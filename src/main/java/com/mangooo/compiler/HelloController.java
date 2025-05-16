package com.mangooo.compiler;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import org.kordamp.ikonli.javafx.FontIcon;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    private TextArea inputArea;
    @FXML
    private TextArea consoleArea;
    @FXML
    private Button loadButton;
    @FXML
    private Button compileButton;
    @FXML
    private Button drawButton;
    @FXML
    private Button openButton;
    @FXML
    private ImageView parseTreeView;
    @FXML
    private StackPane statusIconContainer;
    @FXML
    private ToggleButton themeToggle;
    @FXML
    private Button view3DButton;

    private Project_ASTParser parser;

    @FXML
    private void initialize() {
        loadButton.setOnAction(e -> loadFile());
        compileButton.setOnAction(e -> compile());
        drawButton.setOnAction(e -> drawParseTree());
        openButton.setOnAction(e -> openParseTree());
        view3DButton.setOnAction(e -> openThreeDHtml());

        // Theme toggle
        themeToggle.setGraphic(new FontIcon("fas-moon"));
        themeToggle.setSelected(true);
        themeToggle.selectedProperty().addListener((obs, o, n) -> applyTheme(n));
        themeToggle.sceneProperty().addListener((obs, o, n) -> {
            if (n != null) applyTheme(themeToggle.isSelected());
        });

        drawButton.setDisable(true);
        openButton.setDisable(true);
        view3DButton.setDisable(true);
    }

    private void applyTheme(boolean isDark) {
        Scene scene = themeToggle.getScene();
        if (scene == null) return;
        String darkCss = Objects.requireNonNull(
                HelloApplication.class.getResource("dark-theme.css")
        ).toExternalForm();
        String lightCss = Objects.requireNonNull(
                HelloApplication.class.getResource("light-theme.css")
        ).toExternalForm();
        scene.getStylesheets().clear();
        if (isDark) {
            scene.getStylesheets().add(darkCss);
            themeToggle.setGraphic(new FontIcon("fas-moon"));
        } else {
            scene.getStylesheets().add(lightCss);
            themeToggle.setGraphic(new FontIcon("fas-sun"));
        }
    }

    private void loadFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Input File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        // Show the file chooser dialog
        File selectedFile = fileChooser.showOpenDialog(inputArea.getScene().getWindow());
//        File selectedFile = new File("src/main/resources/Input.txt");
        try {
            String content = new String(Files.readAllBytes(selectedFile.toPath()));
            inputArea.setText(content);
            consoleArea.setStyle("-fx-text-fill: black;");
            consoleArea.setText("File loaded successfully: " + selectedFile.getName());
            statusIconContainer.getChildren().clear();
            parseTreeView.setImage(null);
            drawButton.setDisable(true);
            openButton.setDisable(true);
            view3DButton.setDisable(true);
        } catch (IOException ex) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("Error loading file: " + ex.getMessage());
            statusIconContainer.getChildren().setAll(
                    new FontIcon("fas-times-circle") {{
                        setIconColor(javafx.scene.paint.Color.RED);
                        setIconSize(24);
                    }}
            );
        }
    }

    private void openThreeDHtml() {
        try {
            // Define the path to the Edge executable
            String edgePath = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";

            // Define the user data directory
            String userDataDir = "C:/EdgeDevSession";

            // Specify the HTML file to open
            File htmlFile = new File("threeD.html");

            // Check if the file exists
            if (!htmlFile.exists()) {
                consoleArea.setText("Error: threeD.html not found.");
                return;
            }

            // Convert the file path to a proper file URL
            String fileUrl = htmlFile.toURI().toString(); // e.g., file:///path/to/threeD.html

            // Build and execute the command
            ProcessBuilder pb = new ProcessBuilder(
                    edgePath,
                    "--disable-web-security",
                    "--user-data-dir=" + userDataDir,
                    fileUrl
            );
            pb.start();
        } catch (IOException e) {
            consoleArea.setText("Error opening 3D view: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void compile() {
        try {
            String inputText = inputArea.getText();

            // show "loading" = red X icon instead of spinner
            statusIconContainer.getChildren().setAll(
                    new FontIcon("fas-times-circle") {{
                        setIconColor(javafx.scene.paint.Color.RED);
                        setIconSize(24);
                    }}
            );
            consoleArea.setStyle("-fx-text-fill: blue;");
            consoleArea.setText("Compiling...");

            // Prepare a collector for *all* errors
            StringBuilder errors = new StringBuilder();

            // --- ANTLR3 lexer that captures errors as "syntax error" only ---
            ANTLRStringStream in = new ANTLRStringStream(inputText);
            Project_ASTLexer lexer = new Project_ASTLexer(in) {
                @Override
                public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
                    String hdr = getErrorHeader(e);          // "line 1:0"
                    errors.append(hdr).append(" syntax error\n");
                }
            };

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // --- ANTLR3 parser that also captures errors as "syntax error" ---
            parser = new Project_ASTParser(tokens) {
                @Override
                public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
                    String hdr = getErrorHeader(e);
                    errors.append(hdr).append(" syntax error\n");
                }
            };

            // Run the grammar
            Project_ASTParser.program_return result = parser.program();

            // If any errors, display and bail
            if (errors.length() > 0) {
                consoleArea.setStyle("-fx-text-fill: red;");
                consoleArea.setText(errors.toString());
                highlightFirstError(errors.toString());
                drawButton.setDisable(true);
                openButton.setDisable(true);
                view3DButton.setDisable(true);
                return;
            }

            // --- No errors → build the parse tree as before ---
            CommonTree tree = (CommonTree) result.getTree();
            if (tree == null) {
                throw new RuntimeException("No parse tree generated.");
            }

            // Write DOT
            StringTemplate dot = new DOTTreeGenerator().toDOT(tree);
            try (PrintWriter pw = new PrintWriter(new File("Dot.dot"))) {
                pw.print(dot);
            }

            // Invoke DOT.BAT
            int exitCode = new ProcessBuilder("DOT.BAT").start().waitFor();
            if (exitCode == 0) {
                consoleArea.setStyle("-fx-text-fill: green;");
                consoleArea.setText("Compiled Successfully");
                statusIconContainer.getChildren().setAll(
                        new FontIcon("fas-check-circle") {{
                            setIconColor(javafx.scene.paint.Color.GREEN);
                            setIconSize(24);
                        }}
                );
                drawButton.setDisable(false);
                openButton.setDisable(false);
                view3DButton.setDisable(false);
            } else {
                consoleArea.setStyle("-fx-text-fill: orange;");
                consoleArea.setText("Compiled, but DOT.BAT failed (exit " + exitCode + ")");
            }

        } catch (Exception ex) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("Error: " + ex.getMessage());
            statusIconContainer.getChildren().setAll(
                    new FontIcon("fas-times-circle") {{
                        setIconColor(javafx.scene.paint.Color.RED);
                        setIconSize(24);
                    }}
            );
            drawButton.setDisable(true);
            openButton.setDisable(true);
            view3DButton.setDisable(true);
        }
    }

    private void drawParseTree() {
        try {
            File img = new File("Parse.png");
            if (!img.exists()) throw new IOException("Parse.png not found");
            double w = parseTreeView.getFitWidth(), h = parseTreeView.getFitHeight();
            parseTreeView.setImage(new Image(img.toURI().toString(), w, h, true, true));
        } catch (Exception ex) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("Error displaying parse tree: " + ex.getMessage());
        }
    }

    private void openParseTree() {
        try {
            File img = new File("Parse.png");
            if (Desktop.isDesktopSupported() && img.exists()) {
                Desktop.getDesktop().open(img);
            } else {
                throw new IOException("Cannot open parse tree image");
            }
        } catch (Exception ex) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("Error opening parse tree: " + ex.getMessage());
        }
    }

    /**
     * Highlights the first "line X:Y" occurrence in errs
     */
    private void highlightFirstError(String errs) {
        Matcher m = Pattern.compile("line\\s+(\\d+):(\\d+)").matcher(errs);
        if (!m.find()) return;
        int line = Integer.parseInt(m.group(1));
        int col = Integer.parseInt(m.group(2));

        String[] lines = inputArea.getText().split("\n", -1);
        int offset = 0;
        for (int i = 0; i < line - 1 && i < lines.length; i++) {
            offset += lines[i].length() + 1;
        }
        offset += col;
        inputArea.selectRange(offset, offset + 1);
        inputArea.requestFocus();
    }
}
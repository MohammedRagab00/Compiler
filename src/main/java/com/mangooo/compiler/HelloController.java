package com.mangooo.compiler;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
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
    private StackPane statusIconContainer; // Change from ImageView to StackPane
    @FXML
    private ToggleButton themeToggle;

    // Parser reference to access from other methods
    private Project_ASTParser parser;

    @FXML
    private void initialize() {
        // Add button handlers
        loadButton.setOnAction(e -> loadFile());
        compileButton.setOnAction(e -> compile());
        drawButton.setOnAction(e -> drawParseTree());
        openButton.setOnAction(e -> openParseTree());

        // Setup theme toggle - start with dark mode
        themeToggle.setGraphic(new FontIcon("fas-moon"));
        themeToggle.setSelected(true); // Start with dark theme

        // Setup theme change listener
        themeToggle.selectedProperty().addListener((obs, oldVal, newVal) -> {
            applyTheme(newVal);
        });

        // Make sure we initialize the scene with correct icons when it becomes available
        themeToggle.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                // Apply initial theme when scene is available
                applyTheme(themeToggle.isSelected());
            }
        });

        // Disable draw and open buttons initially until compilation is successful
        drawButton.setDisable(true);
        openButton.setDisable(true);
    }

    private void applyTheme(boolean isDark) {
        Scene scene = themeToggle.getScene();
        if (scene != null) {
            String darkTheme = Objects.requireNonNull(HelloApplication.class.getResource("dark-theme.css")).toExternalForm();
            String lightTheme = Objects.requireNonNull(HelloApplication.class.getResource("light-theme.css")).toExternalForm();

            scene.getStylesheets().clear();
            if (isDark) { // Dark theme
                scene.getStylesheets().add(darkTheme);
                themeToggle.setGraphic(new FontIcon("fas-moon"));
            } else { // Light theme
                scene.getStylesheets().add(lightTheme);
                themeToggle.setGraphic(new FontIcon("fas-sun"));
            }
        }
    }

    private void loadFile() {
/*
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Input File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        // Show file chooser dialog
        File selectedFile = fileChooser.showOpenDialog(inputArea.getScene().getWindow());
*/
        File selectedFile = new File("src/main/resources/Input.txt");

        if (selectedFile != null) {
            try {
                // Read file content
                String content = new String(Files.readAllBytes(selectedFile.toPath()));

                // Set content to input area
                inputArea.setText(content);

                // Optional: Show success message in console
                consoleArea.setText("File loaded successfully: " + selectedFile.getName());

                // Reset status icon - clear the container
                statusIconContainer.getChildren().clear();

                // Reset parse tree view
                parseTreeView.setImage(null);

                // Disable draw and open buttons until compilation
                drawButton.setDisable(true);
                openButton.setDisable(true);

            } catch (IOException e) {
                // Show error in console area
                consoleArea.setText("Error loading file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private void compile() {
        try {
            // Get input from text area
            String inputText = inputArea.getText();

            // Show compiling status
            FontIcon processingIcon = new FontIcon("fas-spinner");
            processingIcon.setIconColor(javafx.scene.paint.Color.BLUE);
            processingIcon.setIconSize(24);
            statusIconContainer.getChildren().clear();
            statusIconContainer.getChildren().add(processingIcon);
            consoleArea.setStyle("-fx-text-fill: blue;");
            consoleArea.setText("Compiling...");

            // Create ANTLR string stream from input text
            ANTLRStringStream input = new ANTLRStringStream(inputText);

            // Create lexer attached to the input stream
            Project_ASTLexer lexer = new Project_ASTLexer(input);

            // Create token stream from lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create parser attached to token stream
            parser = new Project_ASTParser(tokens);

            // Invoke program rule and get return value
            Project_ASTParser.program_return r = null;
            boolean hasErrors = false;

            try {
                r = parser.program();
            } catch (RecognitionException e) {
                hasErrors = true;
                consoleArea.setStyle("-fx-text-fill: red;");
                consoleArea.setText("Syntax Error: " + e.getMessage() +
                        "\nLine: " + e.line +
                        ", Column: " + e.charPositionInLine);

                // Create and set error icon using FontIcon
                FontIcon errorIcon = new FontIcon("fas-times-circle");
                errorIcon.setIconColor(javafx.scene.paint.Color.RED);
                errorIcon.setIconSize(24);
                statusIconContainer.getChildren().clear();
                statusIconContainer.getChildren().add(errorIcon);

                // Disable parse tree buttons
                drawButton.setDisable(true);
                openButton.setDisable(true);
                return;
            }

            // Check if there are any errors
            String msg = parser.s;
            boolean parserHasErrors = (msg != null && (msg.contains("line") ||
                    msg.contains("error") ||
                    msg.contains("Error") ||
                    msg.contains("exception") ||
                    msg.contains("Exception")));

            if (lexer.getNumberOfSyntaxErrors() > 0 || parser.getNumberOfSyntaxErrors() > 0 || parserHasErrors) {
                // Compilation had errors
                hasErrors = true;

                StringBuilder errorMsg = new StringBuilder("Compilation failed with errors:\n");
                if (msg != null && !msg.isEmpty()) {
                    errorMsg.append(msg).append("\n");
                }
                errorMsg.append("Lexer errors: ").append(lexer.getNumberOfSyntaxErrors()).append("\n");
                errorMsg.append("Parser errors: ").append(parser.getNumberOfSyntaxErrors());

                consoleArea.setStyle("-fx-text-fill: red;");
                consoleArea.setText(errorMsg.toString());

                // Create and set error icon using FontIcon
                FontIcon errorIcon = new FontIcon("fas-times-circle");
                errorIcon.setIconColor(javafx.scene.paint.Color.RED);
                errorIcon.setIconSize(24);
                statusIconContainer.getChildren().clear();
                statusIconContainer.getChildren().add(errorIcon);

                // Disable parse tree buttons
                drawButton.setDisable(true);
                openButton.setDisable(true);
            } else {
                // Check if we have a valid tree
                CommonTree t = (CommonTree) r.getTree();
                if (t == null) {
                    consoleArea.setStyle("-fx-text-fill: red;");
                    consoleArea.setText("Error: No parse tree was generated.");

                    // Create and set error icon using FontIcon
                    FontIcon errorIcon = new FontIcon("fas-times-circle");
                    errorIcon.setIconColor(javafx.scene.paint.Color.RED);
                    errorIcon.setIconSize(24);
                    statusIconContainer.getChildren().clear();
                    statusIconContainer.getChildren().add(errorIcon);

                    // Disable parse tree buttons
                    drawButton.setDisable(true);
                    openButton.setDisable(true);
                    return;
                }

                // Generate DOT notation for the parse tree
                DOTTreeGenerator gen = new DOTTreeGenerator();
                StringTemplate st = gen.toDOT(t);

                // Write DOT file
                String dotContent = st.toString();
                File dotFile = new File("Dot.dot");
                PrintWriter output = new PrintWriter(dotFile);
                output.print(dotContent);
                output.close();

                // Run DOT.BAT to generate parse tree image (assuming DOT.BAT exists)
                Process process = new ProcessBuilder("DOT.BAT").start();

                // Wait for the process to complete
                int exitCode = process.waitFor();

                if (exitCode != 0) {
                    consoleArea.setStyle("-fx-text-fill: orange;");
                    consoleArea.setText("Compiled Successfully, but there was a problem generating the parse tree visualization.\n" +
                            "DOT.BAT exit code: " + exitCode);
                } else {
                    // Success case
                    consoleArea.setStyle("-fx-text-fill: green;");
                    consoleArea.setText("Compiled Successfully" + (msg != null ? "\n" + msg : ""));
                }

                // Create and set success icon using FontIcon
                FontIcon successIcon = new FontIcon("fas-check-circle");
                successIcon.setIconColor(javafx.scene.paint.Color.GREEN);
                successIcon.setIconSize(24);
                statusIconContainer.getChildren().clear();
                statusIconContainer.getChildren().add(successIcon);

                // Enable parse tree buttons
                drawButton.setDisable(false);
                openButton.setDisable(false);
            }

        } catch (IOException e) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("IO Error: " + e.getMessage());
            e.printStackTrace();

            // Create and set error icon
            FontIcon errorIcon = new FontIcon("fas-times-circle");
            errorIcon.setIconColor(javafx.scene.paint.Color.RED);
            errorIcon.setIconSize(24);
            statusIconContainer.getChildren().clear();
            statusIconContainer.getChildren().add(errorIcon);

            // Disable parse tree buttons
            drawButton.setDisable(true);
            openButton.setDisable(true);
        } catch (InterruptedException e) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("Process interrupted: " + e.getMessage());
            e.printStackTrace();

            // Create and set error icon
            FontIcon errorIcon = new FontIcon("fas-times-circle");
            errorIcon.setIconColor(javafx.scene.paint.Color.RED);
            errorIcon.setIconSize(24);
            statusIconContainer.getChildren().clear();
            statusIconContainer.getChildren().add(errorIcon);

            // Disable parse tree buttons
            drawButton.setDisable(true);
            openButton.setDisable(true);
        } catch (Exception e) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("Error: " + e.getMessage());
            e.printStackTrace();

            // Create and set error icon
            FontIcon errorIcon = new FontIcon("fas-times-circle");
            errorIcon.setIconColor(javafx.scene.paint.Color.RED);
            errorIcon.setIconSize(24);
            statusIconContainer.getChildren().clear();
            statusIconContainer.getChildren().add(errorIcon);

            // Disable parse tree buttons
            drawButton.setDisable(true);
            openButton.setDisable(true);
        }
    }

    private void drawParseTree() {
        try {
            // Get dimensions of the image view
            double width = parseTreeView.getFitWidth();
            double height = parseTreeView.getFitHeight();

            // Load parse tree image and resize to fit view
            File imageFile = new File("Parse.png");
            if (imageFile.exists()) {
                Image parseImage = new Image(imageFile.toURI().toString(),
                        width, height, true, true);

                // Check if there are errors before displaying
                String msg = parser.s;
                if (msg != null && msg.contains("line")) {
                    // If there are errors, don't show parse tree
                    parseTreeView.setImage(null);
                } else {
                    // If compilation was successful, show parse tree
                    parseTreeView.setImage(parseImage);
                }
            } else {
                consoleArea.setStyle("-fx-text-fill: red;");
                consoleArea.setText("Parse tree image not found. Make sure DOT.BAT generated Parse.png correctly.");
            }
        } catch (Exception e) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("Error displaying parse tree: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void openParseTree() {
        try {
            // Specify the path to the parse tree image file
            File pictureFile = new File("Parse.png");

            // Check if Desktop is supported and the file exists
            if (Desktop.isDesktopSupported() && pictureFile.exists()) {
                Desktop.getDesktop().open(pictureFile);
            } else {
                // Handle case where Desktop is not supported or the file doesn't exist
                consoleArea.setStyle("-fx-text-fill: red;");
                consoleArea.setText("Cannot open parse tree. Desktop may not be supported or file does not exist.");
            }
        } catch (IOException e) {
            consoleArea.setStyle("-fx-text-fill: red;");
            consoleArea.setText("Error opening parse tree: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
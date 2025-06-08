package com.mangooo.compiler;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
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
    private TextArea inputtedArea;
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
    private ScrollPane imageScrollPane;
    @FXML
    private StackPane statusIconContainer;
    @FXML
    private ToggleButton themeToggle;
    @FXML
    private Button view3DButton;

    // Console components
    @FXML
    private ToggleButton consoleCollapseToggle;
    @FXML
    private FontIcon consoleCollapseIcon;
    @FXML
    private VBox consoleContent;
    @FXML
    private VBox consoleTextContainer;
    @FXML
    private SplitPane splitPane;

    private Project_ASTParser parser;
    private double previousConsoleHeight = 200.0;
    private double previousDividerPosition = 0.7;
    private Timeline collapseTimeline;
    private String actualText = ""; // Store the actual text without line numbers

    @FXML
    private void initialize() {
        // Set up existing button actions
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

        // Initialize console collapse functionality
        setupConsoleCollapsing();

        // Configure the ImageView for scrolling
        setupImageScrolling();

        // Initialize line numbering within the input area
        setupLineNumbering();
    }

    private boolean updatingLineNumbers = false;

    private void setupLineNumbering() {
        // Initialize with a single line
        actualText = "";
        updateLineNumbers();

        // Use a simple text change listener instead of TextFormatter
        inputtedArea.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!updatingLineNumbers) {
                // Extract the actual text without line numbers
                String strippedText = stripLineNumbers(newValue);
                actualText = strippedText;

                // Store caret position relative to actual text
                int caretPos = inputtedArea.getCaretPosition();
                int actualCaretPos = getActualCaretPosition(caretPos, newValue);

                // Update line numbers
                updatingLineNumbers = true;
                updateLineNumbers();

                // Restore caret position
                setCaretPositionInNumberedText(actualCaretPos);
                updatingLineNumbers = false;
            }
        });
    }

    private void updateLineNumbers() {
        // Normalize line endings in actualText
        String normalizedText = actualText.replaceAll("\r\n|\r", "\n");
        actualText = normalizedText;

        String[] lines = normalizedText.isEmpty() ? new String[]{""} : normalizedText.split("\n", -1);
        StringBuilder numberedText = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            numberedText.append(String.format("%d | %s", i + 1, lines[i]));
            if (i < lines.length - 1) {
                numberedText.append("\n");
            }
        }

        String newText = numberedText.toString();
        if (!inputtedArea.getText().equals(newText)) {
            inputtedArea.setText(newText);
        }
    }

    private void adjustCaretPosition(int oldCaretPosition) {
        String[] lines = actualText.split("\n", -1);
        int newCaretPosition = 0;
        int charsProcessed = 0;
        for (int i = 0; i < lines.length; i++) {
            int lineNumberLength = String.valueOf(i + 1).length() + 3; // e.g., "1 | " length
            int lineLength = lines[i].length() + lineNumberLength;
            if (i > 0) {
                lineLength += 1; // Account for newline
                charsProcessed += 1;
            }
            charsProcessed += lines[i - 1 != -1 ? i - 1 : 0].length() + (i > 0 ? String.valueOf(i).length() + 3 : 0);
            if (oldCaretPosition <= charsProcessed + lineLength) {
                newCaretPosition = oldCaretPosition + (i + 1) * 3 + String.valueOf(i + 1).length();
                break;
            }
        }
        inputtedArea.positionCaret(Math.min(newCaretPosition, inputtedArea.getText().length()));
    }

    private int getActualCaretPosition(int caretInNumberedText, String numberedText) {
        String[] lines = numberedText.split("\n", -1);
        int actualPos = 0;
        int currentPos = 0;

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            int lineStart = currentPos;
            int lineEnd = currentPos + line.length();

            if (caretInNumberedText >= lineStart && caretInNumberedText <= lineEnd) {
                // Caret is in this line
                String lineNumberPrefix = String.format("%d | ", i + 1);
                int prefixLength = lineNumberPrefix.length();

                if (caretInNumberedText >= lineStart + prefixLength) {
                    // Caret is after the line number prefix
                    actualPos += (caretInNumberedText - lineStart - prefixLength);
                }
                break;
            }

            // Move to next line
            currentPos = lineEnd + 1; // +1 for newline

            // Add the actual line content length (without line numbers)
            if (line.matches("^\\d+\\s\\|\\s.*")) {
                actualPos += line.replaceFirst("^\\d+\\s\\|\\s", "").length();
            } else if (line.matches("^\\d+\\s\\|$")) {
                // Empty line, don't add anything
            } else {
                actualPos += line.length();
            }

            if (i < lines.length - 1) {
                actualPos += 1; // Add newline
            }
        }

        return actualPos;
    }

    private void setCaretPositionInNumberedText(int actualCaretPos) {
        String[] actualLines = actualText.split("\n", -1);
        int numberedCaretPos = 0;
        int actualCharsProcessed = 0;

        for (int i = 0; i < actualLines.length; i++) {
            String lineNumberPrefix = String.format("%d | ", i + 1);
            numberedCaretPos += lineNumberPrefix.length();

            int lineLength = actualLines[i].length();

            if (actualCaretPos <= actualCharsProcessed + lineLength) {
                // Caret is in this line
                numberedCaretPos += (actualCaretPos - actualCharsProcessed);
                break;
            }

            // Move past this line
            numberedCaretPos += lineLength;
            actualCharsProcessed += lineLength;

            if (i < actualLines.length - 1) {
                numberedCaretPos += 1; // Add newline
                actualCharsProcessed += 1; // Add newline
            }
        }

        inputtedArea.positionCaret(Math.min(numberedCaretPos, inputtedArea.getText().length()));
    }

    private String stripLineNumbers(String text) {
        if (text.isEmpty()) return "";
        String[] lines = text.split("\n", -1);
        StringBuilder stripped = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            if (line.matches("^\\d+\\s\\|\\s.*")) {
                stripped.append(line.replaceFirst("^\\d+\\s\\|\\s", ""));
            } else if (line.matches("^\\d+\\s\\|$")) {
                stripped.append("");
            } else {
                stripped.append(line);
            }
            if (i < lines.length - 1) {
                stripped.append("\n");
            }
        }
        return stripped.toString();
    }

    private void setupImageScrolling() {
        parseTreeView.setPreserveRatio(true);
        imageScrollPane.setFitToWidth(false);
        imageScrollPane.setFitToHeight(false);
        imageScrollPane.setPannable(true);
        imageScrollPane.setMaxHeight(Double.MAX_VALUE);
        imageScrollPane.setMaxWidth(Double.MAX_VALUE);
        VBox.setVgrow(imageScrollPane, javafx.scene.layout.Priority.ALWAYS);
    }

    private void setupConsoleCollapsing() {
        if (consoleCollapseToggle != null) {
            consoleCollapseToggle.setSelected(false);
            if (consoleCollapseIcon != null) {
                consoleCollapseIcon.setIconLiteral("fas-minus");
            } else {
                consoleCollapseIcon = new FontIcon("fas-minus");
                consoleCollapseToggle.setGraphic(consoleCollapseIcon);
            }
            if (consoleCollapseToggle.getTooltip() == null) {
                consoleCollapseToggle.setTooltip(new Tooltip("Hide Console"));
            }
            consoleCollapseToggle.setOnAction(event -> {
                boolean isCollapsed = consoleCollapseToggle.isSelected();
                if (isCollapsed) {
                    consoleCollapseIcon.setIconLiteral("fas-plus");
                    consoleCollapseToggle.getTooltip().setText("Show Console");
                    collapseConsole();
                } else {
                    consoleCollapseIcon.setIconLiteral("fas-minus");
                    consoleCollapseToggle.getTooltip().setText("Hide Console");
                    expandConsole();
                }
            });
        }

        if (splitPane != null) {
            splitPane.getDividers().get(0).positionProperty().addListener((obs, oldVal, newVal) -> {
                if ((collapseTimeline == null || collapseTimeline.getStatus() != Animation.Status.RUNNING) &&
                        newVal.doubleValue() > 0.1 && newVal.doubleValue() < 0.9) {
                    previousDividerPosition = newVal.doubleValue();
                }
            });
        }
    }

    private void collapseConsole() {
        if (splitPane == null) return;

        if (splitPane.getDividerPositions().length > 0) {
            previousDividerPosition = splitPane.getDividerPositions()[0];
        }

        if (collapseTimeline != null && collapseTimeline.getStatus() == Animation.Status.RUNNING) {
            collapseTimeline.stop();
        }

        consoleContent.setStyle("-fx-padding: 0 0 15px 0;");
        consoleContent.applyCss();
        consoleContent.layout();

        collapseTimeline = new Timeline(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(splitPane.getDividers().get(0).positionProperty(), previousDividerPosition)),
                new KeyFrame(Duration.millis(250),
                        new KeyValue(splitPane.getDividers().get(0).positionProperty(), 0.98))
        );

        collapseTimeline.setOnFinished(e -> {
            consoleTextContainer.setVisible(false);
            consoleTextContainer.setManaged(false);
            splitPane.requestLayout();
        });

        collapseTimeline.play();
    }

    private void expandConsole() {
        if (splitPane == null) return;

        consoleTextContainer.setVisible(true);
        consoleTextContainer.setManaged(true);

        if (collapseTimeline != null && collapseTimeline.getStatus() == Animation.Status.RUNNING) {
            collapseTimeline.stop();
        }

        consoleContent.setStyle("");
        consoleContent.applyCss();
        consoleContent.layout();

        collapseTimeline = new Timeline(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(splitPane.getDividers().get(0).positionProperty(), 0.98)),
                new KeyFrame(Duration.millis(250),
                        new KeyValue(splitPane.getDividers().get(0).positionProperty(), previousDividerPosition))
        );

        collapseTimeline.setOnFinished(e -> splitPane.requestLayout());

        collapseTimeline.play();
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
/*
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Input File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        File selectedFile = fileChooser.showOpenDialog(inputtedArea.getScene().getWindow());
*/
        File selectedFile = new File("src/main/resources/Input.txt");
        try {
            // Read the file content
            String content = new String(Files.readAllBytes(selectedFile.toPath()));
            // Normalize line endings to \n
            content = content.replaceAll("\r\n|\r", "\n");
            actualText = content;

            // Display only the success message with the filename
            consoleArea.setText("File loaded successfully: " + selectedFile.getName());
            consoleArea.setStyle("-fx-text-fill: green;");

            // Update the display with line numbers
            updateLineNumbers();

            // Clear status and reset buttons
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
            String edgePath = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
            String userDataDir = "C:/EdgeDevSession";
            File htmlFile = new File("threeD.html");
            if (!htmlFile.exists()) {
                consoleArea.setText("Error: threeD.html not found.");
                return;
            }
            String fileUrl = htmlFile.toURI().toString();
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
            String inputText = stripLineNumbers(inputtedArea.getText());
            statusIconContainer.getChildren().setAll(
                    new FontIcon("fas-times-circle") {{
                        setIconColor(javafx.scene.paint.Color.RED);
                        setIconSize(24);
                    }}
            );
            consoleArea.setStyle("-fx-text-fill: blue;");
            consoleArea.setText("Compiling...");

            if (consoleCollapseToggle != null && consoleCollapseToggle.isSelected()) {
                consoleCollapseToggle.setSelected(false);
                consoleCollapseIcon.setIconLiteral("fas-minus");
                consoleCollapseToggle.getTooltip().setText("Hide Console");
                expandConsole();
            }

            StringBuilder errors = new StringBuilder();
            ANTLRStringStream in = new ANTLRStringStream(inputText);
            Project_ASTLexer lexer = new Project_ASTLexer(in) {
                @Override
                public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
                    String hdr = getErrorHeader(e);
                    errors.append(hdr).append(" syntax error\n");
                }
            };
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new Project_ASTParser(tokens) {
                @Override
                public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
                    String hdr = getErrorHeader(e);
                    errors.append(hdr).append(" syntax error\n");
                }
            };
            Project_ASTParser.program_return result = parser.program();
            if (errors.length() > 0 || result.getTree() == null) {
                consoleArea.setStyle("-fx-text-fill: red;");
                consoleArea.setText(errors.length() > 0 ? errors.toString() : "No parse tree generated.");
                highlightFirstError(errors.toString());
                drawButton.setDisable(true);
                openButton.setDisable(true);
                view3DButton.setDisable(true);
                return;
            }
            CommonTree tree = (CommonTree) result.getTree();
            if (tree == null) {
                throw new RuntimeException("No parse tree generated.");
            }
            StringTemplate dot = new DOTTreeGenerator().toDOT(tree);
            try (PrintWriter pw = new PrintWriter(new File("Dot.dot"))) {
                pw.print(dot);
            }
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

            Image image = new Image(img.toURI().toString());
            parseTreeView.setImage(image);

            parseTreeView.setFitWidth(0);
            parseTreeView.setFitHeight(0);

            double scrollHeight = imageScrollPane.getViewportBounds().getHeight();
            double imgWidth = image.getWidth();
            double imgHeight = image.getHeight();

            double zoomFactor = 1.5;
            double zoomedHeight = imgHeight * zoomFactor;
            double zoomedWidth = imgWidth * zoomFactor;

            double scale = scrollHeight / zoomedHeight;
            parseTreeView.setFitHeight(zoomedHeight * scale);
            parseTreeView.setFitWidth(zoomedWidth * scale);

            imageScrollPane.setHvalue(0.5);
            imageScrollPane.setVvalue(0.5);

            imageScrollPane.layout();

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

    private void highlightFirstError(String errs) {
        Matcher m = Pattern.compile("line\\s+(\\d+):(\\d+)").matcher(errs);
        if (!m.find()) return;
        int line = Integer.parseInt(m.group(1));
        int col = Integer.parseInt(m.group(2));
        String[] lines = stripLineNumbers(inputtedArea.getText()).split("\n", -1);
        int offset = 0;
        for (int i = 0; i < line - 1 && i < lines.length; i++) {
            offset += lines[i].length() + 1;
        }
        offset += col;
        // Adjust for line numbers in the displayed text
        int numberOffset = 0;
        for (int i = 1; i < line; i++) {
            numberOffset += String.valueOf(i).length() + 3; // Length of "i | " including spaces
        }
        numberOffset += String.valueOf(line).length() + 3 + col;
        inputtedArea.selectRange(numberOffset, numberOffset + 1);
        inputtedArea.requestFocus();
    }
}
module com.mangooo.compiler {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires antlr;
    requires java.desktop;
    requires javafx.web;


    opens com.mangooo.compiler to javafx.fxml;
    exports com.mangooo.compiler;
}
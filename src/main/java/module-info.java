module xyz.intellij.filerenametool {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens xyz.intellij.file.rename to javafx.fxml;
    exports xyz.intellij.file.rename;
}

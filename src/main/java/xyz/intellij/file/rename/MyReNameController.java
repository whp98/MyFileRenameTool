package xyz.intellij.file.rename;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import xyz.intellij.file.rename.utils.ConsoleOututil;
import xyz.intellij.file.rename.utils.FileRenameUtil;

import java.util.Arrays;
import java.util.List;

public class MyReNameController {
    @FXML
    public TextField path;
    @FXML
    public TextField str;
    @FXML
    public TextArea console;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("开始执行...");
        System.out.println(path.getCharacters());
        System.out.println(str.getCharacters());
        String path1 =  path.getCharacters().toString();
        String str1 = str.getCharacters().toString();
        List<String> stringList = Arrays.asList(str1);
        FileRenameUtil.runInPath(path1,stringList,new ConsoleOututil(console));
        welcomeText.setText("执行完毕!");
    }
}

package xyz.intellij.file.rename.utils;

import javafx.scene.control.TextArea;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @Author whp98
 * @Date 2021/11/11 17:00
 * @Version
 */
public class ConsoleOututil {
    private TextArea textArea;
    public ConsoleOututil(TextArea textArea){
        this.textArea = textArea;
        textArea.setWrapText(true);
    }

    public void setTextArea(TextArea textArea) {
        this.textArea = textArea;
    }

    public void append(String s){
        textArea.appendText(s);
    }
    public void appendln(String s){
        textArea.appendText(s+"\n");
    }
    public void clear(){
        textArea.clear();
    }
}

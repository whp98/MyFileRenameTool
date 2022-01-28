package xyz.intellij.file.rename.utils;

import java.io.File;
import java.util.List;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @Author whp98
 * @Date 2021/11/11 13:31
 * @Version
 */
public class FileRenameUtil {
    public static void runInPath(String path, List<String> StrList, ConsoleOututil consoleOututil) {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null != files) {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        runInPath(file2.getAbsolutePath(), StrList, consoleOututil);
                    } else {
                        String oldname = file2.getAbsolutePath();
                        oldname = oldname.replace(path, "");
                        String newFileName = oldname;
                        for (String s : StrList) {
                            newFileName = newFileName.replace(s, "");
                        }
                        if (newFileName != oldname) {
                            consoleOututil.appendln("开始重命名");
                            consoleOututil.appendln("原名: " + oldname);
                            consoleOututil.appendln("新名: " + newFileName);
                            consoleOututil.appendln("");
                            File newFile = new File(path + newFileName);
                            file2.renameTo(newFile);
                        }
                        consoleOututil.appendln(file2.getAbsolutePath());
                    }
                }
            }
        } else {
            consoleOututil.appendln("文件不存在!");
        }
    }
}

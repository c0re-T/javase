package f_commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo02FileUtils {
    public static void main(String[] args) throws IOException {
        //静态方法：FileUtils.copyDirectoryToDirectory(File src, File~dest);
        //传递File类型的目录，进行整个目录的复制，自动进行递归遍历。

        //参数:
        //Src:要复制的文件夹路径
        //dest:要将文件夹粘贴到哪里去
        //FileUtils.copyDirectoryToDirectory(new File("IOSec\\aa"),new File("IOSec\\bb"));

        //静态方法:writeStringToFile(File file,String str)写字符串到文本文件中。
        //FileUtils.writeStringToFile(new File("IOSec\\commons.txt"),"ssss");

        //静态方法: string readFileToString(File file)读取文本文件返回字符串。
        String s = FileUtils.readFileToString(new File("IOSec\\log.txt"));
        System.out.println(s);
    }
}

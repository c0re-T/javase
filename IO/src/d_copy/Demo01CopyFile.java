package d_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream
        FileInputStream fis = new FileInputStream("IO\\1.txt");
        //2.创建一个FileOutputStream,将读取的图片写到指定的位置
        FileOutputStream fos = new FileOutputStream("IO\\例子.txt");
        //3.定义一个数组
        byte[] bytes = new byte[1024];
        //4.边读边写,真实数据在数组,len是个数
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
    }
}

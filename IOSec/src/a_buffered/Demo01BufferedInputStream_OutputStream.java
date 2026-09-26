package a_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01BufferedInputStream_OutputStream {
    public static void main(String[] args) throws Exception {
        //method01();
        method02();
    }

    //使用字节缓冲流复制文件
    private static void method02() throws Exception {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("media/demo.mp4");
        FileOutputStream fos = new FileOutputStream("media/2.mp4");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //边读边写
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        bis.close();
        bos.close();
    }

    //使用基本流复制文件
    private static void method01() throws Exception {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("media/demo.mp4");
        FileOutputStream fos = new FileOutputStream("media/2.mp4");
        //边读边写
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        fis.close();
        fos.close();
    }
}

package e_filereader;

import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        //method01();
        method02();
    }

    private static void method02() throws IOException {
        FileReader fr = new FileReader("IO\\中文.txt");
        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }

        fr.close();
    }

    private static void method01() throws IOException {
        FileReader fr = new FileReader("IO\\中文.txt");
        //int data1 = fr.read();
        //System.out.println((char) data1);

        int len;
        while ((len = fr.read()) != -1) {
            System.out.println((char) len);
        }

        fr.close();
    }
}

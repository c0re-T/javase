package a_file;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        //File file1 = new File("IO\\2.txt");
        File file1 = new File("1.txt");
        System.out.println(file1.createNewFile());
    }
}

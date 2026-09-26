package b_reversestream;

import java.io.*;

public class Demo01InputStreamReader {
    public static void main(String[] args) throws Exception {
        /*FileReader fr = new FileReader("IOSec\\2.txt");
        int data = fr.read();
        System.out.println((char) data);
        fr.close();*/

        InputStreamReader isr = new InputStreamReader(new FileInputStream("IOSec\\2.txt"),"GBK");
        int data = isr.read();
        System.out.println((char) data);
        isr.close();
    }
}

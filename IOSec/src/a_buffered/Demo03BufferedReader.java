package a_buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo03BufferedReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("IOSec\\1.txt"));
        /*String s1 = br.readLine();
        System.out.println(s1);

        String s2 = br.readLine();
        System.out.println(s2);

        String s3 = br.readLine();
        System.out.println(s3);

        String s4 = br.readLine();
        System.out.println(s4);

        String s5 = br.readLine();
        System.out.println(s5);*/

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}

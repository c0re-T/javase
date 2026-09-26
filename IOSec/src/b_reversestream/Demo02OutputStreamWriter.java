package b_reversestream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IOSec\\2.txt"),"GBK");
        osw.write("你好");
        osw.close();
    }
}

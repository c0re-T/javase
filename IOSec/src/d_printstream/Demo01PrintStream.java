package d_printstream;

import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("IOSec\\printstream.txt");
        ps.println("汤晓峰牛逼");
        ps.println("忻浙也牛逼");
        ps.close();
    }
}

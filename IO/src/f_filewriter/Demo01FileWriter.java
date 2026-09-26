package f_filewriter;

import java.io.FileWriter;

public class Demo01FileWriter {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("IO\\2.txt");
        fw.write("千山鸟飞绝\n");
        fw.write("万径人踪灭\n");
        fw.write("孤舟蓑笠翁\n");
        fw.write("独钓寒江雪\n");
        fw.flush();

        //fw.write("晓峰和忻浙的故事");
        //fw.flush();

        fw.close();

    }
}

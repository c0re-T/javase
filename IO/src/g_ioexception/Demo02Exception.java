package g_ioexception;

import java.io.FileWriter;

public class Demo02Exception {
    public static void main(String[] args) {
        //自动关流
        try (FileWriter fw = new FileWriter("IO\\4.txt")) {
            fw.write("你好");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

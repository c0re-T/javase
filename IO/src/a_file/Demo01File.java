package a_file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        //file01();
        file02();
    }

    /*
    * 将来写代码如何正确编写一个路径用java代码
    * */
    private static void file02() {
        String path = "io";
        System.out.println(path);

        System.out.println("================");

        //要求代码写完，一次编写，到处运行
        String path1 = "io" + File.separator + "data" + File.separator + "1.jpg";
        System.out.println(path1);
    }

    private static void file01() {
        //staticString pathSeparator:与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
        String pathSeparator = File.pathSeparator;
        System.out.println("pathSeparator=" + pathSeparator); // ;
        //static String separator:与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
        String separator = File.separator;
        System.out.println("separator" + separator); // \
    }
}

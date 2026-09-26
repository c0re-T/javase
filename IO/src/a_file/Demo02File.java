package a_file;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        //File(String Parent，String child） 根据所填写的路径创建File对象
        //parent:父路径
        //child:子路径
        File file1 = new File("io", "学生证照片.jpg");
        System.out.println("file1 = " + file1);

        //File(File parent, String child)
        //parent:父路径,是一个File对象
        //child:子路径根据所填写的路径创建File对象
        File parent = new File("io");
        File file2 = new File(parent, "学生证照片.jpg");
        System.out.println("file2 = " + file2);

        //File(String pathname)
        //pathname:直接指定路径根据所填写的路径创建File对象
        File file3 = new File("io\\学生证照片.jpg");
        System.out.println("file3 = " + file3);

        //我们创建File对象的时候，传递的路径可以是不存在的，但是传递不存在的路径没啥意义
        File file = new File("Z:\\fewfwfaefewafe");
        System.out.println(file);
    }
}

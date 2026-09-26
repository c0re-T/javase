package c_hashtable_vector;

import java.util.Vector;

public class Demo02Vector {
    public static void main(String[] args) {
        //a.如果用空参构造创建对象，数组初始容量为10，如果超出范围，自动扩容，2倍
        //b.如果用有参构造创建对象，如果超出了范围，自动扩容，扩的是老数组长度+指定的容量增强
        Vector<String> vector = new Vector<>(10,5);
        vector.add("张三");
        vector.add("李四");
        vector.add("李四");
        vector.add("李四");
        vector.add("李四");
        vector.add("李四");
        vector.add("李四");
        vector.add("李四");
        vector.add("李四");
        vector.add("李四");
        vector.add("李四");
        System.out.println(vector);
        for (String v : vector) {
            System.out.println(v);
        }
    }
}

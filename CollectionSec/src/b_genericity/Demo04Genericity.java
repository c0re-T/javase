package b_genericity;

import java.util.ArrayList;

public class Demo04Genericity {
    public static void main(String[] args) {
        MyArrayList1<String> list = new MyArrayList1<>();
        list.add("张三");
        list.add("李四");
        System.out.println(list.get(0));
    }
}

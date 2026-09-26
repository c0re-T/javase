package c_genericity;

import java.util.ArrayList;

public class Demo01Genericity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        method(list);
        method(list1);
    }

    public static void method(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

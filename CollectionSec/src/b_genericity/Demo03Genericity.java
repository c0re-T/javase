package b_genericity;

import java.util.ArrayList;

public class Demo03Genericity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtils.addAll(list,"a","b","c","d");
        System.out.println(list);

        System.out.println("===================");

        ArrayList<Integer> list1 = new ArrayList<>();
        ListUtils.addAll(list1,1,2,3,4,5);
        System.out.println(list1);
    }
}

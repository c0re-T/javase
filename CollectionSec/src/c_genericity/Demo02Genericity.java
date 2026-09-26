package c_genericity;

import java.util.ArrayList;
import java.util.Collection;

/*
* integer => Number => Object
* String => Object
* */


public class Demo02Genericity {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();

//        get1(list);
//        get1(list1);
//        get1(list2);
//        get1(list3);

        System.out.println("===================");

//        get2(list);
//        get2(list1);
//        get2(list2);
//        get2(list3);
    }

    //上限  ?只能接收extends后面的本类类型以及子类类型
    public static void get1(Collection<? extends Number> collection) {

    }
    //下限  ?只能接收super后面的本类类型以及父类类型
    public static void get2(Collection<? super Number> collection) {

    }
}

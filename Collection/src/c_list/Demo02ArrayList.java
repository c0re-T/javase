package c_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("硝烟");
        list.add("小星星");
        list.add("撒旦法");
        list.add("法国人");
        list.add("湿粉膏");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("====================");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

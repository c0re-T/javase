package c_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo05LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("硝烟");
        linkedList.add("小星星");
        linkedList.add("撒旦法");
        linkedList.add("法国人");
        linkedList.add("湿粉膏");
        System.out.println(linkedList);

        linkedList.addFirst("牛叉");
        System.out.println(linkedList);

        linkedList.addLast("不牛叉");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);
    }
}

package c_list;

import java.util.LinkedList;

public class Demo06LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("硝烟");
        linkedList.add("小星星");
        linkedList.add("撒旦法");
        linkedList.add("法国人");
        linkedList.add("湿粉膏");
        System.out.println(linkedList);

        //public E pop():从此列表所表示的堆栈出弹出一个元素
        linkedList.pop();
        System.out.println(linkedList);
        //public void push(E e):将元素推入此列表所表示的堆栈
        linkedList.push("牛牛");
        System.out.println(linkedList);
    }
}

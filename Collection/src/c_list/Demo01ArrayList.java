package c_list;

import java.util.ArrayList;

public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //boolean add(E e):将元素添加到集合中(我们一般调add时，不用boolean接接收，因为add一定会成功)
        list.add("硝烟");
        list.add("小星星");
        list.add("撒旦法");
        list.add("法国人");
        list.add("湿粉膏");
        System.out.println(list);

        //void add(int index, E element):在指定索引位置添加元素
        list.add(2,"牛奶");
        System.out.println(list);

        //boolean remove(Object o):将指定的元素从集合中删除,成功为true，失败为false
        list.remove("小星星");
        System.out.println(list);

        //E remove(int index):删除指定索引位置上的元素,修改成后面element的元素
        String element = list.remove(0);
        System.out.println(element);
        System.out.println(list);

        //E set(int index, E element):将指定索引位置上的元素，修改成构面的element元素
        String element2 = list.set(0, "扭伤");
        System.out.println(element2);
        System.out.println(list);

        //E get(int index):根据索引获取元素
        System.out.println(list.get(1));

        //int size():获取集合元素个数
        System.out.println(list.size());

    }
}

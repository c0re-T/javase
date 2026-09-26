package a_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        //boolean add(E e):将给定的元素添加到当前集合中(我们一般调add时，不用boolean接接收，因为add一定会成功)
        collection.add("硝烟");
        collection.add("小星星");
        collection.add("撒旦法");
        collection.add("法国人");
        collection.add("湿粉膏");
        System.out.println(collection);

        //boolean addAll(Collection<? extends E> c):将另一个集合元素添加到当前集合中(集合合并)
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("汤晓峰");
        collection1.add("范德萨");
        collection1.add("冯绍峰");
        collection1.add("烘焙店");
        collection1.addAll(collection);
        System.out.println(collection1);

        //void clear():清除集合中所有的元素
        collection1.clear();
        System.out.println(collection1);

        //boolean contains(Object o):判断当前集合中是否包含指定的元素
        boolean res = collection.contains("晓峰");
        System.out.println("res = " + res);

        //boolean isEmpty():判断当前结合中是否有元素->判断结合是否为空
        System.out.println(collection1.isEmpty());

        //boolean remove(Object o):将指定的元素从集合中删除
        collection.remove("法国人");
        System.out.println(collection);

        //int size():返回集合中的元素个数
        System.out.println(collection.size());

        //Object[] toArray():把集合中的元素,存储到数组中
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));
    }
}

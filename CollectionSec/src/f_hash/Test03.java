package f_hash;

import java.util.HashSet;

public class Test03 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        //重写hashcode方法,比较的是属性的hash值和属性的内容,可以去重
        //不重写的话,默认调用的是Object中的,不同对象的hash值肯定不一样,equals比较对象的地址值也不一样
        set.add(new Person("p1",16));
        set.add(new Person("p2",18));
        set.add(new Person("p1",16));
        System.out.println(set);
    }
}

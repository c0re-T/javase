package e_list_in_list;

import java.util.ArrayList;

public class Demo01ListInList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("杨过");
        list1.add("小龙女");
        list1.add("尹志平");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("涛哥");
        list2.add("金莲");
        list2.add("三上");

        /*
        * list中的元素是两个ArrayList<String>
        * 所以泛型应该也是ArrayList<String>
        * */
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        System.out.println(list);

        /*
        * 先遍历大集合，将两个小集合遍历出来
        * 再遍历两个小集合，将元素获取出来
        * */

        for (ArrayList<String> big : list) {
            for (String small : big) {
                System.out.println(small);
            }
        }
    }
}

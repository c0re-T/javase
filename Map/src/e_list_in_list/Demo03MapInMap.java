package e_list_in_list;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* JavaSE：集合 存储的是 学号 键，值 学生姓名
* - 1 张三
* - 2 李四
* JavaEE：集合 存储的是 学号 键，值 学生姓名
* - 1 王五
* - 2 赵六
* */
public class Demo03MapInMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"张三");
        map1.put(2,"李四");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1,"王五");
        map2.put(2,"赵六");

        HashMap<String, HashMap<Integer, String>> map = new HashMap<>();
        map.put("JavaSE",map1);
        map.put("JavaEE",map2);

        System.out.println(map);

        Set<Map.Entry<String, HashMap<Integer, String>>> outerEn = map.entrySet();
        for (Map.Entry<String, HashMap<Integer, String>> outer : outerEn) {
            String outerK = outer.getKey();
            HashMap<Integer, String> outerV = outer.getValue();

            Set<Map.Entry<Integer, String>> innerEn = outerV.entrySet();
            for (Map.Entry<Integer, String> inner : innerEn) {
                System.out.println(inner.getKey() + "-----" + inner.getValue());
            }
        }
    }
}

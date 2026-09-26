package a_map;

import java.util.LinkedHashMap;
import java.util.Set;

public class Demo03HashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("猪八", "嫦娥");
        map.put("猪八", "高翠兰");
        map.put("忻浙", "汤晓峰");
        map.put("二郎神", "嫦娥");
        map.put("唐僧", "王五");
        map.put("牛舌", "猪食");
        System.out.println(map);

        Set<String> set = map.keySet();
        for (String key : set) {
            //根据key获取value
            System.out.println(key + "..." + map.get(key));
        }
    }
}

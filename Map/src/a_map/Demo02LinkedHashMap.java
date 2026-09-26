package a_map;

import java.util.LinkedHashMap;

public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("忻浙", "汤晓峰");
        map.put("二郎神", "嫦娥");
        map.put("唐僧", "王五");
        map.put("牛舌", "猪食");
        System.out.println(map);
    }
}

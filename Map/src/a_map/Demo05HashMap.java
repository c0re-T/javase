package a_map;


import java.util.HashMap;

public class Demo05HashMap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        //依旧是重写hashcode和equals方法,给实体类对象按属性内容去重
        map.put(new Person("忻浙", 21), "浙江省");
        map.put(new Person("汤晓峰", 20), "浙江省");
        map.put(new Person("忻浙", 21), "广东省");
        System.out.println(map);
    }
}

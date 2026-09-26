package a_map;

import java.util.HashMap;
import java.util.Scanner;

public class Demo06HashMap {
    public static void main(String[] args) {
        //1.创建Scanner和HashMap
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String next = input.next();

        //2.遍历字符串，将每一个字符获取出来
        char[] charArray = next.toCharArray();
        for (char ch : charArray) {
            String key = String.valueOf(ch);
            //3.判断,map中是否包含遍历出来的字符-> containsKey
            //4.如果不包含，证明此字符第一次出现，直接将此字符和1存储到map中
            //5.如果包含，根据字符获取对应的value，让value++
            //6.将此字符和改变后的value重新保存到map集合中
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                Integer value = map.get(key);
                value++;
                map.put(key, value);
            }
        }
        //7.输出
        System.out.println(map);
    }
}

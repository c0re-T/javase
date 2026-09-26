package d_properties;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //object setProperty(String key, String value) -> 存键值对
        properties.setProperty("username","root");
        properties.setProperty("password","1234");
        System.out.println(properties);
        //string getProperty(string key) ->根据key获取value的
        System.out.println(properties.getProperty("username"));
        //Set<String>stringPropertyNames（）->获取所有的key，保存到set集合中，相当于keySet方法
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
        }
    }
}

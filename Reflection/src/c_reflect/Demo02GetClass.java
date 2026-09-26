package c_reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo02GetClass {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream in = new FileInputStream("Reflection\\pro.properties");
        properties.load(in);

        String className = properties.getProperty("className");
        System.out.println("className = " + className);

        Class<?> aClass = Class.forName(className);
        System.out.println("aClass = " + aClass);
    }
}

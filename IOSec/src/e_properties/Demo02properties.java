package e_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

public class Demo02properties {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("IOSec\\jdbc.properties");
        properties.load(fis);

        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + ": " + properties.getProperty(key));
        }
    }
}

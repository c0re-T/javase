package c_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo01Serializable {
    public static void main(String[] args) throws Exception {
        //write();
        read();
    }

    //反序列化
    private static void read() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IOSec\\person.txt"));

        /*for (int i = 0; i < 3; i++) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        }*/

        //将集合反序列化出来即可
        ArrayList<Person> people = (ArrayList<Person>) ois.readObject();
        for (Person person : people) {
            System.out.println(person);
        }

        ois.close();
    }

    //序列化
    private static void write() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IOSec\\person.txt"));
        //创建一个集合，存储多个Person对象
        ArrayList<Person> people = new ArrayList<>();
        //将对象存储到集合中
        people.add(new Person("晓峰", 18));
        people.add(new Person("忻浙", 20));
        people.add(new Person("萨芬", 22));
        oos.writeObject(people);
        oos.close();
    }
}

package a_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03Collections {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("刘艳",89));
        students.add(new Student("刺客",100));
        students.add(new Student("萨嘎",65));
        students.add(new Student("刘晨",98));
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

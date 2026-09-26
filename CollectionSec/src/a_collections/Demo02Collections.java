package a_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo02Collections {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("刘艳",18));
        people.add(new Person("刺客",23));
        people.add(new Person("萨嘎",21));
        people.add(new Person("刘晨",33));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Person person : people) {
            System.out.println(person);
        }
    }
}

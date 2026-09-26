package a_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Lambda {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("忻浙",18));
        list.add(new Person("晓峰",20));
        list.add(new Person("JJ",22));

        System.out.println("===========Lambda===========");

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("================Lambda================");

        Collections.sort(list, (Person o1, Person o2) -> {
                return o1.getAge() - o2.getAge();
        });

        System.out.println("================Lambda表达式简化形式================");
        Collections.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println(list);
    }
}

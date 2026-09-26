package g_lombok;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("晓峰");
        person.setAge(18);

        System.out.println(person.getName() + "...." + person.getAge());

        System.out.println("==============");

        Person p1 = new Person("忻浙", 18);
        System.out.println(p1.getName() + "...." + p1.getAge());

    }
}

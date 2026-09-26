package f_hash;

public class Demo01Hash {
    public static void main(String[] args) {
        Person p1 = new Person("p1", 18);
        Person p2 = new Person("p1", 18);

        System.out.println(p1); //f_hash.Person@b4c966a
        System.out.println(p2); //f_hash.Person@2f4d3709

        System.out.println(p1.hashCode());  //189568618
        System.out.println(p2.hashCode());  //793589513

        System.out.println(Integer.toHexString(p1.hashCode())); //b4c966a
        System.out.println(Integer.toHexString(p2.hashCode())); //2f4d3709

        System.out.println("====================");

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.hashCode()); //96354
        System.out.println(s2.hashCode()); //96354

        System.out.println("=====================");

        String s3 = "通话";
        String s4 = "重地";
        System.out.println(s3.hashCode());  //1179395
        System.out.println(s4.hashCode());  //1179395
    }
}

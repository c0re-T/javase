package b_genericity;

public class Demo02Genericity {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);//直接输出对象名,默认调用toString

        System.out.println("==================");

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Integer element = list1.get(0);
        System.out.println(element);
        System.out.println(list1);
    }
}

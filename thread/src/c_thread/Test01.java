package c_thread;

public class Test01 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("金莲");

        MyThread1 t2 = new MyThread1();
        t2.setName("阿庆");

        /*
        * MIN_PRIORITY 最小优先级 1
        * NORM_PRIORITY 默认优先级 5
        * NORM_PRIORITY 最大优先级 10
        * */

        /*System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());*/

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}

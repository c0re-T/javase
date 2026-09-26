package d_thread;

public class Test01 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("金莲");

        MyThread2 t2 = new MyThread2();
        t2.setName("阿庆");

        //t2设置为守护线程
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}

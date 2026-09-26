package e_thread;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "线程执行了..." + i);
            //还是会抢夺线程权
            Thread.yield();
        }
    }
}

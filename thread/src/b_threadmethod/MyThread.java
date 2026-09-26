package b_threadmethod;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //线程睡眠
            //子类重写时，父类的方法没有抛异常就要用try catch
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "线程执行了...." + i);
        }
    }
}

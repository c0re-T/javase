package g_runnable;

public class Test02 {
    public static void main(String[] args) {
        /*
        * Thread(Runnable r)匿名内部类创建线程
        * Thread(Runnable r, String name):name线程的名字
        * */

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行了..." + i);
                }
            }
        },"晓峰").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行了..." + i);
                }
            }
        },"忻浙").start();
    }
}

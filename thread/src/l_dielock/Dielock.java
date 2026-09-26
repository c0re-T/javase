package l_dielock;

public class Dielock implements Runnable{
    private boolean flag;

    public Dielock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (LockA.lockA) {
                System.out.println("if...lockA");
                synchronized (LockB.lockB) {
                    System.out.println("if...lockB");
                }
            }
        }else {
            synchronized (LockB.lockB) {
                System.out.println("else...lockB");
                synchronized (LockA.lockA) {
                    System.out.println("else...lockA");
                }
            }
        }
    }
}

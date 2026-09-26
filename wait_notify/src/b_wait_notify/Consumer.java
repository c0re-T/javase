package b_wait_notify;

public class Consumer implements Runnable{
    BaoZiPu baozipu = new BaoZiPu();

    public Consumer(BaoZiPu baozipu) {
        this.baozipu = baozipu;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            baozipu.getCount();
        }
    }
}
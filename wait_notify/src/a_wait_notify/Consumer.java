package a_wait_notify;

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

            synchronized (baozipu) {
                //1.判断flag是否为false,如果为false,证明没有包子,消费线程等待
                if (baozipu.isFlag() == false) {
                    try {
                        baozipu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                //2.如果flag为true,证明有包子,开始消费
                baozipu.getCount();
                //3.改变flag状态,为false,证明消费完了,没有包子了
                baozipu.setFlag(false);
                //4.唤醒生产线程
                baozipu.notify();
            }
        }
    }
}
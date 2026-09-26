package j_synchronized;

public class MyTicket implements Runnable {
    //定义100张票
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (!method01()) {
                break;
            }
        }
    }

    /*public synchronized boolean method01() {
        if (ticket <= 0) {
            return false;
        }
        System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "票");
        ticket--;
        return true;
    }*/

    public boolean method01() {
        synchronized(this) {
            System.out.println(this + "......");
            if (ticket <= 0) {
                return false;
            }
            System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "票");
            ticket--;
            return true;
        }
    }
}

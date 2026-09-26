package l_dielock;

public class Test01 {
    public static void main(String[] args) {
        Dielock dielock1 = new Dielock(true);
        Dielock dielock2 = new Dielock(false);

        new Thread(dielock1).start();
        new Thread(dielock2).start();
    }
}

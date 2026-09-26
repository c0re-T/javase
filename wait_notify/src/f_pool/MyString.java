package f_pool;

import java.util.concurrent.Callable;

public class MyString implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "那一夜你伤害了我";
    }
}

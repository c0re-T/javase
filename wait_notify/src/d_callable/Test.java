package d_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();

        /*
        * FutureTask(Callable<V> callable)
        * */

        FutureTask<String> futureTask = new FutureTask<>(myCallable);

        //创建Thread对象->Thread(Runable target)
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println(futureTask.get());

    }
}

package concurrency.commonUtil;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author liuyuan
 * @create 2020-01-06 20:42
 * @description
 **/
public class Task implements Runnable {
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        Future<?> f = executorService.submit(new Task());
    }
}

package concurrency.harness;

import java.util.concurrent.CountDownLatch;

/**
 * @author liuyuan
 * @create 2019-12-23 15:05
 * @description
 **/
public class TestHarness {
    public static long timeTasks(int nThreads,final Runnable task) throws InterruptedException {
        final CountDownLatch startGate=new CountDownLatch(1);
        final CountDownLatch endGate=new CountDownLatch(nThreads);
        for (int i = 0; i < nThreads; i++) {
            Thread thread= new Thread(() -> {
                try {
                    startGate.await();
                    try {
                        task.run();
                    }finally {
                        endGate.countDown();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
        long start=System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end=System.nanoTime();
        return end-start;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable= () -> System.out.println("test");
        long count=timeTasks(10,runnable);
        System.out.println(count);
    }
}

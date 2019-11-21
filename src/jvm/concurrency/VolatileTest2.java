package jvm.concurrency;

/**
 * @author liuyuan
 * @create 2019-11-21 14:47
 * @description
 **/
public class VolatileTest2 {
    volatile boolean shutdownRequested;
    public void shutdown(){
        shutdownRequested=true;
    }
    private static final int THREADS_COUNT=20;
    public void doWork(){
        while (!shutdownRequested){
            System.out.println(shutdownRequested);
        }
    }

    public static void main(String[] args) {
        Thread[] threads=new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    new VolatileTest2().doWork();
                    new VolatileTest2().shutdown();
                }
            });
            threads[i].start();
        }
    }
}

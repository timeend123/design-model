package jvm.concurrency;

/**
 * @author liuyuan
 * @create 2019-11-21 14:29
 * @description 变量自增运算测试
 **/
public class VolatileTest1 {
    public static volatile int race=0;
    public static void increase(){
        race++;
    }
    private static final int THREADS_COUNT=20;

    public static void main(String[] args) {
        Thread[] threads=new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(race);
    }
}
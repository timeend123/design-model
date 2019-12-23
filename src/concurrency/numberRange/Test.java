package concurrency.numberRange;

/**
 * @author liuyuan
 * @create 2019-12-15 15:57
 * @description
 **/
public class Test {
    static NumberRange numberRange = new NumberRange();

    public static class Thread1 implements Runnable {

        @Override
        public void run() {
            numberRange.setLower(5);
        }
    }
    public static class Thread2 implements Runnable{
        @Override
        public void run() {
            numberRange.setUpper(4);
        }
    }

    public static void main(String[] args) {
        Thread thread1=new Thread(new Thread1());
        Thread thread2=new Thread(new Thread2());
        thread1.start();
        Thread.yield();
        thread2.start();
        System.out.println(numberRange.toString());
    }
}

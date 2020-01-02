package leetCodePractices.concurrency;

import java.util.function.IntConsumer;

/**
 * @author liuyuan
 * @create 2019-11-24 19:58
 * @description
 **/
public class Test {
    ZeroEvenOdd zeroEvenOdd=new ZeroEvenOdd(2);
    IntConsumer printNumber= value -> System.out.println(value);
    //输出0
    Thread thread1= new Thread(() -> {
        try {
            zeroEvenOdd.zero(printNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });
    //输出偶数
    Thread thread2= new Thread(() -> {
        try {
            zeroEvenOdd.even(printNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });
    //输出奇数
    Thread Thread3= new Thread(() -> {
        try {
            zeroEvenOdd.odd(printNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    public static void main(String[] args) {
        Test test=new Test();
        test.thread1.start();
        Thread.yield();
        test.thread2.start();
        Thread.yield();
        test.Thread3.start();
        Thread.yield();
    }
}

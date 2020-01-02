package leetCodePractices.concurrency;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @author liuyuan
 * @create 2019-11-24 19:41
 * @description 打印零与奇偶数
 **/
public class ZeroEvenOdd {
    private final Semaphore semaphore=new Semaphore(2);
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        semaphore.acquire(2);
        printNumber.accept(0);
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(n%2);
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(n/2);
    }
}

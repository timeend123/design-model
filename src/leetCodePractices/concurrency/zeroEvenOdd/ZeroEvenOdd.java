package leetCodePractices.concurrency.zeroEvenOdd;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @author liuyuan
 * @create 2019-11-24 19:41
 * @description 打印零与奇偶数
 **/
public class ZeroEvenOdd {
    private final Semaphore semaphore = new Semaphore(1);
    //用于判断是否打印0打印0，1打印奇数，2打印偶数
    private int flag = 0;
    private int count = 1;
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while (count <= n) {
            semaphore.acquire(1);
            if (flag == 0&&count<=n) {
                printNumber.accept(0);
                flag = count % 2 == 0 ? 2 : 1;
            }
            semaphore.release(1);
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while (count <= n) {
            semaphore.acquire(1);
            if (flag == 2&&count<=n) {
                printNumber.accept(count++);
                flag = 0;
            }
            semaphore.release(1);
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while (count <= n) {
            semaphore.acquire(1);
            if (flag == 1&&count<=n) {
                printNumber.accept(count++);
                flag = 0;
            }
            semaphore.release(1);
        }
    }
}

package leetCodePractices.concurrency;

import java.util.function.IntConsumer;

/**
 * @author liuyuan
 * @create 2019-11-24 19:41
 * @description 打印零与奇偶数
 **/
public class ZeroEvenOdd {
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    //控制线程的等待与唤醒
    Object lock = new Object();
    //用于控制交替
    volatile int flag;
    //用于控制奇偶
    volatile int count=1;

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while (count<=n){
            synchronized (lock){
                if (flag!=0){
                    lock.wait();
                }
                printNumber.accept(0);
                if (count%2==0){
                    flag=2;
                }else {
                    flag=1;
                }
                lock.notifyAll();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while (count<=n){
            synchronized (lock){
                if (flag!=2){
                    lock.wait();
                }
                printNumber.accept(count);
                count++;
                flag=0;
                lock.notifyAll();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while (count<=n){
            synchronized (lock){
                if (flag!=1){
                    lock.wait();
                }
                printNumber.accept(count);
                count++;
                flag=0;
                lock.notifyAll();
            }
        }
    }
}

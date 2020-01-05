package leetCodePractices.concurrency.fizzBuzz;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @author liuyuan
 * @create 2020-01-05 17:47
 * @description 编写一个可以从 1 到 n 输出代表这个数字的字符串的程序，但是：
 * <p>
 * 如果这个数字可以被 3 整除，输出 "fizz"。
 * 如果这个数字可以被 5 整除，输出 "buzz"。
 * 如果这个数字可以同时被 3 和 5 整除，输出 "fizzbuzz"。
 * 例如，当 n = 15，输出： 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz
 **/
class FizzBuzz {
    private volatile int i = 1;
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (i <= n) {
            synchronized (this) {
                if (i <= n&&i % 3 == 0 && i % 5 != 0) {
                    printFizz.run();
                    i++;
                }
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (i <= n) {
            synchronized (this) {
                if (i <= n&&i % 3 != 0 && i % 5 == 0) {
                    printBuzz.run();
                    i++;
                }
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (i <= n) {
            synchronized (this) {
                if (i <= n&&i % 3 == 0 && i % 5 == 0) {
                    printFizzBuzz.run();
                    i++;
                }
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (i <= n) {
            synchronized (this) {
                if (i <= n&&i % 3 != 0 && i % 5 != 0) {
                    printNumber.accept(i);
                    i++;
                }
            }
        }
    }
}
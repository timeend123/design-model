package leetCodePractices.concurrency.fizzBuzz;

import java.util.function.IntConsumer;

/**
 * @author liuyuan
 * @create 2020-01-05 17:48
 * @description
 **/
public class TestFizzBuzz {
    final static FizzBuzz fizzBuzz = new FizzBuzz(15);

    public static void main(String[] args) throws InterruptedException {
        Thread fizzThread = new Thread(() -> {
            try {
                fizzBuzz.fizz(() -> System.out.println("fizz"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread buzzThread = new Thread(() -> {
            try {
                fizzBuzz.buzz(() -> System.out.println("buzz"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread fizzbuzzThread = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> System.out.println("fizzbuzz"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread numberThread = new Thread(() -> {
            try {
                fizzBuzz.number(value -> System.out.println(value));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        fizzThread.start();
        Thread.yield();
        buzzThread.start();
        Thread.yield();
        fizzbuzzThread.start();
        Thread.yield();
        numberThread.start();
        Thread.yield();
    }
}

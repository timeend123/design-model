package leetCodePractices.concurrency;

/**
 * @author liuyuan
 * @create 2019-11-24 18:21
 * @description 按顺序打印
 **/
class Foo {
    public volatile int count=1;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        while (count!=1){}
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        count++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (count!=2){}
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        count++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (count!=3){}
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        count++;
    }
}
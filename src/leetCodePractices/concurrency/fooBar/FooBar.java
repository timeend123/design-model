package leetCodePractices.concurrency.fooBar;

/**
 * @author liuyuan
 * @create 2019-11-24 18:57
 * @description 交替打印
 **/
public class FooBar {
    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    public Object lock = new Object();
    public volatile boolean flag;

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            synchronized (lock) {
                if (flag) {
                    lock.wait();
                }
                flag = true;
                printFoo.run();
                lock.notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
            synchronized (lock) {
                if (!flag) {
                    lock.wait();
                }
                flag = false;
                printBar.run();
                lock.notifyAll();
            }
        }
    }
}

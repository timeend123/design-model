package leetCodePractices.concurrency.diningPhilosophers;

import java.util.concurrent.Semaphore;

/**
 * @author liuyuan
 * @create 2020-01-05 19:24
 * @description 哲学家进餐问题
 **/
class DiningPhilosophers {
    //进餐次数
    private int n;
    private Semaphore[] semaphores=new Semaphore[5];

    public DiningPhilosophers(int n) {
        this.n=n;
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            pickLeftFork.run();
            pickRightFork.run();
            eat.run();
            putLeftFork.run();
            putRightFork.run();
        }
    }
}
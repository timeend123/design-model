package leetCodePractices.concurrency.diningPhilosophers;

import java.util.concurrent.Semaphore;

/**
 * @author liuyuan
 * @create 2020-01-05 19:24
 * @description 哲学家进餐问题
 **/
class DiningPhilosophers {
    private Semaphore[] semaphores = new Semaphore[5];

    public DiningPhilosophers() {
        //每个叉子同时只能有一个人使用，所以定义五个通信量
        for (int i = 0; i < semaphores.length; i++) {
            semaphores[i] = new Semaphore(1);
        }
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        //给叉子进行编号从顺时针分别位0，1，2，3，4，令右边的叉子编号与哲学家相同，则
        int rightFork = philosopher;
        int leftFork = (philosopher + 1) % 5;
        while (true) {
            if (semaphores[leftFork].tryAcquire()) {//尝试获取左边的叉子
                if (semaphores[rightFork].tryAcquire()) {//尝试获取右边的叉子
                    pickLeftFork.run();
                    pickRightFork.run();
                    eat.run();
                    putLeftFork.run();
                    semaphores[leftFork].release();
                    putRightFork.run();
                    semaphores[rightFork].release();
                    break;
                } else {//如果只拿到了左边的叉子
                    semaphores[leftFork].release();
                    Thread.yield();
                }
            } else {//如果一个叉子都没拿到
                Thread.yield();
            }
        }
    }
}

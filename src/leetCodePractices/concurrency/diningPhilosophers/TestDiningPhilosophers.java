package leetCodePractices.concurrency.diningPhilosophers;

/**
 * @author liuyuan
 * @create 2020-01-05 19:29
 * @description
 **/
public class TestDiningPhilosophers {
    private static DiningPhilosophers diningPhilosophers=new DiningPhilosophers();
    public static void main(String[] args) {
        Thread p0=new Thread(() -> {
            try {
                diningPhilosophers.wantsToEat(0,
                        () -> System.out.println("[0,1,1]"),
                        () -> System.out.println("[0,2,1]"),
                        () -> System.out.println("[0,0,3]"),
                        () -> System.out.println("[0,1,2]"),
                        () -> System.out.println("[0,2,2]"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread p1=new Thread(() -> {
            try {
                diningPhilosophers.wantsToEat(1,
                        () -> System.out.println("[1,1,1]"),
                        () -> System.out.println("[1,2,1]"),
                        () -> System.out.println("[1,0,3]"),
                        () -> System.out.println("[1,1,2]"),
                        () -> System.out.println("[1,2,2]"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread p2=new Thread(() -> {
            try {
                diningPhilosophers.wantsToEat(2,
                        () -> System.out.println("[2,1,1]"),
                        () -> System.out.println("[2,2,1]"),
                        () -> System.out.println("[2,0,3]"),
                        () -> System.out.println("[2,1,2]"),
                        () -> System.out.println("[2,2,2]"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread p3=new Thread(() -> {
            try {
                diningPhilosophers.wantsToEat(3,
                        () -> System.out.println("[3,1,1]"),
                        () -> System.out.println("[3,2,1]"),
                        () -> System.out.println("[3,0,3]"),
                        () -> System.out.println("[3,1,2]"),
                        () -> System.out.println("[3,2,2]"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread p4=new Thread(() -> {
            try {
                diningPhilosophers.wantsToEat(4,
                        () -> System.out.println("[4,1,1]"),
                        () -> System.out.println("[4,2,1]"),
                        () -> System.out.println("[4,0,3]"),
                        () -> System.out.println("[4,1,2]"),
                        () -> System.out.println("[4,2,2]"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        p0.start();
        Thread.yield();
        p1.start();
        Thread.yield();
        p2.start();
        Thread.yield();
        p3.start();
        Thread.yield();
        p4.start();
        Thread.yield();
    }
}

package concurrency.commonUtil;

import java.util.concurrent.Executor;

/**
 * @author liuyuan
 * @create 2020-01-06 20:40
 * @description
 **/
public class Invoker implements Executor {
    @Override
    public void execute(Runnable command) {
        command.run();
    }

    public static void main(String[] args) {
        Executor executor=new Invoker();
        executor.execute(()-> System.out.println("test"));
    }
}

package concurrency.countDownLatch;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author liuyuan
 * @create 2019-12-23 15:50
 * @description
 **/
public class Preloader {
    private final FutureTask<ProductInfo> futureTask=new FutureTask<ProductInfo>(() -> null);
    private final Thread thread=new Thread(futureTask);
    public void start(){
        thread.start();
    }
    public ProductInfo get() throws Throwable {
        try {
            return futureTask.get();
        }catch (ExecutionException e){
            Throwable cause=e.getCause();
            throw cause;
        }
    }
}

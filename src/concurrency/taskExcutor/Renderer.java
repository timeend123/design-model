package concurrency.taskExcutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;

/**
 * @author liuyuan
 * @create 2019-12-27 15:43
 * @description 通过completionService实现页面渲染器
 **/
public class Renderer {
    private final ExecutorService executorService;

    public Renderer(ExecutorService executorService) {
        this.executorService = executorService;
    }
    void renderPage(CharSequence sources){
        List<ImageInfo> info= new ArrayList<>();
        CompletionService<String> completionService=new ExecutorCompletionService<String>(executorService);
        completionService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }
        });
    }
}

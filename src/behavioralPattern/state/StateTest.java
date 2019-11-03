package behavioralPattern.state;

/**
 * @author liuyuan
 * @create 2019-11-03 18:49
 * @description 状态模式测试类
 **/
public class StateTest {
    public static void main(String[] args) {
        Context context=new Context();
        //每处理一次改变一次状态
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}

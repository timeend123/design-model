package behavioralPattern.interpreter;

/**
 * @author liuyuan
 * @create 2019-11-06 12:47
 * @description 解释器模式测试类
 **/
public class InterpreterTest {
    public static void main(String[] args) {
        Context bus=new Context();
        bus.operation("上海的老人");
        bus.operation("北京的老人");
        bus.operation("上海的小孩");
        bus.operation("老人");
    }
}

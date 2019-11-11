package pattern.behavioralPattern.command;

/**
 * @author liuyuan
 * @create 2019-11-03 16:38
 * @description 命令模式测试类
 **/
public class CommandTest {
    public static void main(String[] args) {
        Command command=new CommandA();
        Invoker invoker=new Invoker(command);
        invoker.call();
    }
}

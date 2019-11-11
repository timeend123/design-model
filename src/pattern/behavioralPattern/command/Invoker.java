package pattern.behavioralPattern.command;

/**
 * @author liuyuan
 * @create 2019-11-03 16:10
 * @description 调用者
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void call(){
        System.out.println("调用执行者命令command");
        command.execute();
    }
}

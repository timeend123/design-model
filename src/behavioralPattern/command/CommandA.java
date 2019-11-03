package behavioralPattern.command;

/**
 * @author liuyuan
 * @create 2019-11-03 16:07
 * @description 具体命令
 **/
public class CommandA implements Command {
    private Receiver receiver;

    public CommandA() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

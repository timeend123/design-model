package behavioralPattern.mediator;

/**
 * @author liuyuan
 * @create 2019-11-03 19:59
 * @description 抽象同事类
 **/
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    //接收方法
    public abstract void receive();
    //发送方法
    public abstract void send();

}

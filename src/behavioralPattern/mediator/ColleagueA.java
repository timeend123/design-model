package behavioralPattern.mediator;

/**
 * @author liuyuan
 * @create 2019-11-03 20:02
 * @description 同事A
 **/
public class ColleagueA extends Colleague {
    @Override
    public void receive() {
        System.out.println("同事A收到请求");
    }

    @Override
    public void send() {
        System.out.println("同事A发出请求");
        //让中介者转发
        mediator.replay(this);
    }
}

package behavioralPattern.mediator;

/**
 * @author liuyuan
 * @create 2019-11-03 20:02
 * @description 同事B
 **/
public class ColleagueB extends Colleague {
    @Override
    public void receive() {
        System.out.println("同事B收到请求");
    }

    @Override
    public void send() {
        System.out.println("同事B发出请求");
        //让中介者转发
        mediator.replay(this);
    }
}

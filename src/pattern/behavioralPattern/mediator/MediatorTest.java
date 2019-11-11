package pattern.behavioralPattern.mediator;

/**
 * @author liuyuan
 * @create 2019-11-03 20:56
 * @description 中介者模式测试类
 **/
public class MediatorTest {
    public static void main(String[] args) {
        //初始化同事和中介
        Colleague colleagueA=new ColleagueA();
        Colleague colleagueB=new ColleagueB();
        Mediator mediator=new MediatorA();
        //中介和同事分别联系
        mediator.register(colleagueA);
        mediator.register(colleagueB);
        colleagueA.send();
        colleagueB.send();
    }
}

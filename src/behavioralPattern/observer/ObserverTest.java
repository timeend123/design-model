package behavioralPattern.observer;

/**
 * @author liuyuan
 * @create 2019-11-03 19:04
 * @description 观察者模式测试类
 **/
public class ObserverTest {
    public static void main(String[] args) {
        //创建一个具体目标
        Subject subject=new SubjectA();
        //创建观察者
        Observer observerA=new ObserverA();
        Observer observerB=new ObserverB();
        //目标被观察者观察
        subject.addObserver(observerA);
        subject.addObserver(observerB);
        //发送通知
        subject.notifyObserver();
    }
}

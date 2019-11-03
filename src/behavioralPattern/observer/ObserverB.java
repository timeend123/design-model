package behavioralPattern.observer;

/**
 * @author liuyuan
 * @create 2019-11-03 18:58
 * @description 具体观察者B
 **/
public class ObserverB implements Observer{
    @Override
    public void response() {
        System.out.println("观察者B进行反应");
    }
}

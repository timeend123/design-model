package pattern.behavioralPattern.observer;

/**
 * @author liuyuan
 * @create 2019-11-03 18:58
 * @description 具体观察者A
 **/
public class ObserverA implements Observer{
    @Override
    public void response() {
        System.out.println("观察者A进行反应");
    }
}

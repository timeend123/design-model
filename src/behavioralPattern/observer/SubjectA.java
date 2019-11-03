package behavioralPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyuan
 * @create 2019-11-03 18:55
 * @description 具体目标A
 **/
public class SubjectA extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("目标发生了改变，需要通知给大家");
        System.out.println("--------");
        //各个观察者得到目标变化后的通知后进行反应
        for (Observer observer : observers) {
            observer.response();
        }
    }
}

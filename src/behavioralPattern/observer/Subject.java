package behavioralPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyuan
 * @create 2019-11-03 18:53
 * @description 抽象目标
 **/
public abstract class Subject {
    //定义存放观察者的list
    List<Observer> observers=new ArrayList<>();
    //定义增加观察者的方法
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    //定义删除观察者的方法
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    //定义一个通知观察者的方法
    public abstract void notifyObserver();
}

package pattern.behavioralPattern.memento;

/**
 * @author liuyuan
 * @create 2019-11-04 9:38
 * @description
 **/
public class MementoTest {
    public static void main(String[] args) {
        //创建一个发起人
        Originator originator=new Originator();
        //创建一个管理者
        Caretaker caretaker=new Caretaker();
        originator.setState("S0");
        System.out.println("初始状态:"+originator.getState());
        //创建新的状态，并进行保存
        Memento memento=originator.createMemento();
        caretaker.setMemento(memento);
        originator.setState("S1");
        System.out.println("新的状态:"+originator.getState());
        //恢复状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态:"+originator.getState());
    }
}

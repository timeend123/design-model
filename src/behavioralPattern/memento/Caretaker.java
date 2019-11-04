package behavioralPattern.memento;

/**
 * @author liuyuan
 * @create 2019-11-04 9:36
 * @description 管理者
 **/
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

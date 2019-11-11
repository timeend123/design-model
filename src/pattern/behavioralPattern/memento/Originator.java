package pattern.behavioralPattern.memento;

/**
 * @author liuyuan
 * @create 2019-11-04 9:23
 * @description 发起人
 **/
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建快照
    public Memento createMemento(){
        return new Memento(state);
    }
    //恢复快照
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}

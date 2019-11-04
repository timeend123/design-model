package behavioralPattern.memento;

/**
 * @author liuyuan
 * @create 2019-11-04 9:12
 * @description 备忘录（快照）
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

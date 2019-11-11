package pattern.behavioralPattern.state;

/**
 * @author liuyuan
 * @create 2019-11-03 18:42
 * @description 环境类
 **/
public class Context {
    private State state;
    //定义环境的初始状态
    public Context() {
        this.state = new StateA();
    }
    //设置状态
    public State getState() {
        return state;
    }
    //获取状态
    public void setState(State state) {
        this.state = state;
    }
    //对请求进行处理
    public void handle(){
        state.handle(this);
    }
}

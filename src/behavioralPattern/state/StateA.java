package behavioralPattern.state;

/**
 * @author liuyuan
 * @create 2019-11-03 18:41
 * @description 具体状态类A
 **/
public class StateA implements State {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态为A");
        //对状态进行改变
        context.setState(new StateB());
    }
}

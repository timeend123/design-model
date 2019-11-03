package behavioralPattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyuan
 * @create 2019-11-03 20:06
 * @description 具体中介者
 **/
public class MediatorA implements Mediator {
    private List<Colleague> colleagues=new ArrayList<>();
    //同事和中介相互联系
    @Override
    public void register(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setMediator(this);
    }
    //中介转发给两个同事
    @Override
    public void replay(Colleague colleague) {
        for (Colleague ob : colleagues) {
            if (ob.equals(colleague)){
                ob.receive();
            }
        }
    }
}

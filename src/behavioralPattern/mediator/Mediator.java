package behavioralPattern.mediator;

/**
 * @author liuyuan
 * @create 2019-11-03 19:57
 * @description 抽象中介者
 **/
public interface Mediator {
    //注册
    void register(Colleague colleague);
    //转发
    void replay(Colleague colleague);
}

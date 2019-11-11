package pattern.structuralPattern.bridge;

/**
 * @author liuyuan
 * @create 2019-10-28 9:21
 * @description 抽象化角色
 **/
public abstract class Abstraction {
    protected Implementor implementor;
    protected Abstraction(Implementor implementor){
        this.implementor=implementor;
    }
    public abstract void Operation();
}

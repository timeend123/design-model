package structuralPattern.flyweight;

/**
 * @author liuyuan
 * @create 2019-10-30 9:13
 * @description 抽象享元角色
 **/
public interface Flyweight {
    void operation(UnsharedFlyweight state);
}

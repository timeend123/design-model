package pattern.structuralPattern.flyweight;

/**
 * @author liuyuan
 * @create 2019-10-31 10:02
 * @description 享元模式测试
 **/
public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight flyweight01=factory.getFlyweight("a");
        Flyweight flyweight02=factory.getFlyweight("a");
        Flyweight flyweight03=factory.getFlyweight("a");
        Flyweight flyweight11=factory.getFlyweight("b");
        Flyweight flyweight12=factory.getFlyweight("b");
        flyweight01.operation(new UnsharedFlyweight("第一次调用"));
        flyweight02.operation(new UnsharedFlyweight("第二次调用"));
        flyweight03.operation(new UnsharedFlyweight("第三次调用"));
        flyweight11.operation(new UnsharedFlyweight("第一次调用"));
        flyweight12.operation(new UnsharedFlyweight("第二次调用"));

    }
}

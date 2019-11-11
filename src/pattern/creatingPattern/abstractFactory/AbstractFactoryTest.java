package pattern.creatingPattern.abstractFactory;

/**
 * @author liuyuan
 * @create 2019-10-25 11:15
 * @description 抽象工厂测试类
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory=new Factory();
        factory.createProduct1();
        factory.createProduct2();
    }
}

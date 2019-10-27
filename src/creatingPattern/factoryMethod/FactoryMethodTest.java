package creatingPattern.factoryMethod;

/**
 * @author liuyuan
 * @create 2019-10-25 10:01
 * @description 工厂方法模式测试类
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        factory1.createProduct();
        AbstractFactory factory2=new Factory2();
        factory2.createProduct();
    }
}

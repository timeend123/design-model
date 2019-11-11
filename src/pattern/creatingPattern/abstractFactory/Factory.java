package pattern.creatingPattern.abstractFactory;

/**
 * @author liuyuan
 * @create 2019-10-25 11:13
 * @description 抽象工厂方法，有多个创建产品的方法
 **/
public class Factory implements AbstractFactory {
    @Override
    public Product1 createProduct1() {
        System.out.println("生产产品1");
        return new Product1();
    }

    @Override
    public Product2 createProduct2() {
        System.out.println("生产产品2");
        return new Product2();
    }
}

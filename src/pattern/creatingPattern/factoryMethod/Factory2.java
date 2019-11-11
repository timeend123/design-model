package pattern.creatingPattern.factoryMethod;

/**
 * @author liuyuan
 * @create 2019-10-25 10:18
 * @description
 **/
public class Factory2 implements AbstractFactory {
    @Override
    public Product createProduct() {
        System.out.println("具体工厂2生产产品2");
        return new Product2();
    }
}

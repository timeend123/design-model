package pattern.creatingPattern.factoryMethod;

/**
 * @author liuyuan
 * @create 2019-10-25 10:14
 * @description
 **/
public class Factory1 implements AbstractFactory {
    @Override
    public Product createProduct() {
        System.out.println("具体工厂1生产产品1");
        return new Product1();
    }
}

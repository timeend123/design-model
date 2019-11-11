package pattern.creatingPattern.abstractFactory;

/**
 * @author liuyuan
 * @create 2019-10-25 11:09
 * @description 抽象工厂接口，提供多个工厂方法，用于创建产品
 **/
public interface AbstractFactory {
    public Product1 createProduct1();
    public Product2 createProduct2();
}

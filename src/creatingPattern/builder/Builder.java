package creatingPattern.builder;

/**
 * @author liuyuan
 * @create 2019-10-25 15:18
 * @description 抽象建造者
 **/
public abstract class Builder {
    //创建产品对象
    protected Product product=new Product();
    public abstract void createPart1();
    public abstract void createPart2();
    public abstract void createPart3();
    //返回产品对象
    public Product getResult(){
        return product;
    }
}

package creatingPattern.builder;

/**
 * @author liuyuan
 * @create 2019-10-25 15:46
 * @description 指挥者 调用建造者中的方法完成复杂对象的创建
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct(){
        builder.createPart1();
        builder.createPart2();
        builder.createPart3();
        return builder.getResult();
    }
}

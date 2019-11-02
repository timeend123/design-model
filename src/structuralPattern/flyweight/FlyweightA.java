package structuralPattern.flyweight;

/**
 * @author liuyuan
 * @create 2019-10-30 9:20
 * @description 具体享元角色
 **/
public class FlyweightA implements Flyweight{
    private String key;

    public FlyweightA(String key) {
        this.key = key;
        System.out.println("具体享元"+key+"被创建!");
    }

    @Override
    public void operation(UnsharedFlyweight state) {
        System.out.println("具体享元"+key+"被调用,");
        System.out.println("非享元信息是:"+state.getInfo());
    }
}

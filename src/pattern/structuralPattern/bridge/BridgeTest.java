package pattern.structuralPattern.bridge;

/**
 * @author liuyuan
 * @create 2019-10-28 9:05
 * @description 桥接模式测试类
 **/
public class BridgeTest {

    public static void main(String[] args) {
        Implementor implementor = new ImplementorA();
        Abstraction abstractionExt = new AbstractionExt(implementor);
        abstractionExt.Operation();
    }
}

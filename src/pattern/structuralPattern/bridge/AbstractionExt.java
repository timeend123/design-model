package pattern.structuralPattern.bridge;

/**
 * @author liuyuan
 * @create 2019-10-28 15:34
 * @description 扩展抽象化角色
 **/
public class AbstractionExt extends Abstraction {
    protected AbstractionExt(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("扩展化对象的操作!");
        implementor.OperationImpl();
    }
}

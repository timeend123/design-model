package structuralPattern.bridge;

/**
 * @author liuyuan
 * @create 2019-10-28 9:16
 * @description 具体实现化角色
 **/
public class ImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化角色操作");
    }
}

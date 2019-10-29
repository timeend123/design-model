package structuralPattern.decorator;

/**
 * @author liuyuan
 * @create 2019-10-29 16:29
 * @description
 **/
public class DecoratorA extends Decorator {
    public DecoratorA(Component component) {
        super(component);
    }
    public void operation(){
        super.operation();
        operationExt();
    }
    public void operationExt(){
        System.out.println("额外操作");
    }
}

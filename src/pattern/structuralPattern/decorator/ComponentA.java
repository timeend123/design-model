package pattern.structuralPattern.decorator;

/**
 * @author liuyuan
 * @create 2019-10-29 16:25
 * @description
 **/
public class ComponentA implements Component {
    public ComponentA() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}

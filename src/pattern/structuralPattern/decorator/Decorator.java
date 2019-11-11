package pattern.structuralPattern.decorator;

/**
 * @author liuyuan
 * @create 2019-10-29 16:27
 * @description 抽象装饰角色
 **/
public  class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

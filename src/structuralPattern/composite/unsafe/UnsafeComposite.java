package structuralPattern.composite.unsafe;

import java.util.ArrayList;

/**
 * @author liuyuan
 * @create 2019-11-01 10:07
 * @description
 **/
public class UnsafeComposite implements UnsafeComponent {
    private ArrayList<UnsafeComponent> children=new ArrayList<>();
    @Override
    public void add(UnsafeComponent component) {
        children.add(component);
    }

    @Override
    public void remove(UnsafeComponent component) {
        children.remove(component);
    }

    @Override
    public UnsafeComponent getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (UnsafeComponent child : children) {
            child.operation();
        }
    }
}

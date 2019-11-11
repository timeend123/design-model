package pattern.structuralPattern.composite.safe;

import java.util.ArrayList;

/**
 * @author liuyuan
 * @create 2019-11-01 10:30
 * @description
 **/
public class SafeComposite implements SafeComponent {
    private ArrayList<SafeComponent> children=new ArrayList<>();
    public void add(SafeComponent component){
        children.add(component);
    };
    public void remove(SafeComponent component){
        children.remove(component);
    }
    public SafeComponent getChild(int i){
        return children.get(i);
    }
    @Override
    public void operation() {
        for (SafeComponent child : children) {
            child.operation();
        }
    }
}

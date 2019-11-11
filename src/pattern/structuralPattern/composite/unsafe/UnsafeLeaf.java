package pattern.structuralPattern.composite.unsafe;

/**
 * @author liuyuan
 * @create 2019-11-01 10:06
 * @description
 **/
public class UnsafeLeaf implements UnsafeComponent {
    private String name;

    public UnsafeLeaf(String name) {
        this.name = name;
    }

    @Override
    public void add(UnsafeComponent component) {

    }

    @Override
    public void remove(UnsafeComponent component) {

    }

    @Override
    public UnsafeComponent getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶:"+name+"被访问");
    }
}

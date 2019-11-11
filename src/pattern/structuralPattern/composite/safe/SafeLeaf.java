package pattern.structuralPattern.composite.safe;

/**
 * @author liuyuan
 * @create 2019-11-01 10:33
 * @description
 **/
public class SafeLeaf implements SafeComponent {
    private String name;

    public SafeLeaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶:"+name+"被访问");
    }
}

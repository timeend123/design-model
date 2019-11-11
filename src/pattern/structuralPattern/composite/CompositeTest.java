package pattern.structuralPattern.composite;

import pattern.structuralPattern.composite.safe.SafeComponent;
import pattern.structuralPattern.composite.safe.SafeComposite;
import pattern.structuralPattern.composite.safe.SafeLeaf;
import pattern.structuralPattern.composite.unsafe.UnsafeComponent;
import pattern.structuralPattern.composite.unsafe.UnsafeComposite;
import pattern.structuralPattern.composite.unsafe.UnsafeLeaf;

/**
 * @author liuyuan
 * @create 2019-11-01 10:10
 * @description 组合模式测试类
 **/
public class CompositeTest {
    public static void main(String[] args) {
        //透明方式
        UnsafeComponent c0=new UnsafeComposite();
        UnsafeComponent c1=new UnsafeComposite();
        UnsafeComponent leaf1=new UnsafeLeaf("1");
        UnsafeComponent leaf2=new UnsafeLeaf("2");
        UnsafeComponent leaf3=new UnsafeLeaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
        //安全方式
        SafeComponent c2=new SafeComposite();
        SafeComponent c3=new SafeComposite();
        SafeComponent leaf4=new SafeLeaf("4");
        SafeComponent leaf5=new SafeLeaf("5");
        SafeComponent leaf6=new SafeLeaf("6");
        ((SafeComposite) c2).add(leaf4);
        ((SafeComposite) c2).add(c3);
        ((SafeComposite) c3).add(leaf5);
        ((SafeComposite) c3).add(leaf6);
        c2.operation();


    }
}

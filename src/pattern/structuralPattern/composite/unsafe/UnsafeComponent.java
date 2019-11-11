package pattern.structuralPattern.composite.unsafe;

/**
 * @author liuyuan
 * @create 2019-11-01 10:03
 * @description 抽象构建
 **/
public interface UnsafeComponent {
    void add(UnsafeComponent component);
    void remove(UnsafeComponent component);
    UnsafeComponent getChild(int i);
    void operation();
}

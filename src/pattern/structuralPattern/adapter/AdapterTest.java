package pattern.structuralPattern.adapter;

/**
 * @author liuyuan
 * @create 2019-10-27 15:14
 * @description 适配器测试类
 **/
public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器测试:");
        Target target1=new ClassAdapter();
        target1.request();
        System.out.println("对象适配器类：");
        Adapter adapter=new Adapter();
        Target target2=new ObjectAdapter(adapter);
        target2.request();
    }
}

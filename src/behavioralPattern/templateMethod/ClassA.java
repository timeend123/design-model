package behavioralPattern.templateMethod;

/**
 * @author liuyuan
 * @create 2019-11-01 13:27
 * @description 具体实现类
 **/
public class ClassA extends AbstractClass{
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}

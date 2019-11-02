package behavioralPattern.templateMethod;

/**
 * @author liuyuan
 * @create 2019-11-01 13:21
 * @description 抽象类
 **/
public abstract class AbstractClass {
    //模板方法
    public void TemplateMethod(){
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    //具体方法
    public void specificMethod(){
        System.out.println("抽象类中具体方法被调用...");
    }
    //抽象方法1
    public abstract void abstractMethod1();
    //抽象方法2
    public abstract void abstractMethod2();
}

package pattern.behavioralPattern.templateMethod;

/**
 * @author liuyuan
 * @create 2019-11-01 13:29
 * @description 模板方法模式测试类
 **/
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass classA=new ClassA();
        classA.TemplateMethod();
    }
}

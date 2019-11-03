package behavioralPattern.visitor;

/**
 * @author liuyuan
 * @create 2019-11-03 22:53
 * @description 访问者模式测试类
 **/
public class VisitorTest {
    public static void main(String[] args) {
        ObjectStructure objectStructure=new ObjectStructure();
        objectStructure.addElement(new ElementA());
        objectStructure.addElement(new ElementB());
        Visitor visitor=new VisitorA();
        objectStructure.accept(visitor);
        visitor=new VisitorB();
        objectStructure.accept(visitor);
    }
}

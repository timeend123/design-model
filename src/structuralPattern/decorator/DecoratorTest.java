package structuralPattern.decorator;

/**
 * @author liuyuan
 * @create 2019-10-29 16:32
 * @description
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        Component componentA=new ComponentA();
        componentA.operation();
        System.out.println("--------");
        Component componentB=new DecoratorA(componentA);
        componentB.operation();
    }
}

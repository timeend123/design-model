package behavioralPattern.visitor;

/**
 * @author liuyuan
 * @create 2019-11-03 22:21
 * @description 具体元素B
 **/
public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB(){
        return "具体元素B的操作";
    }
}

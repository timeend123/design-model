package pattern.behavioralPattern.visitor;

/**
 * @author liuyuan
 * @create 2019-11-03 22:21
 * @description 具体元素A
 **/
public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationA(){
        return "具体元素A的操作";
    }
}

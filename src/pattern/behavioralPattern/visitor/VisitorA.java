package pattern.behavioralPattern.visitor;

/**
 * @author liuyuan
 * @create 2019-11-03 22:26
 * @description 具体访问者A
 **/
public class VisitorA implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("具体访问者A访问："+elementA.operationA());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("具体访问者A访问："+elementB.operationB());
    }
}

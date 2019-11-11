package pattern.behavioralPattern.visitor;

/**
 * @author liuyuan
 * @create 2019-11-03 22:08
 * @description 抽象访问类
 **/
public interface Visitor {
    void visit(ElementA elementA);
    void visit(ElementB elementB);
}

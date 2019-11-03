package behavioralPattern.visitor;

/**
 * @author liuyuan
 * @create 2019-11-03 22:20
 * @description 抽象元素类
 **/
public interface Element {
    void accept(Visitor visitor);
}

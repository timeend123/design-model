package pattern.behavioralPattern.interpreter;

/**
 * @author liuyuan
 * @create 2019-11-04 9:50
 * @description 抽象表达式类
 **/
public interface Expression {
    //解释方法
    public boolean interpret(String info);
}

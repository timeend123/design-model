package behavioralPattern.interpreter;

/**
 * @author liuyuan
 * @create 2019-11-04 9:50
 * @description 抽象表达式类
 **/
public interface AbstractExpression {
    //解释方法
    public Object interpret(String info);
}

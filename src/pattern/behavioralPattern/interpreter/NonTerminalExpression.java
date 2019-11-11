package pattern.behavioralPattern.interpreter;

/**
 * @author liuyuan
 * @create 2019-11-04 9:55
 * @description 非终结符表达式类
 **/
public class NonTerminalExpression implements Expression {
    private Expression city;
    private Expression person;

    public NonTerminalExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String s[]=info.split("的");
        return city.interpret(s[0])&&person.interpret(s[1]);
    }
}

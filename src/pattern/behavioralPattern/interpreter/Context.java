package pattern.behavioralPattern.interpreter;

/**
 * @author liuyuan
 * @create 2019-11-04 10:41
 * @description
 **/
public class Context {
    private String[] cities={"上海","杭州"};
    private String[] people={"老人","妇女","儿童"};
    private Expression cityPerson;

    public Context() {
        Expression city=new TerminalExpression(cities);
        Expression person=new TerminalExpression(people);
        cityPerson=new NonTerminalExpression(city,person);
    }
    public void operation(String info){
        boolean ok=cityPerson.interpret(info);
        if (ok){
            System.out.println("您是"+info+",您本次乘车免费！");
        }else {
            System.out.println(info+",您不是免费人员");
        }
    }
}

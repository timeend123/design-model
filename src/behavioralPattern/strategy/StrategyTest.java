package behavioralPattern.strategy;

/**
 * @author liuyuan
 * @create 2019-11-03 12:17
 * @description 策略模式测试类
 **/
public class StrategyTest {
    public static void main(String[] args) {
        Context context=new Context();
        Strategy strategyA=new StrategyA();
        context.setStrategy(strategyA);
        context.method();
        System.out.println("-----------");
        Strategy strategyB=new StrategyB();
        context.setStrategy(strategyB);
        context.method();
    }
}

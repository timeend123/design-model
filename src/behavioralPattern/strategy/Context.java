package behavioralPattern.strategy;

/**
 * @author liuyuan
 * @create 2019-11-03 12:16
 * @description 环境类
 **/
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void method(){
        strategy.method();
    }
}


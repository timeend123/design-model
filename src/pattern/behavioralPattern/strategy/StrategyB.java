package pattern.behavioralPattern.strategy;

/**
 * @author liuyuan
 * @create 2019-11-03 12:14
 * @description
 **/
public class StrategyB implements Strategy {
    @Override
    public void method() {
        System.out.println("具体策略B被访问！");
    }
}

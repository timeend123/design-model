package concurrency.numberRange;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liuyuan
 * @create 2019-12-15 15:51
 * @description 该方法使用了不安全的“先检查后执行”
 **/
public class NumberRange {
    private final AtomicInteger lower = new AtomicInteger(0);
    private final AtomicInteger upper = new AtomicInteger(0);

    public void setLower(int i) {
        if (i > upper.get()) {
            throw new IllegalArgumentException("can't set lower to " + i + " > upper"+upper.get());
        }
        lower.set(i);
    }
    public void setUpper(int i){
        if (i<lower.get()){
            throw new IllegalArgumentException("can't set upper to "+ i+" < lower"+lower.get());
        }
        upper.set(i);
    }
    public boolean isInRange(int i){
        return (i >= lower.get() && i<=upper.get());
    }

    @Override
    public String toString() {
        return "NumberRange{" +
                "lower=" + lower +
                ", upper=" + upper +
                '}';
    }
}

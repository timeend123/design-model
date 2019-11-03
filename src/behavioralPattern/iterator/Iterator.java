package behavioralPattern.iterator;

/**
 * @author liuyuan
 * @create 2019-11-03 21:50
 * @description 抽象迭代器
 **/
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}

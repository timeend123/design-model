package behavioralPattern.iterator;

/**
 * @author liuyuan
 * @create 2019-11-03 21:46
 * @description 抽象聚合类
 **/
public interface Aggregate {
    void add(Object object);

    void remove(Object object);

    Iterator getIterator();
}

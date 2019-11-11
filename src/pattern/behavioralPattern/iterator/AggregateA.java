package pattern.behavioralPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyuan
 * @create 2019-11-03 21:48
 * @description 具体聚合类
 **/
public class AggregateA implements Aggregate {
    private List<Object> list=new ArrayList<>();
    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new IteratorA(list);
    }
}

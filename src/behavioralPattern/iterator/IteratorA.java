package behavioralPattern.iterator;

import java.util.List;

/**
 * @author liuyuan
 * @create 2019-11-03 21:51
 * @description 具体迭代器
 **/
public class IteratorA implements Iterator {
    private List<Object> list=null;
    private int index=0;

    public IteratorA(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index=0;
        Object object=list.get(index);
        return object;
    }

    @Override
    public Object next() {
        Object object=null;
        if (this.hasNext()){
            object=list.get(index++);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if (index<list.size()){
            return true;
        }
        return false;
    }
}

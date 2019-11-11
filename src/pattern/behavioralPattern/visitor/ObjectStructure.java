package pattern.behavioralPattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liuyuan
 * @create 2019-11-03 22:49
 * @description 对象结构角色
 **/
public class ObjectStructure {
    private List<Element> list=new ArrayList<>();
    public void accept(Visitor visitor){
        Iterator<Element> iterator=list.iterator();
        while (iterator.hasNext()){
            iterator.next().accept(visitor);
        }
    }
    public void addElement(Element element){
        list.add(element);
    }
    public void removeElement(Element element){
        list.remove(element);
    }
}

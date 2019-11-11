package pattern.behavioralPattern.iterator;

/**
 * @author liuyuan
 * @create 2019-11-03 21:57
 * @description
 **/
public class IteratorTest {
    public static void main(String[] args) {
        Aggregate aggregate=new AggregateA();
        aggregate.add("测试1");
        aggregate.add("测试2");
        aggregate.add("测试3");
        aggregate.add("测试4");
        System.out.println("遍历：");
        Iterator iterator=aggregate.getIterator();
        while (iterator.hasNext()){
            Object object=iterator.next();
            System.out.println(object.toString()+"\n");
        }
        Object object=iterator.first();
        System.out.println("\nfirst:"+object.toString());
    }
}

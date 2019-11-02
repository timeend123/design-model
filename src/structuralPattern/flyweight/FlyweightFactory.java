package structuralPattern.flyweight;

import java.util.HashMap;

/**
 * @author liuyuan
 * @create 2019-10-31 9:53
 * @description
 **/
public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweights=new HashMap();
    public Flyweight getFlyweight(String key){
        Flyweight flyweight=flyweights.get(key);
        if (flyweight!=null){
            System.out.println("具体享元"+key+"已经存在，被成功获取!");
        }else{
            flyweight=new FlyweightA(key);
            flyweights.put(key,flyweight);
        }
        return flyweight;
    }
}

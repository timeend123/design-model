package creatingPattern.singleton;

/**
 * @author liuyuan
 * @create 2019-10-24 10:53
 * @description 饿汉单例模式
 **/
public class HungarySingleton {
    //私有化构造函数的时候就进行了实例化
    private static final HungarySingleton instance=new HungarySingleton();
    //提供私有化构造函数
    private HungarySingleton(){}
    //提供一个线程安全的公共方法供外部实例化对象
    public static HungarySingleton getInstance(){
        return instance;
    }
}

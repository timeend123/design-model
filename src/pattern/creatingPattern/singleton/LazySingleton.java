package pattern.creatingPattern.singleton;

/**
 * @author liuyuan
 * @create 2019-10-24 10:33
 * @description 懒汉单例模式
 **/
public class LazySingleton {
    //私有化对象
    private static volatile LazySingleton instance = null;
    //私有化构造函数
    private LazySingleton(){};
    //提供方法实例化对象
    public static synchronized LazySingleton getInstance(){
        //如果未实例化
        if (instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}

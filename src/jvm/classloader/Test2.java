package jvm.classloader;

/**
 * @author liuyuan
 * @create 2019-11-18 16:06
 * @description 通过数组定义来引用类，不会触发此类的初始化
 **/
public class Test2 {
    public static void main(String[] args) {
        SuperClass[] sca=new SuperClass[10];
    }
}

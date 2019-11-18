package jvm.classloader;

/**
 * @author liuyuan
 * @create 2019-11-18 15:26
 * @description
 **/
public class SuperClass {
    static {
        System.out.println("superClass init!");
    }
    public static int value=123;
}

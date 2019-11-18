package jvm.classloader;

/**
 * @author liuyuan
 * @create 2019-11-18 15:29
 * @description
 **/
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}

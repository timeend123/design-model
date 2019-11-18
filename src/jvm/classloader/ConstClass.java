package jvm.classloader;

/**
 * @author liuyuan
 * @create 2019-11-18 16:03
 * @description
 **/
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }
    public static final String HELLO_WORLD="hello world";
}

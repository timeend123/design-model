package jvm.classloader;

/**
 * @author liuyuan
 * @create 2019-11-18 15:31
 * @description 对于静态字段，只有直接定义这个字段的类才会被初始化
 **/
public class Test1 {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

package jvm.classloader;

/**
 * @author liuyuan
 * @create 2019-11-19 9:14
 * @description 字段解析顺序详解
 **/
public class FieldResolve {
    interface Interface0{
        int A=0;
    }
    interface Interface1 extends Interface0{
        int A=1;
    }
    interface Interface2{
        int A=2;
    }
    static class Parent implements Interface1{
        public static int A=3;
    }
    static class Sub extends Parent implements Interface2{
        public static int A=4;
    }

    public static void main(String[] args) {
        System.out.println(Sub.A);
    }
}

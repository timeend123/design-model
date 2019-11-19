package jvm.classloader;

/**
 * @author liuyuan
 * @create 2019-11-19 10:04
 * @description <clinit>()方法执行顺序
 **/
public class Test5 {
    static class Parent{
        public Parent() {
            System.out.println("parent");
        }

        public static int A=1;
        static {
            A=2;
        }
    }
    static class Sub extends Parent{
        public Sub() {
            System.out.println("Sub");
        }

        public static int B=A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
        new Sub();
    }
}

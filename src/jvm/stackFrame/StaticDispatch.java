package jvm.stackFrame;

/**
 * @author liuyuan
 * @create 2019-11-20 14:41
 * @description 静态分派
 **/
public class StaticDispatch {
    static abstract class Human{}
    static class Man extends Human{}
    static class Woman extends Human{}
    public void sayHello(Human guy) {
        System.out.println("hello guy");
    }
    public void sayHello(Man man) {
        System.out.println("hello man");
    }
    public void sayHello(Woman woman){
        System.out.println("hello woman");
    }

    public static void main(String[] args) {
        StaticDispatch staticDispatch=new StaticDispatch();
        Human man=new Man();
        Human woman=new Woman();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(woman);
//        Human man=new Man();
//        man=new Woman();
//        staticDispatch.sayHello((Man) man);
//        staticDispatch.sayHello((Woman) man);
    }
}

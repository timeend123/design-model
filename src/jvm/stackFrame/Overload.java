package jvm.stackFrame;

import java.io.Serializable;

/**
 * @author liuyuan
 * @create 2019-11-20 14:56
 * @description 重载方法匹配优先级
 **/
public class Overload {
    public static void sayHello(Object arg){
        System.out.println("hello Object");
    }
    public static void sayHello(int arg){
        System.out.println("hello int");
    }
    public static void sayHello(long arg){
        System.out.println("hello character");
    }
    public static void sayHello(Character arg){
        System.out.println("hello char");
    }
    public static void sayHello(char arg){
        System.out.println("hello char");
    }
    public static void sayHello(char... arg){
        System.out.println("hello char...");
    }
    public static void sayHello(Serializable arg){
        System.out.println("hello Serializable");
    }

    public static void main(String[] args) {
        sayHello('a');
    }
}

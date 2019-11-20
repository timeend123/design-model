package jvm.stackFrame;

/**
 * @author liuyuan
 * @create 2019-11-20 14:03
 * @description 局部变量表测试
 **/
public class SlotTest {
    public static void main(String[] args) {
        SlotTest test=new SlotTest();
//        test.test1();
//        test.test2();
        test.test3();
    }
    public static void test1(){
        byte[] placeholder=new byte[64*1024*1024];
        System.gc();
    }
    public static void test2(){
        {
            byte[] placeholder=new byte[64*1024*1024];
        }
        System.gc();
    }
    public static void test3(){
        {
            byte[] placeholder=new byte[64*1024*1024];
        }
        int a=0;
        System.gc();
    }
}

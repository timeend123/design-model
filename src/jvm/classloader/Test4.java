package jvm.classloader;

/**
 * @author liuyuan
 * @create 2019-11-19 9:59
 * @description 初始化测试类---非法向前引用变量,初始化时候静态语句块从上往下执行
 **/
public class Test4 {
    static {
        i=0;//给变量赋值，可以正常运行
//        System.out.println(i);//编译会提示"非法向前引用"
    }
    static int i=1;

}

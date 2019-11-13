package jvm;

/**
 * @author liuyuan
 * @create 2019-11-13 21:39
 * @description 通过循环引用证明GC并不是通过引用计数算法的
 **/
public class ReferenceCountGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountGC objA = new ReferenceCountGC();
        ReferenceCountGC objB = new ReferenceCountGC();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}

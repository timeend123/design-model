package jvm.exception;

/**
 * @author liuyuan
 * @create 2019-11-11 22:13
 * @description
 **/
public class JavaVMStackSOF {
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) {
        JavaVMStackSOF omm=new JavaVMStackSOF();
        try {
            omm.stackLeak();
        }catch (Throwable e){
            System.out.println("stackLength:"+omm.stackLength);
            throw e;
        }
    }
}

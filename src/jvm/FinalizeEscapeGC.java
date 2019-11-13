package jvm;

/**
 * @author liuyuan
 * @create 2019-11-13 21:55
 * @description 对象在被GC时可以进行自我拯救，但是这种自救是通过对象的finalize方法进行的，只会执行一次，尽量不要使用这种方式去自救
 **/
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK=null;
    public void isAlive(){
        System.out.println("yes, I am still alive!");
    }
    @Override
    protected void finalize() {
//        super.notify();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK=this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK=new FinalizeEscapeGC();
        //对象第一次成功拯救自己
        SAVE_HOOK =null;
        System.gc();
        //finalize方法优先级很低，所以暂停0.5秒等待它
        Thread.sleep(500);
        if (SAVE_HOOK !=null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no,I am dead!");
        }
        //第二次拯救自己失败了
        SAVE_HOOK =null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK !=null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no,I am dead!");
        }
    }

}

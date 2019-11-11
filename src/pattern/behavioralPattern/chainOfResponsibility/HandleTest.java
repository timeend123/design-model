package pattern.behavioralPattern.chainOfResponsibility;

/**
 * @author liuyuan
 * @create 2019-11-03 18:38
 * @description 责任链式模式测试类
 **/
public class HandleTest {
    public static void main(String[] args) {
        Handler handlerA=new HandlerA();
        Handler handlerB=new HandlerB();
        handlerA.setNext(handlerB);
        handlerA.handleRequest("B");
    }
}

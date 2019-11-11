package pattern.behavioralPattern.chainOfResponsibility;

/**
 * @author liuyuan
 * @create 2019-11-03 18:31
 * @description 抽象处理者角色
 **/
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
    //处理请求的方法
    public abstract void handleRequest(String request);
}

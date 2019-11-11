package pattern.behavioralPattern.chainOfResponsibility;

/**
 * @author liuyuan
 * @create 2019-11-03 18:33
 * @description 具体处理者A
 **/
public class HandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("A".equals(request)){
            System.out.println("处理者A处理该请求！");
        }else{
            if (getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("无人处理请求！");
            }
        }
    }
}

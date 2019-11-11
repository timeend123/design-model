package pattern.structuralPattern.proxy;

/**
 * @author liuyuan
 * @create 2019-10-27 14:53
 * @description 代理类
 **/
public class Proxy implements Subject {
    RealSubject realSubject;
    @Override
    public void Request() {
        if (realSubject==null){
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("预请求处理");
    }
    public void postRequest(){
        System.out.println("访问后请求处理");
    }
}

package pattern.structuralPattern.proxy;

/**
 * @author liuyuan
 * @create 2019-10-25 16:58
 * @description 真实主题类
 **/
public class RealSubject implements Subject{

    @Override
    public void Request() {
        System.out.println("访问真实主题。。");
    }
}

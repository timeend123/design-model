package structuralPattern.flyweight;

/**
 * @author liuyuan
 * @create 2019-10-30 9:15
 * @description 非享元具体角色
 **/
public class UnsharedFlyweight {
    private String info;

    public UnsharedFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

package creatingPattern.prototype;

/**
 * @author liuyuan
 * @create 2019-10-24 13:41
 * @description
 **/
public class Prototype implements Cloneable{
    public Prototype() {
    }
    //克隆的方法
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}

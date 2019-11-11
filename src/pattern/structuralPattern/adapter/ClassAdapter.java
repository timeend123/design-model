package pattern.structuralPattern.adapter;

/**
 * @author liuyuan
 * @create 2019-10-27 15:12
 * @description 类适配器类（它是一个转换器，通过继承适配者，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者）
 **/
public class ClassAdapter extends Adapter implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}

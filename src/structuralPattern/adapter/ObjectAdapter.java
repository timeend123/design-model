package structuralPattern.adapter;

/**
 * @author liuyuan
 * @create 2019-10-27 15:24
 * @description 对象适配器类（它是一个转换器，通过引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者）
 **/
public class ObjectAdapter implements Target {
    private Adapter adapter;

    public ObjectAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void request() {
        adapter.specificRequest();
    }
}

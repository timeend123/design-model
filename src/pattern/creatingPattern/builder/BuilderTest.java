package pattern.creatingPattern.builder;

/**
 * @author liuyuan
 * @create 2019-10-25 15:50
 * @description
 **/
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder=new MyBuilder();
        Director director=new Director(builder);
        Product product = director.construct();
        product.show();
    }
}

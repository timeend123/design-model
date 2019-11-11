package pattern.creatingPattern.builder;

/**
 * @author liuyuan
 * @create 2019-10-25 15:35
 * @description
 **/
public class MyBuilder extends Builder {
    @Override
    public void createPart1() {
        product.setPart1("建造 part1");
    }

    @Override
    public void createPart2() {
        product.setPart2("建造 part2");
    }

    @Override
    public void createPart3() {
        product.setPart3("建造 part3");
    }
}

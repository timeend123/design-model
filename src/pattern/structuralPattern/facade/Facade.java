package pattern.structuralPattern.facade;

/**
 * @author liuyuan
 * @create 2019-10-30 9:04
 * @description 外观角色（为多个子系统对外提供一个共同的接口）
 **/
public class Facade {
    private SubSystem01 system01=new SubSystem01();
    private SubSystem02 system02=new SubSystem02();
    public void method(){
        system01.method();
        system02.method();
    }
}

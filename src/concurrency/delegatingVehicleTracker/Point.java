package concurrency.delegatingVehicleTracker;

/**
 * @author liuyuan
 * @create 2019-12-14 16:48
 * @description 不可变point类
 **/
public class Point {
    public final int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

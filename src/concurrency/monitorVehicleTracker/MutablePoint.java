package concurrency.monitorVehicleTracker;

/**
 * @author liuyuan
 * @create 2019-12-09 15:28
 * @description 可变point类
 **/
public class MutablePoint {
    public int x, y;

    public MutablePoint() {
        x = 0;
        y = 0;
    }

    public MutablePoint(MutablePoint point) {
        this.x = point.x;
        this.y = point.y;
    }
}

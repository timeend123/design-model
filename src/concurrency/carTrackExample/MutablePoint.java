package concurrency.carTrackExample;

/**
 * @author liuyuan
 * @create 2019-12-03 15:56
 * @description
 **/
public class MutablePoint {
    public int x,y;

    public MutablePoint() {
        x=0;
        y=0;
    }
    public MutablePoint(MutablePoint p){
        this.x=p.x;
        this.y=p.y;
    }
}

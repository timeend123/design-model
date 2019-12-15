package concurrency.delegatingVehicleTracker;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author liuyuan
 * @create 2019-12-14 16:51
 * @description 基于委托的车辆追踪器
 **/
public class DelegatingVehicleTracker {
    private final ConcurrentMap<String,Point> locations;
    private final Map<String,Point> unmodifiableMap;

    public DelegatingVehicleTracker(Map<String,Point> points) {
        this.locations = new ConcurrentHashMap<String,Point>();
        this.unmodifiableMap = Collections.unmodifiableMap(locations);
    }
    public Map<String,Point> getLocations(){
        return unmodifiableMap;
    }
    public Point getLocation(String id){
        return locations.get(id);
    }
    public void setLocation(String id,int x,int y){
        if (locations.replace(id,new Point(x,y))==null){
            throw new  IllegalArgumentException("invalid vehicle name: "+id);
        }
    }
}

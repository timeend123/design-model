package concurrency.carTrackExample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyuan
 * @create 2019-12-03 15:55
 * @description 基于监视器模式的车辆追踪
 **/
public class MonitorVehicleTracker {
    private final Map<String, MutablePoint> locations;

    public MonitorVehicleTracker(Map<String, MutablePoint> locations) {
        this.locations = locations;
    }

    public synchronized Map<String, MutablePoint> getLocations() {
        return deepCopy(locations);
    }

    public synchronized MutablePoint getLocation(String id) {
        MutablePoint location = locations.get(id);
        return location == null ? null : new MutablePoint(location);
    }

    public synchronized void setLocations(String id, int x, int y) {
        MutablePoint location = locations.get(id);
        if (location == null) {
            throw new IllegalArgumentException("No such ID:" + id);
        }
        location.x = x;
        location.y = y;
    }
    private static Map<String,MutablePoint> deepCopy(Map<String,MutablePoint> map){
        Map<String,MutablePoint> result=new HashMap<>();
        for (String id:map.keySet()){
            result.put(id,new MutablePoint(map.get(id)));
        }
            return Collections.unmodifiableMap(result);
    }
}

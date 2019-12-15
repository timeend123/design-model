package concurrency.monitorVehicleTracker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyuan
 * @create 2019-12-09 15:28
 * @description
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
        MutablePoint loc = locations.get(id);
        return loc == null ? null : new MutablePoint(loc);
    }

    public synchronized void setLocation(String id, int x, int y) {
        MutablePoint loc = locations.get(id);
        if (loc == null) {
            throw new IllegalArgumentException("NO such Id: " + id);
        }
        loc.x = x;
        loc.y = y;
    }

    private static Map<String, MutablePoint> deepCopy(Map<String, MutablePoint> map) {
        Map<String, MutablePoint> result = new HashMap<>();
        for (String id : map.keySet()) {
            result.put(id, new MutablePoint(map.get(id)));
        }
        return Collections.unmodifiableMap(result);
    }
}

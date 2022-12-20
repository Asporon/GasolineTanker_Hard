package gasolineTanker;

import java.util.HashMap;
import java.util.ArrayList;

public class MapsCollection {
    HashMap<String, MapWithSetTrucksGeneric<DrawningObjectTruck, AbstractMap>> _mapStorages;
    private int _pictureWidth;
    private int _pictureHeight;
    
    public ArrayList<String> getKeys(){
        return new ArrayList<>(_mapStorages.keySet());
    }
    
    public MapsCollection(int pictureWidth, int pictureHeight) {
        _mapStorages = new HashMap<String, MapWithSetTrucksGeneric<DrawningObjectTruck, AbstractMap>>();
        _pictureWidth = pictureWidth;
        _pictureHeight = pictureHeight;
    }
    
    public void addMap(String name, AbstractMap map) {
        if (!_mapStorages.containsKey(name)) {
            _mapStorages.put(name, new MapWithSetTrucksGeneric<DrawningObjectTruck, AbstractMap>
                (_pictureWidth, _pictureHeight, map));
        }
    }
    
    public void delMap(String name) {
        if (_mapStorages.containsKey(name)) {
            _mapStorages.remove(name); 
        }
    }
    
    public MapWithSetTrucksGeneric<DrawningObjectTruck, AbstractMap> get(String ind){
        if (_mapStorages.containsKey(ind)) {
            return _mapStorages.get(ind);
        } else {
            return null;
        }
    }
    
    public DrawningObjectTruck get(String map, int truck) {
        if (_mapStorages.containsKey(map)) {
            return _mapStorages.get(map).getSetTruck().get(truck);
        } else {
            return null;
        }
    }
}

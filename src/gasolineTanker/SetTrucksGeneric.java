package gasolineTanker;

import java.util.ArrayList;

public class SetTrucksGeneric<T> {
    private ArrayList<T> _places;
    private int _maxCount;
    
    public int getCount() { return _places.size();}
    
    public SetTrucksGeneric(int count) {
        _maxCount = count;
        _places = new ArrayList<T>();
    }
    
    public int insert(T truck) {
        return insert(truck, 0);
    }
    
    public int insert(T truck, int position) {
        if (position <= _places.size() && _places.size() < _maxCount && position >= 0) {
            _places.add(position, truck);
            return position;
        } else {
            return -1;
        }        
    }
    
    public T remove(int position) {
        if (position < _places.size() && position >= 0) {
            var truck = _places.get(position);
            _places.remove(position);
            return truck;
        } else {
            return null;
        }
    }
    
    public T get(int position) {
        if (position < _places.size() && position >= 0) {
            return _places.get(position);
        } else {
            return null;
        }
    }
    
    public void set(T truck, int position) {
        if (position < _places.size() && position >= 0) {
            _places.set(position, truck);
        }
    }
}

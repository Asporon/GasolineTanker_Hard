package gasolineTanker;

public class SetTrucksGeneric<T> {
    private final T[] _places;
    private int count;
    
    public int getCount() { return count;}
    
    public SetTrucksGeneric(int count) {
        _places = (T[]) new Object[count];
        this.count = count;
    }
    
    public int insert(T truck) {
        return insert(truck, 0);
    }
    
    public int insert(T truck, int position) {
        if (_places[position] != null)
        {
            boolean freeSpace = false;
            int firstFreeElement = -1;
            for (int i = count - 1; i >= position; i--)
            {
                if (_places[i] == null)
                {
                    freeSpace = true;
                    firstFreeElement = i;
                }
            }
            if (!freeSpace)
                return -1;

            for (int i = firstFreeElement - 1; i >= position; i--)
            {
                _places[i + 1] = _places[i];
            }
        }
        _places[position] = truck;
        return position;
    }
    
    public T remove(int position) {
        if (_places[position] != null)
        {
            T result = _places[position];
            _places[position] = null;
            return result;
        } else
            return null;
    }
    
    public T get(int position) {
        if (_places[position] != null)
            return _places[position];
        else return null;
    }
}

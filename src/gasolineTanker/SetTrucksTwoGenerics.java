package gasolineTanker;

import java.util.Random;

public class SetTrucksTwoGenerics<T extends EntityTruck, U extends IDrawningWheels> {
    private Object[] _trucks;
    private Object[] _wheelSet;
    private int count;
    private int trucksCount = 0;
    private int wheelSetCount = 0;
    
    public SetTrucksTwoGenerics(int count) {
        _trucks = new Object[count];
        _wheelSet = new Object[count];
        this.count = count;
    }
    
    public int insert(T truck) {
        if (trucksCount < count) {
            for (int i = trucksCount - 1 ; i >= 0; i--) {
                _trucks[i + 1] = _trucks[i];
            }
            _trucks[0] = truck;
            trucksCount++;
            return 0;
        } else {
            return -1;
        }
    }
    
    public int insert(U wheels) {
        if (wheelSetCount < count) {
            for (int i = wheelSetCount - 1 ; i >= 0; i--) {
                _wheelSet[i + 1] = _wheelSet[i];
            }
            _wheelSet[0] = wheels;
            wheelSetCount++;
            return 0;
        } else {
            return -1;
        }
    }
    
    public DrawningTruck createTruck() {
        Random rnd = new Random();
        
        T truck = (T)_trucks[rnd.nextInt(0, count)];
        U wheels = (U) _wheelSet[rnd.nextInt(0, count)];
        int disk = -1;
        if (wheels instanceof DrawningTrucksWheels) 
            disk = 0;
        else if (wheels instanceof DrawningTrucksWheelsScrew)
            disk = 1;
        else if (wheels instanceof DrawningTrucksWheelsSpoke)
            disk = 2;
        
        if (truck instanceof EntityGasolineTanker gasolineTanker) 
            return new DrawningGasolineTanker(gasolineTanker.getSpeed(), gasolineTanker.getWeight(),
                gasolineTanker.getBodyColor(), wheels.getWheels(), disk,
                gasolineTanker.getDopColor(), gasolineTanker.getCistern(), gasolineTanker.getFlasher());
        else
            return new DrawningTruck(truck.getSpeed(), truck.getWeight(),
               truck.getBodyColor(), wheels.getWheels(), disk);
    } 
}

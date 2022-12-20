package gasolineTanker;

import java.awt.*;

public class DrawningObjectTruck implements IDrawningObject {
    private DrawningTruck _truck = null;
    private float step;
    
    public DrawningObjectTruck(DrawningTruck truck){
        _truck = truck;
        if (_truck.Truck != null)
            step = _truck.Truck.getStep();
        else 
            step = 0;
    }
    
    public DrawningTruck getDrawningTruck() { return _truck; }
    
        @Override
    public float getStep() { return step; }
  
        @Override
    public void setObject(int x, int y, int width, int height) {
        _truck.setPosition(x, y, width, height);
    }
    
        @Override
    public void moveObject(Direction direction) {
        if (_truck != null)
            _truck.moveTransport(direction);
    }
    
        @Override
    public void drawningObject(Graphics g) {
        _truck.drawTransport(g);
    }
    
        @Override
    public float[] getCurrentPosition() {
        if (_truck != null) {
            return _truck.getCurrentPosition();
        } else
            return null;
    } 
}

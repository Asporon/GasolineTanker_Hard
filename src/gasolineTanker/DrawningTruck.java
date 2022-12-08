package gasolineTanker;

import java.awt.*;

public class DrawningTruck {
    private EntityTruck Truck;
    private DrawningTrucksWheels Wheels;
    
    private float _startPosX;
    private float _startPosY;
    private Integer _pictureWidth = null;
    private Integer _pictureHeight = null;
    private final int _truckWidth = 90;
    private final int _truckHeight = 70;
    
    public EntityTruck getTruck() { return Truck; }
    
    public void init(int speed, float weight, Color bodyColor, int wheels) {
        Truck = new EntityTruck();
        Truck.init(speed, weight, bodyColor);
        
        Wheels = new DrawningTrucksWheels();
        Wheels.setWheels(wheels);
    }
    
    public void setPosition(int x, int y, int width, int height) {
        if (x > 0 && y > 0 && width > 0 && height > 0 
            && x + _truckWidth < width && y + _truckHeight < height)
        {
            _startPosX = x;
            _startPosY = y;
            _pictureWidth = width;
            _pictureHeight = height;
        }
    }
    
    public void moveTransport(Direction direction) {
        if (_pictureWidth == null || _pictureHeight == null) {
            return;
        }
        switch (direction) {
            case Up:
                if (_startPosY - Truck.getStep() > 0)
                    _startPosY -= Truck.getStep();
                break;
            case Right:
                if (_startPosX + _truckWidth + Truck.getStep() < _pictureWidth)
                    _startPosX += Truck.getStep();
                break;
            case Down:
                if (_startPosY + _truckHeight + Truck.getStep() < _pictureHeight)
                    _startPosY += Truck.getStep();
                break;
            case Left:
                if (_startPosX - Truck.getStep() > 0)
                    _startPosX -= Truck.getStep();
                break;
        }
    }
    
    public void drawTransport(Graphics g) {
        if (_startPosX < 0 || _startPosY < 0
            || _pictureHeight == null || _pictureWidth == null){
            return;
        }
        
        Color bodyColor;
        if (Truck != null) 
            bodyColor = Truck.getBodyColor();
        else
            bodyColor = Color.BLACK;
        
        g.setColor(bodyColor);
        g.fillRect((int)_startPosX + 70, (int)_startPosY, 20, 30);
        g.fillRect((int)_startPosX, (int)_startPosY + 35, 90, 15);

        Wheels.drawWheels(g, (int)_startPosX, (int)_startPosY + 50, bodyColor);
    }
    
    public void changeBorders(int width, int height) {
        _pictureWidth = width;
        _pictureHeight = height;
        if (_pictureWidth <= _truckWidth || _pictureHeight <= _truckHeight)
        {
            _pictureWidth = null;
            _pictureHeight = null;
            return;
        }
        if (_startPosX + _truckWidth > _pictureWidth)
            _startPosX = _pictureWidth - _truckWidth;
        if (_startPosY + _truckHeight > _pictureHeight)
            _startPosY = _pictureHeight - _truckHeight;
        
    }
}

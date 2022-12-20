package gasolineTanker;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MapWithSetTrucksGeneric<T extends IDrawningObject, U extends AbstractMap> {
    private final int _pictureWidth;
    private final int _pictureHeight;
    private final int _placeSizeWidth = 120;
    private final int _placeSizeHeight = 90;
    private final SetTrucksGeneric<T> _setTrucks;
    private final U _map;
    
    public MapWithSetTrucksGeneric(int picWidth, int picHeight, U map) {
        int width = picWidth / _placeSizeWidth;
        int height = picHeight / _placeSizeHeight;
        _setTrucks = new SetTrucksGeneric<T>(width * height);
        _pictureWidth = picWidth;
        _pictureHeight = picHeight;
        _map = map;
    }
    
    public int insert(T truck) {
        return _setTrucks.insert(truck);
    }
    public T remove(int position) {
        return _setTrucks.remove(position);
    }
    
    public BufferedImage showSet() {
        BufferedImage bmp = new BufferedImage(_pictureWidth, _pictureHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bmp.createGraphics();
        drawBackground(g2d);
        drawTrucks(g2d);
        return bmp;
    }
    
    public BufferedImage showOnMap() {
        shaking();
        for (int i = 0; i < _setTrucks.getCount(); i++)
        {
            var Truck = _setTrucks.get(i);
            if (Truck != null)
            {
                return _map.createMap(_pictureWidth, _pictureHeight, Truck);
            }
        }
        return new BufferedImage(_pictureWidth, _pictureHeight, BufferedImage.TYPE_INT_ARGB);
    }
    
    public BufferedImage moveObject(Direction direction) {
        if (_map != null)
        {
            return _map.moveObject(direction);
        }
        return new BufferedImage(_pictureWidth, _pictureHeight, BufferedImage.TYPE_INT_ARGB);
    }
    
    private void shaking() {
        int j = _setTrucks.getCount() - 1;
        for (int i = 0; i < _setTrucks.getCount(); i++)
        {
            if (_setTrucks.get(i) == null)
            {
                for (; j > i; j--)
                {
                    var Truck = _setTrucks.get(j);
                    if (Truck != null)
                    {
                        _setTrucks.insert(Truck, i);
                        _setTrucks.remove(j);
                        break;
                    }
                }
                if (j <= i)
                {
                    return;
                }
            }
        }
    }
    
    private void drawBackground(Graphics2D g2d) {
        Color asphaltColor = Color.GRAY;
        g2d.setColor(asphaltColor);
        g2d.fillRect(0, 0, _pictureWidth, _pictureHeight);

        Color markupColor = Color.YELLOW;
        g2d.setColor(markupColor);
        BasicStroke markupStroke = new BasicStroke(3);
        g2d.setStroke(markupStroke);
        
        for (int i = 0; i < _pictureWidth / _placeSizeWidth; i++)
        {
            for (int j = 0; j < _pictureHeight / _placeSizeHeight + 1; ++j)
            {
                g2d.drawLine(i * _placeSizeWidth, j * _placeSizeHeight, i * _placeSizeWidth + _placeSizeWidth / 2, j * _placeSizeHeight);
            }
            g2d.drawLine(i * _placeSizeWidth, 0, i * _placeSizeWidth, (_pictureHeight / _placeSizeHeight) * _placeSizeHeight);
        }
    }
    
    private void drawTrucks(Graphics2D g2d) {
        int xPosition = 10;
        int yPosition = (_pictureHeight / _placeSizeHeight - 1) * _placeSizeHeight + 10;

        for (int i = 0; i < _setTrucks.getCount(); i++)
        {
            if (_setTrucks.get(i) != null) {
                _setTrucks.get(i).setObject(xPosition, yPosition, _pictureWidth, _pictureHeight);
                _setTrucks.get(i).drawningObject(g2d);
            }
            
            xPosition += _placeSizeWidth;
            if (xPosition + _placeSizeWidth > _pictureWidth)
            {
                yPosition -= _placeSizeHeight;
                xPosition = 10;
            }
        }
    }
}

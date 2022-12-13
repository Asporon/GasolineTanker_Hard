package gasolineTanker;

import java.util.Random;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class AbstractMap {
    private IDrawningObject _drawningObject = null;
    protected int[][] _map = null;
    protected int _width;
    protected int _height;
    protected int _size_x;
    protected int _size_y;
    protected final Random _random = new Random();
    protected final int _freeRoad = 0;
    protected final int _barrier = 1;
    
    public BufferedImage createMap(int width, int height, IDrawningObject drawningObject) {
        _width = width;
        _height = height;
        _drawningObject = drawningObject;
        generateMap();
        while (!setObjectOnMap())
        {
            generateMap();
        }
        return drawMapWithObject();
    }
    
    private boolean setObjectOnMap() {
        if (_drawningObject == null || _map == null)
        {
            return false;
        }
        int x = _random.nextInt(1, 10);
        int y = _random.nextInt(1, 10);
        _drawningObject.setObject(x, y, _width, _height);

        return checkCollisison(); 
    }
    public BufferedImage moveObject(Direction direction) {
        _drawningObject.moveObject(direction);
        if(!checkCollisison())
        {
            switch (direction)
            {
                case Up:
                    _drawningObject.moveObject(Direction.Down);
                    break;
                case Right:
                    _drawningObject.moveObject(Direction.Left);
                    break;
                case Down:
                    _drawningObject.moveObject(Direction.Up);
                    break;
                case Left:
                    _drawningObject.moveObject(Direction.Right);
                    break;
            }
        }
        return drawMapWithObject();
    }
    private boolean checkCollisison() {
        float[] sides = _drawningObject.getCurrentPosition();
        for (int i = (int)(sides[0] / _size_x); i < (int)(sides[1] / _size_x) + 1; i++)
        {
            for (int j = (int)(sides[2] / _size_y); j < (int)(sides[3] / _size_y) + 1; j++)
            {
                if (_map[i][j] == _barrier)
                    return false;
            }
        }
        return true;
    }
    
    private BufferedImage drawMapWithObject() {
        BufferedImage bmp = new BufferedImage(_width, _height, BufferedImage.TYPE_INT_ARGB);
        if (_drawningObject == null || _map == null)
        {
            return bmp;
        }
        Graphics gr = bmp.createGraphics();
        for (int i = 0; i < _map.length; ++i)
        {
            for (int j = 0; j < _map[0].length; ++j)
            {
                if (_map[i][j] == _freeRoad)
                {
                    drawRoadPart(gr, i, j);
                }
                else if (_map[i][j] == _barrier)
                {
                    drawBarrierPart(gr, i, j);
                }
            }
        }
        _drawningObject.drawningObject(gr);
        return bmp;
    }
    
    protected abstract void generateMap();
    protected abstract void drawRoadPart(Graphics g, int i, int j);
    protected abstract void drawBarrierPart(Graphics g, int i, int j);
}

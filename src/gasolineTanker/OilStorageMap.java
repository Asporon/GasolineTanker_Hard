package gasolineTanker;

import java.awt.*;

public class OilStorageMap extends AbstractMap {
    private final Color tankColor = Color.WHITE;
    private final Color logoColor = Color.RED;
    private final Color roadColor = Color.GRAY;
    
        @Override
    protected void drawBarrierPart(Graphics g, int i, int j) {
        g.setColor(roadColor);
        g.fillRect(i * _size_x, j * _size_y,_size_x,_size_y);
        g.setColor(tankColor);
        g.fillOval(i * _size_x, j * _size_y, _size_x, _size_y);
        g.setColor(logoColor);
        g.drawOval(i * _size_x, j * _size_y, _size_x, _size_y);
    }
    
        @Override
    protected void drawRoadPart(Graphics g, int i, int j) {
        g.setColor(roadColor);
        g.fillRect(i * _size_x, j * _size_y,_size_x,_size_y);
    }
    
        @Override
    protected void generateMap() {
        _map = new int[39][26];
        _size_x = _width / _map.length;
        _size_y = _height / _map[0].length;
        int counter = 0;
        for (int i = 0; i < _map.length; ++i)
        {
            for (int j = 0; j < _map[0].length; ++j)
            {
                _map[i][j] = _freeRoad;
            }
        }
        while (counter < 20)
        {
            int x = _random.nextInt(0, 39);
            int y = _random.nextInt(0, 26);
            if (_map[x][y] == _freeRoad)
            {
                _map[x][y] = _barrier;
                counter++;
            }
        }
    }
}

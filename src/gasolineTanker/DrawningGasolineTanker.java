package gasolineTanker;

import java.awt.*;

public class DrawningGasolineTanker extends DrawningTruck {
    public DrawningGasolineTanker(int speed, float weight, Color bodyColor, int wheels,
        int disk,Color dopColor, boolean cistern, boolean flasher) {
        super(speed, weight, bodyColor, wheels, disk, 90, 70);
        
        Truck = new EntityGasolineTanker (speed, weight, bodyColor, dopColor, 
            cistern, flasher); 
    }
    
        @Override
    public void drawTransport(Graphics g) {
        if (! (Truck instanceof EntityGasolineTanker gasolineTanker)) {
            return;
        }
        
        Color dopColor;
        if (gasolineTanker != null) 
            dopColor = gasolineTanker.getDopColor();
        else
            dopColor = Color.BLACK;
        Color darkGrayColor = Color.DARK_GRAY;
        
        if(gasolineTanker.getCistern()) {
            g.setColor(dopColor);
            g.fillRect((int)_startPosX + 4, (int)_startPosY + 20, 56, 20);
            
            g.setColor(darkGrayColor);
            g.fillRect((int)_startPosX + 15, (int)_startPosY + 20, 6, 20);
            g.fillRect((int)_startPosX + 44, (int)_startPosY + 20, 6, 20);
        }
        
        if (gasolineTanker.getFlasher()) {
            g.setColor(darkGrayColor);
            g.fillRect((int)_startPosX + 62, (int)_startPosY + 8, 5, 37);
            
            g.setColor(Color.ORANGE);
            g.fillRect((int)_startPosX + 60, (int)_startPosY, 9, 8);
        }
        
        _startPosY += 5;
        super.drawTransport(g);
        _startPosY -= 5;
    }
}

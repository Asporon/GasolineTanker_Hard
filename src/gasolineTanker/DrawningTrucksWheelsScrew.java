package gasolineTanker;

import java.awt.*;

public class DrawningTrucksWheelsScrew implements IDrawningWheels {
    private NumberOfWheels numberOfWheels;
    private int wheels;
    
    @Override
    public int getWheels() {
        return wheels;
    }
        @Override
    public void setWheels(int wheels){
        if (wheels < 2 || wheels > 4)
            return;
        switch(wheels){
            case 2:
                numberOfWheels = NumberOfWheels.Two;
                break;
            case 3:
                numberOfWheels = NumberOfWheels.Three;
                break;
            case 4:
                numberOfWheels = NumberOfWheels.Four;
                break;
        }
        this.wheels = wheels;
    }
    
        @Override
    public void drawWheels(Graphics g, float posX, float posY, Color diskColor){
        if (numberOfWheels == null){
            return;
        }
        
        switch(numberOfWheels) {
            case Two:
                drawWheel(g, posX + 15, posY, diskColor);
                drawWheel(g, posX + 68, posY, diskColor);
                break;
            case Three:
                drawWheel(g, posX + 10, posY, diskColor);
                drawWheel(g, posX + 30, posY, diskColor);
                drawWheel(g, posX + 68, posY, diskColor);
                break;
            case Four:
                drawWheel(g, posX, posY, diskColor);
                drawWheel(g, posX + 20, posY, diskColor);
                drawWheel(g, posX + 50, posY, diskColor);
                drawWheel(g, posX + 70, posY, diskColor);
                break;
        }
    }
    
        @Override
    public void drawWheel(Graphics g, float posX, float posY, Color diskColor){
        Color blackColor = Color.BLACK;
        
        int x = (int) posX;
        int y = (int) posY;
        
        g.setColor(blackColor);
        g.fillOval(x, y, 20, 20);
        
        g.setColor(diskColor);
        g.fillOval(x + 4, y + 4, 12, 12);
        
        int[] xScrew = {x + 10, x + 14, x + 10, x + 6};
        int[] yScrew = {y + 6, y + 10, y + 14, y + 10};
        g.setColor(blackColor);
        g.fillPolygon(xScrew, yScrew, 4);
        g.setColor(Color.DARK_GRAY);
        g.drawPolygon(xScrew, yScrew, 4);
    }
}


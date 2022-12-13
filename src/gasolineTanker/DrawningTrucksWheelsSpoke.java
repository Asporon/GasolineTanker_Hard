package gasolineTanker;

import java.awt.*;

public class DrawningTrucksWheelsSpoke implements IDrawningWheels {
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
        int x = (int) posX;
        int y = (int) posY;
        
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 20, 20);
        
        g.setColor(Color.WHITE);
        g.fillOval(x + 4, y + 4, 12, 12);
        
        g.setColor(Color.DARK_GRAY);
        g.drawOval(x + 4, y + 4, 12, 12);
        g.drawLine(x + 4, y + 10, x + 16, y + 10);
        g.drawLine(x + 10, y + 4, x + 10, y + 16);
        g.drawLine(x + 6, y + 6, x + 14, y + 14);
        g.drawLine(x + 14, y + 6, x + 6, y + 14);
    }
}

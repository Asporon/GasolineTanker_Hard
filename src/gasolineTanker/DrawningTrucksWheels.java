package gasolineTanker;

import java.awt.*;

public class DrawningTrucksWheels {
    private NumberOfWheels numberOfWheels;
    private int wheels;
    
    public int getWheels() {
        return wheels;
    }
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
    
    private void drawWheel(Graphics g, float posX, float posY, Color diskColor){
        g.setColor(Color.BLACK);
        g.fillOval((int)posX, (int)posY, 20, 20);
        
        g.setColor(diskColor);
        g.fillOval((int)posX + 4, (int)posY + 4, 12, 12);
    }
}

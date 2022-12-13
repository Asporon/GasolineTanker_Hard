package gasolineTanker;

import java.awt.*;

public interface IDrawningWheels {
    public int getWheels();
    
    void setWheels(int wheels);
    
    void drawWheels(Graphics g, float posX, float posY, Color diskColor);
    
    void drawWheel(Graphics g, float posX, float posY, Color diskColor);
}

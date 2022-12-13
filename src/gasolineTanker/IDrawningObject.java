package gasolineTanker;

import java.awt.*;

public interface IDrawningObject {
    public float getStep();
    
    void setObject(int x, int y, int width, int height);

    void moveObject(Direction direction);

    void drawningObject(Graphics g);
    
    float[] getCurrentPosition(); 
}

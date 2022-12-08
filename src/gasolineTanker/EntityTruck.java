package gasolineTanker;

import java.awt.Color;
import java.util.Random;

public class EntityTruck {
    private int speed;
    private float weight;
    private Color bodyColor;
    
    public int getSpeed() { return speed; }
    public float getWeight() { return weight; }
    public Color getBodyColor() { return bodyColor; }
    public float getStep() {
        return speed * 100 / weight;
    }
    
    public void init(int speed, float weight, Color bodyColor) {
        Random rnd = new Random();
        this.speed = speed <= 0 ? rnd.nextInt(100) + 50 : speed;
        this.weight = weight <= 0 ? rnd.nextFloat(30) + 40 : weight;
        this.bodyColor = bodyColor;
    }
}

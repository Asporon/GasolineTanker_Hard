package gasolineTanker;

import java.awt.Color;

public class EntityGasolineTanker extends EntityTruck {
    private Color dopColor;
    private boolean cistern;
    private boolean flasher;
    
    public Color getDopColor() { return dopColor; }
    public boolean getCistern() { return cistern; }
    public boolean getFlasher() { return flasher; }
    
    public EntityGasolineTanker(int speed, float weight, Color bodyColor, Color dopColor, boolean cistern, boolean flasher) {
        super(speed, weight, bodyColor);
        
        this.dopColor = dopColor;
        this.cistern = cistern;
        this.flasher = flasher;
    }
}

package gasolineTanker;

import javax.swing.*;
import java.awt.*;

public class CanvasTruck extends JComponent {
    private DrawningTruck _truck = null;
    
    public void setTruck(DrawningTruck _truck) {
        this._truck = _truck;
    }
    
    public CanvasTruck() {
        super();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        if (_truck != null) _truck.drawTransport(g2d);
    }
}


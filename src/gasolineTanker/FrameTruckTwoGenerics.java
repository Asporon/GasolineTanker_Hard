package gasolineTanker;

import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class FrameTruckTwoGenerics extends javax.swing.JFrame {
    private DrawningTruck _truck;
    private SetTrucksTwoGenerics<EntityTruck, IDrawningWheels> CreatorTrucks;
       
    public FrameTruckTwoGenerics() {
        initComponents();
        Random rnd = new Random();
        
        int rawMaterialAmt = 3;
        CreatorTrucks = new SetTrucksTwoGenerics<>(rawMaterialAmt);
        for (int i = 0; i < rawMaterialAmt; i++) {
            EntityTruck truck;
            int type = rnd.nextInt(0, 100);
            if (type % 2 == 0) {
                truck = new EntityTruck(rnd.nextInt(100, 300), rnd.nextFloat(1000, 2000),
                    new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)));
            } else {
                truck = new EntityGasolineTanker(rnd.nextInt(100, 300), rnd.nextFloat(1000, 2000),
                    new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
                    new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
                    rnd.nextBoolean(), rnd.nextBoolean());
            }
            CreatorTrucks.insert(truck);
            
            IDrawningWheels wheels = null;
            int disk = rnd.nextInt(0, 100) % 3;
            switch (disk) {
            case 0:
                wheels = new DrawningTrucksWheels();
                break;
            case 1:
                wheels = new DrawningTrucksWheelsScrew();
                break;
            case 2:
                wheels = new DrawningTrucksWheelsSpoke();
                break;
            }
            wheels.setWheels(rnd.nextInt(2, 5));
            CreatorTrucks.insert(wheels);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolBar = new javax.swing.JToolBar();
        LabelSpeed = new javax.swing.JLabel();
        LabelWeight = new javax.swing.JLabel();
        LabelBodyColor = new javax.swing.JLabel();
        ButtonCreate = new javax.swing.JButton();
        ButtonUp = new javax.swing.JButton();
        ButtonRight = new javax.swing.JButton();
        ButtonDown = new javax.swing.JButton();
        ButtonLeft = new javax.swing.JButton();
        CanvasTruck = new gasolineTanker.CanvasTruck();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Грузовик");
        setName(""); // NOI18N

        ToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ToolBar.setRollover(true);

        LabelSpeed.setText("Скорость:");
        ToolBar.add(LabelSpeed);

        LabelWeight.setText("Вес:");
        ToolBar.add(LabelWeight);

        LabelBodyColor.setText("Цвет:");
        ToolBar.add(LabelBodyColor);

        ButtonCreate.setText("Создать");
        ButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateActionPerformed(evt);
            }
        });

        ButtonUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gasolineTanker/arrowUp.png"))); // NOI18N
        ButtonUp.setName("ButtonUp"); // NOI18N
        ButtonUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMoveActionPerformed(evt);
            }
        });

        ButtonRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gasolineTanker/arrowRight.png"))); // NOI18N
        ButtonRight.setName("ButtonRight"); // NOI18N
        ButtonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMoveActionPerformed(evt);
            }
        });

        ButtonDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gasolineTanker/arrowDown.png"))); // NOI18N
        ButtonDown.setName("ButtonDown"); // NOI18N
        ButtonDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMoveActionPerformed(evt);
            }
        });

        ButtonLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gasolineTanker/arrowLeft.png"))); // NOI18N
        ButtonLeft.setName("ButtonLeft"); // NOI18N
        ButtonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMoveActionPerformed(evt);
            }
        });

        CanvasTruck.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                CanvasTruckComponentResized(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 650, Short.MAX_VALUE)
                .addComponent(ButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(CanvasTruck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(CanvasTruck, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void draw(){
        CanvasTruck.repaint();
    }
    
    private void setData() {
        Random rnd = new Random();
        _truck.setPosition(rnd.nextInt(10, 100), rnd.nextInt(10, 100),
                CanvasTruck.getWidth(), CanvasTruck.getHeight());
        LabelSpeed.setText("Скорость: " + _truck.getTruck().getSpeed() + "  ");
        LabelWeight.setText("Вес: " + _truck.getTruck().getWeight() + "  ");
        LabelBodyColor.setText("Цвет: " + _truck.getTruck().getSpeed() + "  ");
    }
    
    private void CanvasTruckComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CanvasTruckComponentResized
        if (_truck == null)
            return;
        
        _truck.changeBorders(CanvasTruck.getWidth(), CanvasTruck.getHeight());
        draw();
    }//GEN-LAST:event_CanvasTruckComponentResized

    private void ButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateActionPerformed
        _truck = CreatorTrucks.createTruck();
        CanvasTruck.setTruck(_truck);
        setData();
        draw();
    }//GEN-LAST:event_ButtonCreateActionPerformed

    private void ButtonMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMoveActionPerformed
        if (_truck == null)
            return;
        
        switch (((JButton)evt.getSource()).getName()) {
            case "ButtonUp":
            _truck.moveTransport(Direction.Up);
            break;
            case "ButtonRight":
            _truck.moveTransport(Direction.Right);
            break;
            case "ButtonDown":
            _truck.moveTransport(Direction.Down);
            break;
            case "ButtonLeft":
            _truck.moveTransport(Direction.Left);
            break;
        }
        draw();
    }//GEN-LAST:event_ButtonMoveActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameTruckTwoGenerics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTruckTwoGenerics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTruckTwoGenerics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTruckTwoGenerics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTruckTwoGenerics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCreate;
    private javax.swing.JButton ButtonDown;
    private javax.swing.JButton ButtonLeft;
    private javax.swing.JButton ButtonRight;
    private javax.swing.JButton ButtonUp;
    private gasolineTanker.CanvasTruck CanvasTruck;
    private javax.swing.JLabel LabelBodyColor;
    private javax.swing.JLabel LabelSpeed;
    private javax.swing.JLabel LabelWeight;
    private javax.swing.JToolBar ToolBar;
    // End of variables declaration//GEN-END:variables
}

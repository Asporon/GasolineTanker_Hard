package gasolineTanker;

import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class FrameTruck extends javax.swing.JFrame {
    private DrawningTruck _truck;

    public FrameTruck() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolBar = new javax.swing.JToolBar();
        LabelSpeed = new javax.swing.JLabel();
        LabelWeight = new javax.swing.JLabel();
        LabelBodyColor = new javax.swing.JLabel();
        LabelWheels = new javax.swing.JLabel();
        ButtonCreate = new javax.swing.JButton();
        ComboBoxWheels = new javax.swing.JComboBox<>();
        ButtonUp = new javax.swing.JButton();
        ButtonRight = new javax.swing.JButton();
        ButtonDown = new javax.swing.JButton();
        ButtonLeft = new javax.swing.JButton();
        CanvasTruck = new gasolineTanker.CanvasTruck();
        ComboBoxDisk = new javax.swing.JComboBox<>();
        ButtonSelectTruck = new javax.swing.JButton();
        ButtonCreateModif = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Грузовик");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 500));

        ToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ToolBar.setRollover(true);

        LabelSpeed.setText("Скорость:");
        ToolBar.add(LabelSpeed);

        LabelWeight.setText("Вес:");
        ToolBar.add(LabelWeight);

        LabelBodyColor.setText("Цвет:");
        ToolBar.add(LabelBodyColor);

        LabelWheels.setText("Колёс:");
        ToolBar.add(LabelWheels);

        ButtonCreate.setText("Создать");
        ButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateActionPerformed(evt);
            }
        });

        ComboBoxWheels.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));

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

        ComboBoxDisk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Колпаки", "Гайки", "Спицы" }));

        ButtonSelectTruck.setText("Выбрать");
        ButtonSelectTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSelectTruckActionPerformed(evt);
            }
        });

        ButtonCreateModif.setText("Модифицировать");
        ButtonCreateModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateModifActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonCreateModif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxWheels, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(ButtonSelectTruck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonCreate)
                        .addComponent(ComboBoxWheels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonSelectTruck)
                        .addComponent(ButtonCreateModif))
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
        LabelWheels.setText("Колёс: " + (ComboBoxWheels.getSelectedIndex() + 2) + "  ");
    }
    
    private void CanvasTruckComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CanvasTruckComponentResized
        if (_truck == null)
            return;
        
        _truck.changeBorders(CanvasTruck.getWidth(), CanvasTruck.getHeight());
        draw();
    }//GEN-LAST:event_CanvasTruckComponentResized

    private void ButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateActionPerformed
        Random rnd = new Random();
        Color bodyColor = new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256));
        JColorChooser ColorChooser = new JColorChooser();
        if (dialog.ShowDialog() == DialogResult.OK) {
            bodyColor = ColorChooser.getColor();
        }
        
        _truck = new DrawningTruck(rnd.nextInt(100, 300), rnd.nextInt(1000, 2000),
            bodyColor, ComboBoxWheels.getSelectedIndex() + 2, ComboBoxDisk.getSelectedIndex());
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

    private void ButtonCreateModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateModifActionPerformed
        
    }//GEN-LAST:event_ButtonCreateModifActionPerformed

    private void ButtonSelectTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSelectTruckActionPerformed
        
    }//GEN-LAST:event_ButtonSelectTruckActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCreate;
    private javax.swing.JButton ButtonCreateModif;
    private javax.swing.JButton ButtonDown;
    private javax.swing.JButton ButtonLeft;
    private javax.swing.JButton ButtonRight;
    private javax.swing.JButton ButtonSelectTruck;
    private javax.swing.JButton ButtonUp;
    private gasolineTanker.CanvasTruck CanvasTruck;
    private javax.swing.JComboBox<String> ComboBoxDisk;
    private javax.swing.JComboBox<String> ComboBoxWheels;
    private javax.swing.JLabel LabelBodyColor;
    private javax.swing.JLabel LabelSpeed;
    private javax.swing.JLabel LabelWeight;
    private javax.swing.JLabel LabelWheels;
    private javax.swing.JToolBar ToolBar;
    // End of variables declaration//GEN-END:variables
}

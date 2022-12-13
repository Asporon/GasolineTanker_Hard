package gasolineTanker;

import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class FrameMap extends javax.swing.JFrame {
    private AbstractMap _abstractMap;

    public FrameMap() {
        initComponents();
        _abstractMap = new SimpleMap();
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
        ButtonCreateModif = new javax.swing.JButton();
        ComboBoxSelectorMap = new javax.swing.JComboBox<>();
        ComboBoxDisk = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Карта");
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

        ButtonCreateModif.setText("Модифицировать");
        ButtonCreateModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateModifActionPerformed(evt);
            }
        });

        ComboBoxSelectorMap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Простая карта", "Нефтехранилище" }));
        ComboBoxSelectorMap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSelectorMapItemStateChanged(evt);
            }
        });

        ComboBoxDisk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Колпаки", "Гайки", "Спицы" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCreateModif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxWheels, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                        .addComponent(ButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxSelectorMap, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxSelectorMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonCreate)
                        .addComponent(ComboBoxWheels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonCreateModif)
                        .addComponent(ComboBoxDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setData(DrawningTruck truck) {
        Random rnd = new Random();
        truck.setPosition(rnd.nextInt(10, 100), rnd.nextInt(10, 100),
            CanvasTruck.getWidth(), CanvasTruck.getHeight());
        CanvasTruck.setTruck(truck);
        CanvasTruck.getGraphics().drawImage(_abstractMap.createMap(CanvasTruck.getWidth() + 10, 
        CanvasTruck.getHeight() + 5, new DrawningObjectTruck(truck)),0, 0, null);
        
        LabelSpeed.setText("Скорость: " + truck.getTruck().getSpeed() + "  ");
        LabelWeight.setText("Вес: " + truck.getTruck().getWeight() + "  ");
        LabelBodyColor.setText("Цвет: " + truck.getTruck().getSpeed() + "  ");
        LabelWheels.setText("Колёс: " + (ComboBoxWheels.getSelectedIndex() + 2) + "  ");
    }
    
    private void ButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateActionPerformed
        Random rnd = new Random();
        var truck = new DrawningTruck(rnd.nextInt(100, 300), rnd.nextInt(1000, 2000),
            new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
            ComboBoxWheels.getSelectedIndex() + 2, ComboBoxDisk.getSelectedIndex());
        setData(truck);
    }//GEN-LAST:event_ButtonCreateActionPerformed

    private void ButtonMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMoveActionPerformed
        Direction dir = Direction.None;
        switch (((JButton)evt.getSource()).getName()) {
            case "ButtonUp":
                dir = Direction.Up;
                break;
            case "ButtonRight":
                dir = Direction.Right;
                break;
            case "ButtonDown":
                dir = Direction.Down;
                break;
            case "ButtonLeft":
                dir = Direction.Left;
                break;
        }
        
        if (_abstractMap != null)
            CanvasTruck.getGraphics().drawImage(_abstractMap.moveObject(dir),0, 0, null);
    }//GEN-LAST:event_ButtonMoveActionPerformed

    private void ButtonCreateModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateModifActionPerformed
        Random rnd = new Random();
        var truck = new DrawningGasolineTanker(rnd.nextInt(100, 300), rnd.nextInt(1000, 2000),
            new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
            ComboBoxWheels.getSelectedIndex() + 2, ComboBoxDisk.getSelectedIndex(),
            new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
            rnd.nextBoolean(), rnd.nextBoolean());
        setData(truck);
    }//GEN-LAST:event_ButtonCreateModifActionPerformed

    private void ComboBoxSelectorMapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxSelectorMapItemStateChanged
        switch (ComboBoxSelectorMap.getSelectedIndex()) {
            case 0:
                _abstractMap = new SimpleMap();
                break;
            case 1:
                _abstractMap = new OilStorageMap();
                break;
        }
    }//GEN-LAST:event_ComboBoxSelectorMapItemStateChanged

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
    private javax.swing.JButton ButtonUp;
    private gasolineTanker.CanvasTruck CanvasTruck;
    private javax.swing.JComboBox<String> ComboBoxDisk;
    private javax.swing.JComboBox<String> ComboBoxSelectorMap;
    private javax.swing.JComboBox<String> ComboBoxWheels;
    private javax.swing.JLabel LabelBodyColor;
    private javax.swing.JLabel LabelSpeed;
    private javax.swing.JLabel LabelWeight;
    private javax.swing.JLabel LabelWheels;
    private javax.swing.JToolBar ToolBar;
    // End of variables declaration//GEN-END:variables
}

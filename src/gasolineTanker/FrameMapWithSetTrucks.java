package gasolineTanker;

import java.awt.*;
import javax.swing.*;

public class FrameMapWithSetTrucks extends javax.swing.JFrame {
    private MapWithSetTrucksGeneric<DrawningObjectTruck, AbstractMap> _mapTrucksCollectionGeneric;
    
    public FrameMapWithSetTrucks() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTools = new javax.swing.JPanel();
        ButtonRight = new javax.swing.JButton();
        ButtonUp = new javax.swing.JButton();
        ButtonLeft = new javax.swing.JButton();
        ButtonDown = new javax.swing.JButton();
        ButtonAddTruck = new javax.swing.JButton();
        ButtonRemoveTruck = new javax.swing.JButton();
        ButtonShowStorage = new javax.swing.JButton();
        ButtonShowOnMap = new javax.swing.JButton();
        ComboBoxSelectorMap = new javax.swing.JComboBox<>();
        TextFieldPosition = new javax.swing.JTextField();
        CanvasTruck = new gasolineTanker.CanvasTruck();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Карта с набором объектов");

        PanelTools.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ButtonRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gasolineTanker/arrowRight.png"))); // NOI18N
        ButtonRight.setName("ButtonRight"); // NOI18N
        ButtonRight.setPreferredSize(new java.awt.Dimension(40, 40));
        ButtonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMoveActionPerformed(evt);
            }
        });

        ButtonUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gasolineTanker/arrowUp.png"))); // NOI18N
        ButtonUp.setName("ButtonUp"); // NOI18N
        ButtonUp.setPreferredSize(new java.awt.Dimension(40, 40));
        ButtonUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMoveActionPerformed(evt);
            }
        });

        ButtonLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gasolineTanker/arrowLeft.png"))); // NOI18N
        ButtonLeft.setName("ButtonLeft"); // NOI18N
        ButtonLeft.setPreferredSize(new java.awt.Dimension(40, 40));
        ButtonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMoveActionPerformed(evt);
            }
        });

        ButtonDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gasolineTanker/arrowDown.png"))); // NOI18N
        ButtonDown.setName("ButtonDown"); // NOI18N
        ButtonDown.setPreferredSize(new java.awt.Dimension(40, 40));
        ButtonDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMoveActionPerformed(evt);
            }
        });

        ButtonAddTruck.setText("Добавить грузовик");
        ButtonAddTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddTruckActionPerformed(evt);
            }
        });

        ButtonRemoveTruck.setText("Удалить грузовик");
        ButtonRemoveTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRemoveTruckActionPerformed(evt);
            }
        });

        ButtonShowStorage.setText("Посмотреть хранилище");
        ButtonShowStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowStorageActionPerformed(evt);
            }
        });

        ButtonShowOnMap.setText("Посмотреть карту");
        ButtonShowOnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowOnMapActionPerformed(evt);
            }
        });

        ComboBoxSelectorMap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Простая карта", "Нефтехранилище" }));
        ComboBoxSelectorMap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSelectorMapItemStateChanged(evt);
            }
        });

        TextFieldPosition.setText("_");

        javax.swing.GroupLayout PanelToolsLayout = new javax.swing.GroupLayout(PanelTools);
        PanelTools.setLayout(PanelToolsLayout);
        PanelToolsLayout.setHorizontalGroup(
            PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToolsLayout.createSequentialGroup()
                .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelToolsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonShowOnMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelToolsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ComboBoxSelectorMap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelToolsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelToolsLayout.createSequentialGroup()
                        .addComponent(ButtonDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(PanelToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonRemoveTruck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonShowStorage, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(ButtonAddTruck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldPosition))
                .addContainerGap())
        );
        PanelToolsLayout.setVerticalGroup(
            PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboBoxSelectorMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonAddTruck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonRemoveTruck)
                .addGap(106, 106, 106)
                .addComponent(ButtonShowStorage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonShowOnMap)
                .addGap(59, 59, 59)
                .addComponent(ButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(CanvasTruck, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CanvasTruck, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(PanelTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMoveActionPerformed
        if (_mapTrucksCollectionGeneric == null) {
            return;
        }
        
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
        CanvasTruck.getGraphics().drawImage(_mapTrucksCollectionGeneric.moveObject(dir),0, 0, null);
    }//GEN-LAST:event_ButtonMoveActionPerformed

    private void ButtonAddTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddTruckActionPerformed
        if (_mapTrucksCollectionGeneric == null) {
            return;
        }    
        
        FrameTruck form = new FrameTruck(this);
        form.setVisible(true);
        DrawningTruck selectedTruck = form.getSelectedTruck();
        if (selectedTruck != null) {
            DrawningObjectTruck truck = new DrawningObjectTruck(selectedTruck);
            if (_mapTrucksCollectionGeneric.insert(truck) >= 0) {
                JOptionPane.showMessageDialog(null,"Объект добавлен");
                CanvasTruck.getGraphics().drawImage(_mapTrucksCollectionGeneric.showSet(), 0, 0, null);
            } else {
                JOptionPane.showMessageDialog(null,"Не удалось добавить объект");
            }
        }       
    }//GEN-LAST:event_ButtonAddTruckActionPerformed

    private void ButtonShowStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowStorageActionPerformed
        if (_mapTrucksCollectionGeneric == null) {
            return;
        }    
        CanvasTruck.getGraphics().drawImage(_mapTrucksCollectionGeneric.showSet(), 0, 0, null);
    }//GEN-LAST:event_ButtonShowStorageActionPerformed

    private void ButtonShowOnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowOnMapActionPerformed
        if (_mapTrucksCollectionGeneric == null) {
            return;
        }    
        CanvasTruck.getGraphics().drawImage(_mapTrucksCollectionGeneric.showOnMap(), 0, 0, null);
    }//GEN-LAST:event_ButtonShowOnMapActionPerformed

    private void ComboBoxSelectorMapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxSelectorMapItemStateChanged
        AbstractMap map = null;
        switch(ComboBoxSelectorMap.getSelectedIndex()) {
            case 0:
                map = new SimpleMap();
                break;
            case 1:
                map = new OilStorageMap();
                break;
        }
        if (map != null) {
            _mapTrucksCollectionGeneric = new MapWithSetTrucksGeneric<>(
                CanvasTruck.getWidth(), CanvasTruck.getHeight(), map);
        } else {
            _mapTrucksCollectionGeneric = null;
        }
    }//GEN-LAST:event_ComboBoxSelectorMapItemStateChanged

    private void ButtonRemoveTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoveTruckActionPerformed
        if (TextFieldPosition.getText().isEmpty() || TextFieldPosition.getText().equals("")) {
            return;
        }
        var res = JOptionPane.showConfirmDialog((Component) this, (Object) "Удалить объект?", "Удаление", JOptionPane.OK_CANCEL_OPTION);
        if (res == JOptionPane.CANCEL_OPTION) {
            return;
        }
        
        int pos = Integer.parseInt(TextFieldPosition.getText());
        if (_mapTrucksCollectionGeneric.remove(pos) != null) {
            JOptionPane.showMessageDialog(null,"Объект удален");
            CanvasTruck.getGraphics().drawImage(_mapTrucksCollectionGeneric.showSet(), 0, 0, null);
        } else {
            JOptionPane.showMessageDialog(null,"Не удалось удалить объект");
        }
    }//GEN-LAST:event_ButtonRemoveTruckActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMapWithSetTrucks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMapWithSetTrucks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMapWithSetTrucks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMapWithSetTrucks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMapWithSetTrucks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddTruck;
    private javax.swing.JButton ButtonDown;
    private javax.swing.JButton ButtonLeft;
    private javax.swing.JButton ButtonRemoveTruck;
    private javax.swing.JButton ButtonRight;
    private javax.swing.JButton ButtonShowOnMap;
    private javax.swing.JButton ButtonShowStorage;
    private javax.swing.JButton ButtonUp;
    private gasolineTanker.CanvasTruck CanvasTruck;
    private javax.swing.JComboBox<String> ComboBoxSelectorMap;
    private javax.swing.JPanel PanelTools;
    private javax.swing.JTextField TextFieldPosition;
    // End of variables declaration//GEN-END:variables
}

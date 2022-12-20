package gasolineTanker;

import java.awt.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Queue;

public class FrameMapWithSetTrucks extends javax.swing.JFrame {
    private HashMap<String, AbstractMap> _mapsDict = new HashMap<String, AbstractMap>();
    private MapsCollection _mapsCollection;
    
    public FrameMapWithSetTrucks() {
        initComponents();
        _mapsCollection = new MapsCollection(CanvasTruck.getWidth(), CanvasTruck.getHeight());
        
        _mapsDict.put("Простая карта", new SimpleMap());
        _mapsDict.put("Нефтехранилище", new OilStorageMap());
        
        ComboBoxSelectorMap.setModel(new DefaultComboBoxModel());
        for (var elem : _mapsDict.keySet()){
            ComboBoxSelectorMap.addItem(elem);
        }
        ComboBoxSelectorMap.setSelectedIndex(-1);
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
        TextFieldNewMapName = new javax.swing.JTextField();
        ButtonAddMap = new javax.swing.JButton();
        ButtonDelMap = new javax.swing.JButton();
        ButtonWorkDeleteTruck = new javax.swing.JButton();
        ScrollPaneMaps = new javax.swing.JScrollPane();
        ListMaps = new javax.swing.JList<>();
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

        TextFieldPosition.setText("_");

        ButtonAddMap.setText("Добавить карту");
        ButtonAddMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddMapActionPerformed(evt);
            }
        });

        ButtonDelMap.setText("Удалить карту");
        ButtonDelMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDelMapActionPerformed(evt);
            }
        });

        ButtonWorkDeleteTruck.setText("Работать с удаленным");
        ButtonWorkDeleteTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWorkDeleteTruckActionPerformed(evt);
            }
        });

        ListMaps.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListMapsValueChanged(evt);
            }
        });
        ScrollPaneMaps.setViewportView(ListMaps);

        javax.swing.GroupLayout PanelToolsLayout = new javax.swing.GroupLayout(PanelTools);
        PanelTools.setLayout(PanelToolsLayout);
        PanelToolsLayout.setHorizontalGroup(
            PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToolsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ComboBoxSelectorMap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(TextFieldNewMapName)
                    .addComponent(ButtonAddMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonDelMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPaneMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonShowOnMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonRemoveTruck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonShowStorage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonAddTruck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldPosition)
                    .addComponent(ButtonWorkDeleteTruck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelToolsLayout.setVerticalGroup(
            PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToolsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TextFieldNewMapName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxSelectorMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonAddMap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(ButtonDelMap)
                .addGap(43, 43, 43)
                .addComponent(ButtonAddTruck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonRemoveTruck)
                .addGap(5, 5, 5)
                .addComponent(ButtonWorkDeleteTruck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(ButtonShowStorage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonShowOnMap)
                .addGap(36, 36, 36)
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
                .addComponent(CanvasTruck, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CanvasTruck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reloadMaps() {
        int index = ListMaps.getSelectedIndex();

        DefaultListModel ListMapsModel = new DefaultListModel();
        ListMapsModel.clear();
        for (int i = 0; i < _mapsCollection.getKeys().size(); i++) {
            ListMapsModel.addElement(_mapsCollection.getKeys().get(i));
        }
        ListMaps.setModel(ListMapsModel);

        if (ListMapsModel.size() > 0 && (index == -1 || index >= ListMapsModel.size())) {
            ListMaps.setSelectedIndex(0);
        } else if (ListMapsModel.size() > 0 && index > -1 && index < ListMapsModel.size()) {
            ListMaps.setSelectedIndex(index);
        }
    }
    
    private void ButtonMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMoveActionPerformed
        if (_mapsCollection.get(ListMaps.getSelectedValue()) == null) {
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
        CanvasTruck.getGraphics().drawImage(_mapsCollection.get(ListMaps.getSelectedValue()).moveObject(dir),0, 0, null);
    }//GEN-LAST:event_ButtonMoveActionPerformed

    private void ButtonAddTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddTruckActionPerformed
        if (_mapsCollection.get(ListMaps.getSelectedValue()) == null) {
            return;
        }    
        
        FrameTruck form = new FrameTruck(this);
        form.setVisible(true);
        DrawningTruck selectedTruck = form.getSelectedTruck();
        if (selectedTruck != null) {
            DrawningObjectTruck truck = new DrawningObjectTruck(selectedTruck);
            if (_mapsCollection.get(ListMaps.getSelectedValue()).insert(truck) >= 0) {
                JOptionPane.showMessageDialog(null,"Объект добавлен");
                CanvasTruck.getGraphics().drawImage(_mapsCollection.get(ListMaps.getSelectedValue()).showSet(), 0, 0, null);
            } else {
                JOptionPane.showMessageDialog(null,"Не удалось добавить объект");
            }
        }       
    }//GEN-LAST:event_ButtonAddTruckActionPerformed

    private void ButtonShowStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowStorageActionPerformed
        if (_mapsCollection.get(ListMaps.getSelectedValue()) == null) {
            return;
        }    
        CanvasTruck.getGraphics().drawImage(_mapsCollection.get(ListMaps.getSelectedValue()).showSet(), 0, 0, null);
    }//GEN-LAST:event_ButtonShowStorageActionPerformed

    private void ButtonShowOnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowOnMapActionPerformed
        if (_mapsCollection.get(ListMaps.getSelectedValue()) == null) {
            return;
        }    
        CanvasTruck.getGraphics().drawImage(_mapsCollection.get(ListMaps.getSelectedValue()).showOnMap(), 0, 0, null);
    }//GEN-LAST:event_ButtonShowOnMapActionPerformed

    private void ButtonRemoveTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoveTruckActionPerformed
        if (TextFieldPosition.getText().isEmpty() || TextFieldPosition.getText().equals("")) {
            return;
        }
        var res = JOptionPane.showConfirmDialog((Component) this, (Object) "Удалить объект?", "Удаление", JOptionPane.OK_CANCEL_OPTION);
        if (res == JOptionPane.CANCEL_OPTION) {
            return;
        }
        
        int pos = Integer.parseInt(TextFieldPosition.getText());
        if (_mapsCollection.get(ListMaps.getSelectedValue()).remove(pos) != null) {
            JOptionPane.showMessageDialog(null,"Объект удален");
            CanvasTruck.getGraphics().drawImage(_mapsCollection.get(ListMaps.getSelectedValue()).showSet(), 0, 0, null);
        } else {
            JOptionPane.showMessageDialog(null,"Не удалось удалить объект");
        }
    }//GEN-LAST:event_ButtonRemoveTruckActionPerformed

    private void ButtonAddMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddMapActionPerformed
        if (ComboBoxSelectorMap.getSelectedIndex() == -1 || TextFieldNewMapName.getText().isBlank()) {
            JOptionPane.showMessageDialog(null,"Не все данные заполнены");
            return;
        }
        if (!_mapsDict.containsKey((String)ComboBoxSelectorMap.getSelectedItem())) {
            JOptionPane.showMessageDialog(null,"Нет такой карты");
            return;
        }
        _mapsCollection.addMap(TextFieldNewMapName.getText(), _mapsDict.get((String)ComboBoxSelectorMap.getSelectedItem()));
        reloadMaps();
    }//GEN-LAST:event_ButtonAddMapActionPerformed

    private void ButtonDelMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDelMapActionPerformed
        if (ListMaps.getSelectedIndex() == -1) {
            return;
        }

        if (JOptionPane.showConfirmDialog((Component) this, (Object) "Удалить карту " + (String)(ListMaps.getSelectedValue()) + "?",
                "Удаление", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            _mapsCollection.delMap(ListMaps.getSelectedValue());
            reloadMaps();
        }
    }//GEN-LAST:event_ButtonDelMapActionPerformed

    private void ButtonWorkDeleteTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWorkDeleteTruckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonWorkDeleteTruckActionPerformed

    private void ListMapsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListMapsValueChanged
        if (ListMaps.getSelectedIndex() == -1){
            return;
        }
        CanvasTruck.getGraphics().drawImage(_mapsCollection.get((String)ListMaps.getSelectedValue()).showSet(), 0, 0, null);
    }//GEN-LAST:event_ListMapsValueChanged

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
    private javax.swing.JButton ButtonAddMap;
    private javax.swing.JButton ButtonAddTruck;
    private javax.swing.JButton ButtonDelMap;
    private javax.swing.JButton ButtonDown;
    private javax.swing.JButton ButtonLeft;
    private javax.swing.JButton ButtonRemoveTruck;
    private javax.swing.JButton ButtonRight;
    private javax.swing.JButton ButtonShowOnMap;
    private javax.swing.JButton ButtonShowStorage;
    private javax.swing.JButton ButtonUp;
    private javax.swing.JButton ButtonWorkDeleteTruck;
    private gasolineTanker.CanvasTruck CanvasTruck;
    private javax.swing.JComboBox<String> ComboBoxSelectorMap;
    private javax.swing.JList<String> ListMaps;
    private javax.swing.JPanel PanelTools;
    private javax.swing.JScrollPane ScrollPaneMaps;
    private javax.swing.JTextField TextFieldNewMapName;
    private javax.swing.JTextField TextFieldPosition;
    // End of variables declaration//GEN-END:variables
}

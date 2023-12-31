/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.flowersalessystem1;

import Classes.Flower;
import Databases.FlowerDatabaseManager;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murat
 */
public class FlowerPage extends javax.swing.JFrame {

    /**
     * Creates new form Flowers
     */
    DefaultTableModel t = new DefaultTableModel();
    private final JPanel patternPanel;

    public FlowerPage() {
        initComponents();
        patternPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image patternImage = new ImageIcon("C:\\Users\\murat\\Desktop\\1-1Z3041506352H.jpg").getImage();
                g.drawImage(patternImage, 0, 0, getWidth(), getHeight(), null);
            }
        };
        patternPanel.setLayout(null);
        patternPanel.setBounds(0, 0, getWidth(), getHeight());
        getContentPane().add(patternPanel);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                patternPanel.setBounds(0, 0, getWidth(), getHeight());
            }
        });
        t.addColumn("id");
        t.addColumn("name");
        t.addColumn("price");
        t.addColumn("stock");
        fillTable();
    }

    public void fillTable() {

        t.setRowCount(0);

        ArrayList<Flower> flowers = FlowerDatabaseManager.getFlowers();

        for (Flower flower : flowers) {
            t.addRow(new Object[]{flower.getId(), flower.getName(), flower.getPrice(), flower.getStock()});
        }

        tblFlowers.setModel(t);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFlowers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMain = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnIncreaseStock = new javax.swing.JButton();
        btnDecreaseStock = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDecreasePrice = new javax.swing.JButton();
        btnIncreasePrice = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblFlowers.setBackground(new java.awt.Color(204, 204, 255));
        tblFlowers.setModel(t);
        jScrollPane2.setViewportView(tblFlowers);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("                         Flowers");

        jLabel3.setText("Price");

        btnMain.setBackground(new java.awt.Color(204, 204, 255));
        btnMain.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMain.setText("Back to Main");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setText("Add New Flower");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        jLabel5.setText("Stock");

        btnIncreaseStock.setBackground(new java.awt.Color(204, 204, 255));
        btnIncreaseStock.setText("Increase");
        btnIncreaseStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncreaseStockActionPerformed(evt);
            }
        });

        btnDecreaseStock.setBackground(new java.awt.Color(204, 204, 255));
        btnDecreaseStock.setText("Decrease");
        btnDecreaseStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecreaseStockActionPerformed(evt);
            }
        });

        jLabel2.setText("Flower Price");

        jLabel6.setText("Flower Stock");

        btnDecreasePrice.setBackground(new java.awt.Color(204, 204, 255));
        btnDecreasePrice.setText("Decrease");
        btnDecreasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecreasePriceActionPerformed(evt);
            }
        });

        btnIncreasePrice.setBackground(new java.awt.Color(204, 204, 255));
        btnIncreasePrice.setText("Increase");
        btnIncreasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncreasePriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnIncreaseStock))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnIncreasePrice)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDecreasePrice)
                                    .addComponent(btnDecreaseStock)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIncreaseStock, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDecreaseStock, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDecreasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncreasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        // TODO add your handling code here:
        AdminPage a = new AdminPage();
        dispose();
        a.setVisible(true);
    }//GEN-LAST:event_btnMainActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String priceString = txtPrice.getText();
        String stockString = txtStock.getText();

        try {

            if (name.isEmpty() || priceString.isEmpty() || stockString.isEmpty()) {
                throw new Exception("Please fill in all the fields.");
            }

            double price;
            try {
                price = Double.parseDouble(priceString);
                if (price <= 0) {
                    throw new Exception("Price must be a positive value.");
                }
            } catch (NumberFormatException e) {
                throw new Exception("Price must be a numeric value.");
            }

            int stock;
            try {
                stock = Integer.parseInt(stockString);
                if (stock < 0) {
                    throw new Exception("Stock must be a non-negative value.");
                }
            } catch (NumberFormatException e) {
                throw new Exception("Stock must be a numeric value.");
            }

            Flower f = new Flower(name, price, stock);
            if (FlowerDatabaseManager.createFlower(f)) {
                JOptionPane.showMessageDialog(rootPane, "Flower added successfully.");
            } else {
                throw new Exception("An error occurred while adding the flower.");
            }

            fillTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void btnIncreaseStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncreaseStockActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlowers.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a flower to update stock.");
            return;
        }

        int flowerId = Integer.parseInt(tblFlowers.getValueAt(selectedRow, 0).toString());

        String stockIncrementString = txtStock.getText();
        int stockIncrement;
        try {
            stockIncrement = Integer.parseInt(stockIncrementString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for stock increment.");
            return;
        }

        if (FlowerDatabaseManager.increaseFlowerStock(flowerId, stockIncrement)) {
            JOptionPane.showMessageDialog(this, "Flower stock updated successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Error updating flower stock.");
        }

        fillTable();

    }//GEN-LAST:event_btnIncreaseStockActionPerformed

    private void btnDecreaseStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecreaseStockActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlowers.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a flower to update stock.");
            return;
        }

        int flowerId = Integer.parseInt(tblFlowers.getValueAt(selectedRow, 0).toString());

        String stockDecrementString = txtStock.getText();
        int stockDecrement;
        try {
            stockDecrement = Integer.parseInt(stockDecrementString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for stock decrement.");
            return;
        }

        if (FlowerDatabaseManager.decreaseFlowerStock(flowerId, stockDecrement)) {
            JOptionPane.showMessageDialog(this, "Flower stock updated successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Error updating flower stock.");
        }

        fillTable();
    }//GEN-LAST:event_btnDecreaseStockActionPerformed

    private void btnDecreasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecreasePriceActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlowers.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a flower to update price.");
            return;
        }

        int flowerId;
        double currentPrice;
        try {
            flowerId = Integer.parseInt(tblFlowers.getValueAt(selectedRow, 0).toString());
            currentPrice = Double.parseDouble(tblFlowers.getValueAt(selectedRow, 2).toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The selected row contains invalid data.");
            return;
        }

        String priceDecrementPercentageString = txtPrice.getText();

        String regex = "^\\d+(\\.\\d+)?%$";
        if (!priceDecrementPercentageString.matches(regex)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid percentage (e.g. 5%, 10.5%).");
            return;
        }

        double priceDecrementPercentage;
        try {
            priceDecrementPercentage = Double.parseDouble(priceDecrementPercentageString.replace("%", ""));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for price decrement percentage.");
            return;
        }

        double newPrice = currentPrice - (currentPrice * priceDecrementPercentage / 100);

        if (FlowerDatabaseManager.updateFlowerPrice(flowerId, newPrice)) {
            JOptionPane.showMessageDialog(this, "Flower price updated successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Error updating flower price.");
        }

        fillTable();


    }//GEN-LAST:event_btnDecreasePriceActionPerformed

    private void btnIncreasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncreasePriceActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlowers.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a flower to update price.");
            return;
        }

        int flowerId;
        double currentPrice;
        try {
            flowerId = Integer.parseInt(tblFlowers.getValueAt(selectedRow, 0).toString());
            currentPrice = Double.parseDouble(tblFlowers.getValueAt(selectedRow, 2).toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The selected row contains invalid data.");
            return;
        }

        String priceIncrementPercentageString = txtPrice.getText();

        String regex = "^\\d+(\\.\\d+)?%$";
        if (!priceIncrementPercentageString.matches(regex)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid percentage (e.g. 5%, 10.5%).");
            return;
        }

        double priceIncrementPercentage;
        try {
            priceIncrementPercentage = Double.parseDouble(priceIncrementPercentageString.replace("%", ""));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for price increment percentage.");
            return;
        }

        double newPrice = currentPrice + (currentPrice * priceIncrementPercentage / 100);

        if (FlowerDatabaseManager.updateFlowerPrice(flowerId, newPrice)) {
            JOptionPane.showMessageDialog(this, "Flower price updated successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Error updating flower price.");
        }

        fillTable();


    }//GEN-LAST:event_btnIncreasePriceActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDecreasePrice;
    private javax.swing.JButton btnDecreaseStock;
    private javax.swing.JButton btnIncreasePrice;
    private javax.swing.JButton btnIncreaseStock;
    private javax.swing.JButton btnMain;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblFlowers;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}

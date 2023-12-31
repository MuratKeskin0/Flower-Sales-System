/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.flowersalessystem1;

import Classes.BasketItem;
import Classes.Order;
import Classes.OrderItem;
import Classes.User;
import Databases.BasketDatabaseManager;
import Databases.OrderDatabaseManager;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.smartcardio.Card;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author murat
 */
public class DeliveryPage extends javax.swing.JFrame {

    /**
     * Creates new form DeliveryPage
     */
    User u;
    private final JPanel patternPanel;

    public DeliveryPage(User u) {
        this.u = u;
        initComponents();
        patternPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image patternImage = new ImageIcon("C:\\Users\\murat\\Desktop\\renkli-cicek-arka-plan-desenli-fon-perde-326213.jpg").getImage();
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

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCardNumber = new javax.swing.JTextField();
        txtMonthYear = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNameSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        BtnFinish = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCardNumber.setBackground(new java.awt.Color(204, 204, 255));

        txtMonthYear.setBackground(new java.awt.Color(204, 204, 255));
        txtMonthYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthYearActionPerformed(evt);
            }
        });

        jLabel1.setText("Card Number");

        txtCvv.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Month/Year");

        jLabel3.setText("CVV");

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("              Delivery");

        txtNameSurname.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setText("Name Surname");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Card Information");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Address Information");

        txtAddress.setBackground(new java.awt.Color(204, 204, 255));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        BtnFinish.setBackground(new java.awt.Color(204, 204, 255));
        BtnFinish.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnFinish.setText("Finish");
        BtnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinishActionPerformed(evt);
            }
        });

        BtnBack.setBackground(new java.awt.Color(204, 204, 255));
        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMonthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMonthYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthYearActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void BtnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinishActionPerformed
        String cardNumber = txtCardNumber.getText();
        String monthYear = txtMonthYear.getText();
        String cvv = txtCvv.getText();
        String nameSurname = txtNameSurname.getText();
        String address = txtAddress.getText();

        String cardNumberRegex = "[0-9]{16}";
        String monthYearRegex = "(0[1-9]|1[0-2])/[0-9]{2}";
        String cvvRegex = "[0-9]{3}";
        String nameRegex = "[a-zA-ZçÇğĞıİöÖşŞüÜ]+( [a-zA-ZçÇğĞıİöÖşŞüÜ]+)*";

        if (!cardNumber.matches(cardNumberRegex)) {
            JOptionPane.showMessageDialog(null, "Invalid card number. Please enter a valid card number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!monthYear.matches(monthYearRegex)) {
            JOptionPane.showMessageDialog(null, "Invalid month/year information. Please enter a valid month/year.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cvv.matches(cvvRegex)) {
            JOptionPane.showMessageDialog(null, "Invalid CV. Please enter a valid CVV.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nameSurname.matches(nameRegex)) {
            JOptionPane.showMessageDialog(null, "Invalid last name. Please enter a valid first and last name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Order order = new Order(u.getId(), address);

        boolean isOrderSaved = OrderDatabaseManager.saveOrder(order);
        if (isOrderSaved) {
            List<BasketItem> basketItems = BasketDatabaseManager.getUserBasket(u.getId());

            StringBuilder orderDetails = new StringBuilder();
            orderDetails.append("Order Details:\n");
            orderDetails.append("Order Id: " + order.getOrderId() + "\n");
            orderDetails.append("Email: " + u.getEmail() + "\n");
            orderDetails.append("Address: " + order.getDeliveryAddress() + "\n");
            orderDetails.append("Flowers:\n");

            double totalPrice = 0.0;
            for (BasketItem item : basketItems) {
                OrderItem orderItem = new OrderItem(0, order.getOrderId(), item.getFlower().getName(), item.getQuantity(), item.getFlower().getPrice());
                OrderDatabaseManager.saveOrderItem(orderItem);
                orderDetails.append("- " + item.getFlower().getName() + ": " + item.getQuantity() + " pcs, total price: " + (item.getFlower().getPrice() * item.getQuantity()) + "\n");
                totalPrice += item.getFlower().getPrice() * item.getQuantity();
            }

            orderDetails.append("Total price: " + totalPrice);

            JOptionPane.showMessageDialog(null, orderDetails.toString());
            JOptionPane.showMessageDialog(null, "Order saved successfully");
            try {
                String cardDetails = "Order ID: " + order.getOrderId() + ", Card Number: " + cardNumber + ", Month/Year: " + monthYear + ", CVV: " + cvv + ", Name: " + nameSurname + "\n";

                String desktopPath = System.getProperty("user.home") + "/Desktop/";
                FileWriter writer = new FileWriter(desktopPath + "credit_card_details.txt", true);

                writer.write(cardDetails);
                writer.close();

                JOptionPane.showMessageDialog(null, "Credit card details saved to desktop");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An error occurred while saving credit card details");
            }

            boolean isBasketCleared = BasketDatabaseManager.clearBasket(u.getId());
            if (isBasketCleared) {
                JOptionPane.showMessageDialog(null, "Basket cleared successfully");
            } else {
                JOptionPane.showMessageDialog(null, "An error occurred while clearing the basket");
            }
        } else {
            JOptionPane.showMessageDialog(null, "An error occurred while saving the order");
        }

        MainMenuPage m = new MainMenuPage(this.u);
        m.setVisible(true);
        dispose();


    }//GEN-LAST:event_BtnFinishActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        Baskets m = new Baskets(this.u); // Mevcut müşteriyi MainMenu'e gönder
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnFinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtMonthYear;
    private javax.swing.JTextField txtNameSurname;
    // End of variables declaration//GEN-END:variables
}

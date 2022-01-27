/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.kma.ptudw.api.CONSTANT;
import project.kma.ptudw.entity.Customer;
import project.kma.ptudw.entity.Drink;
import project.kma.ptudw.entity.OrderPending;
import project.kma.ptudw.service.CustomerService;
import project.kma.ptudw.service.DrinkService;
import project.kma.ptudw.service.DrinkTypeService;
import project.kma.ptudw.service.OrderPendingService;

public class OrderForm extends javax.swing.JFrame {

  private List<Drink> drinksPending = new ArrayList<>();
  private String urlCusPost = CONSTANT.HOST + CONSTANT.CUSTOMER_API + CONSTANT.CREATE;
  private String urlPendingPost = CONSTANT.HOST + CONSTANT.PENDING_API + CONSTANT.CREATE;
  private String urlGetDrink = CONSTANT.HOST + CONSTANT.DRINK_API + CONSTANT.ALL;
  private OrderPendingService orderPendingService;
  private CustomerService customerService;
  private DrinkService drinkService;
  private static int idDrink;

  public OrderForm(int idDrink) {
    initComponents();
    this.idDrink = idDrink;
    this.drinkService = new DrinkService();
    this.orderPendingService = new OrderPendingService();
    this.customerService = new CustomerService();
    txtSl.setText(String.valueOf(0));
    getAllDrink();
  }

  public void getAllDrink() {
    List<Drink> drinks = null;
    try {
      drinks = drinkService.handleMethodGetAll(urlGetDrink, Drink[].class);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
    if (drinks.size() == 0) {
      JOptionPane.showMessageDialog(null, "Không tìm thấy!");
      return;
    }
    String[] title = {"Mã đồ uống", "Tên đồ uống", "Giá thành", "Dung tích"};
    DefaultTableModel model = new DefaultTableModel(title, 0);
    for (Drink drink : drinks) {
      Vector vector = new Vector();
      vector.add(drink.getId());
      vector.add(drink.getName());
      vector.add(drink.getPrice());
      vector.add(drink.getMass() + " ml");
      model.addRow(vector);
    }
    tblMenu.setModel(model);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButton1 = new javax.swing.JButton();
    jName = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    txtPhone = new javax.swing.JTextField();
    txtAddress = new javax.swing.JTextField();
    jPhone = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblMenu = new javax.swing.JTable();
    jButton3 = new javax.swing.JButton();
    txtSl = new javax.swing.JTextField();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jButton1.setBackground(new java.awt.Color(255, 204, 204));
    jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 51, 0));
    jButton1.setText("Hủy bỏ");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jName.setText("Họ và Tên:");

    jPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jPhone.setText("Số điện thoại:");

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel1.setText("Địa chỉ");

    jButton2.setBackground(new java.awt.Color(204, 255, 255));
    jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton2.setForeground(new java.awt.Color(0, 153, 0));
    jButton2.setText("Xác nhận");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    tblMenu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    tblMenu.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tblMenu.setAlignmentX(2.0F);
    tblMenu.setAlignmentY(2.0F);
    tblMenu.setRowHeight(18);
    jScrollPane1.setViewportView(tblMenu);

    jButton3.setText("Thêm");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jButton4.setText("+");
    jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    jButton5.setText("-");
    jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1)
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(46, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPhone)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
              .addComponent(jName)
              .addGap(57, 57, 57)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addComponent(jLabel1)
              .addGap(82, 82, 82)
              .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(136, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(82, 82, 82)
        .addComponent(jButton1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButton2)
        .addGap(95, 95, 95))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton3)
          .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton4)
          .addComponent(jButton5))
        .addGap(53, 53, 53)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jName)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(39, 39, 39)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(35, 35, 35)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jPhone))
        .addGap(47, 47, 47)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton2)
          .addComponent(jButton1))
        .addContainerGap(28, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.setVisible(false);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String name = txtName.getText();
    String address = txtAddress.getText();
    String phone = txtPhone.getText();
    OrderPending orderPending = new OrderPending();
    orderPending.setNameCus(name);
    orderPending.setAddressCus(address);
    orderPending.setPhoneCus(phone);
    orderPending.setDrinkId(idDrink);
    Customer customer = new Customer();
    customer.setName(name);
    customer.setAddress(address);
    customer.setPhone(phone);
    try {
      Customer c = customerService.handleMethodPost(urlCusPost, customer);
//      orderPendingService.handleMethodPost(urlPendingPost, orderPending);
      System.out.println(c.getId());
      JOptionPane.showMessageDialog(null, "Order thành công!");
      this.setVisible(false);
    } catch (Exception ex) {
      Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    try {
      int size = Integer.parseInt(txtSl.getText());
      if (size == 0) {

      }
    } catch (Exception e) {
    }

  }//GEN-LAST:event_jButton3ActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new OrderForm(idDrink).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jName;
  private javax.swing.JLabel jPhone;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblMenu;
  private javax.swing.JTextField txtAddress;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtPhone;
  private javax.swing.JTextField txtSl;
  // End of variables declaration//GEN-END:variables
}

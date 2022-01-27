/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.gui;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.kma.ptudw.api.CONSTANT;
import project.kma.ptudw.entity.Order;
import project.kma.ptudw.service.OrderService;

public class OrderManager extends javax.swing.JFrame {

  private final static String urlGetAll
          = CONSTANT.HOST + CONSTANT.ORDER_API + CONSTANT.ALL;
  private OrderService orderService;

  public OrderManager() {
    initComponents();
    this.orderService = new OrderService();
    getOrderToTable();
  }

  public void getOrderToTable() {
    try {
      List<Order> orders = orderService.handleMethodGetAll(urlGetAll, Order[].class);
      String[] title = {"Mã", "Mã KH", "Tên KH", "SĐT KH", "Tên NV bán", "Thời gian", "Tiền", "TT"};
      DefaultTableModel model = new DefaultTableModel(title, 0);
      for (Order order : orders) {
        Vector vector = new Vector();
        vector.add(order.getId());
        vector.add(order.getCustomer().getId());
        vector.add(order.getCustomer().getName());
        vector.add(order.getCustomer().getPhone());
        vector.add(order.getEmployee().getEmpName());
        vector.add(order.getTime().format(DateTimeFormatter.ISO_DATE));
        vector.add(order.getTotal());
        vector.add(order.getStatus());
        model.addRow(vector);
      }
      tblOrder.setModel(model);
    } catch (Exception ex) {
      Logger.getLogger(OrderManager.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Lỗi kết nối tới dữ liệu!");
    }
    
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jMenu1 = new javax.swing.JMenu();
    cbIDCus = new javax.swing.JComboBox();
    jLabel2 = new javax.swing.JLabel();
    cbNameEmp = new javax.swing.JComboBox();
    jLabel3 = new javax.swing.JLabel();
    cbIDProduct = new javax.swing.JComboBox();
    jLabel4 = new javax.swing.JLabel();
    cbPromotions = new javax.swing.JComboBox();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    txtTime = new javax.swing.JTextField();
    txtDate = new javax.swing.JTextField();
    btnSearch = new javax.swing.JButton();
    btnReset = new javax.swing.JButton();
    cbIDOrder = new javax.swing.JComboBox();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tblOrder = new javax.swing.JTable();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu2 = new javax.swing.JMenu();
    jMenu3 = new javax.swing.JMenu();

    jMenu1.setText("jMenu1");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    cbIDCus.setEditable(true);

    jLabel2.setText("Mã sản phẩm:");

    cbNameEmp.setEditable(true);

    jLabel3.setText("Mã khách hàng:");

    cbIDProduct.setEditable(true);

    jLabel4.setText("Thời gian:");

    cbPromotions.setEditable(true);

    jLabel5.setText("Nhân viên:");

    jLabel6.setText("Ngày:");

    jLabel7.setText("Chương trình khuyến mãi:");

    jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(0, 0, 255));
    jLabel10.setText("Thông tin mua hàng");

    btnSearch.setText("Tìm kiếm");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSearchActionPerformed(evt);
      }
    });

    btnReset.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResetActionPerformed(evt);
      }
    });

    cbIDOrder.setEditable(true);

    jLabel1.setText("Mã đơn hàng:");

    tblOrder.setModel(new javax.swing.table.DefaultTableModel(
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
    tblOrder.setAlignmentX(1.5F);
    tblOrder.setAlignmentY(1.5F);
    tblOrder.setRowHeight(25);
    tblOrder.setRowMargin(2);
    jScrollPane2.setViewportView(tblOrder);

    jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
    jMenu2.setText("Quay lại");
    jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu2MouseClicked(evt);
      }
    });
    jMenuBar1.add(jMenu2);

    jMenu3.setText("Edit");
    jMenuBar1.add(jMenu3);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(524, 524, 524)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2)))
        .addContainerGap())
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addComponent(jLabel10)
              .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
              .addGap(24, 24, 24)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cbIDProduct, 0, 28, Short.MAX_VALUE)
                .addComponent(cbNameEmp, 0, 1, Short.MAX_VALUE)
                .addComponent(cbIDOrder, 0, 1, Short.MAX_VALUE))
              .addGap(18, 18, 18)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7)
                .addComponent(jLabel3))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(cbIDCus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbPromotions, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(jLabel6))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtTime)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addContainerGap()))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(114, 114, 114)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        .addContainerGap())
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(cbPromotions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(9, 9, 9)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(cbIDCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(cbIDOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(9, 9, 9)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addComponent(cbIDProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(cbNameEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addContainerGap(382, Short.MAX_VALUE)))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    String s1 = (String) cbIDOrder.getSelectedItem();
    String s2 = (String) cbIDProduct.getSelectedItem();
    String s3 = (String) cbIDCus.getSelectedItem();
    String s4 = (String) cbPromotions.getSelectedItem();
    String s5 = txtDate.getText().trim();
    String s6 = txtTime.getText().trim();
    String s7 = (String) cbNameEmp.getSelectedItem();
    JOptionPane.showMessageDialog(null, "Lỗi:: Không thể kết nối đến máy chủ");
    
  }//GEN-LAST:event_btnSearchActionPerformed

  private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    cbIDCus.setSelectedIndex(-1);
    cbIDOrder.setSelectedIndex(-1);
    cbIDProduct.setSelectedIndex(-1);
    cbNameEmp.setSelectedIndex(-1);
    cbPromotions.setSelectedIndex(-1);
    txtTime.setText("");
    txtDate.setText("");
  }//GEN-LAST:event_btnResetActionPerformed

  private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    MenuMain menuMain = new MenuMain();
    menuMain.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_jMenu2MouseClicked
  
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new OrderManager().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnReset;
  private javax.swing.JButton btnSearch;
  private javax.swing.JComboBox cbIDCus;
  private javax.swing.JComboBox cbIDOrder;
  private javax.swing.JComboBox cbIDProduct;
  private javax.swing.JComboBox cbNameEmp;
  private javax.swing.JComboBox cbPromotions;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable tblOrder;
  private javax.swing.JTextField txtDate;
  private javax.swing.JTextField txtTime;
  // End of variables declaration//GEN-END:variables
}

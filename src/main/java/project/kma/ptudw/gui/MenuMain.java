/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.gui;

import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.kma.ptudw.api.CONSTANT;
import project.kma.ptudw.entity.Customer;
import project.kma.ptudw.entity.Drink;
import project.kma.ptudw.entity.DrinkType;
import project.kma.ptudw.entity.Employee;
import project.kma.ptudw.entity.Order;
import project.kma.ptudw.entity.OrderPending;
import project.kma.ptudw.service.DrinkService;
import project.kma.ptudw.service.DrinkTypeService;
import project.kma.ptudw.service.EmployeeService;
import project.kma.ptudw.service.OrderPendingService;
import project.kma.ptudw.service.OrderService;

/**
 *
 * @author Duy Nien
 */
public class MenuMain extends javax.swing.JFrame {
  
  private String urlGetDrinkTypeAll = CONSTANT.HOST + CONSTANT.DRINK_TYPE_API + CONSTANT.ALL;
  private String urlGetDrinkTypeLike = CONSTANT.HOST + CONSTANT.DRINK_TYPE_API + CONSTANT.GET_BY_LIKE;
  private String urlGetDrinkByType = CONSTANT.HOST + CONSTANT.DRINK_API + CONSTANT.GET_BY_TYPE;
  private String urlGetDrinkById = CONSTANT.HOST + CONSTANT.DRINK_API + CONSTANT.GET_BY_ID;
  private String urlGetPendingAll = CONSTANT.HOST + CONSTANT.PENDING_API + CONSTANT.ALL;
  private String urlDeletePending = CONSTANT.HOST + CONSTANT.PENDING_API + CONSTANT.DELETE;
  private String urlGetIsLogin = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.ISLOGIN;
  private String urlLogout = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.LOGOUT;
  private String urlPostOrder = CONSTANT.HOST + CONSTANT.ORDER_API + CONSTANT.CREATE;
  private DrinkTypeService drinkTypeService;
  private DrinkService drinkService;
  private OrderPendingService orderPendingService;
  private EmployeeService employeeService;
  private OrderService orderService;
  
  public MenuMain() {
    initComponents();
    this.drinkTypeService = new DrinkTypeService();
    this.drinkService = new DrinkService();
    this.orderPendingService = new OrderPendingService();
    this.employeeService = new EmployeeService();
    this.orderService = new OrderService();
    getDrinkTypeToComboBox();
    getOrderPending();
    txtNameEmp.setText("Xin chào " + getEmployeeActive().getEmpName());
  }
  
  public void getDrinkTypeToComboBox() {
    try {
      List<DrinkType> listDrirkTypes
              = drinkTypeService.handleMethodGetAll(urlGetDrinkTypeAll, DrinkType[].class);
      for (DrinkType listDrirkType : listDrirkTypes) {
        jComboBoxType.addItem(listDrirkType.getId() + "." + listDrirkType.getName());
      }
    } catch (Exception ex) {
      Logger.getLogger(MenuMain.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Lỗi kết nối tới dữ liệu!");
    }
  }
  
  public void getDrinkByType(int typeId) {
    List<Drink> drinks = null;
    try {
      drinks = drinkService.getDrinksByTypeId(urlGetDrinkByType, typeId);
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
  
  public void getOrderPending() {
    List<OrderPending> pendings = null;
    try {
      pendings = orderPendingService.handleMethodGetAll(urlGetPendingAll, OrderPending[].class);
    } catch (Exception ex) {
      Logger.getLogger(MenuMain.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
    String[] title = {"Mã", "Tên KH", "ĐC KH", "SĐT KH", "Mã đồ uống"};
    DefaultTableModel model = new DefaultTableModel(title, 0);
    for (OrderPending orderPending : pendings) {
      Vector vector = new Vector();
      vector.add(orderPending.getId());
      vector.add(orderPending.getNameCus());
      vector.add(orderPending.getAddressCus());
      vector.add(orderPending.getPhoneCus());
      vector.add(orderPending.getDrinkId());
      model.addRow(vector);
    }
    tblPending.setModel(model);
  }
  
  public Employee getEmployeeActive() {
    Employee employee = null;
    try {
      employee = employeeService.getIsLogin(urlGetIsLogin);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
    return employee;
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jMenuItem1 = new javax.swing.JMenuItem();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jButton5 = new javax.swing.JButton();
    jComboBoxType = new javax.swing.JComboBox<>();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblMenu = new javax.swing.JTable();
    jSearch = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jScrollPane3 = new javax.swing.JScrollPane();
    tblPending = new javax.swing.JTable();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jButton6 = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtNameEmp = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu3 = new javax.swing.JMenu();
    jMenu4 = new javax.swing.JMenu();
    jMenu5 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    jMenuItem1.setText("jMenuItem1");

    jLabel1.setText("jLabel1");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane2.setViewportView(jTable1);

    jButton5.setText("jButton5");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jComboBoxTypeActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee-file.png"))); // NOI18N
    jLabel2.setText("Loại đồ uống");

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
    tblMenu.setAlignmentX(1.0F);
    tblMenu.setAlignmentY(1.0F);
    tblMenu.setRowHeight(20);
    tblMenu.setRowMargin(2);
    tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblMenuMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tblMenu);

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
    jButton1.setText("Tìm kiếm");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirm-order.png"))); // NOI18N
    jButton2.setText("Xác nhận");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    tblPending.setModel(new javax.swing.table.DefaultTableModel(
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
    tblPending.setAlignmentX(1.0F);
    tblPending.setAlignmentY(1.0F);
    tblPending.setRowHeight(20);
    tblPending.setRowMargin(2);
    jScrollPane3.setViewportView(tblPending);

    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
    jButton3.setText("Xóa");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
    jButton4.setText("Làm mới");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pending.png"))); // NOI18N

    jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manager.png"))); // NOI18N
    jButton6.setText("Quản lý sản phẩm");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton6ActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee.png"))); // NOI18N
    jLabel6.setText("COFFEE Cộng");

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee-after.png"))); // NOI18N

    txtNameEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

    jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
    jMenu3.setText("Nhân viên");
    jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu3MouseClicked(evt);
      }
    });
    jMenuBar1.add(jMenu3);

    jMenu4.setText("About");
    jMenuBar1.add(jMenu4);

    jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order.png"))); // NOI18N
    jMenu5.setText("Đơn Mua");
    jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu5MouseClicked(evt);
      }
    });
    jMenuBar1.add(jMenu5);

    jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
    jMenu2.setText("Đăng xuất");
    jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu2MouseClicked(evt);
      }
    });
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
          .addComponent(jScrollPane3)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jButton1)
              .addComponent(jButton4)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(txtNameEmp)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6)
            .addComponent(jLabel4))
          .addComponent(txtNameEmp))
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel2)
          .addComponent(jButton6))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButton4)
              .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButton1)))
          .addComponent(jLabel3))
        .addGap(13, 13, 13)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton3)
        .addContainerGap(33, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    try {
      employeeService.logout(urlLogout);
      this.setVisible(false);
      System.exit(0);
    } catch (URISyntaxException ex) {
      Logger.getLogger(MenuMain.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
  }//GEN-LAST:event_jMenu2MouseClicked

  private void jComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeActionPerformed
    int typeId = Integer.parseInt(jComboBoxType.getSelectedItem().toString().split("\\.")[0]);
    getDrinkByType(typeId);
  }//GEN-LAST:event_jComboBoxTypeActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
      int row = tblPending.getSelectedRow();
      String idPending = String.valueOf(tblPending.getValueAt(row, 0));
      String nameKH = String.valueOf(tblPending.getValueAt(row, 1));
      String DCKH = String.valueOf(tblPending.getValueAt(row, 2));
      String phoneKH = String.valueOf(tblPending.getValueAt(row, 3));
      String idDrink = String.valueOf(tblPending.getValueAt(row, 4));
      if (idPending == "" || idPending == null) {
        JOptionPane.showMessageDialog(null, "Chưa chọn đồ!");
        return;
      } else {
        int option = JOptionPane.showConfirmDialog(null, "Có xác định thanh toán!");
        if (option == 0) {
          Employee employee = getEmployeeActive();
          Drink drink = drinkService.handleMethodGetById(urlGetDrinkById, Integer.parseInt(idDrink));
          Customer customer = new Customer();
          customer.setName(nameKH);
          customer.setAddress(DCKH);
          customer.setPhone(phoneKH);
          Order order = new Order();
          order.setCustomer(customer);
          order.setEmployee(employee);
          order.setTime(LocalDateTime.now());
          order.setTotal(drink.getPrice());
          order.setStatus("Đã thanh toán");
          orderService.handleMethodPost(urlPostOrder, order);
          int id = Integer.parseInt(idPending);
          orderPendingService.handleMethodDelete(urlDeletePending, id);
          getOrderPending();
          JOptionPane.showMessageDialog(null, "Xóa thành công!");
        }
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Chưa chọn dữ liệu");
      e.printStackTrace();
    }
  }//GEN-LAST:event_jButton3ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nameSearch = jSearch.getText();
    String second = nameSearch.substring(1, nameSearch.length());
    String first = String.valueOf(nameSearch.charAt(0)).toUpperCase();
    nameSearch = first.concat(second);
    try {
      DrinkType drinkTypeSearch = drinkTypeService.getdDrinkTypeLike(urlGetDrinkTypeLike, nameSearch);
      getDrinkByType(drinkTypeSearch.getId());
      JOptionPane.showMessageDialog(null, "Tìm thành công!");
    } catch (Exception ex) {
      Logger.getLogger(MenuMain.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
      int row = tblMenu.getSelectedRow();
      String idDrink = String.valueOf(tblMenu.getValueAt(row, 0));
      if (idDrink == "" || idDrink == null) {
        JOptionPane.showMessageDialog(null, "Chưa chọn đồ!");
        return;
      } else {
        OrderForm testForm = new OrderForm(Integer.parseInt(idDrink));
        testForm.setVisible(true);
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Chưa chọn đồ!");
      e.printStackTrace();
    }
  }//GEN-LAST:event_jButton2ActionPerformed

  private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked

  }//GEN-LAST:event_tblMenuMouseClicked

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    getOrderPending();
  }//GEN-LAST:event_jButton4ActionPerformed

  private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    OrderManager orderManager = new OrderManager();
    orderManager.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_jMenu5MouseClicked

  private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    EmployeeManager employeeManager = new EmployeeManager();
    employeeManager.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_jMenu3MouseClicked

  private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    ProductManager productManager = new ProductManager();
    productManager.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_jButton6ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MenuMain().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JComboBox<String> jComboBoxType;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenu jMenu5;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JTextField jSearch;
  private javax.swing.JTable jTable1;
  private javax.swing.JTable tblMenu;
  private javax.swing.JTable tblPending;
  private javax.swing.JLabel txtNameEmp;
  // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.gui;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.kma.ptudw.api.CONSTANT;
import project.kma.ptudw.entity.Drink;
import project.kma.ptudw.entity.DrinkType;
import project.kma.ptudw.service.DrinkService;
import project.kma.ptudw.service.DrinkTypeService;

/**
 *
 * @author Duy Nien
 */
public class ProductManager extends javax.swing.JFrame {

  private String urlGetDrinkTypeAll = CONSTANT.HOST + CONSTANT.DRINK_TYPE_API + CONSTANT.ALL;
  private String urlGetDrinkTypeById = CONSTANT.HOST + CONSTANT.DRINK_TYPE_API + CONSTANT.GET_BY_ID;
  private String urlGetDrink = CONSTANT.HOST + CONSTANT.DRINK_API + CONSTANT.ALL;
  private String urlCreateDrink = CONSTANT.HOST + CONSTANT.DRINK_API + CONSTANT.CREATE;
  private String urlGetDrinkById = CONSTANT.HOST + CONSTANT.DRINK_API + CONSTANT.GET_BY_ID;
  private DrinkService drinkService;
  private DrinkTypeService drinkTypeService;

  public ProductManager() {
    initComponents();
    this.drinkTypeService = new DrinkTypeService();
    this.drinkService = new DrinkService();
    getDrinkType();
    getDrink();
  }

  public void getDrinkType() {
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

  public void getDrink() {
    List<Drink> drinks = null;
    try {
      drinks = drinkService.handleMethodGetAll(urlGetDrink, Drink[].class);
    } catch (Exception ex) {
      Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Lỗi kết nối tới dữ liệu!");
    }
    if (drinks.size() == 0) {
      JOptionPane.showMessageDialog(null, "Không tìm thấy!");
      return;
    }
    String[] title = {"Mã đồ uống", "Tên đồ uống", "Giá thành", "Dung tích", "Loại"};
    DefaultTableModel model = new DefaultTableModel(title, 0);
    for (Drink drink : drinks) {
      Vector vector = new Vector();
      vector.add(drink.getId());
      vector.add(drink.getName());
      vector.add(drink.getPrice());
      vector.add(drink.getMass() + " ml");
      vector.add(drink.getDrinkType().getName());
      model.addRow(vector);
    }
    tblDrink.setModel(model);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtPrice = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtMass = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblDrink = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    jComboBoxType = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu3 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Loại đồ uống");

    jLabel2.setText("Tên đồ uống");

    jLabel3.setText("Giá thành");

    jLabel4.setText("Khối lượng tịnh");

    tblDrink.setModel(new javax.swing.table.DefaultTableModel(
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
    tblDrink.setAlignmentX(1.5F);
    tblDrink.setAlignmentY(1.5F);
    tblDrink.setRowHeight(20);
    tblDrink.setRowMargin(2);
    jScrollPane1.setViewportView(tblDrink);

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirm-order.png"))); // NOI18N
    jButton1.setText("Xác nhận thêm");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel5.setText("ml");

    jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
    jMenu1.setText("Quay lại");
    jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu1MouseClicked(evt);
      }
    });
    jMenuBar1.add(jMenu1);

    jMenu3.setText("Thêm mới loại");
    jMenuBar1.add(jMenu3);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(33, 33, 33)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jButton1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(txtName)
              .addComponent(jComboBoxType, 0, 126, Short.MAX_VALUE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(txtMass, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 26, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtMass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(8, 8, 8)
        .addComponent(jButton1)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(20, 20, 20))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    MenuMain menu = new MenuMain();
    menu.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_jMenu1MouseClicked

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nameDrink = null;
    int drinkTypeId = 0;
    Double priceDrink = null, massDrink = null;
    Drink drink = new Drink();
    DrinkType drinkType = null;
    try {
      drinkTypeId = Integer.parseInt(String.valueOf(jComboBoxType.getSelectedItem()).split("\\.")[0]);
      nameDrink = txtName.getText();
      priceDrink = Double.parseDouble(txtPrice.getText());
      massDrink = Double.parseDouble(txtMass.getText());
    } catch (Exception e) {
      e.getStackTrace();
      JOptionPane.showMessageDialog(null, "Lỗi định dạng khối lượng!");
    }
    try {
      drinkType = drinkTypeService.handleMethodGetById(urlGetDrinkTypeById, drinkTypeId);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Lỗi kết nối tới dữ liệu!");
    }
    drink.setName(nameDrink);
    drink.setPrice(priceDrink);
    drink.setMass(massDrink);
    drink.setDrinkType(drinkType);
    try {
      drinkService.handleMethodPost(urlCreateDrink, drink);
      JOptionPane.showMessageDialog(null, "Thêm mới thành công!");
      getDrink();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Lỗi kết nối tới dữ liệu!");
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ProductManager().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JComboBox<String> jComboBoxType;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblDrink;
  private javax.swing.JTextField txtMass;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtPrice;
  // End of variables declaration//GEN-END:variables
}

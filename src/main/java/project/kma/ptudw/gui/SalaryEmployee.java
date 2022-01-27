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
import project.kma.ptudw.entity.DetailSalary;
import project.kma.ptudw.service.SalaryService;
import project.kma.ptudw.service.poi.CreateExel;

public class SalaryEmployee extends javax.swing.JFrame {

  private String urlgetSalaryIsLike = CONSTANT.HOST + CONSTANT.DETAIL_SALARY_API + CONSTANT.GET_BY_LIKE;
  private String urlgetSalary = CONSTANT.HOST + CONSTANT.DETAIL_SALARY_API + CONSTANT.ALL;
  private SalaryService salaryService;

  public SalaryEmployee() {
    initComponents();
    this.salaryService = new SalaryService();
    setSalarys(getAll());
  }

  public List<DetailSalary> getAll() {
    List<DetailSalary> detailSalarys = null;
    try {
      detailSalarys = salaryService.handleMethodGetAll(urlgetSalary, DetailSalary[].class);
    } catch (Exception ex) {
      Logger.getLogger(SalaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
    }
    return detailSalarys;
  }

  public List<DetailSalary> getAllIsLike(String name) {
    List<DetailSalary> detailSalarys = null;
    try {
      detailSalarys = salaryService.getSalaryIsLike(urlgetSalaryIsLike, name);
    } catch (Exception ex) {
      Logger.getLogger(SalaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
    }
    return detailSalarys;
  }

  public void setSalarys(List<DetailSalary> detailSalarys) {
    try {
      String[] title = {"Tên", "ĐC", "SĐT", "Ngày vào", "Tháng", "Năm", "Tổng lương"};
      DefaultTableModel model = new DefaultTableModel(title, 0);
      for (DetailSalary detailSalary : detailSalarys) {
        Vector vector = new Vector();
        vector.add(detailSalary.getEmployee().getEmpName());
        vector.add(detailSalary.getEmployee().getAddress());
        vector.add(detailSalary.getEmployee().getPhone());
        vector.add(detailSalary.getEmployee().getStartJob().format(DateTimeFormatter.ISO_DATE));
        vector.add(detailSalary.getMonth());
        vector.add(detailSalary.getYear());
        vector.add(detailSalary.getPrice());
        model.addRow(vector);
      }
      tblSalary.setModel(model);
    } catch (Exception ex) {
      Logger.getLogger(SalaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jMenu1 = new javax.swing.JMenu();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblSalary = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    txtSearch = new javax.swing.JTextField();
    btnSearch = new javax.swing.JButton();
    tblExel = new javax.swing.JButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    menuPrev = new javax.swing.JMenu();
    jMenu3 = new javax.swing.JMenu();

    jMenu1.setText("jMenu1");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    tblSalary.setModel(new javax.swing.table.DefaultTableModel(
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
    tblSalary.setAlignmentX(1.0F);
    tblSalary.setAlignmentY(1.5F);
    tblSalary.setRowHeight(20);
    jScrollPane1.setViewportView(tblSalary);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel1.setText("Tìm kiếm theo tên");

    btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
    btnSearch.setText("Search");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSearchActionPerformed(evt);
      }
    });

    tblExel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    tblExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excel.png"))); // NOI18N
    tblExel.setText("Xuất File");
    tblExel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tblExelActionPerformed(evt);
      }
    });

    menuPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
    menuPrev.setText("Quay lại");
    menuPrev.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        menuPrevMouseClicked(evt);
      }
    });
    jMenuBar1.add(menuPrev);

    jMenu3.setText("Edit");
    jMenuBar1.add(jMenu3);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnSearch)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tblExel)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSearch)
          .addComponent(tblExel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void tblExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblExelActionPerformed
    try {
      List<DetailSalary> detailSalarys = salaryService.handleMethodGetAll(urlgetSalary, DetailSalary[].class);
      CreateExel.handleCreate(detailSalarys);
      JOptionPane.showMessageDialog(null, "Xuất file thành công!");
    } catch (Exception ex) {
      Logger.getLogger(SalaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
  }//GEN-LAST:event_tblExelActionPerformed

  private void menuPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrevMouseClicked
    EmployeeManager employeeManager = new EmployeeManager();
    employeeManager.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_menuPrevMouseClicked

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    String name = txtSearch.getText();
    name = name.substring(0, 1).toUpperCase().concat(name.substring(1, name.length()));
    List<DetailSalary> salarys = getAllIsLike(name);
    if (salarys.size() > 0) {
      setSalarys(getAllIsLike(name));
      JOptionPane.showMessageDialog(null, "Tìm thành công!");
    }
    else{
      JOptionPane.showMessageDialog(null, "Không tìm thấy!");
    }
  }//GEN-LAST:event_btnSearchActionPerformed

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SalaryEmployee().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnSearch;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JMenu menuPrev;
  private javax.swing.JButton tblExel;
  private javax.swing.JTable tblSalary;
  private javax.swing.JTextField txtSearch;
  // End of variables declaration//GEN-END:variables
}

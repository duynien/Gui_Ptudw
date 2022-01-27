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
import project.kma.ptudw.entity.Employee;
import project.kma.ptudw.service.CustomerService;
import project.kma.ptudw.service.EmployeeService;

/**
 *
 * @author Duy Nien
 */
public class EmployeeManager extends javax.swing.JFrame {
  
  private EmployeeService employeeService;
  private String urlAll = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.ALL;
  private String urlById = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.GET_BY_ID;
  private String urlMaxId = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.GET_MAX_ID;
  private String urlPost = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.CREATE;
  private String urlExistByEmail = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.EXIST_BY_EMAIL;
  private String urlDelete = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.DELETE;
  private String urlPut = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.UPDATE;
  
  public EmployeeManager() {
    initComponents();
    this.employeeService = new EmployeeService();
    loadData();
  }
  
  public void loadData() {
    try {
      List<Employee> employees = employeeService.handleMethodGetAll(urlAll, Employee[].class);
      String title[] = {"Mã", "Tên", "ĐC", "SĐT", "Ngày BĐ", "Email", "Password"};
      DefaultTableModel model = new DefaultTableModel(title, 0);
      for (Employee employee : employees) {
        Vector vector = new Vector();
        vector.add(employee.getId());
        vector.add(employee.getEmpName());
        vector.add(employee.getAddress());
        vector.add(employee.getPhone());
        vector.add(employee.getStartJob());
        vector.add(employee.getEmail());
        vector.add(employee.getPassword());
        model.addRow(vector);
      }
      tblEmp.setModel(model);
      lbSL.setText(String.valueOf(employees.size()));
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
  }
  
  public void reset() {
    
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbSL = new javax.swing.JLabel();
    btnReset = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    txtPhone = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblEmp = new javax.swing.JTable();
    txtAddress = new javax.swing.JTextField();
    btnAdd = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    btnDel = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    txtEmail = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    txtSex = new javax.swing.JComboBox<>();
    txtPass = new javax.swing.JPasswordField();
    jLabel8 = new javax.swing.JLabel();
    ID = new javax.swing.JLabel();
    tblSalary = new javax.swing.JButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lbSL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    lbSL.setText("0 ");

    btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnReset.setForeground(new java.awt.Color(255, 0, 255));
    btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
    btnReset.setText("Làm mới");
    btnReset.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResetActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 204, 0));
    jLabel6.setText("Bảng thành viên");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel3.setText("Số điện thoại:");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel4.setText("Email:");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 0, 0));
    jLabel5.setText("Thông tin thành viên");

    tblEmp.setModel(new javax.swing.table.DefaultTableModel(
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
    tblEmp.setAlignmentY(1.0F);
    tblEmp.setRowHeight(20);
    tblEmp.getTableHeader().setReorderingAllowed(false);
    tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblEmpMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tblEmp);

    btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnAdd.setForeground(new java.awt.Color(0, 204, 0));
    btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-account.png"))); // NOI18N
    btnAdd.setText("Thêm");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnUpdate.setForeground(new java.awt.Color(0, 0, 153));
    btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-document.png"))); // NOI18N
    btnUpdate.setText("Cập nhật");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    btnDel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnDel.setForeground(new java.awt.Color(255, 0, 0));
    btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
    btnDel.setText("Xóa");
    btnDel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDelActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel2.setText("Họ và Tên:");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(0, 204, 0));
    jLabel7.setText("thành viên");

    jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel13.setText("Địa chỉ");

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel1.setText("Password");

    jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel14.setText("Giới tính");

    txtSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel8.setText("Mã thành viên");

    ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

    tblSalary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    tblSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
    tblSalary.setText("Xem bảng lương");
    tblSalary.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tblSalaryActionPerformed(evt);
      }
    });

    jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
    jMenu1.setText("Quay lại");
    jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu1MouseClicked(evt);
      }
    });
    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnAdd)
              .addComponent(jLabel14))
            .addGap(6, 6, 6)
            .addComponent(btnUpdate)
            .addGap(6, 6, 6)
            .addComponent(btnDel)
            .addGap(6, 6, 6)
            .addComponent(btnReset)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tblSalary))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel13)
                .addComponent(jLabel5)
                .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                      .addGap(10, 10, 10)
                      .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7))
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(18, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(lbSL)
              .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(14, 14, 14)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel13))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtEmail))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtSex)
          .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnAdd)
          .addComponent(btnUpdate)
          .addComponent(btnDel)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnReset)
            .addComponent(tblSalary)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    loadData();
    txtName.setText("");
    txtAddress.setText("");
    txtPhone.setText("");
    txtEmail.setText("");
    txtPass.setText("");
  }//GEN-LAST:event_btnResetActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    try {
      boolean existByEmail = employeeService.existByEmail(urlExistByEmail, txtEmail.getText());
      if (existByEmail) {
        JOptionPane.showMessageDialog(null, "Email đã tồn tại");
        return;
      } else {
        int maxId = employeeService.getMaxId(urlMaxId);
        Employee employee = new Employee();
        employee.setId(maxId + 1);
        employee.setEmpName(txtName.getText());
        employee.setAddress(txtAddress.getText());
        employee.setPhone(txtPhone.getText());
        employee.setSex(txtSex.getSelectedItem().toString());
        employee.setStartJob(LocalDateTime.now());
        employee.setEmail(txtEmail.getText());
        employee.setPassword(txtPass.getPassword().toString());
        employee.setRole("EMPLOYEE");
        employee.setStatus("inactive");
        Employee rs = employeeService.handleMethodPost(urlPost, employee);
        loadData();
        JOptionPane.showMessageDialog(null, "Thêm thành công!");
      }
    } catch (URISyntaxException ex) {
      Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu");
    } catch (Exception ex) {
      Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu");
    }
  }//GEN-LAST:event_btnAddActionPerformed

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    String idStr = ID.getText();
    if (idStr.equals("") || idStr == null) {
      JOptionPane.showMessageDialog(null, "Không nhận được dữ liệu!");
      return;
    }
    try {
      Employee getStatus = employeeService.handleMethodGetById(urlById, Integer.parseInt(idStr));
      Employee employee = new Employee();
      employee.setId(Integer.parseInt(idStr));
      employee.setEmpName(txtName.getText());
      employee.setAddress(txtAddress.getText());
      employee.setPhone(txtPhone.getText());
      employee.setSex(txtSex.getSelectedItem().toString());
      employee.setEmail(txtEmail.getText());
      employee.setPassword(txtPass.getPassword().toString());
      employee.setStatus(getStatus.getStatus());
      employeeService.handleMethodPut(urlPut, employee);
      loadData();
      JOptionPane.showMessageDialog(null, "Thay đổi thành công");
    } catch (Exception ex) {
      Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Không truy cập được dữ liệu!");
    }
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
    String idStr = ID.getText();
    if (idStr.equals("") || idStr == null) {
      JOptionPane.showMessageDialog(null, "Không nhận được dữ liệu!");
      return;
    }
    int option = JOptionPane.showConfirmDialog(null, "Có xác định xóa!");
    if (option == 0) {
      int id = Integer.parseInt(idStr);
      try {
        employeeService.handleMethodDelete(urlDelete, id);
        loadData();
        JOptionPane.showMessageDialog(null, "Xóa thành công!");
      } catch (Exception ex) {
        Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
      }
    }
  }//GEN-LAST:event_btnDelActionPerformed

  private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
    int row = tblEmp.getSelectedRow();
    int idEmp = (int) tblEmp.getValueAt(row, 0);
    try {
      Employee employee = employeeService.handleMethodGetById(urlById, idEmp);
      ID.setText(String.valueOf(employee.getId()));
      txtName.setText(employee.getEmpName());
      txtPhone.setText(employee.getPhone());
      txtAddress.setText(employee.getAddress());
      txtEmail.setText(employee.getEmail());
      txtPass.setText(employee.getPassword());
      txtSex.setSelectedItem(employee.getSex());
    } catch (Exception ex) {
      Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_tblEmpMouseClicked

  private void tblSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblSalaryActionPerformed
    SalaryEmployee salaryEmployee = new SalaryEmployee();
    salaryEmployee.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_tblSalaryActionPerformed

  private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    MenuMain menuMain = new MenuMain();
    menuMain.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_jMenu1MouseClicked

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new EmployeeManager().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel ID;
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnDel;
  private javax.swing.JButton btnReset;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbSL;
  private javax.swing.JTable tblEmp;
  private javax.swing.JButton tblSalary;
  private javax.swing.JTextField txtAddress;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtName;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtPhone;
  private javax.swing.JComboBox<String> txtSex;
  // End of variables declaration//GEN-END:variables
}

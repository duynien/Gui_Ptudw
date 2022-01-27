/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import project.kma.ptudw.api.CONSTANT;
import project.kma.ptudw.entity.Employee;
import project.kma.ptudw.entity.LoginRequest;
import project.kma.ptudw.service.EmployeeService;

public class SignIn extends javax.swing.JFrame {

  private EmployeeService employeeService;
  private String urlLogin = CONSTANT.HOST + CONSTANT.EMPLOYEE_API + CONSTANT.LOGIN;
  private String emailPattern = CONSTANT.EMAIL_PATTERN;

  public SignIn() {
    initComponents();
    this.employeeService = new EmployeeService();
  }

  public boolean isEmail(String email) {
    Pattern pattern = Pattern.compile(emailPattern);
    return pattern.matcher(email).matches();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel4 = new javax.swing.JLabel();
    role = new javax.swing.JComboBox();
    jLabel2 = new javax.swing.JLabel();
    email = new javax.swing.JTextField();
    password = new javax.swing.JPasswordField();
    jLabel3 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("LOGIN");

    jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key-access.png"))); // NOI18N
    jLabel4.setText("ROLE");

    role.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "EMPLOYEE" }));
    role.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        roleActionPerformed(evt);
      }
    });
    role.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        roleKeyPressed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/google-mail.png"))); // NOI18N
    jLabel2.setText("EMAIL");

    email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    email.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        emailKeyPressed(evt);
      }
    });

    password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    password.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        passwordKeyPressed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
    jLabel3.setText("PASSWORD");

    jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forms.png"))); // NOI18N
    jLabel1.setText("FORM LOGIN");

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee-logo.png"))); // NOI18N

    jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/good-luck.png"))); // NOI18N
    jButton1.setText("Đăng nhập");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devil-horn.png"))); // NOI18N
    jButton2.setText("Đăng ký");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(85, 85, 85)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel6)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(jButton2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jButton1))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addComponent(jLabel2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addComponent(jLabel4)
                  .addGap(79, 79, 79)
                  .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(layout.createSequentialGroup()
            .addGap(223, 223, 223)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(97, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(73, 73, 73)
            .addComponent(jLabel6))
          .addGroup(layout.createSequentialGroup()
            .addGap(106, 106, 106)
            .addComponent(jLabel1)))
        .addGap(106, 106, 106)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(34, 34, 34)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3)
          .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(33, 33, 33)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1)
          .addComponent(jButton2))
        .addGap(25, 25, 25))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_roleActionPerformed

  private void roleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roleKeyPressed

  }//GEN-LAST:event_roleKeyPressed

  private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed

  }//GEN-LAST:event_emailKeyPressed

  private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed

  }//GEN-LAST:event_passwordKeyPressed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String email = this.email.getText();
    if (!isEmail(email)) {
      JOptionPane.showMessageDialog(null, "Không đúng định dạng!");
      return;
    }
    String password = String.valueOf(this.password.getPassword());
    String role = this.role.getSelectedItem().toString();
    LoginRequest loginRequest = new LoginRequest(email, password);
    Employee employee = null;
    try {
      employee = employeeService.handleLogin(urlLogin, loginRequest);
    } catch (Exception ex) {
      Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(null, "Lỗi kết nối tới dữ liệu!");
    }
    if (employee != null) {
      if (employee.getRole().equals(role)) {
        MenuMain menuMain = new MenuMain();
        menuMain.setVisible(true);
        this.setVisible(false);
      } else {
        JOptionPane.showMessageDialog(null, "Không có quyền!");
      }
    } else {
      System.out.println("LOGIN FAIL");
      JOptionPane.showMessageDialog(null, "Sai toàn khoản mật khẩu!");
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
  }//GEN-LAST:event_jButton2ActionPerformed

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
      java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SignIn().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField email;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPasswordField password;
  private javax.swing.JComboBox role;
  // End of variables declaration//GEN-END:variables
}

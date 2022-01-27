/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.gui;

/**
 *
 * @author Duy Nien
 */
public class SignUp extends javax.swing.JFrame {

  public SignUp() {
    initComponents();
    hideEmailAndPass(false);
  }
  public void hideEmailAndPass(boolean isHide){
    jEmail.setVisible(isHide);
    jPass.setVisible(isHide);
    tEmail.setVisible(isHide);
    tPass.setVisible(isHide);
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
    jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();
    jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
    jMenuItem1 = new javax.swing.JMenuItem();
    jPopupMenu1 = new javax.swing.JPopupMenu();
    jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
    jDialog1 = new javax.swing.JDialog();
    jColorChooser1 = new javax.swing.JColorChooser();
    jLabel2 = new javax.swing.JLabel();
    label1 = new java.awt.Label();
    button1 = new java.awt.Button();
    textField1 = new java.awt.TextField();
    label2 = new java.awt.Label();
    textField2 = new java.awt.TextField();
    label3 = new java.awt.Label();
    textField3 = new java.awt.TextField();
    button2 = new java.awt.Button();
    button3 = new java.awt.Button();
    filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
    jEmail = new javax.swing.JLabel();
    tEmail = new javax.swing.JTextField();
    jPass = new javax.swing.JLabel();
    tPass = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    munuAdmin = new javax.swing.JMenu();
    menuEmploy = new javax.swing.JMenu();
    menuCus = new javax.swing.JMenu();

    jCheckBoxMenuItem1.setSelected(true);
    jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

    jCheckBoxMenuItem2.setSelected(true);
    jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

    jMenu1.setText("jMenu1");

    jMenu2.setText("jMenu2");

    jCheckBoxMenuItem3.setSelected(true);
    jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

    jMenuItem1.setText("jMenuItem1");

    jCheckBoxMenuItem4.setSelected(true);
    jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

    javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
    jDialog1.getContentPane().setLayout(jDialog1Layout);
    jDialog1Layout.setHorizontalGroup(
      jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    jDialog1Layout.setVerticalGroup(
      jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );

    jLabel2.setText("jLabel2");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("SIGN UP");

    label1.setText("NAME");

    button1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    button1.setLabel("CANCEL");

    label2.setText("HOMETOWN");

    label3.setText("AGE");

    button2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    button2.setLabel("CONFIRM");
    button2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        button2ActionPerformed(evt);
      }
    });

    button3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    button3.setLabel("LOGIN");
    button3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        button3ActionPerformed(evt);
      }
    });

    jEmail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jEmail.setText("EMAIL");

    tEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    jPass.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jPass.setText("PASSWORD");

    tPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 0, 24)); // NOI18N
    jLabel1.setText("FORM SIGN UP");

    munuAdmin.setText("ADMIN");
    munuAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        munuAdminMouseClicked(evt);
      }
    });
    jMenuBar1.add(munuAdmin);

    menuEmploy.setText("EMPLOYEE");
    menuEmploy.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        menuEmployMouseClicked(evt);
      }
    });
    jMenuBar1.add(menuEmploy);

    menuCus.setText("CUSTOMER");
    menuCus.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        menuCusMouseClicked(evt);
      }
    });
    jMenuBar1.add(menuCus);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(3, 3, 3)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
          .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(tEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
          .addComponent(tPass))
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(38, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(54, 54, 54))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(119, 119, 119))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(41, 41, 41))
    );

    button2.getAccessibleContext().setAccessibleName("button2");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void menuCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCusMouseClicked
    // TODO add your handling code here:
    System.out.println("CUSTOMER");
    hideEmailAndPass(true);
  }//GEN-LAST:event_menuCusMouseClicked

  private void menuEmployMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmployMouseClicked
    // TODO add your handling code here:
    System.out.println("EMPLOYEE");
    
  }//GEN-LAST:event_menuEmployMouseClicked

  private void munuAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_munuAdminMouseClicked
    // TODO add your handling code here:
   System.out.println("ADMIN");
  }//GEN-LAST:event_munuAdminMouseClicked

  private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
    // TODO add your handling code here:
    System.out.println("CONFIRM");
  }//GEN-LAST:event_button2ActionPerformed

  private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
    SignIn signIn = new SignIn();
    signIn.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_button3ActionPerformed

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
      java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SignUp().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private java.awt.Button button1;
  private java.awt.Button button2;
  private java.awt.Button button3;
  private javax.swing.Box.Filler filler1;
  private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
  private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
  private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
  private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
  private javax.swing.JColorChooser jColorChooser1;
  private javax.swing.JDialog jDialog1;
  private javax.swing.JLabel jEmail;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JLabel jPass;
  private javax.swing.JPopupMenu jPopupMenu1;
  private java.awt.Label label1;
  private java.awt.Label label2;
  private java.awt.Label label3;
  private javax.swing.JMenu menuCus;
  private javax.swing.JMenu menuEmploy;
  private javax.swing.JMenu munuAdmin;
  private javax.swing.JTextField tEmail;
  private javax.swing.JTextField tPass;
  private java.awt.TextField textField1;
  private java.awt.TextField textField2;
  private java.awt.TextField textField3;
  // End of variables declaration//GEN-END:variables
}

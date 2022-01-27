package project.kma.ptudw.gui;

public class About extends javax.swing.JFrame {

  public About() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbLogo = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    btnOK = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JSeparator();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(153, 0, 0));
    jLabel1.setText("Phiên bản: 1.0");

    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(153, 0, 0));
    jLabel2.setText("Ngày ra mắt: 01/01/2021 08:00 AM");

    jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(153, 0, 0));
    jLabel3.setText("Địa chỉ: Hà Nội");

    jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(153, 0, 0));
    jLabel4.setText("Số điện thoại: 0123456789");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(51, 51, 255));
    jLabel5.setText("Giấy phép: Miễn phí");

    jLabel6.setFont(new java.awt.Font("Bradley Hand ITC", 1, 12)); // NOI18N
    jLabel6.setText("Copyright © 2017 by THE GARDEN COFFEE");

    btnOK.setText("Quay lại");
    btnOK.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOKActionPerformed(evt);
      }
    });

    jSeparator1.setBackground(new java.awt.Color(0, 0, 204));
    jSeparator1.setForeground(new java.awt.Color(0, 0, 153));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(jLabel2)
              .addComponent(jLabel3)
              .addComponent(jLabel4)
              .addComponent(jLabel5))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnOK)))
        .addContainerGap())
      .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
      .addGroup(layout.createSequentialGroup()
        .addGap(108, 108, 108)
        .addComponent(jLabel6)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel6)
        .addGap(4, 4, 4)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnOK)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
    this.dispose();
  }//GEN-LAST:event_btnOKActionPerformed


  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new About().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnOK;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JLabel lbLogo;
  // End of variables declaration//GEN-END:variables
}

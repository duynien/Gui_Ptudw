/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Duy Nien
 */
public class BillForm extends javax.swing.JFrame {

  public BillForm() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel(){
      ImageIcon icon = new ImageIcon("image//background.png");
      public void paintComponent(Graphics g){
        Dimension d = getSize();
        g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
        setOpaque(false);
        super.paintComponent(g);
      }
    };
    jPanel2 = new javax.swing.JPanel(){
      ImageIcon icon = new ImageIcon("image//hqR7r.png");
      public void paintComponent(Graphics g){
        Dimension d = getSize();
        g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
        setOpaque(false);
        super.paintComponent(g);
      }

    };
    jLabel9 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    lbSolve = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    txtDis1 = new javax.swing.JTextField();
    txtGuest = new javax.swing.JTextField();
    txtPay = new javax.swing.JTextField();
    txtDis2 = new javax.swing.JTextField();
    txtTotal = new javax.swing.JTextField();
    btnPrint = new javax.swing.JButton();
    jLabel20 = new javax.swing.JLabel();
    txtIDBill = new javax.swing.JTextField();
    lbLoiGia = new javax.swing.JLabel();
    txtRepay = new javax.swing.JTextField();
    jPanel3 = new javax.swing.JPanel(){
      ImageIcon icon = new ImageIcon("image//hqR7r.png");
      public void paintComponent(Graphics g){
        Dimension d = getSize();
        g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
        setOpaque(false);
        super.paintComponent(g);
      }
    };
    cbCTKM = new javax.swing.JComboBox();
    jLabel12 = new javax.swing.JLabel();
    lbNhap = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    pnInformation = new javax.swing.JPanel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    lbIDCus = new javax.swing.JLabel();
    lbNameCus = new javax.swing.JLabel();
    lbQuantityCus = new javax.swing.JLabel();
    lbDisCus = new javax.swing.JLabel();
    lbDateCus = new javax.swing.JLabel();
    jLabel19 = new javax.swing.JLabel();
    lbIDError = new javax.swing.JLabel();
    lbNgayKM = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    txtEmpName = new javax.swing.JTextField();
    cbProduct = new javax.swing.JComboBox();
    spQuantity = new javax.swing.JSpinner();
    cbSize = new javax.swing.JComboBox();
    jLabel11 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    btnAdd = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblBill = new javax.swing.JTable();
    btnDel = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(102, 51, 0));
    jLabel9.setText("Thanh toán");

    jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(153, 51, 0));
    jLabel6.setText("Tổng cộng:");

    jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(153, 51, 0));
    jLabel5.setText("Chiết khấu:");

    jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 0, 0));
    jLabel8.setText("Thành tiền:");

    jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(153, 51, 0));
    jLabel4.setText("Tiền khách đưa:");

    jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(153, 51, 0));
    jLabel7.setText("Tiền trả lại:");

    jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(153, 51, 0));
    jLabel10.setText("%");

    txtDis1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtDis1.setForeground(new java.awt.Color(0, 0, 204));
    txtDis1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtDis1.setText("0");
    txtDis1.setDisabledTextColor(new java.awt.Color(51, 0, 204));
    txtDis1.setEnabled(false);

    txtGuest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtGuest.setForeground(new java.awt.Color(0, 0, 204));
    txtGuest.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtGuest.setText("0");
    txtGuest.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txtGuestCaretUpdate(evt);
      }
    });

    txtPay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtPay.setForeground(new java.awt.Color(255, 0, 0));
    txtPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtPay.setText("0");
    txtPay.setDisabledTextColor(new java.awt.Color(255, 0, 0));
    txtPay.setEnabled(false);

    txtDis2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtDis2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtDis2.setDisabledTextColor(new java.awt.Color(0, 0, 204));
    txtDis2.setEnabled(false);

    txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtTotal.setText("0");
    txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    txtTotal.setDisabledTextColor(new java.awt.Color(0, 0, 204));
    txtTotal.setEnabled(false);
    txtTotal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtTotalActionPerformed(evt);
      }
    });

    btnPrint.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
    btnPrint.setForeground(new java.awt.Color(0, 204, 0));
    btnPrint.setText("Lưu và In");
    btnPrint.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPrintActionPerformed(evt);
      }
    });

    jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel20.setForeground(new java.awt.Color(255, 0, 0));
    jLabel20.setText("Mã hóa đơn:");

    lbLoiGia.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
    lbLoiGia.setForeground(new java.awt.Color(255, 0, 0));
    lbLoiGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    txtRepay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtRepay.setForeground(new java.awt.Color(0, 0, 204));
    txtRepay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtRepay.setText("0");
    txtRepay.setDisabledTextColor(new java.awt.Color(0, 0, 204));
    txtRepay.setEnabled(false);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(19, 19, 19)
            .addComponent(txtDis1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtDis2))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(299, 299, 299))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel8)
            .addGap(28, 28, 28)
            .addComponent(txtPay))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addGap(28, 28, 28)
            .addComponent(txtGuest))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(lbLoiGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbSolve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9))
              .addComponent(jLabel20))
            .addGap(6, 6, 6)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtRepay)
              .addComponent(txtIDBill)))))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(6, 6, 6)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel9)
          .addComponent(lbSolve))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(jLabel10)
          .addComponent(txtDis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtDis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lbLoiGia)
        .addGap(16, 16, 16)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(txtRepay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel20)
          .addComponent(txtIDBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    cbCTKM.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbCTKMActionPerformed(evt);
      }
    });
    cbCTKM.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        cbCTKMKeyPressed(evt);
      }
    });

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(0, 0, 102));
    jLabel12.setText("Chương trình khuyến mãi:");

    lbNhap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    lbNhap.setText("Nhập mã thẻ:");

    txtID.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txtIDCaretUpdate(evt);
      }
    });

    jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(0, 0, 204));
    jLabel13.setText("Thông tin khách hàng:");

    jLabel14.setText("Mã thẻ:");

    jLabel15.setText("Họ và tên:");

    jLabel16.setText("Số ly đã mua:");

    jLabel17.setText("Được giảm:");

    lbIDCus.setForeground(new java.awt.Color(204, 0, 51));
    lbIDCus.setText("...");

    lbNameCus.setForeground(new java.awt.Color(204, 0, 51));
    lbNameCus.setText("...");

    lbQuantityCus.setForeground(new java.awt.Color(204, 0, 51));
    lbQuantityCus.setText("...");

    lbDisCus.setForeground(new java.awt.Color(204, 0, 51));
    lbDisCus.setText("...");

    lbDateCus.setForeground(new java.awt.Color(204, 0, 51));
    lbDateCus.setText("...");

    jLabel19.setText("Ngày đăng ký:");

    javax.swing.GroupLayout pnInformationLayout = new javax.swing.GroupLayout(pnInformation);
    pnInformation.setLayout(pnInformationLayout);
    pnInformationLayout.setHorizontalGroup(
      pnInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pnInformationLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(pnInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel13)
          .addGroup(pnInformationLayout.createSequentialGroup()
            .addComponent(jLabel14)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbIDCus))
          .addGroup(pnInformationLayout.createSequentialGroup()
            .addComponent(jLabel15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbNameCus))
          .addGroup(pnInformationLayout.createSequentialGroup()
            .addComponent(jLabel16)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbQuantityCus))
          .addGroup(pnInformationLayout.createSequentialGroup()
            .addComponent(jLabel17)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbDisCus))
          .addGroup(pnInformationLayout.createSequentialGroup()
            .addComponent(jLabel19)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbDateCus)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pnInformationLayout.setVerticalGroup(
      pnInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pnInformationLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel13)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(pnInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel14)
          .addComponent(lbIDCus))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(pnInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel15)
          .addComponent(lbNameCus))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(pnInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lbDateCus)
          .addComponent(jLabel19))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(pnInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lbQuantityCus)
          .addComponent(jLabel16))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(pnInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel17)
          .addComponent(lbDisCus))
        .addGap(5, 5, 5))
    );

    lbIDError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    lbIDError.setForeground(new java.awt.Color(255, 0, 0));
    lbIDError.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lbIDError.setToolTipText("");

    lbNgayKM.setForeground(new java.awt.Color(255, 0, 0));
    lbNgayKM.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(cbCTKM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtID)
          .addComponent(pnInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lbIDError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel12)
              .addComponent(lbNhap))
            .addGap(0, 1, Short.MAX_VALUE))
          .addComponent(lbNgayKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addComponent(jLabel12)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(cbCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lbNgayKM)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(lbNhap)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(4, 4, 4)
        .addComponent(lbIDError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(pnInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 0, 204));
    jLabel2.setText("Tên nhân viên:");

    jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 204));
    jLabel1.setText("Tên sản phẩm");

    txtEmpName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    txtEmpName.setDisabledTextColor(new java.awt.Color(255, 0, 0));
    txtEmpName.setEnabled(false);

    cbProduct.setEditable(true);

    spQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
    spQuantity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    cbSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nhỏ", "Vừa", "Lớn" }));

    jLabel11.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(0, 0, 204));
    jLabel11.setText("Kích thước:");

    jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 0, 204));
    jLabel3.setText("Số lượng:");

    btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btnAdd.setText("Thêm");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtEmpName)
          .addComponent(cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(6, 6, 6)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel11)
              .addComponent(jLabel3))
            .addGap(12, 12, 12)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(spQuantity)
              .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(spQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))))))
    );

    tblBill.setBackground(new java.awt.Color(0, 255, 0));
    tblBill.setSelectionBackground(new java.awt.Color(255, 0, 0));
    tblBill.getTableHeader().setReorderingAllowed(false);
    tblBill.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblBillMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tblBill);

    btnDel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnDel.setForeground(new java.awt.Color(255, 0, 0));
    btnDel.setText("Xóa");
    btnDel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDelActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void tblBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBillMouseClicked

  }//GEN-LAST:event_tblBillMouseClicked

  private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
    txtPay.setText("0");
    txtTotal.setText("0");
    txtGuest.setText("0");
    txtRepay.setText("0");
    btnPrint.setEnabled(false);
    txtIDBill.setEnabled(false);
  }//GEN-LAST:event_btnDelActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

  }//GEN-LAST:event_btnAddActionPerformed

  private void txtIDCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIDCaretUpdate

  }//GEN-LAST:event_txtIDCaretUpdate

  private void cbCTKMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCTKMKeyPressed

  }//GEN-LAST:event_cbCTKMKeyPressed

  private void cbCTKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCTKMActionPerformed

  }//GEN-LAST:event_cbCTKMActionPerformed

  private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

  }//GEN-LAST:event_btnPrintActionPerformed

  private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed

  }//GEN-LAST:event_txtTotalActionPerformed

  private void txtGuestCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtGuestCaretUpdate

  }//GEN-LAST:event_txtGuestCaretUpdate

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BillForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnDel;
  private javax.swing.JButton btnPrint;
  private javax.swing.JComboBox cbCTKM;
  private javax.swing.JComboBox cbProduct;
  private javax.swing.JComboBox cbSize;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDateCus;
  private javax.swing.JLabel lbDisCus;
  private javax.swing.JLabel lbIDCus;
  private javax.swing.JLabel lbIDError;
  private javax.swing.JLabel lbLoiGia;
  private javax.swing.JLabel lbNameCus;
  private javax.swing.JLabel lbNgayKM;
  private javax.swing.JLabel lbNhap;
  private javax.swing.JLabel lbQuantityCus;
  private javax.swing.JLabel lbSolve;
  private javax.swing.JPanel pnInformation;
  private javax.swing.JSpinner spQuantity;
  private javax.swing.JTable tblBill;
  private javax.swing.JTextField txtDis1;
  private javax.swing.JTextField txtDis2;
  private javax.swing.JTextField txtEmpName;
  private javax.swing.JTextField txtGuest;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtIDBill;
  private javax.swing.JTextField txtPay;
  private javax.swing.JTextField txtRepay;
  private javax.swing.JTextField txtTotal;
  // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer.View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author admin
 */
public class pnlCustomer extends javax.swing.JPanel {
    
    /**
     * Creates new form pnlCustomer
     */
    public pnlCustomer() {
        initComponents();
    }

    public JButton getBtnAddContract() {
        return btnAddContract;
    }

    public void setBtnAddContract(JButton btnAddContract) {
        this.btnAddContract = btnAddContract;
    }

    public JButton getBtnDeleteContract() {
        return btnDeleteContract;
    }

    public void setBtnDeleteContract(JButton btnDeleteContract) {
        this.btnDeleteContract = btnDeleteContract;
    }

    public JButton getBtnEditContract() {
        return btnEditContract;
    }

    public void setBtnEditContract(JButton btnEditContract) {
        this.btnEditContract = btnEditContract;
    }

    public JButton getBtnViewElectricIndex() {
        return btnViewElectricIndex;
    }

    public void setBtnViewElectricIndex(JButton btnViewElectricIndex) {
        this.btnViewElectricIndex = btnViewElectricIndex;
    }


    public JButton getjButton2() {
        return btnEditContract;
    }

    public void setjButton2(JButton jButton2) {
        this.btnEditContract = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JComboBox<String> getjComboBox1() {
        return cboSearchField;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.cboSearchField = jComboBox1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getTblClockDetail() {
        return tblClockDetail;
    }

    public void setTblClockDetail(JTable tblClockDetail) {
        this.tblClockDetail = tblClockDetail;
    }

    public JTable getTblCustomer() {
        return tblCustomer;
    }

    public void setTblCustomer(JTable tblCustomer) {
        this.tblCustomer = tblCustomer;
    }

    public JTable getjTable1() {
        return tblCustomer;
    }

    public void setjTable1(JTable jTable1) {
        this.tblCustomer = jTable1;
    }


    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAddContract = new javax.swing.JButton();
        btnEditContract = new javax.swing.JButton();
        btnDeleteContract = new javax.swing.JButton();
        btnViewElectricIndex = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClockDetail = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cboSearchField = new javax.swing.JComboBox<>();

        jToolBar1.setRollover(true);

        btnAddContract.setText("Tạo hợp đồng");
        btnAddContract.setFocusable(false);
        btnAddContract.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddContract.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAddContract);

        btnEditContract.setText("Sửa thông tin");
        btnEditContract.setFocusable(false);
        btnEditContract.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditContract.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEditContract);

        btnDeleteContract.setText("Xóa hợp đồng");
        btnDeleteContract.setFocusable(false);
        btnDeleteContract.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteContract.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDeleteContract);

        btnViewElectricIndex.setText("Xem chi tiết sử dụng điện");
        btnViewElectricIndex.setFocusable(false);
        btnViewElectricIndex.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewElectricIndex.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnViewElectricIndex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewElectricIndexMouseClicked(evt);
            }
        });
        btnViewElectricIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewElectricIndexActionPerformed(evt);
            }
        });
        jToolBar1.add(btnViewElectricIndex);

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"KH001", "Trịnh Thị Ngọc  Ánh", "0329271555", "Hà Nội", "DH001", "Đã thanh toán"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Địa chỉ", "Mã đồng hồ", "Trạng thái thanh toán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCustomer.setName("tblCustomer"); // NOI18N
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Danh sách hợp đồng");

        tblClockDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Chỉ số đồng hồ", "Số KWH", "Ngày ghi", "Trạng thái"
            }
        ));
        jScrollPane2.setViewportView(tblClockDetail);

        jTextField1.setToolTipText("Nhập mã hoặc tên khách hàng");

        jButton3.setText("Tìm kiếm");

        cboSearchField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Trạng thái nợ" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewElectricIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewElectricIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewElectricIndexActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnViewElectricIndexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewElectricIndexMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewElectricIndexMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddContract;
    private javax.swing.JButton btnDeleteContract;
    private javax.swing.JButton btnEditContract;
    private javax.swing.JButton btnViewElectricIndex;
    private javax.swing.JComboBox<String> cboSearchField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblClockDetail;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables
}

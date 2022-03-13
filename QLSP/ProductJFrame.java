/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSP;
import QLSP.ConnectSql;
import QLSP.Product;
import QLSP.ProductModify;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ProductJFrame extends javax.swing.JFrame {
 DefaultTableModel tableMode;
    List<Product> dataList;
    int currentPos = -1;
    /**
     * Creates new form BookJFrame
     */
    public ProductJFrame() {
        initComponents();
        tableMode = (DefaultTableModel) tbProduct.getModel();
        dataList = ProductModify.getProductList(null);
        showDataPD();
    }
    private void showDataPD() {
        tableMode.setRowCount(0);
        for (Product sp : dataList) {
            tableMode.addRow(new Object[]{
                tableMode.getRowCount() + 1,
                sp.getIdPD(),
                sp.getNamePD(),
                sp.getCatogery(),
                sp.getQuantity(),
                sp.getPrice()
            });
        }
    }
    /**
     * Creates new form ProductJFrame
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbIdPD = new javax.swing.JLabel();
        lbNamePD = new javax.swing.JLabel();
        lbCatogery = new javax.swing.JLabel();
        lbQuantity = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        txtIdPD = new javax.swing.JTextField();
        txtNamePD = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtCatogery = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIdPD.setText("IdPD:");
        jPanel1.add(lbIdPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        lbNamePD.setText("NamePD:");
        jPanel1.add(lbNamePD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, -1, -1));

        lbCatogery.setText("Catogery:");
        jPanel1.add(lbCatogery, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbQuantity.setText("Quantity:");
        jPanel1.add(lbQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, -1, -1));

        lbPrice.setText("Price:");
        jPanel1.add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, -1, -1));

        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "IdPD", "NamePD", "Catogery", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProduct);
        if (tbProduct.getColumnModel().getColumnCount() > 0) {
            tbProduct.getColumnModel().getColumn(1).setResizable(false);
            tbProduct.getColumnModel().getColumn(3).setResizable(false);
            tbProduct.getColumnModel().getColumn(4).setResizable(false);
            tbProduct.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 390, 130));

        txtIdPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPDActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 11, 300, -1));
        jPanel1.add(txtNamePD, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 49, 300, -1));
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 125, 300, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 163, 300, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));
        jPanel1.add(txtCatogery, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 300, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
if(currentPos >=0){
            dataList.get(currentPos).setIdPD(txtIdPD.getText());
            dataList.get(currentPos).setNamePD(txtNamePD.getText());
            dataList.get(currentPos).setCatogery(txtCatogery.getText());
            dataList.get(currentPos).setQuantity(txtQuantity.getText());
            dataList.get(currentPos).setPrice(txtPrice.getText());
            ProductModify.update(dataList.get(currentPos));
            currentPos = -1;
        }else{
            Product sp = new Product(
                txtIdPD.getText(),
                txtNamePD.getText(),
                txtCatogery.getText(),
                txtQuantity.getText(),
                txtPrice.getText()
            );
            ProductModify.insert(sp);
            dataList = ProductModify.getProductList(null);
        } 
        showDataPD();
        txtIdPD.setText("");
        txtNamePD.setText("");
        txtCatogery.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
  
                                           
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
  if(currentPos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chua chon IdPD can xoa, vui long kiem tra lai");
            return;
        }
        int xoa = JOptionPane.showConfirmDialog(rootPane, "Ban chac chan muon xoa Sp nay khong?");
        if(xoa == 0) {
            ProductModify.delete(dataList.get(currentPos).getIdPD());
            dataList.remove(currentPos);
            currentPos = -1;
            showDataPD();
        }

        txtIdPD.setText("");
        txtNamePD.setText("");
        txtCatogery.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
    //GEN-LAST:event_XoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(ProductJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCatogery;
    private javax.swing.JLabel lbIdPD;
    private javax.swing.JLabel lbNamePD;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField txtCatogery;
    private javax.swing.JTextField txtIdPD;
    private javax.swing.JTextField txtNamePD;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

}
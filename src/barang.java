/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class barang extends javax.swing.JFrame {

    /**
     * Creates new form barang
     */
     DefaultTableModel model;
    public barang() {
        initComponents();    
    String[] judul={"id_barang","nama_barang","harga_sewa"};
        model =new DefaultTableModel(judul,0);
        barang.setModel(model);
        tampildata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_barang = new javax.swing.JTextField();
        nama_barang = new javax.swing.JTextField();
        harga_sewa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        barang = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id_barang ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 40));

        jLabel2.setText("nama_barang ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 40));

        jLabel3.setText("harga_sewa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 100, 30));

        id_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_barangActionPerformed(evt);
            }
        });
        jPanel1.add(id_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, 40));

        nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_barangActionPerformed(evt);
            }
        });
        jPanel1.add(nama_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, 40));
        jPanel1.add(harga_sewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 120, 40));

        jButton1.setText("tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jButton2.setText("edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jButton3.setText("hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jButton4.setText("refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jButton5.setText("keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(barang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 90));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("WONOKARTO PLAYSTATION ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 4, 320, 50));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("WONOKARTO PLAYSTATION ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 400, 60));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-30, -50, 580, 500);

        setSize(new java.awt.Dimension(569, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rentalps","root","");
            cn.createStatement().executeUpdate("insert into barang values"+"('"+id_barang.getText()+"','"+nama_barang.getText()+"','"+harga_sewa.getText()+"')");
            tampildata();
            //reset();
        } catch (SQLException ex) {
            //Logger.getLogger(kamera.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rentalps","root","");
              int executeUpdate = cn.createStatement().executeUpdate("delete from barang where id_barang='"+id_barang.getText()+"'");
            tampildata();
            //reset();
        } catch (SQLException ex) {
            //Logger.getLogger(rentalps.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex); 
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rentalps","root","");
            cn.createStatement().executeUpdate("update barang set nama_barang='"+nama_barang.getText()+"', harga_sewa='"+harga_sewa.getText()+"' where id_barang='"+id_barang.getText()+"'");
            tampildata();   
            //reset();
        } catch (SQLException ex) {
               //Logger.getLogger(kamera.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null,ex); 
        }        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        reset();
    }
    private void reset (){
        id_barang.setText("");
        nama_barang.setText("");
        harga_sewa.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         new tabel_menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void id_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_barangActionPerformed

    private void nama_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_barangActionPerformed

    private void barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangMouseClicked
        // TODO add your handling code here:
         int i=barang.getSelectedRow();
        
        if(i>-1){
            id_barang.setText(model.getValueAt(i,0).toString());
            nama_barang.setText(model.getValueAt(i,1).toString());
            harga_sewa.setText(model.getValueAt(i,2).toString());
            
        }
    }//GEN-LAST:event_barangMouseClicked

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
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable barang;
    private javax.swing.JTextField harga_sewa;
    private javax.swing.JTextField id_barang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_barang;
    // End of variables declaration//GEN-END:variables
  private void tampildata() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   int row = barang.getRowCount();
           for (int a= 0; a<row;a++){
               model.removeRow(0);
           }
           try {
               Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/rentalps","root","");
               ResultSet rs=cn.createStatement().executeQuery ("select * from barang");
               
               while(rs.next()) {
                   String data []={rs.getString(1),rs.getString(2),rs.getString(3),};
                   model.addRow(data);
               }
           
               } catch (SQLException ex){
                   Logger.getLogger(penyewa.class.getName()).log(Level.SEVERE,null,ex);
           }
    }
}

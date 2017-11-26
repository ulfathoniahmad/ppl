/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ppl.koneksi;

/**
 *
 * @author JEE
 */
public class pupuk extends javax.swing.JFrame {

    /**
     * Creates new form pupuk
     */
    koneksi kon;

    public pupuk() throws SQLException {
        kon = new koneksi("ppl", "root", "");
        initComponents();
        namaBuah();
        umur();

    }

    public void namaBuah() throws SQLException {
        String query = "SELECT * FROM npk group by namabuah";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            namaBuah_cb.addItem(rs.getString("namabuah"));
        }
    }

    public void umur() throws SQLException {
        String query = "SELECT * FROM npk group by umur";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            umur_cb.addItem(rs.getString("umur"));

        }
    }

    public JComboBox<String> getNamaBuah() {
        return namaBuah_cb;

    }

    public JComboBox<String> getUmur() {
        return umur_cb;

    }
    

    public JTextArea getHasil() {
        return hasil_ta;
    }

    public JLabel getAnalisa() {
        return analisa_btn;
    }
    
    public JLabel getReset(){
        return reset_btn;
    }

    public JLabel getKembali() {
        return kembali_btn;
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
        namaBuah_cb = new javax.swing.JComboBox<>();
        umur_cb = new javax.swing.JComboBox<>();
        analisa_btn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kembali_btn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil_ta = new javax.swing.JTextArea();
        reset_btn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaBuah_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH TANAMAN" }));
        jPanel1.add(namaBuah_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 460, 30));

        umur_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH UMUR" }));
        jPanel1.add(umur_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 460, 30));

        analisa_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/anal.png"))); // NOI18N
        jPanel1.add(analisa_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Hasil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Umur");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nama Buah");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        kembali_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        jPanel1.add(kembali_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        hasil_ta.setColumns(20);
        hasil_ta.setRows(5);
        jScrollPane1.setViewportView(hasil_ta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 460, 150));

        reset_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/reset.png"))); // NOI18N
        jPanel1.add(reset_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 830, 470));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LIHAT APA YANG TERJADI");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ab.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 891, 544));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void kembali_btnMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

    }

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
            java.util.logging.Logger.getLogger(pupuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pupuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pupuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pupuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pupuk().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(pupuk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analisa_btn;
    private javax.swing.JLabel background;
    private javax.swing.JTextArea hasil_ta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kembali_btn;
    private javax.swing.JComboBox<String> namaBuah_cb;
    private javax.swing.JLabel reset_btn;
    private javax.swing.JComboBox<String> umur_cb;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}

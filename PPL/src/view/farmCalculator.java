/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JEE
 */
public class farmCalculator extends javax.swing.JFrame {

    /**
     * Creates new form isidata
     */
    public farmCalculator() {
        initComponents();
    }

    public JTextField nitrogen() {
        return nitrogen_tf;
    }

    public JTextField fosfor() {
        return fosfor_tf;
    }

    public JTextField kalium() {
        return kalium_tf;
    }

    public JLabel back() {
        return kembali_btn;
    }

    public JTextArea hasil() {
        return hasil_tf;
    }

    public JLabel fertilizer() {
        return analisa_btn;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kembali_btn = new javax.swing.JLabel();
        analisa_btn = new javax.swing.JLabel();
        kalium_tf = new javax.swing.JTextField();
        nitrogen_tf = new javax.swing.JTextField();
        fosfor_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil_tf = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(891, 544));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("K ( Kalium)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("P (Fosfor)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("N (Nitrogen)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        kembali_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        jPanel1.add(kembali_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        analisa_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/anal1.png"))); // NOI18N
        jPanel1.add(analisa_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        kalium_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kalium_tfKeyTyped(evt);
            }
        });
        jPanel1.add(kalium_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 460, 30));

        nitrogen_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitrogen_tfKeyTyped(evt);
            }
        });
        jPanel1.add(nitrogen_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 460, 30));

        fosfor_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fosfor_tfKeyTyped(evt);
            }
        });
        jPanel1.add(fosfor_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 460, 30));

        hasil_tf.setEditable(false);
        hasil_tf.setColumns(20);
        hasil_tf.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        hasil_tf.setRows(5);
        hasil_tf.setWrapStyleWord(true);
        jScrollPane1.setViewportView(hasil_tf);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 240, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 830, 470));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Farm CALCULATOR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ab.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 891, 544));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nitrogen_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitrogen_tfKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nitrogen_tfKeyTyped

    private void fosfor_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fosfor_tfKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_fosfor_tfKeyTyped

    private void kalium_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kalium_tfKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_kalium_tfKeyTyped
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
            java.util.logging.Logger.getLogger(farmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(farmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(farmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(farmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new farmCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analisa_btn;
    private javax.swing.JTextField fosfor_tf;
    private javax.swing.JTextArea hasil_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kalium_tf;
    private javax.swing.JLabel kembali_btn;
    private javax.swing.JTextField nitrogen_tf;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
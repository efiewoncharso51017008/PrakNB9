/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class OperasiHitung extends javax.swing.JFrame {

    /**
     * Creates new form OperasiHitung
     */
    public OperasiHitung() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BIL1TF = new javax.swing.JTextField();
        BIL2TF = new javax.swing.JTextField();
        Hasil = new javax.swing.JTextField();
        TambahBT = new javax.swing.JButton();
        KurangBT2 = new javax.swing.JButton();
        KaliBT3 = new javax.swing.JButton();
        BagiBT4 = new javax.swing.JButton();
        HapusBT5 = new javax.swing.JButton();
        KeluarBT6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Bilangan 1");

        jLabel3.setText("Bilangan 2");

        jLabel4.setText("Hasil");

        BIL1TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BIL1TFKeyTyped(evt);
            }
        });

        BIL2TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BIL2TFKeyTyped(evt);
            }
        });

        Hasil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HasilKeyTyped(evt);
            }
        });

        TambahBT.setText("+");
        TambahBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahBTActionPerformed(evt);
            }
        });

        KurangBT2.setText("-");
        KurangBT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangBT2ActionPerformed(evt);
            }
        });

        KaliBT3.setText("x");
        KaliBT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliBT3ActionPerformed(evt);
            }
        });

        BagiBT4.setText("\\");
            BagiBT4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BagiBT4ActionPerformed(evt);
                }
            });

            HapusBT5.setText("Hapus");
            HapusBT5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    HapusBT5ActionPerformed(evt);
                }
            });

            KeluarBT6.setText("Keluar");
            KeluarBT6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    KeluarBT6ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BIL1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BIL2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(62, 62, 62)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(TambahBT)
                    .addGap(18, 18, 18)
                    .addComponent(KurangBT2)
                    .addGap(18, 18, 18)
                    .addComponent(KaliBT3)
                    .addGap(18, 18, 18)
                    .addComponent(BagiBT4)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HapusBT5)
                    .addGap(1, 1, 1)
                    .addComponent(KeluarBT6)
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BIL1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BIL2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TambahBT)
                        .addComponent(KurangBT2)
                        .addComponent(KaliBT3)
                        .addComponent(BagiBT4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HapusBT5)
                        .addComponent(KeluarBT6))
                    .addContainerGap(31, Short.MAX_VALUE))
            );

            jLabel1.setText("Aplikasi Kalkulator Mini");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void TambahBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahBTActionPerformed
        // Operasi Penjumlahan Bilangan
        Double Bil1 = Double.parseDouble(BIL1TF.getText());
        Double Bil2 = Double.parseDouble(BIL2TF.getText());
        
        //Proses 
        Double hasil = Bil1+Bil2;
        
        //Set Hasil Masuk Kedalam TextField Hasil
        Hasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_TambahBTActionPerformed

    private void KurangBT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangBT2ActionPerformed
        // Operasi Pengurangan 2 Bilangan
        Double Bil1 = Double.parseDouble(BIL1TF.getText());
        Double Bil2 = Double.parseDouble(BIL2TF.getText());
        
        //Proses Pengurangan
        Double hasil = Bil1-Bil2;
        
        //Set Hasil Masuk Kedalam TextField Hasil
        Hasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_KurangBT2ActionPerformed

    private void KaliBT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliBT3ActionPerformed
        // Operasi Perkalian 2 Bilangan
        Double Bil1 = Double.parseDouble(BIL1TF.getText());
        Double Bil2 = Double.parseDouble(BIL2TF.getText());
        
        //Proses Perkalian
        Double hasil = Bil1*Bil2;
        
        //Set Hasil Masuk Kedalam TextField Hasil
        Hasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_KaliBT3ActionPerformed

    private void BagiBT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiBT4ActionPerformed
        // Operasi Pembagian 2 Bilangan
        Double Bil1 = Double.parseDouble(BIL1TF.getText());
        Double Bil2 = Double.parseDouble(BIL2TF.getText());
        
        //Proses Pembagian 
        Double hasil = Bil1/Bil2;
        
        //Set Hasil Masuk Kedalam TextField Hasil
        Hasil.setText(Double.toString(hasil));
        
    }//GEN-LAST:event_BagiBT4ActionPerformed

    private void KeluarBT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarBT6ActionPerformed
        // Proses Kasih Keluar Dari Program
        System.exit(0);
    }//GEN-LAST:event_KeluarBT6ActionPerformed

    private void HapusBT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBT5ActionPerformed
        // TODO add your handling code here:
        BIL1TF.setText("");
        BIL2TF.setText("");
        Hasil.setText("");
    }//GEN-LAST:event_HapusBT5ActionPerformed

    private void HasilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HasilKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilKeyTyped

    private void BIL1TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BIL1TFKeyTyped
        // Operasi Filter Tombol
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)||(c == KeyEvent.VK_BACKSPACE)||(c == KeyEvent.VK_DELETE)))
        { getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Masukkan Hanya Angka 0 s/d 9");
        evt.consume();
        }
    }//GEN-LAST:event_BIL1TFKeyTyped

    private void BIL2TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BIL2TFKeyTyped
        // Operasi Filter Tombol
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)||(c == KeyEvent.VK_BACKSPACE)||(c == KeyEvent.VK_DELETE)))
        { getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Masukkan Hanya Angka 0 s/d 9");
        evt.consume();
        }
    }//GEN-LAST:event_BIL2TFKeyTyped

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
            java.util.logging.Logger.getLogger(OperasiHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperasiHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperasiHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperasiHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperasiHitung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BIL1TF;
    private javax.swing.JTextField BIL2TF;
    private javax.swing.JButton BagiBT4;
    private javax.swing.JButton HapusBT5;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton KaliBT3;
    private javax.swing.JButton KeluarBT6;
    private javax.swing.JButton KurangBT2;
    private javax.swing.JButton TambahBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

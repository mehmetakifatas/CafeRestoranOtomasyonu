/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeotomasyonuprojesı;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Casper
 */
public class yönetim extends javax.swing.JFrame {

    /**
     * Creates new form yönetim
     */
    public yönetim() {
        initComponents();
        SimpleDateFormat bicim = new SimpleDateFormat("dd/M/yyyy");
        Date tarih = new Date();

        lbl_tarıh2.setText((bicim.format(tarih)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        btn_personelekle = new javax.swing.JButton();
        btn_personelsıl = new javax.swing.JButton();
        btn_personelduzenle = new javax.swing.JButton();
        btn_urunekle = new javax.swing.JButton();
        btn_urunsıl = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btn_gerı = new javax.swing.JButton();
        btn_urunduzenle = new javax.swing.JButton();
        lbl_tarıh2 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/urun_duzenle.png"))); // NOI18N
        jButton6.setText(" DÜZENLE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_personelekle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_personelekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/personel_ekle.png"))); // NOI18N
        btn_personelekle.setText(" EKLE");
        btn_personelekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personelekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_personelekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 380, 150));

        btn_personelsıl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_personelsıl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/personel_sil.png"))); // NOI18N
        btn_personelsıl.setText(" SİL");
        btn_personelsıl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personelsılActionPerformed(evt);
            }
        });
        getContentPane().add(btn_personelsıl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 380, 150));

        btn_personelduzenle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_personelduzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/personel_duzenle.png"))); // NOI18N
        btn_personelduzenle.setText(" DÜZENLE");
        btn_personelduzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personelduzenleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_personelduzenle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 310, 370, 150));

        btn_urunekle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_urunekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/urun_ekle.png"))); // NOI18N
        btn_urunekle.setText(" EKLE");
        btn_urunekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_urunekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 380, 150));

        btn_urunsıl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_urunsıl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/urun_sil.png"))); // NOI18N
        btn_urunsıl.setText(" SİL");
        btn_urunsıl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunsılActionPerformed(evt);
            }
        });
        getContentPane().add(btn_urunsıl, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 640, 370, 150));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/ev.png"))); // NOI18N
        jButton7.setText(" ANAMENU");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 840, 180, 80));

        btn_gerı.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_gerı.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/gozat.png"))); // NOI18N
        btn_gerı.setText("  GERİ");
        btn_gerı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerıActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gerı, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 940, 180, 80));

        btn_urunduzenle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_urunduzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/urun_duzenle.png"))); // NOI18N
        btn_urunduzenle.setText(" DÜZENLE");
        btn_urunduzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunduzenleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_urunduzenle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 630, 380, 150));

        lbl_tarıh2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_tarıh2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tarıh2.setText("jLabel1");
        getContentPane().add(lbl_tarıh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 430, 60));

        arkaplan.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        arkaplan.setForeground(new java.awt.Color(255, 255, 255));
        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/maxresdefault-3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_personelekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personelekleActionPerformed
        personelekle nesne = new personelekle();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_personelekleActionPerformed

    private void btn_personelduzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personelduzenleActionPerformed
        personelekle nesne = new personelekle();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_personelduzenleActionPerformed

    private void btn_urunekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunekleActionPerformed
        urunekle nesne = new urunekle();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_urunekleActionPerformed

    private void btn_urunsılActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunsılActionPerformed
        urunsıl nesne = new urunsıl();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_urunsılActionPerformed

    private void btn_urunduzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunduzenleActionPerformed
        urunekle nesne = new urunekle();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_urunduzenleActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        anamenu nesne = new anamenu();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_gerıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerıActionPerformed
      anamenu nesne = new anamenu();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_gerıActionPerformed

    private void btn_personelsılActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personelsılActionPerformed
       personelsıl nesne=new personelsıl();
       nesne.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_personelsılActionPerformed

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
            java.util.logging.Logger.getLogger(yönetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yönetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yönetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yönetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yönetim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_gerı;
    private javax.swing.JButton btn_personelduzenle;
    private javax.swing.JButton btn_personelekle;
    private javax.swing.JButton btn_personelsıl;
    private javax.swing.JButton btn_urunduzenle;
    private javax.swing.JButton btn_urunekle;
    private javax.swing.JButton btn_urunsıl;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel lbl_tarıh2;
    // End of variables declaration//GEN-END:variables
}

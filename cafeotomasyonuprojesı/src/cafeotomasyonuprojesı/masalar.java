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
public class masalar extends javax.swing.JFrame {

    public masalar() {
        initComponents();
        SimpleDateFormat bicim = new SimpleDateFormat("dd/M/yyyy");
        Date tarih = new Date();

        lbl_tarıh2.setText((bicim.format(tarih)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton18 = new javax.swing.JButton();
        btn_masa1 = new javax.swing.JButton();
        btn_masa2 = new javax.swing.JButton();
        btn_masa13 = new javax.swing.JButton();
        btn_masa9 = new javax.swing.JButton();
        btn_masa5 = new javax.swing.JButton();
        btn_masa3 = new javax.swing.JButton();
        btn_masa10 = new javax.swing.JButton();
        btn_masa6 = new javax.swing.JButton();
        btn_masa14 = new javax.swing.JButton();
        btn_masa4 = new javax.swing.JButton();
        btn_masa7 = new javax.swing.JButton();
        btn_masa11 = new javax.swing.JButton();
        btn_masa15 = new javax.swing.JButton();
        btnmasa12 = new javax.swing.JButton();
        btn_masa16 = new javax.swing.JButton();
        btn_masa8 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        lbl_tarıh2 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/ev.png"))); // NOI18N
        jButton18.setText(" ANAMENU");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_masa1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa1.setText("MASA1");
        btn_masa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 310, 140));

        btn_masa2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa2.setText("MASA2");
        btn_masa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 320, 140));

        btn_masa13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa13.setText("MASA13");
        btn_masa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 720, 310, 140));

        btn_masa9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa9.setText("MASA9");
        btn_masa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 310, 140));

        btn_masa5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa5.setText("MASA5");
        btn_masa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 310, 140));

        btn_masa3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa3.setText("MASA3");
        btn_masa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 310, 140));

        btn_masa10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa10.setText("MASA10");
        btn_masa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 320, 140));

        btn_masa6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa6.setText("MASA6");
        btn_masa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 320, 140));

        btn_masa14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa14.setText("MASA14");
        btn_masa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 720, 320, 140));

        btn_masa4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa4.setText("MASA4");
        btn_masa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 140, 330, 140));

        btn_masa7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa7.setText("MASA7");
        btn_masa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 310, 140));

        btn_masa11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa11.setText("MASA11");
        btn_masa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 530, 310, 140));

        btn_masa15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa15.setText("MASA15");
        btn_masa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 720, 310, 140));

        btnmasa12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmasa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btnmasa12.setText("MASA12");
        btnmasa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasa12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnmasa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 530, 330, 140));

        btn_masa16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa16.setText("MASA16");
        btn_masa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 720, 330, 140));

        btn_masa8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_masa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/masay.png"))); // NOI18N
        btn_masa8.setText("MASA8");
        btn_masa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 330, 330, 140));

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/gozat.png"))); // NOI18N
        jButton17.setText("  GERİ");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 780, 180, 80));

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/ev.png"))); // NOI18N
        jButton19.setText(" ANAMENU");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 140, 180, 80));

        lbl_tarıh2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_tarıh2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tarıh2.setText("jLabel1");
        getContentPane().add(lbl_tarıh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 430, 60));

        arkaplan.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        arkaplan.setForeground(new java.awt.Color(255, 255, 255));
        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/maxresdefault-3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmasa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasa12ActionPerformed

        satıs nesne = new satıs(12);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmasa12ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        anamenu anamenü = new anamenu();
        anamenü.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        anamenu anamenü = new anamenu();
        anamenü.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void btn_masa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa1ActionPerformed

        satıs nesne = new satıs(1);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa1ActionPerformed

    private void btn_masa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa2ActionPerformed

        satıs nesne = new satıs(2);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa2ActionPerformed

    private void btn_masa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa3ActionPerformed

        satıs nesne = new satıs(3);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa3ActionPerformed

    private void btn_masa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa4ActionPerformed

        satıs nesne = new satıs(4);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa4ActionPerformed

    private void btn_masa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa5ActionPerformed

        satıs nesne = new satıs(5);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa5ActionPerformed

    private void btn_masa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa6ActionPerformed

        satıs nesne = new satıs(6);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa6ActionPerformed

    private void btn_masa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa7ActionPerformed

        satıs nesne = new satıs(7);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa7ActionPerformed

    private void btn_masa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa8ActionPerformed

        satıs nesne = new satıs(8);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa8ActionPerformed

    private void btn_masa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa9ActionPerformed

        satıs nesne = new satıs(9);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa9ActionPerformed

    private void btn_masa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa10ActionPerformed

        satıs nesne = new satıs(10);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa10ActionPerformed

    private void btn_masa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa11ActionPerformed

        satıs nesne = new satıs(11);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa11ActionPerformed

    private void btn_masa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa13ActionPerformed

        satıs nesne = new satıs(13);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa13ActionPerformed

    private void btn_masa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa14ActionPerformed

        satıs nesne = new satıs(14);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa14ActionPerformed

    private void btn_masa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa15ActionPerformed

        satıs nesne = new satıs(15);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa15ActionPerformed

    private void btn_masa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa16ActionPerformed

        satıs nesne = new satıs(16);
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masa16ActionPerformed

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
            java.util.logging.Logger.getLogger(masalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masalar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_masa1;
    private javax.swing.JButton btn_masa10;
    private javax.swing.JButton btn_masa11;
    private javax.swing.JButton btn_masa13;
    private javax.swing.JButton btn_masa14;
    private javax.swing.JButton btn_masa15;
    private javax.swing.JButton btn_masa16;
    private javax.swing.JButton btn_masa2;
    private javax.swing.JButton btn_masa3;
    private javax.swing.JButton btn_masa4;
    private javax.swing.JButton btn_masa5;
    private javax.swing.JButton btn_masa6;
    private javax.swing.JButton btn_masa7;
    private javax.swing.JButton btn_masa8;
    private javax.swing.JButton btn_masa9;
    private javax.swing.JButton btnmasa12;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel lbl_tarıh2;
    // End of variables declaration//GEN-END:variables
}

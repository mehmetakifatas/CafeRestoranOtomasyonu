/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeotomasyonuprojesı;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casper
 */
public class urunsıl extends javax.swing.JFrame {

    /**
     * Creates new form urunsıl
     */
    DefaultTableModel dtm;

    public urunsıl() {
        initComponents();
        SimpleDateFormat bicim = new SimpleDateFormat("dd/M/yyyy");
        Date tarih = new Date();

        lbl_tarıh2.setText((bicim.format(tarih)));
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"UID", "UISIM", "UFIAT", "UVERGIORAN", "UKATEGORI", "UKATEGORIID"});
        tbl_urunler.setModel(dtm);
      
        try {
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/abc ", "sa", "as")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM SA.KATEGORILER ");
                while (rs.next()) {
                    int kategorııd = rs.getInt("UKATEGORIID");
                    String kategorıadı = rs.getString("UKATEGORI");
                    cmb_kategorıler.addItem(kategorıadı);
                    System.out.println("kategorı ıd : " + kategorıadı);
                }
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_urunıd = new javax.swing.JTextField();
        btn_sıl = new javax.swing.JButton();
        lbl_tarıh2 = new javax.swing.JLabel();
        cmb_kategorıler = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_urunler = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_fıyat = new javax.swing.JLabel();
        lbl_ıd = new javax.swing.JLabel();
        lbl_kategorıadı = new javax.swing.JLabel();
        lbl_ısım = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/ev.png"))); // NOI18N
        jButton8.setText(" ANAMENU");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 157, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/gozat.png"))); // NOI18N
        jButton9.setText("  GERİ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 208, 149, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ÜRÜN ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 86, -1, -1));

        txt_urunıd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_urunıd, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 78, 168, 38));

        btn_sıl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_sıl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/urun_sil.png"))); // NOI18N
        btn_sıl.setText(" SİL");
        btn_sıl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sılActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sıl, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 157, -1, -1));

        lbl_tarıh2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_tarıh2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tarıh2.setText("jLabel1");
        getContentPane().add(lbl_tarıh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 70, 430, 60));

        cmb_kategorıler.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_kategorılerİtemStateChanged(evt);
            }
        });
        getContentPane().add(cmb_kategorıler, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 790, 40));

        tbl_urunler.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_urunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "URUNID", "ÜRÜNADI", "FİYAT", "KATEGORİ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_urunler);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 790, 310));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("İSMİ :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FİYATI :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KATEGORİ ADI :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SİLDİĞİNİZ ÜRÜNÜN ;");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        lbl_fıyat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fıyat.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_fıyat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 200, 30));

        lbl_ıd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_ıd.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_ıd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 190, 30));

        lbl_kategorıadı.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_kategorıadı.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_kategorıadı, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 190, 30));

        lbl_ısım.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_ısım.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_ısım, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 190, 30));

        arkaplan.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        arkaplan.setForeground(new java.awt.Color(255, 255, 255));
        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/maxresdefault-3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  int kategoriid;
    private void btn_sılActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sılActionPerformed
        if (txt_urunıd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ürün ıd değeri giriniz.");
            return;
        }
        int urunıd = Integer.parseInt(txt_urunıd.getText());
        try {
         
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/abc ", "sa", "as")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM SA.URUNLER WHERE UID=" + urunıd);
                if (rs.next()) {
                    String delete = "DELETE FROM SA.URUNLER  WHERE UID=" + urunıd;
                    System.out.println(delete);
                    int ıd = rs.getInt("UID");
                       lbl_ıd.setText(""+ıd);
                       String isim=rs.getString("UISIM");
                       lbl_ısım.setText(isim);
                       double fiyat=rs.getDouble("UFIAT");
                       lbl_fıyat.setText(""+fiyat);
                       String kategoriadi=rs.getString("UKATEGORI");
                       lbl_kategorıadı.setText(kategoriadi);
                       kategoriid=rs.getInt("UKATEGORIID");
                    stmt.executeUpdate(delete);
                    System.out.println("" + delete);
                    JOptionPane.showMessageDialog(rootPane, "Ürün silindi");
                    txt_urunıd.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ürün  bulunamadı.");
                    txt_urunıd.setText("");
                    return;
                }
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
     
    }//GEN-LAST:event_btn_sılActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        anamenu nesne = new anamenu();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ürünler nesne = new ürünler();
        nesne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cmb_kategorılerİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_kategorılerİtemStateChanged
        dtm.setRowCount(0);
        int kategorıno = cmb_kategorıler.getSelectedIndex();
        try {
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/abc ", "sa", "as")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM SA.URUNLER WHERE UKATEGORIID=" + kategorıno);
                while (rs.next()) {

                    int urunıd = rs.getInt("UID");
                    String urunısım = rs.getString("UISIM");
                    double fıyat = rs.getDouble("UFIAT");
                    int vergıoran = rs.getInt("UVERGIORAN");
                    String kategorıadı = rs.getString("UKATEGORI");
                    int kategorııd = rs.getInt("UKATEGORIID");
                    dtm.addRow(new Object[]{urunıd, urunısım, fıyat, vergıoran, kategorıadı, kategorııd});
                    //    System.out.println("kategorı no : "+kategorıno);
                }
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_cmb_kategorılerİtemStateChanged

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
            java.util.logging.Logger.getLogger(urunsıl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(urunsıl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(urunsıl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urunsıl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urunsıl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_sıl;
    private javax.swing.JComboBox<String> cmb_kategorıler;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fıyat;
    private javax.swing.JLabel lbl_kategorıadı;
    private javax.swing.JLabel lbl_tarıh2;
    private javax.swing.JLabel lbl_ıd;
    private javax.swing.JLabel lbl_ısım;
    private javax.swing.JTable tbl_urunler;
    private javax.swing.JTextField txt_urunıd;
    // End of variables declaration//GEN-END:variables
}

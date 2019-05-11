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

public class ürünler extends javax.swing.JFrame {

    DefaultTableModel dtm;
    int say_urun = 0;
    int say_kategori = 0;

    public void say() {
        try {
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/abc ", "sa", "as")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM SA.URUNLER ");
                while (rs.next()) {
                    say_urun++;               }
                con.close();
                   lbl_urun.setText(say_urun + " ADET");            }       } 
        catch (SQLException ex) {
            System.err.println(ex.getMessage());        }
        try {
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/abc ", "sa", "as")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM SA.KATEGORILER ");
                while (rs.next()) {
                    say_kategori++;                                 }
                con.close();
                 lbl_kategori.setText(say_kategori + " ADET");           }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());       }    }

    public ürünler() {
      
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

        jButton7 = new javax.swing.JButton();
        tbl_urunler1 = new javax.swing.JScrollPane();
        tbl_urunler = new javax.swing.JTable();
        btn_anamenu = new javax.swing.JButton();
        btn_gerı = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btn_sıl = new javax.swing.JButton();
        btn_duzenle = new javax.swing.JButton();
        cmb_kategorıler = new javax.swing.JComboBox<>();
        lbl_tarıh2 = new javax.swing.JLabel();
        lbl_kategori = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_urun = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/ev.png"))); // NOI18N
        jButton7.setText(" ANAMENU");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tbl_urunler1.setViewportView(tbl_urunler);
        if (tbl_urunler.getColumnModel().getColumnCount() > 0) {
            tbl_urunler.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(tbl_urunler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 1260, 420));

        btn_anamenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_anamenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/ev.png"))); // NOI18N
        btn_anamenu.setText(" ANAMENU");
        btn_anamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anamenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_anamenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, -1, -1));

        btn_gerı.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_gerı.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/gozat.png"))); // NOI18N
        btn_gerı.setText("  GERİ");
        btn_gerı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerıActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gerı, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 680, 120, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/urun_ekle.png"))); // NOI18N
        jButton10.setText(" EKLE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, -1, -1));

        btn_sıl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_sıl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/urun_sil.png"))); // NOI18N
        btn_sıl.setText(" SİL");
        btn_sıl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sılActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sıl, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 680, -1, -1));

        btn_duzenle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_duzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/urun_duzenle.png"))); // NOI18N
        btn_duzenle.setText(" DÜZENLE");
        btn_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duzenleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_duzenle, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, -1, -1));

        cmb_kategorıler.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_kategorılerİtemStateChanged(evt);
            }
        });
        getContentPane().add(cmb_kategorıler, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 1260, 40));

        lbl_tarıh2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_tarıh2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tarıh2.setText("jLabel1");
        getContentPane().add(lbl_tarıh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 50, 430, 60));

        lbl_kategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_kategori.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 260, 170, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOPLAM ÜRÜN SAYISI :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 300, -1, -1));

        lbl_urun.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_urun.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_urun, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 300, 160, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOPLAM KATEGORİ :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 260, -1, -1));

        arkaplan.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        arkaplan.setForeground(new java.awt.Color(255, 255, 255));
        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/maxresdefault-3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        urunekle nesne = new urunekle();
        nesne.setVisible(true);
        this.dispose();
           say_urun = 0;
     say_kategori = 0;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btn_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenleActionPerformed
        urunekle nesne = new urunekle();
        nesne.setVisible(true);
        this.dispose();
        say_urun = 0;
     say_kategori = 0;
    }//GEN-LAST:event_btn_duzenleActionPerformed

    private void btn_anamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anamenuActionPerformed
        anamenu nesne = new anamenu();
        nesne.setVisible(true);
        this.dispose();
        say_urun = 0;
     say_kategori = 0;
    }//GEN-LAST:event_btn_anamenuActionPerformed

    private void btn_gerıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerıActionPerformed
        anamenu nesne = new anamenu();
        nesne.setVisible(true);
        this.dispose();
        say_urun = 0;
     say_kategori = 0;
    }//GEN-LAST:event_btn_gerıActionPerformed

    private void btn_sılActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sılActionPerformed
        urunsıl nesne = new urunsıl();
        nesne.setVisible(true);
        this.dispose();
        say_urun = 0;
     say_kategori = 0;
    }//GEN-LAST:event_btn_sılActionPerformed

    private void cmb_kategorılerİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_kategorılerİtemStateChanged
       say();
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
                  say_urun = 0;
     say_kategori = 0;
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
            java.util.logging.Logger.getLogger(ürünler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ürünler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ürünler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ürünler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ürünler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_anamenu;
    private javax.swing.JButton btn_duzenle;
    private javax.swing.JButton btn_gerı;
    private javax.swing.JButton btn_sıl;
    private javax.swing.JComboBox<String> cmb_kategorıler;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_kategori;
    private javax.swing.JLabel lbl_tarıh2;
    private javax.swing.JLabel lbl_urun;
    private javax.swing.JTable tbl_urunler;
    private javax.swing.JScrollPane tbl_urunler1;
    // End of variables declaration//GEN-END:variables
}

package cafeotomasyonuprojesı;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JOptionPane;

public class logın extends javax.swing.JFrame {

    public logın() {
        initComponents();
          SimpleDateFormat bicim=new SimpleDateFormat("dd/M/yyyy");
Date tarih=new Date();

lbl_tarıh2.setText((bicim.format(tarih)));
lbl_tarıh.setText("HOŞGELDİNİZ.");
    LocalTime now = LocalTime.now();
 String saat=now.getHour() + ":" + now.getMinute();
 lbl_tarıh1.setText(saat);
 repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_kullanıcıadı = new javax.swing.JLabel();
        lbl_sıfre = new javax.swing.JLabel();
        txt_kadı = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_gırıs = new javax.swing.JButton();
        txt_ksıfre = new javax.swing.JPasswordField();
        ıcon_kullanıcı = new javax.swing.JLabel();
        lbl_tarıh2 = new javax.swing.JLabel();
        lbl_tarıh = new javax.swing.JLabel();
        lbl_tarıh1 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_kullanıcıadı.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_kullanıcıadı.setForeground(new java.awt.Color(255, 255, 255));
        lbl_kullanıcıadı.setText("KULLANICI  ADI : ");
        getContentPane().add(lbl_kullanıcıadı, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 60, -1, -1));

        lbl_sıfre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_sıfre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sıfre.setText("       ŞİFRE : ");
        getContentPane().add(lbl_sıfre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 110, -1, -1));

        txt_kadı.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_kadı, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 60, 186, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 150, 186, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 100, 186, 10));

        btn_gırıs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_gırıs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/door.png"))); // NOI18N
        btn_gırıs.setText("GİRİŞ ");
        btn_gırıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gırısActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gırıs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 170, -1, 40));

        txt_ksıfre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_ksıfre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 110, 186, 27));

        ıcon_kullanıcı.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/Kullanıcı girisi.png"))); // NOI18N
        getContentPane().add(ıcon_kullanıcı, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, 327, 230));

        lbl_tarıh2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_tarıh2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tarıh2.setText("jLabel1");
        getContentPane().add(lbl_tarıh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 430, 60));

        lbl_tarıh.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_tarıh.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tarıh.setText("jLabel1");
        getContentPane().add(lbl_tarıh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, 60));

        lbl_tarıh1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_tarıh1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tarıh1.setText("jLabel1");
        getContentPane().add(lbl_tarıh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 370, 60));

        arkaplan.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        arkaplan.setForeground(new java.awt.Color(255, 255, 255));
        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeotomasyonuprojesı/Yeni klasör/images/maxresdefault-3.jpg"))); // NOI18N
        getContentPane().add(arkaplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gırısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gırısActionPerformed

        if (txt_kadı.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Kullanıcıadını giriniz.");
            return;
        }
        char[] bos = txt_ksıfre.getPassword();
        String bosmu = new String(bos);
        if (bosmu.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "LÜTFEN ŞİFRE GİRİNİZ.");
           return;
        }

        try {
            String kullanıcıadı = txt_kadı.getText();
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/abc ", "sa", "as")) {
                Statement stmt = con.createStatement();

                String rsset = "SELECT * FROM SA.PERSONEL WHERE PISIM='" + kullanıcıadı + "'";
                ResultSet rs = stmt.executeQuery(rsset);
                if (rs.next()) {
                    int sifre = rs.getInt("PID");

                    char[] input = txt_ksıfre.getPassword();
                    String passString = new String(input);
                    int sifreesitleme = Integer.parseInt(passString);

                    if (sifreesitleme == sifre) {
                        dispose();
                        anamenu basla = new anamenu();
                        basla.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Girdiğiniz şifre hatalı.");
                        txt_ksıfre.setText("");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Kullanıcıadı bulunamadı.");
                    txt_kadı.setText("");
                    txt_ksıfre.setText("");
                    return;
                }
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }


    }//GEN-LAST:event_btn_gırısActionPerformed

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
            java.util.logging.Logger.getLogger(logın.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logın.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logın.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logın.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logın().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton btn_gırıs;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_kullanıcıadı;
    private javax.swing.JLabel lbl_sıfre;
    private javax.swing.JLabel lbl_tarıh;
    private javax.swing.JLabel lbl_tarıh1;
    private javax.swing.JLabel lbl_tarıh2;
    private javax.swing.JTextField txt_kadı;
    private javax.swing.JPasswordField txt_ksıfre;
    private javax.swing.JLabel ıcon_kullanıcı;
    // End of variables declaration//GEN-END:variables
}

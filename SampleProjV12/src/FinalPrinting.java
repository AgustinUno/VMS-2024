
import com.mysql.jdbc.Blob;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Main
 */
public class FinalPrinting extends javax.swing.JFrame {

    /**
     * Creates new form FinalPrinting
     */
    public FinalPrinting() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        LblNAME = new javax.swing.JLabel();
        LblADDRESS = new javax.swing.JLabel();
        LblCONTACT = new javax.swing.JLabel();
        LblGENDER = new javax.swing.JLabel();
        LblVACDOSE = new javax.swing.JLabel();
        LblVACDATE = new javax.swing.JLabel();
        LblAGE = new javax.swing.JLabel();
        LblVACBRAND = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LblIMAGE = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        showInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(47, 79, 79));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(47, 79, 79));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 70, -1));

        LblNAME.setBackground(new java.awt.Color(0, 0, 0));
        LblNAME.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        LblNAME.setForeground(new java.awt.Color(0, 0, 0));
        LblNAME.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(LblNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 420, 40));

        LblADDRESS.setBackground(new java.awt.Color(0, 0, 0));
        LblADDRESS.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LblADDRESS.setForeground(new java.awt.Color(0, 0, 0));
        LblADDRESS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(LblADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 490, 40));

        LblCONTACT.setBackground(new java.awt.Color(0, 0, 0));
        LblCONTACT.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LblCONTACT.setForeground(new java.awt.Color(0, 0, 0));
        LblCONTACT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(LblCONTACT, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 320, 40));

        LblGENDER.setBackground(new java.awt.Color(0, 0, 0));
        LblGENDER.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LblGENDER.setForeground(new java.awt.Color(0, 0, 0));
        LblGENDER.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(LblGENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 330, 40));

        LblVACDOSE.setBackground(new java.awt.Color(0, 0, 0));
        LblVACDOSE.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LblVACDOSE.setForeground(new java.awt.Color(0, 0, 0));
        LblVACDOSE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(LblVACDOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 290, 40));

        LblVACDATE.setBackground(new java.awt.Color(0, 0, 0));
        LblVACDATE.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LblVACDATE.setForeground(new java.awt.Color(0, 0, 0));
        LblVACDATE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(LblVACDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 290, 40));

        LblAGE.setBackground(new java.awt.Color(0, 0, 0));
        LblAGE.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LblAGE.setForeground(new java.awt.Color(0, 0, 0));
        LblAGE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(LblAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 340, 40));

        LblVACBRAND.setBackground(new java.awt.Color(0, 0, 0));
        LblVACBRAND.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LblVACBRAND.setForeground(new java.awt.Color(0, 0, 0));
        LblVACBRAND.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(LblVACBRAND, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 280, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Please take a screenshot of this page to serve as your temporary vaccine card.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 480, -1));
        jPanel2.add(LblIMAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 260, 310));

        kButton1.setText("FINISH");
        kButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(47, 79, 79));
        kButton1.setkBorderRadius(15);
        kButton1.setkEndColor(new java.awt.Color(47, 79, 79));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(102, 102, 102));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        kButton1.setkSelectedColor(new java.awt.Color(0, 51, 51));
        kButton1.setkStartColor(new java.awt.Color(47, 79, 79));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, -1, 30));

        showInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/TempVac_1.png"))); // NOI18N
        showInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showInfoMouseEntered(evt);
            }
        });
        jPanel2.add(showInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
         

    }//GEN-LAST:event_jPanel2MouseEntered

    private void showInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showInfoMouseEntered

        PreparedStatement st;
        ResultSet rs;

        String query = "SELECT * from registrantinfo WHERE RegistrantID =1 ";
        try {
            st = ConnectToDB.getConnection().prepareStatement(query);
            rs = st.executeQuery();

            if(rs.next()){

                String name = rs.getString(2);
                String address = rs.getString(3);
                String contact = rs.getString(4);
                String age = rs.getString(5);
                String gender = rs.getString(6);
                
                byte [] imageData = rs.getBytes("ImageFile");
                ImageIcon format = new ImageIcon (imageData);
                Image mm = format.getImage();
                Image img2 = mm.getScaledInstance(260, 310, Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img2);
                
                LblIMAGE.setIcon(image);
               
                
                LblNAME.setText(name);
                LblADDRESS.setText(address);
                LblCONTACT.setText(contact);
                LblAGE.setText(age);
                LblGENDER.setText(gender);
               

            }
        } catch (SQLException ex) {

        }

        String query2 = "SELECT * from registrantvaccine WHERE vrID =1 ";
        try {
            st = ConnectToDB.getConnection().prepareStatement(query2);
            rs = st.executeQuery();

            if(rs.next()){

                String dose = rs.getString(2);
                String brand = rs.getString(3);
                String date = rs.getString(4);

                LblVACDOSE.setText(dose);
                LblVACBRAND.setText(brand);
                LblVACDATE.setText(date);

            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_showInfoMouseEntered

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
     String insertquery = "INSERT INTO `finalinfo`( `finalNAME`, `finalADDRESS`, `finalCONTACT`, `finalAGE`, `finalGENDER`, `finalDOSE`, `finalBRAND`, `finalDATE`) VALUES (?,?,?,?,?,?,?,?)";

             PreparedStatement ps;
             ResultSet rs; 
            
        try {
            
            
            ps = ConnectToDB.getConnection().prepareStatement(insertquery);
       
          
        
        
            ps.setString(1, LblNAME.getText());
            ps.setString(2, LblADDRESS.getText());
            ps.setString(3, LblCONTACT.getText());
            ps.setString(4, LblAGE.getText());
            ps.setString(5, LblGENDER.getText());
           
            ps.setString(6, LblVACDOSE.getText());
            ps.setString(7, LblVACBRAND.getText());
            ps.setString(8, LblVACDATE.getText());
            
             try {
                
                 
                 
                 if (ps.executeUpdate()!=0) {
                     IntoReg Ir = new IntoReg();
                       
                       this.setVisible(false);
   
                 }else{
                      JOptionPane.showMessageDialog(null, "ACCOUNT CREATION FAILED");
                 }
                  }catch (SQLException ex) {
            Logger.getLogger(FinalPrinting.class.getName()).log(Level.SEVERE, null, ex);
        }
// TODO add your handling code here:
           // } catch (FileNotFoundException ex) {
           //  Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
           
// TODO add your handling code here:
            // } catch (FileNotFoundException ex) {
               //  Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
            Logger.getLogger(FinalPrinting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FinalPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalPrinting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblADDRESS;
    private javax.swing.JLabel LblAGE;
    private javax.swing.JLabel LblCONTACT;
    private javax.swing.JLabel LblGENDER;
    private javax.swing.JLabel LblIMAGE;
    private javax.swing.JLabel LblNAME;
    private javax.swing.JLabel LblVACBRAND;
    private javax.swing.JLabel LblVACDATE;
    private javax.swing.JLabel LblVACDOSE;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JLabel showInfo;
    // End of variables declaration//GEN-END:variables
}
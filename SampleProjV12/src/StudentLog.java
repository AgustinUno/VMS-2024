
import java.sql.PreparedStatement;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Main
 */
public class StudentLog extends javax.swing.JFrame {

    /**
     * Creates new form StudentLog
     */
    public StudentLog() {
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
        enterAdminID = new javax.swing.JTextField();
        enterAdminPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        showForgotPass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 79, 79));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterAdminID.setBackground(new java.awt.Color(47, 79, 79));
        enterAdminID.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        enterAdminID.setForeground(new java.awt.Color(204, 204, 204));
        enterAdminID.setText("Admin user ID");
        enterAdminID.setBorder(null);
        enterAdminID.setName("aDMIN"); // NOI18N
        enterAdminID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterAdminIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterAdminIDFocusLost(evt);
            }
        });
        enterAdminID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAdminIDActionPerformed(evt);
            }
        });
        jPanel1.add(enterAdminID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 169, -1));

        enterAdminPass.setBackground(new java.awt.Color(47, 79, 79));
        enterAdminPass.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        enterAdminPass.setForeground(new java.awt.Color(204, 204, 204));
        enterAdminPass.setText("Password");
        enterAdminPass.setBorder(null);
        enterAdminPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterAdminPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterAdminPassFocusLost(evt);
            }
        });
        enterAdminPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAdminPassActionPerformed(evt);
            }
        });
        jPanel1.add(enterAdminPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 170, 20));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 190, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 190, 10));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN ACCESS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/icons8-user-50.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        showForgotPass.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        showForgotPass.setForeground(new java.awt.Color(255, 255, 255));
        showForgotPass.setText("Forgot password?");
        showForgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showForgotPassMouseClicked(evt);
            }
        });
        jPanel1.add(showForgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        jButton1.setBackground(new java.awt.Color(47, 79, 79));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("LOGIN");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 30));

        jPanel2.setBackground(new java.awt.Color(250, 250, 210));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(250, 250, 210));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(47, 79, 79), 1, true));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(250, 250, 210));
        jTextField3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(47, 79, 79));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText(" REGISTER");
        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/we heal as one.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/icons8-virus-100.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/output-onlinepngtools.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 580, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 580, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Only vaccine personnel is given access to this page. Please proceed to register page for vaccine scheduling.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Admin Vaccination Status Update");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterAdminPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAdminPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAdminPassActionPerformed

    private void enterAdminIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAdminIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAdminIDActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
      
          RegisterPage Rp = new RegisterPage();
                     Rp.setVisible(true);
                     this.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enterAdminIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterAdminIDFocusGained
          enterAdminID.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_enterAdminIDFocusGained

    private void enterAdminIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterAdminIDFocusLost
         
// TODO add your handling code here:
    }//GEN-LAST:event_enterAdminIDFocusLost

    private void enterAdminPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterAdminPassFocusGained
        enterAdminPass.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_enterAdminPassFocusGained

    private void enterAdminPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterAdminPassFocusLost
      
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAdminPassFocusLost

    private void showForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showForgotPassMouseClicked
        JOptionPane.showMessageDialog(rootPane,"Please contact the Vaccine Program Mananger");
     
   
    

        // TODO add your handling code here:
    }//GEN-LAST:event_showForgotPassMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     
        
         PreparedStatement ps;
         ResultSet rs;
         
         String username = enterAdminID.getText();
         String pword = String.valueOf(enterAdminPass.getPassword());
         
         String query = "SELECT * from adminlogin WHERE AdminUserName = ? && AdminPass = ?";
         
        
        try {
           
            ps = ConnectToDB.getConnection().prepareStatement(query);
            ps.setString(1, username);
            ps.setString (2, pword);
            
            rs = ps.executeQuery();
            if(rs.next()){
                    IntoAdmin Ia = new IntoAdmin();
                    Ia.setVisible(true);
                    this.setVisible(false);  
                JOptionPane.showMessageDialog(null, "WELCOME ADMIN!");
            }else{
                JOptionPane.showMessageDialog(null, "INVALID CREDENTIALS");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentLog.class.getName()).log(Level.SEVERE, null, ex);
            
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

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
            java.util.logging.Logger.getLogger(StudentLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enterAdminID;
    private javax.swing.JPasswordField enterAdminPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel showForgotPass;
    // End of variables declaration//GEN-END:variables
}

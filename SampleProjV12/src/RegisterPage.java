
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Main
 */
public class RegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPage
     */
    public RegisterPage() {
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

        jLabel8 = new javax.swing.JLabel();
        btnSelectIMG1 = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        enterAge = new javax.swing.JTextField();
        enterAddress = new javax.swing.JTextField();
        enterContact = new javax.swing.JTextField();
        selectGender = new javax.swing.JComboBox<>();
        enterName = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        textFieldDIsplayPath = new javax.swing.JLabel();
        btnRegister = new com.k33ptoo.components.KButton();
        btnSelectIMG = new com.k33ptoo.components.KButton();
        btnSelectIMG2 = new com.k33ptoo.components.KButton();
        btnSelectIMG3 = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        getLOC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 79, 79));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("To ensure our safety.");

        btnSelectIMG1.setText("SELECT");
        btnSelectIMG1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btnSelectIMG1.setkBackGroundColor(new java.awt.Color(47, 79, 79));
        btnSelectIMG1.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSelectIMG1.setkForeGround(new java.awt.Color(47, 79, 79));
        btnSelectIMG1.setkHoverColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG1.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG1.setkHoverForeGround(new java.awt.Color(47, 79, 79));
        btnSelectIMG1.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG1.setkPressedColor(new java.awt.Color(0, 0, 51));
        btnSelectIMG1.setkSelectedColor(new java.awt.Color(0, 51, 51));
        btnSelectIMG1.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSelectIMG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectIMG1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaccine Management System");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(47, 79, 79));
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 474));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterAge.setBackground(new java.awt.Color(255, 255, 255));
        enterAge.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        enterAge.setForeground(new java.awt.Color(0, 0, 0));
        enterAge.setBorder(null);
        enterAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterAgeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterAgeFocusLost(evt);
            }
        });
        enterAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAgeActionPerformed(evt);
            }
        });
        enterAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterAgeKeyTyped(evt);
            }
        });
        jPanel1.add(enterAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 60, 20));

        enterAddress.setBackground(new java.awt.Color(255, 255, 255));
        enterAddress.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        enterAddress.setForeground(new java.awt.Color(0, 0, 0));
        enterAddress.setBorder(null);
        enterAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterAddressFocusLost(evt);
            }
        });
        enterAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAddressActionPerformed(evt);
            }
        });
        jPanel1.add(enterAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 240, 20));

        enterContact.setBackground(new java.awt.Color(255, 255, 255));
        enterContact.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        enterContact.setForeground(new java.awt.Color(0, 0, 0));
        enterContact.setBorder(null);
        enterContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterContactFocusLost(evt);
            }
        });
        enterContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterContactActionPerformed(evt);
            }
        });
        enterContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterContactKeyTyped(evt);
            }
        });
        jPanel1.add(enterContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 240, 20));

        selectGender.setBackground(new java.awt.Color(47, 79, 79));
        selectGender.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        selectGender.setForeground(new java.awt.Color(255, 255, 255));
        selectGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", "Don't want to specify" }));
        selectGender.setBorder(null);
        jPanel1.add(selectGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 120, -1));

        enterName.setBackground(new java.awt.Color(255, 255, 255));
        enterName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        enterName.setForeground(new java.awt.Color(0, 0, 0));
        enterName.setBorder(null);
        enterName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterNameFocusLost(evt);
            }
        });
        enterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameActionPerformed(evt);
            }
        });
        jPanel1.add(enterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 240, 20));

        jTextField1.setBackground(new java.awt.Color(47, 79, 79));
        jTextField1.setForeground(new java.awt.Color(47, 79, 79));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        textFieldDIsplayPath.setBackground(new java.awt.Color(47, 79, 79));
        textFieldDIsplayPath.setForeground(new java.awt.Color(47, 79, 79));
        textFieldDIsplayPath.setText("image path");
        jPanel1.add(textFieldDIsplayPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("REGISTER");
        btnRegister.setAlignmentY(0.0F);
        btnRegister.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister.setIconTextGap(6);
        btnRegister.setkBackGroundColor(new java.awt.Color(47, 79, 79));
        btnRegister.setkBorderRadius(30);
        btnRegister.setkEndColor(new java.awt.Color(255, 255, 255));
        btnRegister.setkForeGround(new java.awt.Color(47, 79, 79));
        btnRegister.setkHoverColor(new java.awt.Color(0, 102, 102));
        btnRegister.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        btnRegister.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btnRegister.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        btnRegister.setkSelectedColor(new java.awt.Color(0, 51, 51));
        btnRegister.setkStartColor(new java.awt.Color(255, 255, 255));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 260, 30));

        btnSelectIMG.setText("SELECT");
        btnSelectIMG.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btnSelectIMG.setkBackGroundColor(new java.awt.Color(47, 79, 79));
        btnSelectIMG.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSelectIMG.setkForeGround(new java.awt.Color(47, 79, 79));
        btnSelectIMG.setkHoverColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btnSelectIMG.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG.setkSelectedColor(new java.awt.Color(0, 51, 51));
        btnSelectIMG.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSelectIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectIMGActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 110, 20));

        btnSelectIMG2.setText("VIEW");
        btnSelectIMG2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btnSelectIMG2.setkBackGroundColor(new java.awt.Color(47, 79, 79));
        btnSelectIMG2.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSelectIMG2.setkForeGround(new java.awt.Color(47, 79, 79));
        btnSelectIMG2.setkHoverColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG2.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG2.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btnSelectIMG2.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG2.setkSelectedColor(new java.awt.Color(0, 51, 51));
        btnSelectIMG2.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSelectIMG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectIMG2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectIMG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 110, 20));

        btnSelectIMG3.setText("ADMIN ");
        btnSelectIMG3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSelectIMG3.setkBackGroundColor(new java.awt.Color(47, 79, 79));
        btnSelectIMG3.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSelectIMG3.setkForeGround(new java.awt.Color(47, 79, 79));
        btnSelectIMG3.setkHoverColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG3.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG3.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btnSelectIMG3.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        btnSelectIMG3.setkSelectedColor(new java.awt.Color(192, 192, 192));
        btnSelectIMG3.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSelectIMG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectIMG3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectIMG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/REGISTRATION.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 670));

        jPanel2.setBackground(new java.awt.Color(250, 250, 210));
        jPanel2.setForeground(new java.awt.Color(47, 79, 79));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(47, 79, 79));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("To ensure our safety.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 420, 60));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(47, 79, 79));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Get vaccinated now!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 420, 130));

        jSeparator4.setBackground(new java.awt.Color(47, 79, 79));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 520, 10));

        jSeparator5.setBackground(new java.awt.Color(47, 79, 79));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 520, 10));

        getLOC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        getLOC.setForeground(new java.awt.Color(47, 79, 79));
        getLOC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(getLOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 520, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/output-onlinepngtools.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Samplw");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAddressActionPerformed

    private void enterAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAgeActionPerformed
       
    }//GEN-LAST:event_enterAgeActionPerformed

    private void enterContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterContactActionPerformed

    private void enterContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterContactKeyTyped
       if(!Character.isDigit(evt.getKeyChar()))
           evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_enterContactKeyTyped

    private void enterAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterAgeFocusGained
        enterAge.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAgeFocusGained
  
        
    
    
    private void enterNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterNameFocusGained
        enterName.setText("");
               
           


// TODO add your handling code here:
    }//GEN-LAST:event_enterNameFocusGained

    private void enterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameActionPerformed

    private void enterNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterNameFocusLost
         enterName.setText(enterName.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameFocusLost

    private void enterAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterAddressFocusGained
          enterAddress.setText("");
          
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAddressFocusGained

    private void enterAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterAddressFocusLost
       enterAddress.setText(enterAddress.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAddressFocusLost

    private void enterContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterContactFocusGained
       enterContact.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_enterContactFocusGained

    private void enterContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterContactFocusLost
          enterContact.setText(enterContact.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_enterContactFocusLost

    private void enterAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterAgeFocusLost
       enterAge.setText(enterAge.getText());
       
       
    }//GEN-LAST:event_enterAgeFocusLost

    private void enterAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAgeKeyTyped

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if (verifyFields()) {
             if (!checkUsername()) {
                String insertquery = "UPDATE `registrantinfo` SET `Name` = ?, `Address` = ?, `ContactNo.` = ?, `Age` = ?, `Gender` = ?, `ImageFile` = ? WHERE RegistrantID = 1";
                
                
                
                
        try {
             PreparedStatement ps;
             ResultSet rs; 
            
            ps = ConnectToDB.getConnection().prepareStatement(insertquery);
            ps.setString(1, enterName.getText());
            ps.setString(2, enterAddress.getText());
            ps.setString(3, enterContact.getText());
            ps.setString(4, enterAge.getText());
            ps.setString(5, selectGender.getSelectedItem().toString());
            
             try {
                 InputStream btnChooseImageFromComputer = new FileInputStream(new File (textFieldDIsplayPath.getText()));
                 ps.setBlob(6, btnChooseImageFromComputer);
                 
                 if (ps.executeUpdate()!=0) {
                     JOptionPane.showMessageDialog(null, "ACCOUNT CREATED SUCCESSFULLY");
                     
                     
                       IntoReg Ir = new IntoReg();
                       Ir.setVisible(true);
                       this.setVisible(false);
   ///////                  
                  
   /////////
   
                 }else{
                      JOptionPane.showMessageDialog(null, "ACCOUNT CREATION FAILED");
                 }
                 
// TODO add your handling code here:
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
             }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }                              
    }           // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnSelectIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectIMGActionPerformed
         // TODO add your handling code here: 
        String path = null;
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter extension = new FileNameExtensionFilter("*Images","jpg","png",".jpeg");
        fc.addChoosableFileFilter(extension);
        
        int filestate = fc.showSaveDialog(null);
        
        if(filestate == JFileChooser.APPROVE_OPTION){
            File selectedImage = fc.getSelectedFile();
            path = selectedImage.getAbsolutePath();
            textFieldDIsplayPath.setText(path);
        
    }                                                 
    }//GEN-LAST:event_btnSelectIMGActionPerformed

    private void btnSelectIMG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectIMG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectIMG1ActionPerformed

    private void btnSelectIMG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectIMG2ActionPerformed
        JOptionPane.showMessageDialog( null, textFieldDIsplayPath );
    }//GEN-LAST:event_btnSelectIMG2ActionPerformed

    private void btnSelectIMG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectIMG3ActionPerformed
         StudentLog Std = new StudentLog();
        Std.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSelectIMG3ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
   
     String sqlquery = "SELECT `centerVacc` FROM `staticlocation` WHERE centerID = 1";
     
     PreparedStatement ps;
     ResultSet rs;
     
        try {
            ps = ConnectToDB.getConnection().prepareStatement(sqlquery);
             rs = ps.executeQuery(sqlquery);
        
                    String loca =  rs.getString(sqlquery);
                   getLOC.setText(loca);
                     
                     
        
        
       
        } catch (SQLException ex) {
        }
    
    }//GEN-LAST:event_jLabel3MouseEntered
   
 
        
    public boolean verifyFields(){
        String name = enterName.getText();
        String address = enterAddress.getText();
        String ContactNo = enterContact.getText();
        String gender = selectGender.getSelectedItem().toString();
        String Age = enterAge.getText();
        
        
        
        
        if(name.trim().equals("") || 
            address.trim().equals("") ||  
            ContactNo.trim().equals("") ||  
            gender.trim().equals("") ||
            Age.trim().equals("") )   
                
        { 
            JOptionPane.showMessageDialog(null, "PLEASE FILL THE REQUIRED INFORMATION, TYPE (N/A) IF NOT APPLICABLE ");
            return false;
        }else{
        return true;
        }
    }
    
     public boolean checkUsername(){
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * from finalinfo WHERE finalNAME = ?";
        try {
            st = ConnectToDB.getConnection().prepareStatement(query);
            st.setString(1, enterName.getText());
            rs = st.executeQuery();
            
            if(rs.next()){
                username_exist = true;
                JOptionPane.showMessageDialog(null, "Account already exists!", "Username Failed", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        return username_exist;
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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      ConnectToDB.getConnection();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
                
                
            }
            
            
            
            
        });
        
        
        
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnRegister;
    private com.k33ptoo.components.KButton btnSelectIMG;
    private com.k33ptoo.components.KButton btnSelectIMG1;
    private com.k33ptoo.components.KButton btnSelectIMG2;
    private com.k33ptoo.components.KButton btnSelectIMG3;
    private javax.swing.JTextField enterAddress;
    private javax.swing.JTextField enterAge;
    private javax.swing.JTextField enterContact;
    private javax.swing.JTextField enterName;
    private javax.swing.JLabel getLOC;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> selectGender;
    private javax.swing.JLabel textFieldDIsplayPath;
    // End of variables declaration//GEN-END:variables
}


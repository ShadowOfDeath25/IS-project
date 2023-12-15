/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cinema;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.Font;
import java.sql.*;
import java.awt.Graphics;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author abdo2
 */
public class Login extends javax.swing.JFrame {
Image showPword;
Image hidePword;
Image logInImage ;
ImageIcon showIcon;
ImageIcon hideIcon;
ImageIcon logInIcon;
SignUp sign = new SignUp();
JLabel lbl = new JLabel("TEST");
BorderLayout border = new BorderLayout();
/**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        user.setBackground(new java.awt.Color(0,0,0,1));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        pass.setBackground(new java.awt.Color(0,0,0,1));
       
          lbl.setVisible(true);
        mainPanel.add(lbl);
        
       
        
        
        
        logInImage = new ImageIcon("src/login.png").getImage();
        showPword= new ImageIcon("src/show.png").getImage();
        hidePword = new ImageIcon("src/hide.png").getImage();
        showIcon = new ImageIcon(showPword.getScaledInstance(showPass.getWidth(),showPass.getHeight() , Image.SCALE_SMOOTH));
        hideIcon = new ImageIcon(hidePword.getScaledInstance(showPass.getWidth(),showPass.getHeight() , Image.SCALE_SMOOTH));
        logInIcon= new ImageIcon(logInImage.getScaledInstance(logInButton.getWidth(),logInButton.getHeight()-30, Image.SCALE_SMOOTH));
       
        showPass.setIcon(showIcon);
        showPass.setSelectedIcon(hideIcon);
        
        logInButton.setIcon(logInIcon);
        logInButton.setText("     Log In");
        logInButton.setVerticalTextPosition(JLabel.BOTTOM);
        logInButton.setHorizontalTextPosition(JLabel.CENTER);
       
        
        
        
        
       
        showPass.setFocusable(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel(){  @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Specify the path to your image file here
                ImageIcon img = new ImageIcon("src/Pure Lust.jpg");
                g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mainPanel = new JPanel(){  @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Specify the path to your image file here
                ImageIcon img = new ImageIcon("src/Pure Lust.jpg");
                g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        signUpButton = new javax.swing.JLabel();
        mainLabel = new JLabel("BFCAI Cinemas");
;
        logInButton = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        showPass = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        jButton2.setText("jButton2");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BFCAI Cinema");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        signUpButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        signUpButton.setText("<HTML><U>Sign Up</U></HTML>");
        signUpButton.setAutoscrolls(true);
        signUpButton.setFocusable(false);
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButtonMouseExited(evt);
            }
        });

        mainLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("BFCAI Cinema ");
        mainLabel.setAlignmentX(100.0F);
        mainLabel.setAlignmentY(5.0F);

        logInButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        logInButton.setText("Log In");
        logInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInButtonMouseClicked(evt);
            }
        });

        user.setBackground(new java.awt.Color(0, 0, 0));
        user.setToolTipText("");
        user.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel1.setText("Username");

        pass.setBackground(new java.awt.Color(60, 65, 63));
        pass.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel3.setText("Don't have an account ?");

        mainLabel.setHorizontalAlignment(SwingConstants.CENTER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(mainLabel)
                        .addGap(305, 305, 305))))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPass))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        // just to see where this goes 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()){
        pass.setEchoChar((char)0);
        }else {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseEntered
        signUpButton.setForeground(Color.blue);
    }//GEN-LAST:event_signUpButtonMouseEntered

    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseExited
        signUpButton.setForeground(Color.black);
    }//GEN-LAST:event_signUpButtonMouseExited

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
        
        mainPanel.setVisible(false);
        //this.setSize(sign.getWidth(),sign.getHeight());
        this.setContentPane(sign.getContentPane());
    }//GEN-LAST:event_signUpButtonMouseClicked

    private void logInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseClicked
        JOptionPane.showMessageDialog(this, "not done yet");
    }//GEN-LAST:event_logInButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public  void run() {
             new Login().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logInButton;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JLabel signUpButton;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

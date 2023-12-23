/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cinema;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author abdo2
 */
public class ShowData extends javax.swing.JFrame {
    Connection con ; 
    PreparedStatement pst ;


    public ShowData(){
        initComponents();
       username.setText(User.getInstance().getUsername());
       fullName.setText(User.getInstance().getFullName());
       phoneNumber.setText(User.getInstance().getPhoneNum());
       role.setText(User.getInstance().getRole());       
       age.setText(Integer.toString(User.getInstance().getAge()));
       
       edit.setCursor((Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)));
       edit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       edit2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       edit4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       try{
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?zeroDateTimeBehavior=CONVERT_TO_NULL","root","abdonwar123");
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(this, "Connection to the database failed\n"+ex);
       }
       
       
       
       
       
       
       
       
       
       
             
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                javax.swing.ImageIcon backgroundIcon = new javax.swing.ImageIcon("src/Pure Lust.jpg");
                g.drawImage(backgroundIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        ;
        username = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        edit1 = new javax.swing.JLabel();
        edit2 = new javax.swing.JLabel();
        edit4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("username");

        age.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        age.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        age.setText("Age :");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username :");

        phoneNumber.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        phoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneNumber.setText("Phone Number :");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Age :");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phone Number :");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Full Name:");

        role.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        role.setText("Role");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Role :");

        fullName.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        fullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullName.setText("Full Name");

        edit.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("<HTML><U>Edit</U></HTML>");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });

        edit1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        edit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit1.setText("<HTML><U>Edit</U></HTML>");
        edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit1MouseExited(evt);
            }
        });

        edit2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        edit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit2.setText("<HTML><U>Edit</U></HTML>");
        edit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit2MouseExited(evt);
            }
        });

        edit4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        edit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit4.setText("<HTML><U>Edit</U></HTML>");
        edit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(username))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumber))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(role))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(age))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(fullName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edit4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(role))
                .addContainerGap(94, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseEntered
        edit.setForeground(Color.blue);
    }//GEN-LAST:event_MouseEntered

    private void MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseExited
        edit.setForeground(Color.black);
    }//GEN-LAST:event_MouseExited

    private void edit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseEntered
        edit1.setForeground(Color.BLUE);
    }//GEN-LAST:event_edit1MouseEntered

    private void edit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseExited
        edit1.setForeground(Color.BLACK);
    }//GEN-LAST:event_edit1MouseExited

    private void edit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit2MouseEntered
       edit2.setForeground(Color.BLUE);
    }//GEN-LAST:event_edit2MouseEntered

    private void edit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit2MouseExited
        edit2.setForeground(Color.black);
    }//GEN-LAST:event_edit2MouseExited

    private void edit4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit4MouseEntered
      edit4.setForeground(Color.blue);
    }//GEN-LAST:event_edit4MouseEntered

    private void edit4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit4MouseExited
      edit4.setForeground(Color.BLACK);
    }//GEN-LAST:event_edit4MouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        User.getInstance().setUsername(JOptionPane.showInputDialog(this,"Enter the new Username"));
       try{ 
           pst = con.prepareStatement("UPDATE users SET u_username = ? WHERE u_id = ?");
          pst.setString(1, User.getInstance().getUsername());
          pst.setInt(2,User.getInstance().getId());
          pst.executeUpdate();
          username.setText(User.getInstance().getUsername());
       }catch (SQLException ex){
           JOptionPane.showMessageDialog(this, "Something went wrong");
       }
    }//GEN-LAST:event_editMouseClicked

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
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel edit1;
    private javax.swing.JLabel edit2;
    private javax.swing.JLabel edit4;
    private javax.swing.JLabel fullName;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel role;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}

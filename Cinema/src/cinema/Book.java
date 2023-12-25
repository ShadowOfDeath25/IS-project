/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cinema;

/**
 *
 * @author ABDO RAMDAN
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.desktop.UserSessionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Book extends javax.swing.JFrame {

    /**
     * Creates new form Book
     */
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst2;
    Movie currMovie;
    ResultSet res;

    public Book(Movie movie) {

        initComponents();
        this.setLocationRelativeTo(null);
        //Image icon = new ImageIcon(this.getClass().getResource("\\popcorn.png")).getImage();
        // this.setIconImage(icon);
        currMovie = movie;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "CONNECTION FAILED");
        }
        jLabel1.setIcon(movie.coverIcon);
        jLabel1.setText(movie.movieTitle);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl1 = new JPanel(){  @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Specify the path to your image file here
                ImageIcon img = new ImageIcon("src/Sea Blue.jpg");
                g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radio3_h1 = new javax.swing.JRadioButton();
        radio1_h1 = new javax.swing.JRadioButton();
        radio2_h1 = new javax.swing.JRadioButton();
        radio3_h2 = new javax.swing.JRadioButton();
        radio2_h2 = new javax.swing.JRadioButton();
        radio1_h2 = new javax.swing.JRadioButton();
        radio1_h3 = new javax.swing.JRadioButton();
        radio2_h3 = new javax.swing.JRadioButton();
        radio3_h3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("God Father I");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HALL 3");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HALL 1");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HALL 2");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        buttonGroup1.add(radio3_h1);
        radio3_h1.setText("9 : 00 PM");

        buttonGroup1.add(radio1_h1);
        radio1_h1.setText("3 : 00 PM");
        radio1_h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1_h1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio2_h1);
        radio2_h1.setText("6 : 00 PM");

        buttonGroup1.add(radio3_h2);
        radio3_h2.setText("9 : 00 PM");

        buttonGroup1.add(radio2_h2);
        radio2_h2.setText("6 : 00 PM");

        buttonGroup1.add(radio1_h2);
        radio1_h2.setText("3 : 00 PM");

        buttonGroup1.add(radio1_h3);
        radio1_h3.setText("3 : 00 PM");

        buttonGroup1.add(radio2_h3);
        radio2_h3.setText("6 : 00 PM");

        buttonGroup1.add(radio3_h3);
        radio3_h3.setText("9 : 00 PM");

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BOOK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(radio2_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radio1_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radio3_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radio2_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio1_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio3_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radio2_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio1_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio3_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addContainerGap(115, Short.MAX_VALUE)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1Layout.createSequentialGroup()
                                        .addComponent(radio1_h2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio2_h2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio3_h2))
                                    .addGroup(pnl1Layout.createSequentialGroup()
                                        .addComponent(radio1_h3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio2_h3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio3_h3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                                .addComponent(radio1_h1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio2_h1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio3_h1)))
                        .addGap(165, 165, 165))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 676, 458);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (radio1_h1.isSelected() || radio2_h1.isSelected() || radio3_h1.isSelected() || radio1_h2.isSelected() || radio2_h2.isSelected() || radio3_h2.isSelected() || radio1_h3.isSelected() || radio2_h3.isSelected() || radio3_h3.isSelected() || radio1_h2.isSelected()) {

            try {
                pst = con.prepareStatement("SELECT * FROM movies WHERE m_title = ?");
                pst.setString(1, currMovie.movieTitle);
                res = pst.executeQuery();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database connection failed");
            }

            try {

                pst = con.prepareStatement(" insert into tickets(m_id,u_id,hall,times) values( ? , ? , ?,? )");
                pst.setInt(2, User.getInstance().getId());
                if (res.next()) {
                    pst.setInt(1, res.getInt(1));
                } else {
                    JOptionPane.showMessageDialog(this, "Movie not found");
                }

                if (radio1_h1.isSelected() || radio2_h1.isSelected() || radio3_h1.isSelected()) {
                    if (radio1_h1.isSelected()) {
                        pst.setString(3, "Hall 1");
                        pst.setString(4, "3:00 PM");
                    } else if (radio2_h1.isSelected()) {
                        pst.setString(3, "Hall 1");
                        pst.setString(4, "6:00 PM");
                    } else if (radio3_h1.isSelected()) {
                        pst.setString(3, "Hall 1");
                        pst.setString(4, "9:00 PM");
                    }

                } else if (radio1_h2.isSelected() || radio2_h2.isSelected() || radio3_h2.isSelected()) {
                    if (radio1_h2.isSelected()) {
                        pst.setString(3, "Hall 2");
                        pst.setString(4, "3:00 PM");
                    } else if (radio2_h2.isSelected()) {
                        pst.setString(3, "Hall 2");
                        pst.setString(4, "6:00 PM");
                    } else if (radio3_h2.isSelected()) {
                        pst.setString(3, "Hall 2");
                        pst.setString(4, "9:00 PM");
                    }

                } else if (radio1_h3.isSelected() || radio2_h3.isSelected() || radio3_h3.isSelected()) {
                    if (radio1_h3.isSelected()) {
                        pst.setString(3, "Hall 3");
                        pst.setString(4, "3:00 PM");
                    } else if (radio2_h3.isSelected()) {
                        pst.setString(3, "Hall 3");
                        pst.setString(4, "6:00 PM");
                    } else if (radio3_h3.isSelected()) {
                        pst.setString(3, "Hall 3");
                        pst.setString(4, "9:00 PM");
                    }

                }
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "your ticket has been booked successfully]\nYou will be redirected to the main page now");
                this.dispose();
                if (User.getInstance().getRole().equals("Admin")) {
                    new AdminMainPage().setVisible(true);
                } else {
                    new mainPage().setVisible(true);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed to book movie ");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please choose a time");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void radio1_h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1_h1ActionPerformed

    }//GEN-LAST:event_radio1_h1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (User.getInstance().getRole().equals("Admin")) {
            new AdminMainPage().setVisible(true);
        } else {
            new mainPage().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Book(new Movie("src/Avengers.png", "Avengers : Infinty War")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnl1;
    private javax.swing.JRadioButton radio1_h1;
    private javax.swing.JRadioButton radio1_h2;
    private javax.swing.JRadioButton radio1_h3;
    private javax.swing.JRadioButton radio2_h1;
    private javax.swing.JRadioButton radio2_h2;
    private javax.swing.JRadioButton radio2_h3;
    private javax.swing.JRadioButton radio3_h1;
    private javax.swing.JRadioButton radio3_h2;
    private javax.swing.JRadioButton radio3_h3;
    // End of variables declaration//GEN-END:variables
}

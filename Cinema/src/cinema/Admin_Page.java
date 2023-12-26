package cinema;

import static cinema.Report_2.totalTickets;
import java.awt.Image;
import javax.swing.*;
import java.awt.Font;
import java.sql.*;
import java.awt.Graphics;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Abdo Ayman
 */
public class Admin_Page extends javax.swing.JFrame {

    Connection con;
    PreparedStatement stmt;
    ImageIcon image;
    ArrayList<Integer> Mid = new ArrayList<>();

    public Admin_Page() {
        initComponents();
        Image icon = new ImageIcon("src/reelicon.png").getImage();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        TextField_Name.setBackground(new Color(0, 0, 0, 1));
        TextField_Username.setBackground(new Color(0, 0, 0, 1));
        TextField_Phone.setBackground(new Color(0, 0, 0, 1));
        TextField_Age.setBackground(new Color(0, 0, 0, 1));
        TextField_Edit.setBackground(new Color(0, 0, 0, 1));
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Connection to the database failed , please restart the app \nif this error occurs again please consult a technichan");
        }
        FillComboBox();
        MovieName.setBackground(new Color(0,0,0,1));
        PhotoSource.setBackground(new Color(0,0,0,1));
        NewMovieName.setBackground(new Color(0,0,0,1));
        NewPhotoSource.setBackground(new Color(0,0,0,1));
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new JPanel(){  @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Specify the path to your image file here
                ImageIcon img = new ImageIcon("src/Gradient.png");
                g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        TextField_Edit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Search_Button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextField_Username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextField_Name = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        TextField_Phone = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        TextField_Age = new javax.swing.JTextField();
        Update_button = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Delete_Button1 = new javax.swing.JButton();
        Refresh_Button2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new JPanel(){  @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Specify the path to your image file here
                ImageIcon img = new ImageIcon("src/Gradient.png");
                g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        jLabel3 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        MovieName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PhotoSource = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MovieList = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        MovieList2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        NewMovieName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        NewPhotoSource = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        DeleteBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 12)); // NOI18N

        TextField_Edit.setForeground(new java.awt.Color(227, 227, 227));
        TextField_Edit.setBorder(null);
        TextField_Edit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_EditKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(227, 227, 227));
        jLabel4.setText("Username");

        Search_Button.setText("Search");
        Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(227, 227, 227));
        jLabel5.setText("Name :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(227, 227, 227));
        jLabel6.setText("Username :");

        TextField_Username.setForeground(new java.awt.Color(227, 227, 227));
        TextField_Username.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(227, 227, 227));
        jLabel7.setText("Role :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(227, 227, 227));
        jLabel8.setText("Phone:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(227, 227, 227));
        jLabel2.setText("Age :");

        TextField_Name.setForeground(new java.awt.Color(227, 227, 227));
        TextField_Name.setBorder(null);

        TextField_Phone.setForeground(new java.awt.Color(227, 227, 227));
        TextField_Phone.setBorder(null);

        TextField_Age.setForeground(new java.awt.Color(227, 227, 227));
        TextField_Age.setBorder(null);

        Update_button.setText("Update");
        Update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(227, 227, 227));
        jRadioButton1.setText("Admin");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(227, 227, 227));
        jRadioButton2.setText("User");

        Delete_Button1.setText("Delete");
        Delete_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Button1ActionPerformed(evt);
            }
        });

        Refresh_Button2.setText("Refresh");
        Refresh_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_Button2ActionPerformed(evt);
            }
        });

        jButton1.setText("Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(TextField_Edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Delete_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Refresh_Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(356, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(7, 7, 7))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Admin Managment", jPanel1);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(227, 227, 227));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add :");

        AddBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        AddBtn.setText("Add ");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        MovieName.setBorder(null);
        MovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(227, 227, 227));
        jLabel9.setText("Movie name");

        PhotoSource.setBorder(null);
        PhotoSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhotoSourceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(227, 227, 227));
        jLabel10.setText("Cover");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(227, 227, 227));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Delete : ");

        MovieList.setBackground(new java.awt.Color(227, 227, 227));
        MovieList.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(227, 227, 227));
        jLabel12.setText("Movies : ");

        DeleteBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(227, 227, 227));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Edit");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(227, 227, 227));
        jLabel14.setText("Movies :");

        MovieList2.setBackground(new java.awt.Color(227, 227, 227));
        MovieList2.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(227, 227, 227));
        jLabel15.setText("New Name");

        NewMovieName.setBorder(null);
        NewMovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMovieNameActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(227, 227, 227));
        jLabel16.setText("New Cover");

        NewPhotoSource.setBorder(null);
        NewPhotoSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPhotoSourceActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        DeleteBtn1.setText("Back");
        DeleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(MovieList, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DeleteBtn))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(179, 179, 179)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(NewPhotoSource, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PhotoSource, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator5)
                                            .addComponent(jSeparator10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AddBtn)
                                            .addComponent(EditBtn))))))
                        .addGap(0, 228, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewMovieName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MovieName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MovieList2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn)
                    .addComponent(PhotoSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MovieList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn))
                .addGap(37, 37, 37)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MovieList2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPhotoSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(DeleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Movies Managment", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void FillComboBox() {
        try {
            PreparedStatement st = con.prepareStatement("select m_id , m_title from movies;");
            ResultSet rss = st.executeQuery();
            while (rss.next()) {
                Mid.add(rss.getInt(1));
                MovieList.addItem(rss.getString(2));
                MovieList2.addItem(rss.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void TextField_EditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_EditKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Get_Content();

        }
    }//GEN-LAST:event_TextField_EditKeyPressed

    private void Update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_buttonActionPerformed
        if (!TextField_Age.getText().isEmpty() && !TextField_Edit.getText().isEmpty() && !TextField_Name.getText().isEmpty() && !TextField_Phone.getText().isEmpty() && !TextField_Username.getText().isEmpty() && (jRadioButton2.isSelected() || jRadioButton1.isSelected())) {
            String Uedit = TextField_Edit.getText();
            int Uage = (int) (Double.parseDouble(TextField_Age.getText()));
            String Uname = TextField_Name.getText();
            String Uphone = TextField_Phone.getText();
            String Uuser = TextField_Username.getText();
            String Urole = null;
            if (jRadioButton1.isSelected()) {
                Urole = jRadioButton1.getText();
            } else if (jRadioButton2.isSelected()) {
                Urole = jRadioButton2.getText();
            } else {
                JOptionPane.showMessageDialog(this, "something wrong in role");
            }

            try {
                PreparedStatement stmt = con.prepareStatement("update users set u_name=?,u_username=?,u_role=?,u_age=?,u_phone=? where u_username=?");
                stmt.setString(6, Uedit);
                stmt.setString(1, Uname);
                stmt.setString(2, Uuser);
                stmt.setString(3, Urole);
                stmt.setInt(4, Uage);
                stmt.setString(5, Uphone);
                int op = stmt.executeUpdate();
                if (op == 0) {
                    JOptionPane.showMessageDialog(this, "this user doesn't exist");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Something went wrong with the database");
            }

            Empty_Data();
            JOptionPane.showMessageDialog(this, "Updated Succssefully");
        } else {
            JOptionPane.showMessageDialog(this, "Please check that there is no empty data");
        }
    }//GEN-LAST:event_Update_buttonActionPerformed

    private void Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ButtonActionPerformed
        Get_Content();
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void Delete_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Button1ActionPerformed
        if (!TextField_Edit.getText().isEmpty()) {
            String username = TextField_Edit.getText();
            try {
                PreparedStatement stmt = con.prepareStatement("delete from users where u_username=?");
                stmt.setString(1, username);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "User is deleted successfully");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "username isn't found in database");
            }
            Empty_Data();
        } else {
            JOptionPane.showMessageDialog(this, "Please import a username");
        }
    }//GEN-LAST:event_Delete_Button1ActionPerformed

    private void Refresh_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_Button2ActionPerformed
        Empty_Data();

    }//GEN-LAST:event_Refresh_Button2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new AdminMainPage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Report_2 reportFrame = new Report_2();
        reportFrame.filltable();
        reportFrame.getjLabel2().setText("Total Tickets : " + reportFrame.totalTickets);
        reportFrame.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:

        if (NewMovieName.getText().isEmpty() && NewPhotoSource.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide data");
        } else if (!NewMovieName.getText().isEmpty() && NewPhotoSource.getText().isEmpty()) {
            try {
                PreparedStatement pst = con.prepareStatement("UPDATE movies set m_title = ? WHERE m_title = ?");
                pst.setString(2,MovieList2.getSelectedItem().toString());
                pst.setString (1 ,NewMovieName.getText());
                pst.executeUpdate();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Something went wrong");
            }

        } else if (NewMovieName.getText().isEmpty() && !NewPhotoSource.getText().isEmpty()) {
             try {
                PreparedStatement pst = con.prepareStatement("UPDATE movies set m_cover = ? WHERE m_title = ?");
                pst.setString(2,MovieList2.getSelectedItem().toString());
                pst.setString (1 ,NewPhotoSource.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Edited successfully");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Something went wrong");
            }

            
            
            
        } else {

            try {
                PreparedStatement ps = con.prepareStatement("update movies set m_title=?,m_cover=? where m_title = ? ;");
                ps.setString(1, NewMovieName.getText());
                ps.setString(2, NewPhotoSource.getText());
                String x = MovieList2.getSelectedItem().toString();
                ps.setString(3, x);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Edited successfully");
            } catch (SQLException ex) {
                Logger.getLogger(Admin_Page.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_EditBtnActionPerformed

    private void NewPhotoSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPhotoSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPhotoSourceActionPerformed

    private void NewMovieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMovieNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewMovieNameActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed

        try {
            PreparedStatement ps = con.prepareStatement("delete from movies where m_title = ? ;");
            String x = MovieList.getSelectedItem().toString();
            ps.setString(1, x);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void PhotoSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhotoSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhotoSourceActionPerformed

    private void MovieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovieNameActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if (!MovieName.getText().isEmpty() && !PhotoSource.getText().isEmpty()) {
            try {
                PreparedStatement ps = con.prepareStatement("INSERT INTO movies(m_title,m_cover) values (?,?);");
                ps.setString(1, MovieName.getText());
                ps.setString(2, PhotoSource.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Added successfully");
            } catch (SQLException ex) {
                Logger.getLogger(Admin_Page.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please provide data");
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DeleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn1ActionPerformed
        this.dispose();
        new AdminMainPage().setVisible(true);
    }//GEN-LAST:event_DeleteBtn1ActionPerformed

    private void Get_Content() {
        String name = null, gender, username = null, role = null, phone = null, password;
        int age = 0, id;

        if (TextField_Edit.getText().length() > 0) {//
            try {
                username = TextField_Edit.getText();
                PreparedStatement stmt = con.prepareStatement("select *from users where u_username=?");
                stmt.setString(1, username);
                ResultSet rs = stmt.executeQuery();
                boolean isEmpty = true;
                while (rs.next()) {
                    isEmpty = false;
                    id = rs.getInt(1);
                    name = rs.getString(2);
                    username = rs.getString(3);
                    role = rs.getString(5);
                    age = rs.getInt(6);
                    phone = rs.getString(7);
                    gender = rs.getString(8);
                }
                if (isEmpty) {
                    JOptionPane.showMessageDialog(this, "This user doesn't exist");
                    TextField_Age.setText("");
                    TextField_Username.setText("");

                } else {
                    TextField_Age.setText(String.valueOf(age));
                    TextField_Name.setText(name);
                    TextField_Phone.setText(phone);
                    TextField_Username.setText(username);
                }

            } catch (SQLException ex) {
                // Logger.getLogger(Admin_Page.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Username not Found");
            }
        } else {
            JOptionPane.showMessageDialog(this, "The Username is Empty");
        }

        if ("Admin".equals(role)) {
            jRadioButton1.setSelected(true);
        } else if ("User".equals(role)) {
            jRadioButton2.setSelected(true);
        } else if (role == null) {

        } else {
            JOptionPane.showMessageDialog(this, "something wrong in role");
        }

    }

    private void Empty_Data() {
        TextField_Edit.setText("");
        TextField_Username.setText("");
        TextField_Age.setText("");
        TextField_Phone.setText("");
        TextField_Name.setText("");
        buttonGroup1.clearSelection();
    }

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
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DeleteBtn1;
    private javax.swing.JButton Delete_Button1;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> MovieList;
    private javax.swing.JComboBox<String> MovieList2;
    private javax.swing.JTextField MovieName;
    private javax.swing.JTextField NewMovieName;
    private javax.swing.JTextField NewPhotoSource;
    private javax.swing.JTextField PhotoSource;
    private javax.swing.JButton Refresh_Button2;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextField TextField_Age;
    private javax.swing.JTextField TextField_Edit;
    private javax.swing.JTextField TextField_Name;
    private javax.swing.JTextField TextField_Phone;
    private javax.swing.JTextField TextField_Username;
    private javax.swing.JButton Update_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

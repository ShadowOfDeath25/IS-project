/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.sql.*;

/**
 *
 * @author abdo2
 */
public class RemovableMovie extends JLabel {

    Image cover;
    ImageIcon coverIcon;
    String movieTitle;
    RemovableMovie currMovie = this;
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst2 ;

    public RemovableMovie(String coverPath, String title) {
        movieTitle = title;
        this.setText(title);
        this.setSize(100, 220);
        cover = new ImageIcon(coverPath).getImage();
        coverIcon = new ImageIcon(cover.getScaledInstance(100, 200, Image.SCALE_SMOOTH));
        this.setIcon(coverIcon);
        this.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 12));
        this.setVerticalTextPosition(JLabel.BOTTOM);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setForeground(new Color(227,227,227));
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int op = JOptionPane.showConfirmDialog(SwingUtilities.getWindowAncestor(currMovie), "Are you sure you want to delete this movie ?");
                if (op == JOptionPane.YES_OPTION) {

                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
                        pst = con.prepareStatement("DELETE FROM tickets WHERE u_id = ? AND m_id = ?");
                        pst2=con.prepareStatement("SELECT m_id FROM movies WHERE m_title= ?");
                        pst2.setString(1, movieTitle);
                        ResultSet m_id = pst2.executeQuery();
                        if (m_id.next()){
                        pst.setInt(2,m_id.getInt(1));
                        }
                        pst.setInt(1, User.getInstance().getId());
                       
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(currMovie), "Ticket Deleted Successfully\nThis page will refresh now");
                        Tickets tickets = new Tickets();
                        SwingUtilities.getWindowAncestor(currMovie).dispose();
                        tickets.setVisible(true);

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(currMovie), "Something went wrong\n"+ex);
                    }

                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setText("<HTML><U>" + title + "</U></HTML>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setText(title);
            }

        });

    }

}
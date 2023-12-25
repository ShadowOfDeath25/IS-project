/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;
import javax.swing.JLabel;
import javax.swing.ImageIcon ;
import java.awt.Image ;
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
/**
 *
 * @author abdo2
 */
public class Movie extends JLabel{
    Image cover ;
    ImageIcon coverIcon;
    String movieTitle;
    Movie currMovie = this;
   
    
    public Movie(String coverPath , String title){
        movieTitle = title ;
        this.setText(title);
        this.setSize(100,220);
        cover = new ImageIcon(coverPath).getImage();
        coverIcon = new ImageIcon(cover.getScaledInstance(100,200,Image.SCALE_SMOOTH));
        int borderThickness = 5 ;
        Color borderColor =Color.BLACK;
        int width = coverIcon.getIconWidth() + (2*borderThickness);
        int height = coverIcon.getIconHeight() + (2*borderThickness);
        BufferedImage borderedImage =new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g= borderedImage.createGraphics();
        g.setColor(borderColor);
        g.fillRect(0, 0, width, height);
        g.drawImage(coverIcon.getImage(), borderThickness,borderThickness,null);
        g.dispose();
        ImageIcon borderedIcon = new ImageIcon (borderedImage.getScaledInstance(100,200, Image.SCALE_SMOOTH));
        this.setIcon(coverIcon);
        this.setFont(new Font ("Tw Cen MT Condensed", Font.BOLD, 14));
        this.setVerticalTextPosition(JLabel.BOTTOM);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.addMouseListener(new MouseAdapter(){
        @Override 
        public void mouseClicked(MouseEvent e){
         
          new Book(currMovie).setVisible(true); 
          SwingUtilities.getWindowAncestor(currMovie).dispose();
    
        }
        @Override 
        public void mouseEntered(MouseEvent e){
          setText("<HTML><U>"+title+"</U></HTML>");
        }
        
        @Override 
        public void mouseExited(MouseEvent e){
            setText(title);
        }
        
        });
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
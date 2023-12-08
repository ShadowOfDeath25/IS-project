/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinema;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class Cinema {
 static Connection con ;

    
    public static void main(String[] args) {
          try{
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","root");
              System.out.println("Connection Successful");
          }
          catch(SQLException e){
              System.out.println("Connection Failed");
              System.out.println("exception : "+e);
          }
    }
    
}

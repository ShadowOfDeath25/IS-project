/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;
import java.sql.*;
/**
 *
 * @author abdo2
 */
public class User {
    User user ;
    public User getInstance(){
        return user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        user.username = username;
    }

    public String getPassword() {
        return user.password;
    }

    public void setPassword(String password) {
        user.password = password;
    }

    public String getHashedPassword() {
        return user.hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        user.hashedPassword = hashedPassword;
    }

    public int getAge() {
        return user.age;
    }

    public void setAge(int age) {
        user.age = age;
    }

    public String getRole() {
        return user.role;
    }

    public void setRole(String role) {
       user.role = role;
    }

    public String getGender() {
        return user.gender;
    }

    public void setGender(String gender) {
        user.gender = gender;
    }

    public String getFullName() {
        return user.fullName;
    }

    public void setFullName(String fullName) {
        user.fullName = fullName;
    }

    public int getId() {
        return user.id;
    }

    public void setId(int id) {
        user.id = id;
    }

    public String getPhoneNum() {
        return user.phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        user.phoneNum = phoneNum;
    }
    
   private String username ;
   private String password;
   private String hashedPassword; 
   private int age ;
   private String role ;
   private String gender ;
   private String fullName;
   private int id ;
   private String phoneNum ;
    
    public User(ResultSet res,String pass){
       try{
        while(res.next()){
        user.username = res.getString(3);
        user.id= res.getInt(1);
        user.fullName = res.getString(2);
        user.hashedPassword = res.getString(4);
        user.password=pass ;
        user.role = res.getString(5);
        user.age = res.getInt(6);
        user.phoneNum =res.getString(7);
        user.gender = res.getString(8);
        }
       }catch(SQLException e){
           System.out.println(e);
       }        
     
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}

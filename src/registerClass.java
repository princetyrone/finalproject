
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class registerClass {
    connections cn = new connections();
      String forname = cn.forname;
    String driver = cn.url;
    String users_name = cn.un;
    String users_pass =cn.up;
    
    public void eh_Rehistro_NaSubong(String firstname, String lastname,String username,String password){
      
        
        try {
            Class.forName(forname);
            Connection con = (Connection) DriverManager.getConnection(driver, users_name, users_pass);
           
             PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into user values(null,?,?,?,md5(?),1)");
             ps.setString(1, firstname);
             ps.setString(2, lastname);
             ps.setString(3, username);
             ps.setString(4, password);
             ps.executeUpdate();
             
   
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
           
        }
       
    }
    
    
    
    
     public int mangitaParehoNgaUsername(String firstname, String lastname,String username,String password){
      int x =0;
        
        try {
            Class.forName(forname);
            Connection con = (Connection) DriverManager.getConnection(driver, users_name, users_pass);
            PreparedStatement findrs = (PreparedStatement) con.prepareStatement("select * from user where username = ?");
            findrs.setString(1, username);
            ResultSet rs  = findrs.executeQuery();
            if(rs.next()){
                x=-1;
            }
            else{
                x=1;
            }
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registerClass.class.getName()).log(Level.SEVERE, null, ex);
            x=0;
        } catch (SQLException ex) {
            Logger.getLogger(registerClass.class.getName()).log(Level.SEVERE, null, ex);
            x=0;
        }
        return x;
    }
     
     
     
     
     public void hihi(){
        try {
            Class.forName(forname);
            Connection con = (Connection) DriverManager.getConnection(driver);
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
     }
}

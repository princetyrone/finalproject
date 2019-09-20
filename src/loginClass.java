
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class loginClass {
      String forname = "com.mysql.jdbc.Driver";
    String driver = "jdbc:mysql://localhost/bsit23";
    String users_name = "root";
    String users_pass ="";
    String pangalan ="";
    public int Ma_LOGin_Ko(String username, String password){
      int x=0;
        
        try {
            Class.forName(forname);
            Connection con = (Connection) DriverManager.getConnection(driver, users_name, users_pass);
           
             PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from user where username =? and password = md5(?)");
             ps.setString(1, username);
             ps.setString(2, password);
             ResultSet rs = ps.executeQuery();
             if(rs.next()){
                 
                 x=1;
                  pangalan = rs.getString("first_name")+" "+rs.getString("last_name");
             }else{
                 x=-1;
             }
             
      
        } catch (ClassNotFoundException ex) {
           x=0; 
        } catch (SQLException ex) {
           x=0;
        }
       return x;
    }
}

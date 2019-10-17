
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class connections {
     String forname = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost/bsit23";
    String un= "root";
    String up =""; 
    
    
    public Connection getConnection(){Connection cc = null;
        try {
             cc =  DriverManager.getConnection(url,un,up);
        } catch (SQLException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cc;
    }
    
    public ResultSet checkResult(PreparedStatement ps){ResultSet cc = null;
       
        try {
            cc=  ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(connections.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return cc;
    }
}

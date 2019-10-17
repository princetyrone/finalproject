
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
public class productClass {

    connect conn = new connect();
    connections cn = new connections();
    public int addProduct(String product, int quantity, float price){int x=0;
         try {
             Class.forName(conn.forname);
             Connection con = DriverManager.getConnection(conn.driver,conn.users_name,conn.users_pass);
             PreparedStatement ps = con.prepareStatement("select * from product where prod_name = ? and prod_price =?");
             ps.setString(1, product);
             ps.setFloat(2, price);
             ResultSet rs = ps.executeQuery();
             if(rs.next()){x=2;
                 
                 int prid = Integer.parseInt(rs.getString("prod_id"));
                 PreparedStatement ps1 = con.prepareStatement("update product set prod_quantity = prod_quantity + ? where prod_id = ? ");
                 ps1.setInt(1, quantity);
                 ps1.setInt(1, prid);
                 ps1.executeUpdate();
             }
             else{x=1;
               PreparedStatement ps1 = con.prepareStatement("insert into product values(null,?,?,?)");
               ps1.setString(1, product);
               ps1.setInt(2, quantity);
               ps1.setFloat(3, price);
               ps1.executeUpdate();
             }
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
         }
         return x;
    }
    
    
    public int removeProduct(int id){int x=0;
         try {
             Class.forName(conn.forname);
             Connection con = DriverManager.getConnection(conn.driver,conn.users_name,conn.users_pass);
             PreparedStatement ps = con.prepareStatement("delete from product where prod_id = ?");
             ps.setInt(1, id);
             x = ps.executeUpdate();
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
         }
         return x;
    }
    
    
    public void edit(int id, String product, float price){
        try {
            Class.forName(cn.forname);
            Connection con = cn.getConnection();
            PreparedStatement ps = con.prepareStatement("update product set prod_name = ?, prod_price = ? where prod_id = ?");
            ps.setString(1,product );
            ps.setFloat(2, price);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}

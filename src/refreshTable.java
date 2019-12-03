
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class refreshTable {
    connect c = new connect();
   
     public void showProds(int barcode,JTable jTable1){
     try {
         Class.forName(c.forname);
         Connection con = DriverManager.getConnection(c.driver,c.users_name,c.users_pass);
         PreparedStatement ps = con.prepareStatement("select * from product where prod_id = ?");
         ps.setInt(1, barcode);
         
         ResultSet rs = ps.executeQuery();
         DefaultTableModel tab = (DefaultTableModel) jTable1.getModel(); 
         if(rs.next()){
             tab.addRow(new Object[]{rs.getString("prod_id"),rs.getString("prod_name"),1,rs.getString("prod_price"),rs.getString("prod_price")});
         }
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(homeFrame.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(homeFrame.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    
    
}

package swings;




import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class components {
    public int getInteger(JTextField t){
        return Integer.parseInt(t.getText());
    }
    public int getInteger(Object o){
        return Integer.parseInt(o.toString());
    }
    
    public int getInteger(JSpinner s){
        return Integer.parseInt(s.getValue().toString());
    }
    
    public int getInteger(JTable t,int row, int column){
        int x=0;
      x =Integer.parseInt(t.getValueAt(row, column).toString());
      return x;
    }
    
    public String getString(JTable t, int row , int column){   
        return t.getValueAt(row, column).toString();    
    }
    
}

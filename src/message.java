
import java.awt.Component;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class message {
    
    public void imessage(Component a, String message){
        JOptionPane.showMessageDialog(a, message);
    }
    
    public void emessage(Component a, String message){
        JOptionPane.showMessageDialog(a, message,"error message",JOptionPane.ERROR_MESSAGE);
    }
    
    public void wmessage(Component a, String message){
        JOptionPane.showMessageDialog(a, message,"warning",JOptionPane.WARNING_MESSAGE);
    }
    public void pmessage(Component a, String message){
        JOptionPane.showMessageDialog(a, message,"Message",JOptionPane.PLAIN_MESSAGE);
    }
    
    
    public int conmessage(Component a, String productname){
        String message ="are you sure to delete ["+productname+"] ?";
       return JOptionPane.showConfirmDialog(a, message,"message",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
    }
    
}

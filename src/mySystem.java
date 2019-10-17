
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class mySystem {
    public void close(){
        Runtime.getRuntime().exit(0);
    }
    public void display(Object message){
        System.out.print(message);
    }
    public void nextLineDisplay(Object message){
        System.out.println(message);
    }
    
    public String getHour(){
        SimpleDateFormat f = new SimpleDateFormat("HH");
        Date d = new Date();
        String a = f.format(d);
        return a;  
    }
    
    
    public String getMinute(){
        SimpleDateFormat f = new SimpleDateFormat("mm");
        Date d = new Date();
        String a = f.format(d);
        return a;  
    }
    
    public String getSecond(){
        SimpleDateFormat f = new SimpleDateFormat("ss");
        Date d = new Date();
        String a = f.format(d);
        return a;  
    }
    
    public String getYear(){
        SimpleDateFormat f = new SimpleDateFormat("YY");
        Date d = new Date();
        String a = "20"+f.format(d);
        return a;  
    }
    
    public String getMonth(){String a="";
        SimpleDateFormat f = new SimpleDateFormat("MM");
        Date d = new Date();
        int month = Integer.parseInt(f.format(d));
        if(month==1){
           a="January"; 
        }
        if(month==2){
           a="February"; 
        }
        if(month==3){
           a="March"; 
        }
        if(month==4){
           a="April"; 
        }
        if(month==5){
           a="May"; 
        }
        if(month==6){
           a="June"; 
        }
        if(month==7){
           a="July"; 
        }
        if(month==8){
           a="August"; 
        }
        if(month==9){
           a="September"; 
        }
        if(month==10){
           a="October"; 
        }
        if(month==11){
           a="November"; 
        }
        if(month==12){
           a="December"; 
        }
        
        return a;  
    }
    
    public String getDay(){
        SimpleDateFormat f = new SimpleDateFormat("dd");
        Date d = new Date();
        String a = f.format(d);
        return a;
    }
    
    public String getDate(){
        SimpleDateFormat f = new SimpleDateFormat();
        Date d = new Date();
        String x =f.format(d);
        return x;
        
    }
 
    public Date dateNow(){
        Date d = new Date();
        return d;
    }
    
    public String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        Date d = new Date();
        String a = f.format(d);
        return a;  
    }
    
    
    public int getMonthNumber(){String a="";
        SimpleDateFormat f = new SimpleDateFormat("MM");
        Date d = new Date();
        int month = Integer.parseInt(f.format(d));
        return month;
    }
}

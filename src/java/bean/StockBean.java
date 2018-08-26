/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SHASHIN
 */
public class StockBean implements Serializable {
    
    private String dress_id;
    private String dress_type;
    private String dress_name;
    private String stock_qty;
    private String available_qty;
    private String state="qqqq";
    private String num;

  
    
    public StockBean(){
        
    }

    public String getDress_id() {
        return dress_id;
    }

    public void setDress_id(String dress_id) {
        this.dress_id = dress_id;
    }

    public String getDress_type() {
        return dress_type;
    }

    public void setDress_type(String dress_type) {
        this.dress_type = dress_type;
    }

    public String getDress_name() {
        return dress_name;
    }

    public void setDress_name(String dress_name) {
        this.dress_name = dress_name;
    }

    public String getStock_qty() {
        return stock_qty;
    }

    public void setStock_qty(String stock_qty) {
        this.stock_qty = stock_qty;
    }

    public String getAvailable_qty() {
        return available_qty;
    }

    public void setAvailable_qty(String available_qty) {
        this.available_qty = available_qty;
    }
    public String validiate()
    {
        
            Connection con=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
              
              try{
           
             Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sineth","root",""); 
             }
             catch(Exception e){
                 System.out.println("Connection error");
             }
              
              String sss="shirt001";
                try{
                  
               String sql="SELECT available_qty FROM stock where dress_id='"+sss+"'";
        
               pst=con.prepareStatement(sql);
              
              rs = pst.executeQuery();
              while(rs.next()){
              num= rs.getString(1);
             int num1=Integer.parseInt(num);
                 num1=num1-1;
                 
                   String sql1="UPDATE  stock SET available_qty='"+num1+"' where dress_id='"+sss+"'" ;
         
               pst=con.prepareStatement(sql1);
               pst.execute();
                 
              }
                  
              }
              catch(Exception e){
                  System.out.println("something went wrong");
                  
              }
                return num;
    }
      
  
    
}

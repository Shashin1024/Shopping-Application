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
public class ClientBean implements Serializable{
    
     private String nic;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String cardno;
    private boolean state;

    
    public ClientBean(){
    
    }
     public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
   

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }
    
    
    
      public boolean validate(){
        
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
              
              try{
                  
               String sql="INSERT INTO client (email,firstname,lastname,nic,password,cardno) VALUES ('"+email+"','"+firstname+"','"+lastname+"','"+nic+"','"+password+"','"+cardno+"')";
        
               pst=con.prepareStatement(sql);
               pst.execute();
                
                 state = true;
                  
              }
              catch(Exception e){
                  System.out.println("something went wrong");
                  state=false;
              }
        
        return state;
    }
    
    
}

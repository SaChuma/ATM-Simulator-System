package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3307/atms","root","258036");
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){
            System.out.println(e);
        }  
    }  
}  



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;


public class conexion {
  public static void main(String args[]) throws ClassNotFoundException, SQLException{
    
    
      
        Class.forName("org.postgresql.Driver");
        Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/persona","postgres","mari");
        PreparedStatement p1 = co.prepareStatement("create table usaurios(\n" +
"nombre varchar (30)not null primary key,\n" +
"email varchar(80) not null,\n" +
"contraseña varchar (15)not null,\n" +
"numeroTarjeta varchar (30) not null\n" +
"	)");
                p1.executeUpdate();
                
                p1.close(); 
                
  }}
  
                

        
       
                         
   
                
    


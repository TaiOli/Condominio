package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tais Oliveira
 */
public class ConnectionFactory {
    
      
     public ResultSet rs;
     
    //Realizando a Conexão
    public  Connection conecta(){ 
        
        try{
            
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/mercadinho","root","");
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);   
        }
    }  
    
}

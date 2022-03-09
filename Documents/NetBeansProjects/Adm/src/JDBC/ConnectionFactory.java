/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {
    
     public ResultSet rs;
     
    //Realizando a Conexão
    public  Connection conecta(){ 
        
        try{
            
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/adm","root","");
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);   
        }
    }  
}
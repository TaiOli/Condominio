/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Javabeans.TelefonesUteis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TelefonesUteisDAO {
    
       private Connection conecta;
    ConnectionFactory cc= new ConnectionFactory();
    Connection con=cc.conecta();

    public TelefonesUteisDAO(){
        
        this.conecta = new ConnectionFactory().conecta();
    }
  
    //Cadastrando Proprietario
    public void CadastrarTelefonesUteis(TelefonesUteis obj){       
        try{
            
            String cmdsql="INSERT INTO cadtelefonesuteis(Nome,Celular,Telefone,Observacao)VALUES(?,?,?,?)";
            try (PreparedStatement stmt = conecta.prepareStatement(cmdsql)) {
                stmt.setString(1,obj.getNome());
                stmt.setString(2,obj.getCelular());
                stmt.setString(3,obj.getTelefone());
                stmt.setString(4,obj.getObservacao());
                
                stmt.execute();
           } 
            
        }catch (SQLException erro){
            
          throw new RuntimeException(erro);
        } 
    }  
}

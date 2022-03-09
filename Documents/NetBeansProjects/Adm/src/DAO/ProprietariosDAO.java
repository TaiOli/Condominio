/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Javabeans.Proprietarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProprietariosDAO {
    
    private Connection conecta;
    ConnectionFactory cc= new ConnectionFactory();
    Connection con=cc.conecta();

    public ProprietariosDAO(){
        
        this.conecta = new ConnectionFactory().conecta();
    }
  
    //Cadastrando Proprietario
    public void CadastrarProprietario(Proprietarios obj){       
        try{
            
            String cmdsql="INSERT INTO cadproprietarios(Nome,Email,Celular,Telefone,Propriedade)VALUES(?,?,?,?,?)";
            try (PreparedStatement stmt = conecta.prepareStatement(cmdsql)) {
                stmt.setString(1,obj.getNome());
                stmt.setString(2,obj.getEmail());
                stmt.setString(3,obj.getCelular());
                stmt.setString(4,obj.getTelefone());
                stmt.setString(5,obj.getPropriedade());
                
                stmt.execute();
            } 
            
        }catch (SQLException erro){
            
          throw new RuntimeException(erro);
        }
    }     
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Javabeans.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDAO {
    
    private Connection conecta;
    ConnectionFactory cc= new ConnectionFactory();
    Connection con=cc.conecta();

    public UsuariosDAO(){
        
        this.conecta = new ConnectionFactory().conecta();
    }
     
    //Cadastrar Usuario
    public void CadastrarUsuario(Usuario obj){
        try{
            
            String cmdsql="INSERT INTO cadusuario(Nome,Email,Senha,EmailAlternativo)VALUES(?,?,?,?)";
            PreparedStatement stmt= conecta.prepareStatement(cmdsql);
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getEmail());
            stmt.setString(3,obj.getSenha());
            stmt.setString(4,obj.getEmailAlternativo());
                        
            stmt.execute();
            stmt.close(); 
            
        }catch (SQLException erro){
            
           throw new RuntimeException(erro); 
        }
    } 
}
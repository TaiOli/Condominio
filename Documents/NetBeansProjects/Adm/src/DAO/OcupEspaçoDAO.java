/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Javabeans.Espaço;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OcupEspaçoDAO {
    
    private Connection conecta;
    ConnectionFactory cc= new ConnectionFactory();
    Connection con=cc.conecta();
   
    public OcupEspaçoDAO(){
        
        this.conecta = new ConnectionFactory().conecta();
    }
    
    //Cadastrando Espaço
     public void CadastrarEspaço(Espaço obj){
         try{

            String cmdsql="INSERT INTO cadocupespaco(DataInicio,DataFim,HoraInicio,HoraEntrega,Preco,Apartamento,Nome)VALUES(?,?,?,?,?,?,?)";
             try(PreparedStatement stmt = conecta.prepareStatement(cmdsql)) {
                 stmt.setString(1,obj.getDataInicio());
                 stmt.setString(2,obj.getDataFim());
                 stmt.setString(3,obj.getHoraInicio());
                 stmt.setString(4,obj.getHoraEntrega());
                 stmt.setDouble(5,obj.getPreco());
                 stmt.setString(6,obj.getApartamento());
                 stmt.setString(7,obj.getNome());
                    
                 stmt.execute();
             }   
        }catch (SQLException erro){
            
          throw new RuntimeException(erro);   
        }     
    } 
}
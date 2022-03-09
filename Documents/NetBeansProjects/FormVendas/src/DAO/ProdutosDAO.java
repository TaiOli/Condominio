package DAO;

import JDBC.ConnectionFactory;
import JavaBeans.ItemVenda;
import JavaBeans.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tais Oliveira
 */
public class ProdutosDAO {
    
    private Connection conecta;
    ConnectionFactory cc= new ConnectionFactory();
    Connection con=cc.conecta();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    

    public ProdutosDAO(){
        
        this.conecta = new ConnectionFactory().conecta();
    }
    
    //Atualiza o Estoque
    public void AtualizarEstoque(Produtos obj){
        
        String sql="UPDATE produtos set Estoque=? WHERE id";
        
        try{
          con=cc.conecta();
          ps=con.prepareStatement(sql);
          ps.setInt(1, obj.getEstoque());
          ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
    
     public void AtualizarQuantidade(Produtos obj){
        
        String sql="UPDATE produtos set Quantidade=? WHERE id";
        
        try{
          con=cc.conecta();
          ps=con.prepareStatement(sql);
          ps.setInt(1, obj.getQuantidade());
          ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
    
    //Buscar Produto por Código
    public Produtos ListarId(String Codigo){
        
        Produtos p= new Produtos();
        String sql="SELECT *FROM produtos WHERE Codigo=?";
        
        try{
          con=cc.conecta();
          ps=con.prepareStatement(sql);
          ps.setString(1, Codigo);
          rs=ps.executeQuery();
          
          while(rs.next()){
              
              p.setId(rs.getInt(1));
              p.setDescricao(rs.getString(2));
              p.setPreco(rs.getDouble(3));
              p.setEstoque(rs.getInt(4));
              p.setCodigo(rs.getString(5));
                       
          }
        }catch(Exception e){
            
        }
        return p;
    }

     
    //Cadastrar Produtos
    public void CadastrarProdutos(Produtos obj){
        try{
            
            String cmdsql="INSERT INTO produtos (Descricao,Preco,Estoque,Codigo)VALUES(?,?,?,?)";
            PreparedStatement stmt= conecta.prepareStatement(cmdsql);
            stmt.setString(1,obj.getDescricao());
            stmt.setDouble(2,obj.getPreco());       
            stmt.setInt(3,obj.getEstoque());
            stmt.setString(4,obj.getCodigo());
                        
            stmt.execute();
            stmt.close(); 
            
        }catch (SQLException erro){
            
           throw new RuntimeException(erro); 
        }
    }  
    
    
    public void CadastrarQuantidade(ItemVenda obj){
        try{
            
            String cmdsql="INSERT INTO itemvenda (Quantidade)VALUES(?)";
            PreparedStatement stmt= conecta.prepareStatement(cmdsql);
                  
            stmt.setInt(1,obj.getQuantidade());
                                    
            stmt.execute();
            stmt.close(); 
            
        }catch (SQLException erro){
            
           throw new RuntimeException(erro); 
        }
        
    }
    
    //Método alterar Produto
    public void AlterarProduto(Produtos obj){
        
       try{
            
            String cmdsql="UPDATE produtos set Descricao=?,Preco=?,Estoque=?,Codigo=? WHERE id=?";
            PreparedStatement stmt= conecta.prepareStatement(cmdsql);
            stmt.setString(1,obj.getDescricao());
            stmt.setDouble(2,obj.getPreco());       
            stmt.setInt(3,obj.getEstoque());
            stmt.setString(4,obj.getCodigo());
            stmt.setInt(5,obj.getId());
                        
            stmt.executeUpdate(); 
            
        }catch (SQLException erro){
            
           throw new RuntimeException(erro); 
        }
    }  

   
}
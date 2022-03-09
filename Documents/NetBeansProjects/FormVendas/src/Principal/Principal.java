package Principal;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Tais Oliveira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           try{
            
            Connection con= new JDBC.ConnectionFactory().conecta();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Erro"+e);   
        }  
    }  
}
    


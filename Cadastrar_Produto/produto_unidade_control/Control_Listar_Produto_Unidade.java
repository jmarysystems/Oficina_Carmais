/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produto_unidade_control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author AnaMariana
 */
public class Control_Listar_Produto_Unidade {
    
    public Control_Listar_Produto_Unidade( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    
    private String ip_do_servidor = "";
    
    PreparedStatement pstm;
    ResultSet rs;
    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.UNIDADE WHERE UNIDADE LIKE ?" ;
                
    public List<Bean_Produto_Unidade> listar ( String nome ){
        List<Bean_Produto_Unidade> listarJavaBD = new ArrayList();        
        try {
            
            String nomeDoBanco = "db";
            String url = "jdbc:derby://" + ip_do_servidor + ":1527/";
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Properties prop = new Properties();
                   prop.put( "user", "cleilson" );
                   prop.put( "password", "23071354" );  
                   
                   /**prop.put( "bootPassword", "a@Simple_More_Than_16_Char_Password" );/**/
                   
            Class.forName( driver );        
            Connection con = DriverManager.getConnection( url + nomeDoBanco, prop );
            
            pstm = con.prepareStatement(consultar);
            pstm.setString(1, nome);//SELECT * FROM CLIENTES WHERE NOME LIKE claudio
            rs = pstm.executeQuery();
            Bean_Produto_Unidade Bean_Produto_Unidade;       
            while(rs.next()) {
                Bean_Produto_Unidade = new Bean_Produto_Unidade();                
                
                Bean_Produto_Unidade.setUNIDADE( rs.getString( "UNIDADE") );                 
                
                Bean_Produto_Unidade.setID( rs.getInt( "ID" ) );
                
                listarJavaBD.add( Bean_Produto_Unidade );                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Produtos;

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
 * @author ana
 */
public class Control_OS_Produto_Listar {
    
    public Control_OS_Produto_Listar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
    
    PreparedStatement pstm;
    ResultSet rs;
    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.PRODUTO WHERE NOME LIKE ?" ;
                
    public List<Bean_Produto_OS> listar ( String nome ){
        List<Bean_Produto_OS> listarJavaBD = new ArrayList();        
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
            Bean_Produto_OS Bean_Produto_OS;       
            while(rs.next()) {
                Bean_Produto_OS = new Bean_Produto_OS();                
                
                Bean_Produto_OS.setNOME               ( rs.getString( "NOME")               ); 
                Bean_Produto_OS.setUNIDADETRIBUTARIA  ( rs.getString( "UNIDADETRIBUTARIA")  ); 
                Bean_Produto_OS.setPRECODEVENDA       ( rs.getFloat ( "PRECODEVENDA")       );                 
                
                Bean_Produto_OS.setID                 ( rs.getInt( "ID" ) );
                
                listarJavaBD.add( Bean_Produto_OS );                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\nLogin_Control\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

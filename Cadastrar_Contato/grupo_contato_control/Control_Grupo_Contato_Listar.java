/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo_contato_control;

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
public class Control_Grupo_Contato_Listar {
    
    public Control_Grupo_Contato_Listar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    
    private String ip_do_servidor = "";
    
    PreparedStatement pstm;
    ResultSet rs;
    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.GRUPO WHERE NOME LIKE ?" ;
                
    public List<Bean_Grupo_Contato> listar ( String nome ){
        List<Bean_Grupo_Contato> listarJavaBD = new ArrayList();        
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
            Bean_Grupo_Contato Bean_Grupo_Contato;       
            while(rs.next()) {
                Bean_Grupo_Contato = new Bean_Grupo_Contato();                
                
                Bean_Grupo_Contato.setNOME( rs.getString( "NOME") );                 
                
                Bean_Grupo_Contato.setID( rs.getInt( "ID" ) );
                
                listarJavaBD.add( Bean_Grupo_Contato );                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

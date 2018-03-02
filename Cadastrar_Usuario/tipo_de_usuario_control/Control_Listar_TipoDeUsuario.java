/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo_de_usuario_control;

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
public class Control_Listar_TipoDeUsuario {
    
    public Control_Listar_TipoDeUsuario( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    
    private String ip_do_servidor = "";
    
    PreparedStatement pstm;
    ResultSet rs;
    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.TIPODEUSUARIO WHERE TIPODEUSUARIO LIKE ?" ;
                
    public List<Bean_Tipo_de_Usuario> listar ( String nome ){
        List<Bean_Tipo_de_Usuario> listarJavaBD = new ArrayList();        
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
            Bean_Tipo_de_Usuario Bean_Tipo_de_Usuario;       
            while(rs.next()) {
                Bean_Tipo_de_Usuario = new Bean_Tipo_de_Usuario();                
                
                Bean_Tipo_de_Usuario.setTIPODEUSUARIO( rs.getString( "TIPODEUSUARIO") );                 
                
                Bean_Tipo_de_Usuario.setID( rs.getInt( "ID" ) );
                
                listarJavaBD.add( Bean_Tipo_de_Usuario );                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login_control;

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
public class Login_Control_Listar {
    
    public Login_Control_Listar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    
    private String ip_do_servidor = "";
    
    PreparedStatement pstm;
    ResultSet rs;
    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.USUARIO WHERE NOME LIKE ?" ;
                
    public List<Login_Bean> listar ( String nome ){
        List<Login_Bean> listarJavaBD = new ArrayList();        
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
            Login_Bean Bean_LoginNew;       
            while(rs.next()) {
                Bean_LoginNew = new Login_Bean();                
                
                Bean_LoginNew.setLOGIN( rs.getString( "LOGIN") );  
                Bean_LoginNew.setSENHA( rs.getString( "SENHA") );                
                
                Bean_LoginNew.setID( rs.getInt( "ID" ) );
                
                listarJavaBD.add( Bean_LoginNew );                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\nLogin_Control\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

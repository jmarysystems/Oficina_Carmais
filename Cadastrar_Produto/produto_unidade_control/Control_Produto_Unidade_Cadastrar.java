/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_unidade_control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author ana
 */
public class Control_Produto_Unidade_Cadastrar {
    
    public Control_Produto_Unidade_Cadastrar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
            
    private PreparedStatement pstm;
    private ResultSet rs;   
    
    private final String cadastrar = "INSERT INTO SCHEMAJMARY.UNIDADE ( "
                    //+ "ID          INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    
                    + "UNIDADE      "
                    
                    + ")" 
                    
                    + "VALUES ( ? )"
            ;
    
    public void cadastrar ( Bean_Produto_Unidade Bean ){
        try{
            
            String nomeDoBanco = "db";
            String url = "jdbc:derby://" + ip_do_servidor + ":1527/";
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Properties prop = new Properties();
                   prop.put( "user", "cleilson" );
                   prop.put( "password", "23071354" );  
                   
                   /**prop.put( "bootPassword", "a@Simple_More_Than_16_Char_Password" );/**/
                   
            Class.forName( driver );        
            Connection con = DriverManager.getConnection( url + nomeDoBanco, prop );
            pstm = con.prepareStatement(cadastrar);
            
            pstm.setString ( 1,  Bean.getUNIDADE()                         );                    

            pstm.executeUpdate();
            
        }catch(ClassNotFoundException | SQLException e){ e.printStackTrace();
            JOptionPane.showMessageDialog( null, "Control\"cadastrar\n"+e.getMessage().toString() );
        }
    }
    
}

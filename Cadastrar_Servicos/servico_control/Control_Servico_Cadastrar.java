/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servico_control;

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
public class Control_Servico_Cadastrar {
    
    public Control_Servico_Cadastrar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
            
    private PreparedStatement pstm;
    private ResultSet rs;   
    
    private final String cadastrar = "INSERT INTO SCHEMAJMARY.SERVICO ( "
                    //+ "ID          INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    
                    + "NOME                          ,"
                    + "PRECO                         ,"
                    + "PALAVRASCHAVE                  "
                    
                    + ")" 
                    
                    + "VALUES ( ?, ?, ? )"
            ;
    
    public void cadastrar ( Bean_Servico Bean ){
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
            
            pstm.setString ( 1,  Bean.getNOME()                         );   
            pstm.setFloat  ( 2,  Bean.getPRECO()                        );   
            pstm.setString ( 3,  Bean.getPALAVRASCHAVE()                );                   

            pstm.executeUpdate();
            
        }catch(ClassNotFoundException | SQLException e){ 
            JOptionPane.showMessageDialog( null, "Control\"cadastrar\n"+e.getMessage().toString() );
        }
    }
    
}

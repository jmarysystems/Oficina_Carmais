/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_usuario_logado;

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
public class Home_Control_logado {
    
    public Home_Control_logado( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
            
    private PreparedStatement pstm;
    private ResultSet rs;   

    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.USUARIO WHERE ID = ?" ;
                
    public List<Home_Bean_logado> listar ( int id ){                            
        List<Home_Bean_logado> listarJavaBD = new ArrayList();        
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
            pstm.setInt( 1, id );//SELECT * FROM CLIENTES WHERE NOME LIKE claudio
            rs = pstm.executeQuery();
            Home_Bean_logado Bean_LoginNew;
            while(rs.next()) {
                Bean_LoginNew = new Home_Bean_logado();                
                
                
                Bean_LoginNew.setNOME                        ( rs.getString( "NOME")                         ); 
                Bean_LoginNew.setEMAIL                       ( rs.getString( "EMAIL")                        ); 
                Bean_LoginNew.setPALAVRASCHAVE               ( rs.getString( "PALAVRASCHAVE")                ); 

                Bean_LoginNew.setTIPODEUSUARIO               ( rs.getString( "TIPODEUSUARIO")                ); 
                
                Bean_LoginNew.setCOMISSAOPRODUTO             ( rs.getFloat( "COMISSAOPRODUTO")                 );
                Bean_LoginNew.setCOMISSAOSERVICO             ( rs.getFloat( "COMISSAOSERVICO")                 );

                Bean_LoginNew.setPERMITIRACESSO              ( rs.getBoolean( "PERMITIRACESSO")              ); 
                Bean_LoginNew.setLOGIN                       ( rs.getString( "LOGIN")                        ); 
                Bean_LoginNew.setSENHA                       ( rs.getString( "SENHA")                        );
                
                Bean_LoginNew.setCADASTRARUSUARIO            ( rs.getBoolean( "CADASTRARUSUARIO")            ); 
            
                Bean_LoginNew.setCADASTRARGRUPO              ( rs.getBoolean( "CADASTRARGRUPO")              );
                Bean_LoginNew.setCADASTRARCLIENTE            ( rs.getBoolean( "CADASTRARCLIENTE")            );
                Bean_LoginNew.setCADASTRARFORNECEDOR         ( rs.getBoolean( "CADASTRARFORNECEDOR")         );
                Bean_LoginNew.setCADASTRARTRANSPORTADOR      ( rs.getBoolean( "CADASTRARTRANSPORTADOR")      );
            
                Bean_LoginNew.setCADASTRARSERVICO            ( rs.getBoolean( "CADASTRARSERVICO")            );
                Bean_LoginNew.setCADASTRARCATEGORIA          ( rs.getBoolean( "CADASTRARCATEGORIA")          );
                Bean_LoginNew.setCADASTRARPRODUTO            ( rs.getBoolean( "CADASTRARPRODUTO")            );
            
                Bean_LoginNew.setCADASTRARTIPOSDEDOCUMENTOS  ( rs.getBoolean( "CADASTRARTIPOSDEDOCUMENTOS")  );
                Bean_LoginNew.setCADASTRARFORMADEPAGAMENTO   ( rs.getBoolean( "CADASTRARFORMADEPAGAMENTO")   );
                Bean_LoginNew.setCADASTRARALTERARDEPAGAMENTO ( rs.getBoolean( "CADASTRARALTERARDEPAGAMENTO") );
                
                Bean_LoginNew.setCADASTRAROS                 ( rs.getBoolean( "CADASTRAROS")                 );
 

                                
                Bean_LoginNew.setID( rs.getInt( "ID" ) );
                
                
                listarJavaBD.add( Bean_LoginNew );                
            }
            
        } catch (ClassNotFoundException | SQLException e) { e.printStackTrace();
            JOptionPane.showMessageDialog( null, "Control\"listar\nHome_Control_logado\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

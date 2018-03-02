/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario_control;

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
public class Control_Cadastrar {
    
    public Control_Cadastrar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
            
    private PreparedStatement pstm;
    private ResultSet rs;   
    
    private final String cadastrar = "INSERT INTO SCHEMAJMARY.USUARIO ( "
                    //+ "ID          INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    
                    + "NOME                          ,"
                    + "EMAIL                         ,"
                    + "PALAVRASCHAVE                 ,"
                    
                    + "TIPODEUSUARIO                 ,"
            
                    + "COMISSAOPRODUTO               ,"
                    + "COMISSAOSERVICO               ,"
                    
                    + "PERMITIRACESSO                ,"
                    + "LOGIN                         ,"
                    + "SENHA                         ,"
                                                            
                    + "CADASTRARUSUARIO              ,"     
                    
                    + "CADASTRARGRUPO                ,"
                    + "CADASTRARCLIENTE              ,"                    
                    + "CADASTRARFORNECEDOR           ,"
                    + "CADASTRARTRANSPORTADOR        ," 
                    
                    + "CADASTRARSERVICO              ,"                    
                    + "CADASTRARCATEGORIA            ,"
                    + "CADASTRARPRODUTO              ,"   
                    
                    + "CADASTRARTIPOSDEDOCUMENTOS    ,"  
                    + "CADASTRARFORMADEPAGAMENTO     ,"  
                    + "CADASTRARALTERARDEPAGAMENTO   ,"
                    
                    + "CADASTRAROS                    "
                    
                    + ")" 
                    
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )"
            ;
    
    public void cadastrar ( Bean_Usuario Bean ){
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
            pstm.setString ( 2,  Bean.getEMAIL()                        );   
            pstm.setString ( 3,  Bean.getPALAVRASCHAVE()                ); 
            
            pstm.setString ( 4,  Bean.getTIPODEUSUARIO()                );   
            
            pstm.setFloat  ( 5,  Bean.getCOMISSAOPRODUTO()              ); 
            pstm.setFloat  ( 6,  Bean.getCOMISSAOSERVICO()              ); 
            
            pstm.setBoolean( 7,  Bean.isPERMITIRACESSO()                ); 
            pstm.setString ( 8,  Bean.getLOGIN()                        ); 
            pstm.setString ( 9, Bean.getSENHA()                        ); 
            
            pstm.setBoolean( 10,  Bean.isCADASTRARUSUARIO()             ); 
            
            pstm.setBoolean( 11,  Bean.isCADASTRARGRUPO()               ); 
            pstm.setBoolean( 12,  Bean.isCADASTRARCLIENTE()             ); 
            pstm.setBoolean( 13,  Bean.isCADASTRARFORNECEDOR()          );  
            pstm.setBoolean( 14,  Bean.isCADASTRARTRANSPORTADOR()       );
            
            pstm.setBoolean( 15,  Bean.isCADASTRARSERVICO()             ); 
            pstm.setBoolean( 16,  Bean.isCADASTRARCATEGORIA()           ); 
            pstm.setBoolean( 17,  Bean.isCADASTRARPRODUTO()             ); 
            
            pstm.setBoolean( 18,  Bean.isCADASTRARTIPOSDEDOCUMENTOS()   ); 
            pstm.setBoolean( 19,  Bean.isCADASTRARFORMADEPAGAMENTO()    ); 
            pstm.setBoolean( 20,  Bean.isCADASTRARALTERARDEPAGAMENTO()  );
            
            pstm.setBoolean( 21,  Bean.isCADASTRAROS()                  );                   

            pstm.executeUpdate();
            
        }catch(ClassNotFoundException | SQLException e){ e.printStackTrace();
            JOptionPane.showMessageDialog( null, "Control\"cadastrar\nHome_Control_logado\nControl_Cadastrar\n"+e.getMessage().toString() );
        }
    }
    
}

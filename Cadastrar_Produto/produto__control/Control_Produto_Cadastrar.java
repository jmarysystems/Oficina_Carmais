/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto__control;

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
public class Control_Produto_Cadastrar {
    
    public Control_Produto_Cadastrar( String ip_do_servidor2 ) { 

        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
            
    private PreparedStatement pstm;
    private ResultSet rs;   
    
    private String cadastrar(){   
               String cadastrar = "INSERT INTO SCHEMAJMARY.PRODUTO("
                    //+ "ID          INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    
                    + "NOME                               ,"
                    + "CATEGORIA                          ,"
                    + "CODIGOPERSONALIZADO                ,"
                    + "UNIDADETRIBUTARIA                  ,"
                    
                    + "MARGEMDELUCRO                      ,"
                    + "PRECODECUSTO                       ,"
                    + "PRECODEVENDA                       ,"
                    + "VALORDELUCRO                       ,"
                    
                    + "CODIGODEBARRAS                     ,"
                    + "LOCALIZACAOINTERNA                 ,"
                    + "INFORMACOESADICIONAISPARANFE       ,"
                    
                    + "REFERENCIAEANGTIN                  ,"
                    + "NCM                                ,"
                    + "EXCECAOTABELAIPI                   ,"
                    + "ANOTACOESINTERNAS                  ,"
                    
                    + "CONTROLARESTOQUE                   ,"
                    + "VENDERCOMESTOQUENEGATIVO           ,"
                    + "ESTOQUEMINIMO                      ,"
                    + "PALAVRASCHAVE                       "
                    
                    + ")" 
                    
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                    + "         ?, ?, ?, ?, ?                            "     
            
                    + ")"
            ;
               
            return cadastrar;    
    }
    
    public void cadastrar ( Bean_Produto Bean ){
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
            pstm = con.prepareStatement(cadastrar());
            
            pstm.setString ( 1,   Bean.getNOME()                               );
            pstm.setString ( 2,   Bean.getCATEGORIA()                          );
            pstm.setString ( 3,   Bean.getCODIGOPERSONALIZADO()                );       
            pstm.setString ( 4,   Bean.getUNIDADETRIBUTARIA()                  );
                    
            pstm.setFloat  ( 5,   Bean.getMARGEMDELUCRO()                      );
            pstm.setFloat  ( 6,   Bean.getPRECODECUSTO()                       );
            pstm.setFloat  ( 7,   Bean.getPRECODEVENDA()                       );
            pstm.setString ( 8,   Bean.getVALORDELUCRO()                       );
                    
            pstm.setString ( 9,   Bean.getCODIGODEBARRAS()                     );
            pstm.setString ( 10,  Bean.getLOCALIZACAOINTERNA()                 );
            pstm.setString ( 11,  Bean.getINFORMACOESADICIONAISPARANFE()       );
            
            pstm.setString ( 12,  Bean.getREFERENCIAEANGTIN ()                 );                    
            pstm.setString ( 13,  Bean.getNCM()                                );
            pstm.setString ( 14,  Bean.getEXCECAOTABELAIPI()                    );
            pstm.setString ( 15,  Bean.getANOTACOESINTERNAS()                   );
            
            pstm.setBoolean( 16,  Bean.isCONTROLARESTOQUE()                    );                    
            pstm.setBoolean( 17,  Bean.isVENDERCOMESTOQUENEGATIVO()            );
            pstm.setInt    ( 18,  Bean.getESTOQUEMINIMO()                      );
            pstm.setString ( 19,  Bean.getPALAVRASCHAVE()                      );

            pstm.executeUpdate();
            
        }catch(ClassNotFoundException | SQLException e){ 
            JOptionPane.showMessageDialog( null, "Control\"cadastrar\n"+e.getMessage().toString() );
        }
    }
    
}

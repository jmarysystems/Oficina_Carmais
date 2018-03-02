/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_control;

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
public class Control_Formas_de_Pagamento_Cadastrar {
    
    public Control_Formas_de_Pagamento_Cadastrar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
            
    private PreparedStatement pstm;
    private ResultSet rs;   
    
    private final String cadastrar = "INSERT INTO SCHEMAJMARY.FORMASDEPAGAMENTO ( "
                    //+ "ID          INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    
                    + "NOME                                     ,"
                    + "PARCELAMENTOMAXIMO                       ,"
                    + "PARCELASSEMJUROS                         ,"
                    
                    + "JUROSPORCENTAGEM                         ,"
                    + "TAXAFIXA                                 ,"
                    + "DESCONTOAVISTAPORCENTAGEM                ,"
                    
                    + "CONTADEDESTINOPADRAOID                   ,"
                    
                    + "TIPODEDOCUMENTOPADRAOID                  ,"
                    
                    + "INTERVALOPADRAOENTREASPARCELAS           ,"
                    + "INTERVALOPADRAOENTREASPARCELASDIAOUMES    "    
                    
                    + ")" 
                    
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )"
            ;
    
    public void cadastrar ( Bean_Forma_de_Pagamento Bean ){
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
            
            pstm.setString ( 1,  Bean.getNOME()                                      ); 
            pstm.setString ( 2,  Bean.getPARCELAMENTOMAXIMO()                        ); 
            pstm.setString ( 3,  Bean.getPARCELASSEMJUROS()                          ); 
                    
            pstm.setFloat  ( 4,  Bean.getJUROSPORCENTAGEM()                          ); 
            pstm.setFloat  ( 5,  Bean.getTAXAFIXA()                                  ); 
            pstm.setFloat  ( 6,  Bean.getDESCONTOAVISTAPORCENTAGEM()                 ); 
                    
            pstm.setInt    ( 7,  Bean.getCONTADEDESTINOPADRAOID()                    );  
                    
            pstm.setInt    ( 8,  Bean.getTIPODEDOCUMENTOPADRAOID()                   ); 
                    
            pstm.setInt    ( 9,  Bean.getINTERVALOPADRAOENTREASPARCELAS()            ); 
            pstm.setString ( 10, Bean.getINTERVALOPADRAOENTREASPARCELASDIAOUMES()    ); 

            pstm.executeUpdate();
            
        }catch(ClassNotFoundException | SQLException e){ 
            JOptionPane.showMessageDialog( null, "Control\"cadastrar\n"+e.getMessage().toString() );
        }
    }
    
}
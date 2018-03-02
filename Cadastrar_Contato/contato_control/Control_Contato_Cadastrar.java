/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contato_control;

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
public class Control_Contato_Cadastrar {
    
    public Control_Contato_Cadastrar( String ip_do_servidor2, String TIPODECONTATO2 ) { 
        
        TIPODECONTATO = TIPODECONTATO2;
        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
    String TIPODECONTATO = "";
            
    private PreparedStatement pstm;
    private ResultSet rs;   
    
    private String cadastrar(){   
               String cadastrar = "INSERT INTO SCHEMAJMARY." + TIPODECONTATO + "("
                    //+ "ID          INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    
                    + "PESSOAFISICA               ,"
                    + "PESSOAJURIDICA             ,"
                    + "GRUPO                      ,"       
                    + "ANOTACOESGERAIS            ,"
                    
                    + "NOMEOURAZAOSOCIAL          ,"
                    + "NOMEFANTASIA               ,"
                    + "CPFOUCNPJ                  ,"
                    + "NOMEDORESPONSAVEL          ,"
                    
                    + "INSCRICAOESTADUAL          ,"
                    + "INSCRICAOESTSUBSTTRIB      ,"
                    + "INSCRICAOMUNICIPAL         ,"
                    + "INSCRICAOSUFRAMA           ,"
                    
                    + "CEP                        ,"
                    + "ENDERECO                   ,"
                    + "NUMERO                     ,"
                    + "COMPLEMENTO                ,"
                    
                    + "BAIRRO                     ,"
                    + "ESTADO                     ,"
                    + "CIDADE                     ,"
                    + "PAIS                       ,"
                    
                    + "TELEFONE                   ,"
                    + "FONE2                      ,"
                    + "FONE3                      ,"
                    + "DATADENASCIMENTO           ,"
                    
                    + "EMAIL                      ,"
                    + "OUTROEMAIL                 ,"
                    + "PALAVRASCHAVE              ,"
                    + "FACEBOOK                    "
                    
                    + ")" 
                    
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                    + "         ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? "     
            
                    + ")"
            ;
               
            return cadastrar;    
    }
    
    public void cadastrar ( Bean_Contato Bean ){
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
            pstm = con.prepareStatement( cadastrar(), PreparedStatement.RETURN_GENERATED_KEYS );
            
            pstm.setBoolean( 1,   Bean.isPESSOAFISICA()                  );
            pstm.setBoolean( 2,   Bean.isPESSOAJURIDICA()                );
            pstm.setString ( 3,   Bean.getGRUPO()                       );       
            pstm.setString ( 4,   Bean.getANOTACOESGERAIS()             );
                    
            pstm.setString ( 5,   Bean.getNOMEOURAZAOSOCIAL()           );
            pstm.setString ( 6,   Bean.getNOMEFANTASIA()                );
            pstm.setString ( 7,   Bean.getCPFOUCNPJ()                   );
            pstm.setString ( 8,   Bean.getNOMEDORESPONSAVEL()           );
                    
            pstm.setString ( 9,   Bean.getINSCRICAOESTADUAL()           );
            pstm.setString ( 10,  Bean.getINSCRICAOESTSUBSTTRIB()       );
            pstm.setString ( 11,  Bean.getINSCRICAOMUNICIPAL()          );
            pstm.setString ( 12,  Bean.getINSCRICAOSUFRAMA()            );
                    
            pstm.setString ( 13,  Bean.getCEP()                         );
            pstm.setString ( 14,  Bean.getENDERECO()                    );
            pstm.setInt    ( 15,  Bean.getNUMERO()                      );
            pstm.setString ( 16,  Bean.getCOMPLEMENTO()                 );
                    
            pstm.setString ( 17,  Bean.getBAIRRO()                      );
            pstm.setString ( 18,  Bean.getESTADO()                      );
            pstm.setString ( 19,  Bean.getCIDADE()                      );
            pstm.setString ( 20,  Bean.getPAIS()                        );
                    
            pstm.setString ( 21,  Bean.getTELEFONE()                    );
            pstm.setString ( 22,  Bean.getFONE2()                       );
            pstm.setString ( 23,  Bean.getFONE3()                       );
            pstm.setString ( 24,  Bean.getDATADENASCIMENTO()            );
                    
            pstm.setString ( 25,  Bean.getEMAIL()                       );
            pstm.setString ( 26,  Bean.getOUTROEMAIL()                  );
            pstm.setString ( 27,  Bean.getPALAVRASCHAVE()               );
            pstm.setString ( 28,  Bean.getFACEBOOK()                    );

            pstm.executeUpdate();
                          
            aposCadastrar( pstm );
        }catch(ClassNotFoundException | SQLException e){ 
            JOptionPane.showMessageDialog( null, "Control\"cadastrar\n"+e.getMessage().toString() );
        }
    }
    
    private void aposCadastrar( PreparedStatement ps ){
        try{
            
            /************************************************************/
            rs = ps.getGeneratedKeys(); 
            int novoRegistro = 0; 
            while(rs.next()){
                novoRegistro = rs.getInt(1);
            }
            System.out.println( "contato control cadastrar ***************************"+novoRegistro );
            /************************************************************/
            
        }catch(Exception e){ 
            JOptionPane.showMessageDialog( null, "Control\"após cadastrar\n"+e.getMessage().toString() );
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente_Control;

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
public class Control_Contato_Pelo_Nome_Listar {
    
    public Control_Contato_Pelo_Nome_Listar( String ip_do_servidor2, String TIPODECONTATO2 ) { 
        
        TIPODECONTATO = TIPODECONTATO2;
        ip_do_servidor = ip_do_servidor2; 
    }    
    private String ip_do_servidor = "";
    String TIPODECONTATO = "";
            
    private PreparedStatement pstm;
    private ResultSet rs;  
    
    public final String consultar =
            "SELECT * FROM SCHEMAJMARY.CLIENTE WHERE NOMEOURAZAOSOCIAL LIKE ?" ;
                
    public List<Bean_Contato> listar ( String nome ){
        List<Bean_Contato> listarJavaBD = new ArrayList();        
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
            Bean_Contato Bean_Contato;       
            while(rs.next()) {
                Bean_Contato = new Bean_Contato();    
                
                
                Bean_Contato.setPESSOAFISICA          ( rs.getBoolean("PESSOAFISICA")             );
                Bean_Contato.setPESSOAJURIDICA        ( rs.getBoolean( "PESSOAJURIDICA" )         );
                Bean_Contato.setGRUPO                 ( rs.getString( "GRUPO" )                   );       
                Bean_Contato.setANOTACOESGERAIS       ( rs.getString( "ANOTACOESGERAIS" )         );
                    
                Bean_Contato.setNOMEOURAZAOSOCIAL     ( rs.getString( "NOMEOURAZAOSOCIAL" )       );
                Bean_Contato.setNOMEFANTASIA          ( rs.getString( "NOMEFANTASIA" )            );
                Bean_Contato.setCPFOUCNPJ             ( rs.getString( "CPFOUCNPJ" )               );
                Bean_Contato.setNOMEDORESPONSAVEL     ( rs.getString( "NOMEDORESPONSAVEL" )       );
                    
                Bean_Contato.setINSCRICAOESTADUAL     ( rs.getString( "INSCRICAOESTADUAL" )       );
                Bean_Contato.setINSCRICAOESTSUBSTTRIB ( rs.getString( "INSCRICAOESTSUBSTTRIB" )   );
                Bean_Contato.setINSCRICAOMUNICIPAL    ( rs.getString( "INSCRICAOMUNICIPAL" )      );
                Bean_Contato.setINSCRICAOSUFRAMA      ( rs.getString( "INSCRICAOSUFRAMA" )        );
                    
                Bean_Contato.setCEP                   ( rs.getString( "CEP" )                     );
                Bean_Contato.setENDERECO              ( rs.getString( "ENDERECO" )                );
                Bean_Contato.setNUMERO                ( rs.getInt   ( "NUMERO" )                  );
                Bean_Contato.setCOMPLEMENTO           ( rs.getString( "COMPLEMENTO" )             );
                    
                Bean_Contato.setBAIRRO                ( rs.getString( "BAIRRO" )                  );
                Bean_Contato.setESTADO                ( rs.getString( "ESTADO" )                  );
                Bean_Contato.setCIDADE                ( rs.getString( "CIDADE" )                  );
                Bean_Contato.setPAIS                  ( rs.getString( "PAIS" )                    );
                     
                Bean_Contato.setTELEFONE              ( rs.getString( "TELEFONE" )                );
                Bean_Contato.setFONE2                 ( rs.getString( "FONE2" )                   );
                Bean_Contato.setFONE3                 ( rs.getString( "FONE3" )                   );
                Bean_Contato.setDATADENASCIMENTO      ( rs.getString( "DATADENASCIMENTO" )        );
                    
                Bean_Contato.setEMAIL                 ( rs.getString( "EMAIL" )                   );
                Bean_Contato.setOUTROEMAIL            ( rs.getString( "OUTROEMAIL" )              );
                Bean_Contato.setPALAVRASCHAVE         ( rs.getString( "PALAVRASCHAVE" )           );
                Bean_Contato.setFACEBOOK              ( rs.getString( "FACEBOOK" )                );
                
                Bean_Contato.setID                    ( rs.getInt   ( "ID" )                      );
                  
                
                
                listarJavaBD.add( Bean_Contato );                
            }
            
        } catch (ClassNotFoundException | SQLException e) { e.printStackTrace();
            JOptionPane.showMessageDialog( null, "Control\"listar\nLogin_Control\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

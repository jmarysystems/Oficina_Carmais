/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package definicao_forma_pgto_Setar_CB_Forma_Pgto;

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
public class Forma_de_Pagamento_Control_Listar {
    
    public Forma_de_Pagamento_Control_Listar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    
    private String ip_do_servidor = "";
    
    PreparedStatement pstm;
    ResultSet rs;
    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.FORMASDEPAGAMENTO WHERE NOME LIKE ?" ;
                
    public List<Bean_OS_Forma_de_Pgto> listar ( String nome ){
        List<Bean_OS_Forma_de_Pgto> listarJavaBD = new ArrayList();        
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
            Bean_OS_Forma_de_Pgto Bean_OS_Forma_de_Pgto;       
            while(rs.next()) {
                Bean_OS_Forma_de_Pgto = new Bean_OS_Forma_de_Pgto();                
                
                Bean_OS_Forma_de_Pgto.setNOME                                   ( rs.getString( "NOME" ) );
                Bean_OS_Forma_de_Pgto.setPARCELAMENTOMAXIMO                     ( rs.getString( "PARCELAMENTOMAXIMO" ) ); 
                Bean_OS_Forma_de_Pgto.setPARCELASSEMJUROS                       ( rs.getString( "PARCELASSEMJUROS" ) ); 
                    
                Bean_OS_Forma_de_Pgto.setJUROSPORCENTAGEM                       ( rs.getFloat ( "JUROSPORCENTAGEM" ) ); 
                Bean_OS_Forma_de_Pgto.setTAXAFIXA                               ( rs.getFloat ( "TAXAFIXA" ) );
                Bean_OS_Forma_de_Pgto.setDESCONTOAVISTAPORCENTAGEM              ( rs.getFloat ( "DESCONTOAVISTAPORCENTAGEM" ) ); 
                    
                Bean_OS_Forma_de_Pgto.setCONTADEDESTINOPADRAOID                 ( rs.getInt   ( "CONTADEDESTINOPADRAOID" ) );  
                    
                Bean_OS_Forma_de_Pgto.setTIPODEDOCUMENTOPADRAOID                ( rs.getInt   ( "TIPODEDOCUMENTOPADRAOID" ) );
                    
                Bean_OS_Forma_de_Pgto.setINTERVALOPADRAOENTREASPARCELAS         ( rs.getInt   ( "INTERVALOPADRAOENTREASPARCELAS" ) );
                Bean_OS_Forma_de_Pgto.setINTERVALOPADRAOENTREASPARCELASDIAOUMES ( rs.getString( "INTERVALOPADRAOENTREASPARCELASDIAOUMES" ) );
                
                Bean_OS_Forma_de_Pgto.setID( rs.getInt( "ID" ) );
                
                listarJavaBD.add( Bean_OS_Forma_de_Pgto );                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\nOS_Forma_de_Pagamento_Control_Listar\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

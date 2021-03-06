/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formas_de_pagamento_Setar_CB_conta_de_destino;

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
public class Conta_Destino_Control_Listar {
    
    public Conta_Destino_Control_Listar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    
    private String ip_do_servidor = "";
    
    PreparedStatement pstm;
    ResultSet rs;
    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.CONTASDISPONIVEIS WHERE APELIDOCURTO LIKE ?" ;
                
    public List<Bean_Contas_Disponiveis_Forma_de_Pagamento> listar ( String nome ){
        List<Bean_Contas_Disponiveis_Forma_de_Pagamento> listarJavaBD = new ArrayList();        
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
            Bean_Contas_Disponiveis_Forma_de_Pagamento Bean_Contas_Disponiveis_Forma_de_Pagamento;       
            while(rs.next()) {
                Bean_Contas_Disponiveis_Forma_de_Pagamento = new Bean_Contas_Disponiveis_Forma_de_Pagamento();                
                
                Bean_Contas_Disponiveis_Forma_de_Pagamento.setAPELIDOCURTO         ( rs.getString( "APELIDOCURTO")          ); 
                Bean_Contas_Disponiveis_Forma_de_Pagamento.setNOMEDESCRICAODACONTA ( rs.getString( "NOMEDESCRICAODACONTA")  ); 
                
                Bean_Contas_Disponiveis_Forma_de_Pagamento.setID( rs.getInt( "ID" ) );
                
                listarJavaBD.add( Bean_Contas_Disponiveis_Forma_de_Pagamento );                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\nConta_Destino_Control_Listar\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formas_de_pagamento_Setar_CB_tipo_de_documento;

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
public class TipoDoc_Forma_Pgto_Control_Listar {
    
    public TipoDoc_Forma_Pgto_Control_Listar( String ip_do_servidor2 ) { 
        
        ip_do_servidor = ip_do_servidor2; 
    }    
    
    private String ip_do_servidor = "";
    
    PreparedStatement pstm;
    ResultSet rs;
    
    public static final String consultar =
            "SELECT * FROM SCHEMAJMARY.TIPODEDOCUMENTO WHERE NOME LIKE ?" ;
                
    public List<Bean_TipoDeDoc_FormaPgto> listar ( String nome ){
        List<Bean_TipoDeDoc_FormaPgto> listarJavaBD = new ArrayList();        
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
            Bean_TipoDeDoc_FormaPgto Bean_TipoDeDoc_FormaPgto;       
            while(rs.next()) {
                Bean_TipoDeDoc_FormaPgto = new Bean_TipoDeDoc_FormaPgto();                
                
                Bean_TipoDeDoc_FormaPgto.setNOME         ( rs.getString( "NOME")          ); 
                Bean_TipoDeDoc_FormaPgto.setTIPODECUSTO  ( rs.getString( "TIPODECUSTO")   ); 
                Bean_TipoDeDoc_FormaPgto.setVALORDECUSTO ( rs.getFloat ( "VALORDECUSTO")  );
                
                
                Bean_TipoDeDoc_FormaPgto.setID( rs.getInt( "ID" ) );
                
                listarJavaBD.add( Bean_TipoDeDoc_FormaPgto );                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\nTipoDoc_Forma_Pgto_Control_Listar\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

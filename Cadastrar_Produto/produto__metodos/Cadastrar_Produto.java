/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto__metodos;

import home.Home;
import produto_.Produto;
import produto__control.Bean_Produto;
import produto__control.Control_Produto_Cadastrar;
import utilidades.RetornarNumeroFloat;
import utilidades.RetornarNumeroInteiro;
import utilidades.RetornarStringDoComboBox;

/**
 *
 * @author CARMAL
 */
public class Cadastrar_Produto {
    
    Produto Produto;
    Home Home;
    
    public Cadastrar_Produto( Home Home2, Produto Produto2 ){
        Produto = Produto2;
        Home = Home2;
        
        cadastrar_Produto( getBean() );
        limparCampos();       
    }
    
    private void cadastrar_Produto( Bean_Produto Bean ){
        
        Control_Produto_Cadastrar Control = new Control_Produto_Cadastrar( Home.ip );
        Control.cadastrar( Bean );     
        
    }
    
    private Bean_Produto getBean(){
        Bean_Produto Bean = new Bean_Produto();
        
        //ID                               ;
            
        Bean.setNOME                         ( Produto.tfNOME.getText().trim()                                                      );     
        Bean.setCATEGORIA                    ( RetornarStringDoComboBox.getString( Produto.cbCATEGORIA, "Categoria", true )         );      
        Bean.setCODIGOPERSONALIZADO          ( Produto.tfCODIGOPERSONALIZADO.getText().trim()                                       );      
        Bean.setUNIDADETRIBUTARIA            ( RetornarStringDoComboBox.getString( Produto.cbUNIDADETRIBUTARIA, "Unidade tributada", true )   );              
                    
        Bean.setMARGEMDELUCRO                ( RetornarNumeroFloat.floatTF( 
            Produto.tfMARGEMDELUCRO, Produto.tfMARGEMDELUCRO.getText().trim(), "Margem de lucro", true )                            );            
        Bean.setPRECODECUSTO                 ( RetornarNumeroFloat.floatTF( 
            Produto.tfPRECODECUSTO, Produto.tfPRECODECUSTO.getText().trim(), "Preço de custo", true )        );               
        Bean.setPRECODEVENDA                 ( RetornarNumeroFloat.floatTF( 
            Produto.tfPRECODEVENDA, Produto.tfPRECODEVENDA.getText().trim(), "Preço de venda", true )        );  
        Bean.setVALORDELUCRO                 ( Produto.tfVALORDELUCRO.getText().trim()                       );
        
        Bean.setCODIGODEBARRAS               ( Produto.tfCODIGODEBARRAS.getText().trim()                     ); 
        Bean.setLOCALIZACAOINTERNA           ( Produto.tfLOCALIZACAOINTERNA.getText().trim()                 );  
        Bean.setINFORMACOESADICIONAISPARANFE ( Produto.tfINFORMACOESADICIONAISPARANFE.getText().trim()                         );   
                    
        Bean.setREFERENCIAEANGTIN            ( Produto.tfREFERENCIAEANGTIN.getText().trim()                  );                
        Bean.setNCM                          ( Produto.tfNCM.getText().trim()                                );                
        Bean.setEXCECAOTABELAIPI             ( Produto.tfEXCECAOTABELAIPI.getText().trim()                   );             
        Bean.setANOTACOESINTERNAS            ( Produto.taANOTACOESINTERNAS.getText().trim()                  );         
                    
        Bean.setCONTROLARESTOQUE             ( Produto.cbCONTROLARESTOQUE.isSelected()                       );
        Bean.setVENDERCOMESTOQUENEGATIVO     ( Produto.cbVENDERCOMESTOQUENEGATIVO.isSelected()               );
        Bean.setESTOQUEMINIMO                ( RetornarNumeroInteiro.intTF(
            Produto.tfESTOQUEMINIMO, Produto.tfESTOQUEMINIMO.getText().trim(), "Estoque mínimo", true )      ); 
        Bean.setPALAVRASCHAVE                ( Produto.tfPALAVRASCHAVE.getText().trim()                      );
        
        return Bean;
    }
    
    private void limparCampos(){
        
        Produto.tfNOME                           .setText("");   
        //Produto.cbCATEGORIA                    .setText("");    
        Produto.tfCODIGOPERSONALIZADO            .setText("");      
        //Produto.cbUNIDADETRIBUTARIA            .setText("");          
                    
        Produto.tfPRECODECUSTO                   .setText("");        
        Produto.tfMARGEMDELUCRO                  .setText("");                 
        Produto.tfPRECODEVENDA                   .setText("");
        Produto.tfVALORDELUCRO                   .setText("");
        
        Produto.tfCODIGODEBARRAS                 .setText(""); 
        Produto.tfLOCALIZACAOINTERNA             .setText("");
        Produto.tfINFORMACOESADICIONAISPARANFE   .setText("");  
                    
        Produto.tfREFERENCIAEANGTIN              .setText("");               
        Produto.tfNCM                            .setText("");             
        Produto.tfEXCECAOTABELAIPI               .setText("");        
        Produto.taANOTACOESINTERNAS              .setText("");         
                    
        Produto.cbCONTROLARESTOQUE        .setSelected(false);
        Produto.cbVENDERCOMESTOQUENEGATIVO.setSelected(false);
        Produto.tfESTOQUEMINIMO                  .setText(""); 
        Produto.tfPALAVRASCHAVE                  .setText("");
       
    }
    
}

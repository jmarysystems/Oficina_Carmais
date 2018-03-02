/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_parcelas_adicionar;

import definicao_forma_pgto_parcelas.Setar_CB_Tipo_de_Documento_Parcelas;
import definicao_forma_pgto_parcelas.Setar_CB_Conta_Destino_Parcelas;
import definicao_forma_pgto_parcelas.Preenchimento_Lista_Parcelas;
import OS.OS;
import home.Home;
import java.text.SimpleDateFormat;
import java.util.Date;
import utilidades.Float_Para_Moeda;

/**
 *
 * @author ana
 */
public class Get_Preenchimento_Lista_Parcelas_Setado {

    public Preenchimento_Lista_Parcelas jpLista( OS OS2, Home Home2, String TIPODEVALOR2, float VALOR2, 
            Date   DATADOPAGAMENTO2,  int    CONTADEDESTINO2, 
            int    TIPODEDOCUMENTO2, String NUMERODODOCUMENTO2, float  CUSTOINTERNO2 ) { 
          
        
        Preenchimento_Lista_Parcelas Preenchimento_Lista_Parcelas = new Preenchimento_Lista_Parcelas( OS2, Home2,
                TIPODEVALOR2, VALOR2, DATADOPAGAMENTO2, CONTADEDESTINO2, TIPODEDOCUMENTO2, NUMERODODOCUMENTO2, CUSTOINTERNO2 
        );
        
        Preenchimento_Lista_Parcelas.setSize( 802, 19 );
        //jp2.setBackground(new java.awt.Color( 255, 255, 255 ) );
        Preenchimento_Lista_Parcelas.setPreferredSize(new java.awt.Dimension( 802, 33 ) );
        Preenchimento_Lista_Parcelas.setVisible(true);
        
        
        Preenchimento_Lista_Parcelas.tfVALOR              .setText( String.valueOf( VALOR2 )           ); 
        
        SimpleDateFormat out = new SimpleDateFormat               ("dd/MM/yyyy");
        Preenchimento_Lista_Parcelas.tfDATADOPAGAMENTO    .setText( String.valueOf( out.format( DATADOPAGAMENTO2 ) ) );                                  
    
        Setar_CB_Conta_Destino_Parcelas     Setar_CB_Conta_Destino     = new Setar_CB_Conta_Destino_Parcelas( OS2, Home2, Preenchimento_Lista_Parcelas );                   
        Setar_CB_Tipo_de_Documento_Parcelas Setar_CB_Tipo_de_Documento = new Setar_CB_Tipo_de_Documento_Parcelas( OS2, Home2, Preenchimento_Lista_Parcelas );   
    
        Preenchimento_Lista_Parcelas.tfNUMERODODOCUMENTO  .setText( NUMERODODOCUMENTO2                 );  
        
        Float_Para_Moeda.inicioJTextField( Preenchimento_Lista_Parcelas.tfCUSTOINTERNO, CUSTOINTERNO2, true ); 
              
        return Preenchimento_Lista_Parcelas;
    }
    
}

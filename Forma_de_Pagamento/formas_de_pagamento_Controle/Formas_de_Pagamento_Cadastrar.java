/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_Controle;

import formas_de_pagamento.Formas_de_Pagamento_Home;
import formas_de_pagamento_Setar_CB_conta_de_destino.BookInfoContaDeDestino;
import formas_de_pagamento_Setar_CB_tipo_de_documento.BookInfoTipoDeDoc_FormaPgto;
import formas_de_pagamento_control.Bean_Forma_de_Pagamento;
import formas_de_pagamento_control.Control_Formas_de_Pagamento_Cadastrar;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Formas_de_Pagamento_Cadastrar {
    
    Home Home;
    Formas_de_Pagamento_Home Formas_de_Pagamento_Home;
    
    public Formas_de_Pagamento_Cadastrar( Home Home2, Formas_de_Pagamento_Home Formas_de_Pagamento_Home2 ) {
        
        Home = Home2;
        Formas_de_Pagamento_Home = Formas_de_Pagamento_Home2;
        
        inicio();
    }
            
    boolean um1 = false;
    private void inicio(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um1 == false ) {     um1 = true;
                    try { Thread.sleep(1); 
                    
                        iniciar();
                                
                    }catch(Exception e) {
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Formas_de_Pagamento_Cadastrar, "
                                 + "\ninicio()"
                                 + "\n"+ e.getMessage()
                                 + "\n", "inicio()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um1 = false;
    }
    
    private void iniciar(){
        
        cadastrar( getBean() );                            
    }    
    
    private void cadastrar( Bean_Forma_de_Pagamento Bean ){
        
        Control_Formas_de_Pagamento_Cadastrar Control = new Control_Formas_de_Pagamento_Cadastrar( Home.ip );
        Control.cadastrar( Bean );
    }
    
    private Bean_Forma_de_Pagamento getBean(){
        Bean_Forma_de_Pagamento Bean = new Bean_Forma_de_Pagamento();
        
        //ID                          
                    
        Bean.setNOME                                  ( Formas_de_Pagamento_Home.Formas_de_Pagamento.tfNome.getText().trim()    );   
        Bean.setPARCELAMENTOMAXIMO                    ( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.getSelectedItem().toString().trim() );
        Bean.setPARCELASSEMJUROS                      ( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros  .getSelectedItem().toString().trim() );
                    
        Bean.setJUROSPORCENTAGEM                      ( Float.parseFloat( Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros            .getText().trim() )   );  
        Bean.setTAXAFIXA                              ( Float.parseFloat( Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa         .getText().trim() )   );  
        Bean.setDESCONTOAVISTAPORCENTAGEM             ( Float.parseFloat( Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista   .getText().trim() )   );  
                    
        Bean.setCONTADEDESTINOPADRAOID                ( getCBContaDeDestinoPadrao()  );
                
        Bean.setTIPODEDOCUMENTOPADRAOID               ( getCBTipoDeDocumentoPadrao() );
                    
        Bean.setINTERVALOPADRAOENTREASPARCELAS        ( Integer.parseInt( Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas.getText().trim()  ) ); 
        Bean.setINTERVALOPADRAOENTREASPARCELASDIAOUMES( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbIntervaloPadraoEntreAsParcelas.getSelectedItem().toString().trim() );
        
        return Bean;
   
    }
    
    private int getCBContaDeDestinoPadrao() {     
        int retorno = 0;        
        
        try{
            
            if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao.getSelectedItem() != null ) {
                
                BookInfoContaDeDestino obj = (BookInfoContaDeDestino) Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao.getSelectedItem();
                
                retorno = obj.ID;
            }
        }catch(Exception e) {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Formas_de_Pagamento_Cadastrar, "
                    + "\ngetCBContaDeDestinoPadrao()"
                    + e.getMessage()
                    + "\n", "getCBContaDeDestinoPadrao()" );
        }
        
        return retorno;
    } 
    
    private int getCBTipoDeDocumentoPadrao() {     
        int retorno = 0;        
        
        try{
            
            if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao.getSelectedItem() != null ) {
                
                BookInfoTipoDeDoc_FormaPgto obj = (BookInfoTipoDeDoc_FormaPgto) Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao.getSelectedItem();
                
                retorno = obj.ID;
            }
        }catch(Exception e) {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Formas_de_Pagamento_Cadastrar, "
                    + "\ngetCBTipoDeDocumentoPadrao()"
                    + e.getMessage()
                    + "\n", "getCBTipoDeDocumentoPadrao()" );
        }
        
        return retorno;
    } 
   
}

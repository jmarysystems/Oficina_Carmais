/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_Controle;

import formas_de_pagamento.Formas_de_Pagamento_Home;
import home.Home;

/**
 *
 * @author ana
 */
public class Formas_de_Pagamento_Limpar_Campos_Apos_Salvar {
    
    Home Home;
    Formas_de_Pagamento_Home Formas_de_Pagamento_Home;
    
    public Formas_de_Pagamento_Limpar_Campos_Apos_Salvar( Home Home2, Formas_de_Pagamento_Home Formas_de_Pagamento_Home2 ) {
        
        Home = Home2;
        Formas_de_Pagamento_Home = Formas_de_Pagamento_Home2;
        
        inicio();
    }
            
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        limpar();
                        
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void limpar(){
        try { 
                    
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfNome                               .setText( ""  );
            //Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo               .setText( ""  );
            //Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros                 .setText( ""  );
            
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros                              .setText( ""  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa                           .setText( ""  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista                     .setText( ""  );
            
            //Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao             .setText( ""  );
            //Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao            .setText( ""  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas     .setText( ""  );
            //Formas_de_Pagamento_Home.Formas_de_Pagamento.cbIntervaloPadraoEntreAsParcelas   .setText( ""  );

        }catch(Exception e) { }
    }
            
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_Estado_dos_TFs_CBs;

import formas_de_pagamento.Formas_de_Pagamento_Home;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Formas_de_Pagamento_TFs_CBs_Botao_Novo_Pressionado {
    
    Home Home;
    Formas_de_Pagamento_Home Formas_de_Pagamento_Home;
    
    public Formas_de_Pagamento_TFs_CBs_Botao_Novo_Pressionado( Home Home2, Formas_de_Pagamento_Home Formas_de_Pagamento_Home2 ) {
        
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
                    
                        tfs_CBs      ( true );
                        
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "OS_Botao_Novo_Pressionado, "
                                + "\ninicio()\n"
                                + e.getMessage()
                                + "\n", "inicio()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void tfs_CBs( boolean b ){
        try { 
                    
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfNome                             .setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo               .setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros                 .setEnabled( b  );
            
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros                            .setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa                         .setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista                   .setEnabled( b  );
            
            Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao             .setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao            .setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas   .setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.cbIntervaloPadraoEntreAsParcelas   .setEnabled( b  );

        }catch(Exception e) { }
    }
       
}

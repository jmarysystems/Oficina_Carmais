/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_Estado_dos_Botoes;

import formas_de_pagamento.Formas_de_Pagamento_Home;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Formas_de_Pagamento_Botao_Novo_Pressionado {
    
    Home Home;
    Formas_de_Pagamento_Home Formas_de_Pagamento_Home;
    
    public Formas_de_Pagamento_Botao_Novo_Pressionado( Home Home2, Formas_de_Pagamento_Home Formas_de_Pagamento_Home2 ) {
        
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
                    
                        botoes      ( true );
                        
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
    
    private void botoes( boolean b ){
        try { 
            
            Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes.btNovo     .setEnabled( !b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes.btAlterar  .setEnabled( !b );
            Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes.btCancelar .setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes.btExcluir  .setEnabled( !b );
            Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes.btSalvar   .setEnabled( b );
            Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes.btAtualizar.setEnabled( b  );
            Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes.btPesquisar.setEnabled( !b  );
            
        }catch(Exception e) { }
    }
       
}

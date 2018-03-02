/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_incluir;

import formas_de_pagamento.Formas_de_Pagamento_Home;
import home.Home;

/**
 *
 * @author ana
 */
public class Incluir_Formas_de_Pagamento {
    
    public Incluir_Formas_de_Pagamento( Home Home2 ) {
        
        Home = Home2;
        
        incluir();
    }
    
    Home Home;
    
    boolean um = false;
    private void incluir(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        Home.ControleTabs.AddTabsAoHome( "Formas de Pagamento", "livroTp.gif", new Formas_de_Pagamento_Home( Home ) );  
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
}

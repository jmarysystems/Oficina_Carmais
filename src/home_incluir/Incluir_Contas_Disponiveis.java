/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_incluir;

import contas_disponiveis.Contas_Disponiveis_Home;
import home.Home;

/**
 *
 * @author ana
 */
public class Incluir_Contas_Disponiveis {
    
    public Incluir_Contas_Disponiveis( Home Home2 ) {
        
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
                    
                        Home.ControleTabs.AddTabsAoHome( "Contas Disponiveis", "livroTp.gif", new Contas_Disponiveis_Home( Home ) );  
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
}

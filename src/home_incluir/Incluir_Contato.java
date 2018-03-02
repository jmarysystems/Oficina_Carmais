/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_incluir;

import contato.Contato;
import home.Home;

/**
 *
 * @author ana
 */
public class Incluir_Contato {
    
    public Incluir_Contato( Home Home2, String tipoContato2 ) {
        
        Home = Home2;
        tipoContato = tipoContato2;
        
        incluir();
    }
    
    Home Home;
    String tipoContato;
            
    boolean um = false;
    private void incluir(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        Home.ControleTabs.AddTabsAoHome( tipoContato, "livroTp.gif", new Contato( Home, tipoContato ) );  
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
}

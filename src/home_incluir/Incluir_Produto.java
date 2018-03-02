/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_incluir;

import home.Home;
import produto_.Produto;

/**
 *
 * @author ana
 */
public class Incluir_Produto {
    
    public Incluir_Produto( Home Home2 ) {
        
        Home = Home2;
        
        incluir_produto();
    }
    
    Home Home;
    
    boolean um = false;
    private void incluir_produto(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        Home.ControleTabs.AddTabsAoHome( "Produto", "livroTp.gif", new Produto( Home ) );  
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
}

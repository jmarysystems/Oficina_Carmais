/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_incluir;

import home.Home;
import tipo_de_documento.Tipos_de_Documento_Home;

/**
 *
 * @author ana
 */
public class Incluir_Tipos_de_Documento {
    
    public Incluir_Tipos_de_Documento( Home Home2 ) {
        
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
                    
                        Home.ControleTabs.AddTabsAoHome( "Tipos de Documento", "livroTp.gif", new Tipos_de_Documento_Home( Home ) );  
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
}

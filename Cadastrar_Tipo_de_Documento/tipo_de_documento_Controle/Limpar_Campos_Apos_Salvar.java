/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipo_de_documento_Controle;

import home.Home;
import tipo_de_documento.Tipos_de_Documento_Home;

/**
 *
 * @author ana
 */
public class Limpar_Campos_Apos_Salvar {
    
    Home Home;
    Tipos_de_Documento_Home Tipos_de_Documento_Home;
    
    public Limpar_Campos_Apos_Salvar( Home Home2, Tipos_de_Documento_Home Tipos_de_Documento_Home2 ) {
        
        Home = Home2;
        Tipos_de_Documento_Home = Tipos_de_Documento_Home2;
        
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
                    
            Tipos_de_Documento_Home.Tipos_de_Documento.tfNome         .setText("");
            //Tipos_de_Documento_Home.Tipos_de_Documento.cbTipoDeCusto  
            Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto   .setText("");

        }catch(Exception e) { }
    }
            
}

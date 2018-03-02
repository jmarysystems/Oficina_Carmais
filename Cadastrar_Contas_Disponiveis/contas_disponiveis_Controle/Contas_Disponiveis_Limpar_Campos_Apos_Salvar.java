/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas_disponiveis_Controle;

import contas_disponiveis.Contas_Disponiveis_Home;
import home.Home;

/**
 *
 * @author ana
 */
public class Contas_Disponiveis_Limpar_Campos_Apos_Salvar {
    
    Home Home;
    Contas_Disponiveis_Home Contas_Disponiveis_Home;
    
    public Contas_Disponiveis_Limpar_Campos_Apos_Salvar( Home Home2, Contas_Disponiveis_Home Contas_Disponiveis_Home2 ) {
        
        Home = Home2;
        Contas_Disponiveis_Home = Contas_Disponiveis_Home2;
        
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
                    
            Contas_Disponiveis_Home.Contas_Disponiveis.tfApelidoCurto    .setText( ""  );
            Contas_Disponiveis_Home.Contas_Disponiveis.tfNomeDescricao   .setText( ""  );

        }catch(Exception e) { }
    }
            
}

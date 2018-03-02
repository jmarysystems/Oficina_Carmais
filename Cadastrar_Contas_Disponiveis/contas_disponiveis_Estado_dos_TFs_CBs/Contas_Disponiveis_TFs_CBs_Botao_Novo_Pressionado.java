/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas_disponiveis_Estado_dos_TFs_CBs;

import contas_disponiveis.Contas_Disponiveis_Home;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Contas_Disponiveis_TFs_CBs_Botao_Novo_Pressionado {
    
    Home Home;
    Contas_Disponiveis_Home Contas_Disponiveis_Home;
    
    public Contas_Disponiveis_TFs_CBs_Botao_Novo_Pressionado( Home Home2, Contas_Disponiveis_Home Contas_Disponiveis_Home2 ) {
        
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
                    
            Contas_Disponiveis_Home.Contas_Disponiveis.tfApelidoCurto    .setEnabled( b  );
            Contas_Disponiveis_Home.Contas_Disponiveis.tfNomeDescricao   .setEnabled( b  );

        }catch(Exception e) { }
    }
       
}

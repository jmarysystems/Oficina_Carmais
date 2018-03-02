/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas_disponiveis_Estado_dos_Botoes;

import contas_disponiveis.Contas_Disponiveis_Home;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Contas_Disponiveis_Botao_Novo_Pressionado {
    
    Home Home;
    Contas_Disponiveis_Home Contas_Disponiveis_Home;
    
    public Contas_Disponiveis_Botao_Novo_Pressionado( Home Home2, Contas_Disponiveis_Home Contas_Disponiveis_Home2 ) {
        
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
            
            Contas_Disponiveis_Home.Contas_Disponiveis_Botoes.btNovo     .setEnabled( !b  );
            Contas_Disponiveis_Home.Contas_Disponiveis_Botoes.btAlterar  .setEnabled( !b );
            Contas_Disponiveis_Home.Contas_Disponiveis_Botoes.btCancelar .setEnabled( b  );
            Contas_Disponiveis_Home.Contas_Disponiveis_Botoes.btExcluir  .setEnabled( !b );
            Contas_Disponiveis_Home.Contas_Disponiveis_Botoes.btSalvar   .setEnabled( b );
            Contas_Disponiveis_Home.Contas_Disponiveis_Botoes.btAtualizar.setEnabled( !b  );
            Contas_Disponiveis_Home.Contas_Disponiveis_Botoes.btPesquisar.setEnabled( !b  );
        }catch(Exception e) { }
    }
       
}

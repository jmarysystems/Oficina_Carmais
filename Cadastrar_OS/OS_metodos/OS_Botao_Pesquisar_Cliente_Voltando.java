/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_metodos;

import OS.OS;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class OS_Botao_Pesquisar_Cliente_Voltando {
    
    public OS_Botao_Pesquisar_Cliente_Voltando( OS OS2, Home Home2, boolean botao2 ) {
        
        OS = OS2;
        Home = Home2;
        
        botao  = botao2;      
        
        inicio();  
    }
    
    OS OS;
    Home Home;
    boolean botao;
    
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        botoes      ( botao );
                        
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "OS_Botao_Pesquisar_Cliente_Pressionado, "
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
                                
            OS.OS_Botoes.btNovo     .setEnabled( !b  );
            OS.OS_Botoes.btAlterar  .setEnabled( !b );
            OS.OS_Botoes.btCancelar .setEnabled( b  );
            OS.OS_Botoes.btExcluir  .setEnabled( !b );
            OS.OS_Botoes.btSalvar   .setEnabled( b );
            OS.OS_Botoes.btAtualizar.setEnabled( b  );
            OS.OS_Botoes.btPesquisar.setEnabled( !b  );
        }catch(Exception e) { }
    }
    
}

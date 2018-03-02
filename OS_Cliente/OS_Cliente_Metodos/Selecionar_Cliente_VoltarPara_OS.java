/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente_Metodos;

import OS.OS;
import OS_metodos.OS_Botao_Pesquisar_Cliente_Voltando;
import home.Home;
import javax.swing.JTable;
import OS_Cliente.Contato_OS;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Selecionar_Cliente_VoltarPara_OS {
    
    public Selecionar_Cliente_VoltarPara_OS( Home Home2, OS OS2, Contato_OS Contato_OS2, JTable tb2 ) {
        
        Contato_OS = Contato_OS2;
        Home = Home2;
        OS = OS2;
        tb = tb2;
        
        inicio();  
    }
    
    OS OS;
    Home Home;
    JTable tb;
    Contato_OS Contato_OS;
        
    boolean um2 = false;
    private void inicio(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um2 == false ) {     um2 = true;
                    try { Thread.sleep(1); 
                    
                        if ( Contato_OS.Bean_Contato.size() > -1 ){
                            
                            if ( tb.getSelectedRow() != -1){
                                setar();
                            } else {
                                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Selecionar Cliente, "
                                        + "\nNenhum cliente selecionado"
                                        + "\n\nPara voltar sem selecionar click em Cancelar"
                                        + "\n", "Selecionar Cliente" );
                            }
                        }

                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Selecionar Cliente, "
                                + "\nNenhum cliente selecionado"
                                + "\n\nPara voltar sem selecionar click em Cancelar"
                                + "\n", "Selecionar Cliente" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um2 = false;
    }
    
    private void setar(){
        
        int     codigo  = Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getID();
        String nome    = Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getNOMEOURAZAOSOCIAL();
   
        OS.receber_e_SetarCliente( nome, codigo );
        
        Home.ControleTabs.removerTabSemControleSelecionado( OS.tabOS );
        OS_Botao_Pesquisar_Cliente_Voltando bt_Pesquisar_Cliente = new OS_Botao_Pesquisar_Cliente_Voltando(OS, Home, true);
    }
           
}

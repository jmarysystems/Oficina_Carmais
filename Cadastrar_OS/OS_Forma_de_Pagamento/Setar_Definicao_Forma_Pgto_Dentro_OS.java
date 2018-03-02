/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Forma_de_Pagamento;

import OS.OS;
import home.Home; 
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_Definicao_Forma_Pgto_Dentro_OS {
    
    public Setar_Definicao_Forma_Pgto_Dentro_OS( Home Home2, OS OS2 ) {
        
        OS = OS2;   
        Home = Home2;
        
        inicio();
    }
    
    OS OS;
    Home Home;
    
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        setar();
                    
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_Definicao_Forma_Pgto_Dentro_OS, "
                            + "\ninicio()"
                            + e.getMessage()
                            + "\n", "inicio()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void setar() {  
        Retornar_Total Retornar_Total = new Retornar_Total( Home, OS );        
        float Total = Retornar_Total.getTotal();
        
        Bean_OS_Contas_Disponiveis Bean_Conta      = OS.pegar_e_GetConta();
        
        Bean_OS_TipoDeDocumento Bean_Documento     = OS.pegar_e_GetDocumento();
        
        Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto = OS.pegar_e_GetarFormaPgto();

                
        setarDefinicao( Total, Bean_Conta, Bean_Documento, Bean_Forma_Pgto );
     }
    
    private void setarDefinicao( float Total, Bean_OS_Contas_Disponiveis Bean_Conta,
            Bean_OS_TipoDeDocumento Bean_Documento, Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto ) { 
        
        System.out.println( "Setando definição interna" );
    }
    
}

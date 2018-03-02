/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_Setar_CB_Tipo_de_Entrada;

import OS.OS;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_OS_OS_Forma_de_Pgto_Tipo_de_Entrada {
    
    OS OS;
    Home Home;
    
    
    public Setar_OS_OS_Forma_de_Pgto_Tipo_de_Entrada( OS OS2, Home Home2 ) {
        
        OS = OS2;
        Home = Home2;        
        
        inicio();
    }
    
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        setar();
                                                                        
                    }catch(Exception e) {
                        
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_OS_OS_Forma_de_Pagamento_Inicio_Parcelas, "
                                + "\ninicio()\n"
                                + e.getMessage()
                                + "\n", "inicio()" ); 
                        
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void setar(){  

        //OS.OS_Forma_de_Pagamento.setCBTIPODEENTRADA( 0 );
        
        //Definir_Forma_de_Pagamento_Valor_das_Parcelas Parcelas = new Definir_Forma_de_Pagamento_Valor_das_Parcelas( OS, Home, Definir_Forma_de_Pagamento_Home );

    }

    
}

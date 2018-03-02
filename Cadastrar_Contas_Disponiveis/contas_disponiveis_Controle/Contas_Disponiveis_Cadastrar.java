/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas_disponiveis_Controle;

import contas_disponiveis.Contas_Disponiveis_Home;
import contas_disponiveis_control.Bean_Contas_Disponiveis;
import contas_disponiveis_control.Control_Contas_Disponiveis_Cadastrar;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Contas_Disponiveis_Cadastrar {
    
    Home Home;
    Contas_Disponiveis_Home Contas_Disponiveis_Home;
    
    public Contas_Disponiveis_Cadastrar( Home Home2, Contas_Disponiveis_Home Contas_Disponiveis_Home2 ) {
        
        Home = Home2;
        Contas_Disponiveis_Home = Contas_Disponiveis_Home2;
        
        inicio();
    }
            
    boolean um1 = false;
    private void inicio(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um1 == false ) {     um1 = true;
                    try { Thread.sleep(1); 
                    
                        iniciar();
                                
                    }catch(Exception e) {
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Contas_Disponiveis_Cadastrar, "
                                 + "\ninicio()"
                                 + e.getMessage()
                                 + "\n", "inicio()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um1 = false;
    }
    
    private void iniciar(){
        
        cadastrar( getBean() );                            
    }    
    
    private void cadastrar( Bean_Contas_Disponiveis Bean ){
        
        Control_Contas_Disponiveis_Cadastrar Control = new Control_Contas_Disponiveis_Cadastrar( Home.ip );
        Control.cadastrar( Bean );
    }
    
    private Bean_Contas_Disponiveis getBean(){
        Bean_Contas_Disponiveis Bean = new Bean_Contas_Disponiveis();
        
        //ID
                    
        Bean.setAPELIDOCURTO         ( Contas_Disponiveis_Home.Contas_Disponiveis.tfApelidoCurto.getText().trim()    );   
        Bean.setNOMEDESCRICAODACONTA ( Contas_Disponiveis_Home.Contas_Disponiveis.tfNomeDescricao.getText().trim()   );                            
                  
        return Bean;
   
    }
   
}

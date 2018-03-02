/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento;

import formas_de_pagamento_Estado_dos_Botoes.Formas_de_Pagamento_Botoes_Inicio;
import formas_de_pagamento_Estado_dos_TFs_CBs.Formas_de_Pagamento_TFs_CBs_Inicio;
import home.Home;
import java.awt.BorderLayout;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Formas_de_Pagamento_Home_Inicio {
    
    Home Home;
    Formas_de_Pagamento_Home Formas_de_Pagamento_Home;
    
    public Formas_de_Pagamento_Home_Inicio( Home Home2, Formas_de_Pagamento_Home Formas_de_Pagamento_Home2 ) {
        
        Home = Home2;     
        Formas_de_Pagamento_Home = Formas_de_Pagamento_Home2;
    }
            
    boolean um1 = false;
    public void inicio(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um1 == false ) {     um1 = true;
                    try { Thread.sleep(1); 
                    
                        iniciar();
                        
                        Formas_de_Pagamento_Botoes_Inicio Forma_de_Pagamento_Botoes_Inicio = new Formas_de_Pagamento_Botoes_Inicio( Home,Formas_de_Pagamento_Home );
           
                        Formas_de_Pagamento_TFs_CBs_Inicio Formas_de_Pagamento_TFs_CBs_Inicio = new Formas_de_Pagamento_TFs_CBs_Inicio( Home,Formas_de_Pagamento_Home );
                                
                    }catch(Exception e) {
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Formas_de_Pagamento_Home_Inicio, "
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
        
        Formas_de_Pagamento_Home.Formas_de_Pagamento        = new Formas_de_Pagamento( Home );
        Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes = new Formas_de_Pagamento_Botoes( Home, Formas_de_Pagamento_Home );
        
        Formas_de_Pagamento_Home.setLayout( new BorderLayout() );
            
        Formas_de_Pagamento_Home.add( Formas_de_Pagamento_Home.Formas_de_Pagamento_Botoes, BorderLayout.NORTH );
        
        Formas_de_Pagamento_Home.add( Formas_de_Pagamento_Home.Formas_de_Pagamento, BorderLayout.CENTER );
        Formas_de_Pagamento_Home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                        
    }    
   
}

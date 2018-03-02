/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas_disponiveis;

import contas_disponiveis_Estado_dos_TFs_CBs.Contas_Disponiveis_TFs_CBs_Inicio;
import contas_disponiveis_Estado_dos_Botoes.Contas_Disponiveis_Botoes_Inicio;
import home.Home;
import java.awt.BorderLayout;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Contas_Disponiveis_Home_Inicio {
    
    Home Home;
    Contas_Disponiveis_Home Contas_Disponiveis_Home;
    
    public Contas_Disponiveis_Home_Inicio( Home Home2, Contas_Disponiveis_Home Contas_Disponiveis_Home2 ) {
        
        Home = Home2;     
        Contas_Disponiveis_Home = Contas_Disponiveis_Home2;
    }
            
    boolean um1 = false;
    public void inicio(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um1 == false ) {     um1 = true;
                    try { Thread.sleep(1); 
                    
                        iniciar();
                        
                        Contas_Disponiveis_Botoes_Inicio Contas_Disponiveis_Botoes_Inicio = new Contas_Disponiveis_Botoes_Inicio( Home,Contas_Disponiveis_Home );
           
                        Contas_Disponiveis_TFs_CBs_Inicio Contas_Disponiveis_TFs_CBs_Inicio = new Contas_Disponiveis_TFs_CBs_Inicio( Home,Contas_Disponiveis_Home );
                                
                    }catch(Exception e) {
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Contas_Disponiveis_Home_Inicio, "
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
        
        Contas_Disponiveis_Home.Contas_Disponiveis        = new Contas_Disponiveis( Home );
        Contas_Disponiveis_Home.Contas_Disponiveis_Botoes = new Contas_Disponiveis_Botoes( Home, Contas_Disponiveis_Home );
        
        Contas_Disponiveis_Home.setLayout( new BorderLayout() );
            
        Contas_Disponiveis_Home.add( Contas_Disponiveis_Home.Contas_Disponiveis_Botoes, BorderLayout.NORTH );
        
        Contas_Disponiveis_Home.add( Contas_Disponiveis_Home.Contas_Disponiveis, BorderLayout.CENTER );
        Contas_Disponiveis_Home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                        
    }    
   
}

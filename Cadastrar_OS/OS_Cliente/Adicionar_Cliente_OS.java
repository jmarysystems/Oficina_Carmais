/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente;

import OS.OS;
import home.Home;
import java.awt.BorderLayout;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Adicionar_Cliente_OS {
    
    public Adicionar_Cliente_OS( Home Home2, OS OS2 ) {
        
        OS = OS2;
        Home = Home2;  
        
        adicionar_Cliente_OS();
    }
    
    OS OS;
    Home Home;
        
    boolean um2 = false;
    private void adicionar_Cliente_OS(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um2 == false ) {     um2 = true;
                    try { Thread.sleep(1); 
                    
                        Contato_OS Pesquisar_Contato = new Contato_OS(Home, OS, "Cliente");
                    
                        JPAdicionar_Cliente JPAdicionar_Cliente = new JPAdicionar_Cliente(Home, OS);
                        
                        JPAdicionar_Cliente.setLayout( new BorderLayout() );
                        
                        //JPAdicionar_Cliente.add      ( new Contato_Botoes(Home, Pesquisar_Contato, OS), BorderLayout.NORTH );
        
                        JPAdicionar_Cliente.add      ( Pesquisar_Contato, BorderLayout.CENTER );
                        JPAdicionar_Cliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                    
                        Home.ControleTabs.AddTabSemControleNovo( OS.tabOS, "Procurar Cliente", "/imagens/clienteos.gif", JPAdicionar_Cliente );
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Adicionar_Cliente_OS, "
                            + "\nadicionar_Cliente_OS()"
                            + e.getMessage()
                            + "\n", "adicionar_Cliente_OS()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um2 = false;
    }
           
}

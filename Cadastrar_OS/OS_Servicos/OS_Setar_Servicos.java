/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Servicos;

import OS.OS;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class OS_Setar_Servicos {
    
    public OS_Setar_Servicos( OS OS2, Home Home2 ) {
        
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
                    }catch(Exception e) { e.printStackTrace();
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "OS_Setar_Servicos, "
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
        
        Control_OS_Servico_Listar Control = new Control_OS_Servico_Listar( Home.ip );
        List<Bean_OS_Servico> Bean_OS_Servico = Control.listar( "%"+""+"%" );
                
        mostrarLista( Bean_OS_Servico );
    }
    
    protected void mostrarLista( List<Bean_OS_Servico> Bean_OS_Servico ){
                                     
        if( OS.OS_Corpo.Controle_De_Inserir.cbAdicionar.getItemCount() > 0 ) { OS.OS_Corpo.Controle_De_Inserir.cbAdicionar.removeAllItems(); OS.BookInfoServicos.clear(); }       
                
        for (int i = 0; i < Bean_OS_Servico.size(); i++){ 
                                                           
            OS.OS_Corpo.Controle_De_Inserir.cbAdicionar.addItem( new BookInfoServicos( 
                    Bean_OS_Servico.get(i).getID(), 
                    Bean_OS_Servico.get(i).getNOME(), 
                    Bean_OS_Servico.get(i).getPRECO(), 
                    Bean_OS_Servico.get(i).getPALAVRASCHAVE() 
            )
            );    
        }
           
    }
    
}

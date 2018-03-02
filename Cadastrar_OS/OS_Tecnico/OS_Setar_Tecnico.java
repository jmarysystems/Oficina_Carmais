/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Tecnico;

import OS.OS;
import home.Home;
import java.util.List;

/**
 *
 * @author ana
 */
public class OS_Setar_Tecnico {
    
    public OS_Setar_Tecnico( OS OS2, Home Home2 ) {
        
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
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void setar(){  
        
        Tecnico_Control_Listar Control = new Tecnico_Control_Listar( Home.ip );
        List<Tecnico_Bean> Tecnico_Bean = Control.listar( "%"+""+"%" );
                
        mostrarLista( Tecnico_Bean );
    }
    
    protected void mostrarLista( List<Tecnico_Bean> Tecnico_Bean ){
                                     
        if( OS.OS_Corpo.cbTecnico.getItemCount() > 0 ) { OS.OS_Corpo.cbTecnico.removeAllItems(); OS.ListBookInfoTecnico.clear(); }       
                
        for (int i = 0; i < Tecnico_Bean.size(); i++){ 
                                                             
            OS.OS_Corpo.cbTecnico.addItem( new BookInfoTecnico( 
                    Tecnico_Bean.get(i).getID(), Tecnico_Bean.get(i).getNOME(), 
                    Tecnico_Bean.get(i).getCOMISSAOPRODUTO(), Tecnico_Bean.get(i).getCOMISSAOSERVICO() 
            )
            );    
        }
           
    }
    
}

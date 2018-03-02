/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contato_metodos;

import contato.Contato;
import grupo_contato_control.Bean_Grupo_Contato;
import grupo_contato_control.Control_Grupo_Contato_Listar;
import home.Home;
import java.util.List;

/**
 *
 * @author Cleilson
 */
public class Setar_Grupo {
    
    public Setar_Grupo( Home Home2, Contato Contato2 ) {
        
        Contato = Contato2;
        Home = Home2;
        
        setar_Grupo();
    }
    
    Contato Contato;
    Home Home;
            
    private boolean um = true;
    private void setar_Grupo(){ 
        new Thread() {   @Override
            public void run() {
                while ( um == true ) { um = false;
                    try { Thread.sleep(1); verificarParaSetarGrupo(); } catch(Exception e) { }
                }
            }
        }.start(); um = true;
    }
    
    private void verificarParaSetarGrupo(){  
        
        Control_Grupo_Contato_Listar Control = new Control_Grupo_Contato_Listar( Home.ip );
        List<Bean_Grupo_Contato> Bean_Grupo_Contato = Control.listar( "%"+""+"%" );
                
        mostrarLista( Bean_Grupo_Contato );
    }
    
    protected void mostrarLista( List<Bean_Grupo_Contato> Bean_Grupo_Contato ){
        if( Contato.cbGrupo.getItemCount() > 0 ) { Contato.cbGrupo.removeAllItems(); }           
        for (int i = 0; i < Bean_Grupo_Contato.size(); i++){ 
            
            //System.out.println( i + " - " + Bean_Grupo_Contato.get(i).getNOME() ); 
            
            Contato.cbGrupo.addItem( Bean_Grupo_Contato.get(i).getNOME() );
        }
    }
            
    
}

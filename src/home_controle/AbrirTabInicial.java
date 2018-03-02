/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home_controle;

import home.Home;
import home_janelas.JPBarra_Titulo1;

import java.awt.BorderLayout;
import java.awt.Component;

/**
 *
 * @author Ana
 */
public class AbrirTabInicial {
    
    public AbrirTabInicial( Home HomeR ) {
        Home = HomeR;
    }
    
    Home Home;
    
    boolean um = false;
    public void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        paginaInicial();
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    public void paginaInicial(){

        try{
            
            Home.ControleTabs.AddTabHome( "Home", "casahome.gif", new PnTabImagemHome() );
                       
            setarBarra_Titulo( new JPBarra_Titulo1( Home ) );
        } catch( Exception e ){}
    }
    
    public void setarBarra_Titulo( Component c ){
        
        try{
            
            Home.Barra_de_Titulo.setLayout( new BorderLayout() );
            Home.Barra_de_Titulo.add( c, BorderLayout.CENTER );
            
        } catch( Exception e ){}
    }     
    
}

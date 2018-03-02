/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipo_de_documento;

import home.Home;
import java.awt.BorderLayout;
import tipo_de_documento_Estado_dos_Botoes.Tipo_de_Documentos_Botoes_Inicio;
import tipo_de_documento_Estado_dos_TFs_CBs.Tipo_de_Documentos_TFs_CBs_Inicio;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Tipo_de_Documento_Home_Inicio {
    
    Home Home;
    Tipos_de_Documento_Home Tipos_de_Documento_Home;
    
    public Tipo_de_Documento_Home_Inicio( Home Home2, Tipos_de_Documento_Home Tipos_de_Documento_Home2 ) {
        
        Home = Home2;     
        Tipos_de_Documento_Home = Tipos_de_Documento_Home2;
    }
            
    boolean um1 = false;
    public void inicio(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um1 == false ) {     um1 = true;
                    try { Thread.sleep(1); 
                    
                        iniciar();
                        
                        Tipo_de_Documentos_Botoes_Inicio Tipo_de_Documentos_Botoes_Inicio = new Tipo_de_Documentos_Botoes_Inicio( Home,Tipos_de_Documento_Home );
           
                        Tipo_de_Documentos_TFs_CBs_Inicio Tipo_de_Documentos_TFs_CBs_Inicio = new Tipo_de_Documentos_TFs_CBs_Inicio( Home,Tipos_de_Documento_Home );
                                
                    }catch(Exception e) {
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Tipo_de_Documento_Home_Inicio, "
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
        
        Tipos_de_Documento_Home.Tipos_de_Documento        = new Tipos_de_Documento( Home );
        Tipos_de_Documento_Home.Tipo_de_Documentos_Botoes = new Tipo_de_Documentos_Botoes( Home, Tipos_de_Documento_Home );
        
        Tipos_de_Documento_Home.setLayout( new BorderLayout() );
            
        Tipos_de_Documento_Home.add( Tipos_de_Documento_Home.Tipo_de_Documentos_Botoes, BorderLayout.NORTH );
        
        Tipos_de_Documento_Home.add( Tipos_de_Documento_Home.Tipos_de_Documento, BorderLayout.CENTER );
        Tipos_de_Documento_Home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                        
    }    
   
}

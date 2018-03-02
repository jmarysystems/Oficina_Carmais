/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipo_de_documento_Controle;

import home.Home;
import tipo_de_documento.Tipos_de_Documento_Home;
import tipo_de_documento_control.Bean_TipoDeDocumento;
import tipo_de_documento_control.Control_TipoDeDocumento_Cadastrar;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Tipo_de_Documento_Cadastrar {
    
    Home Home;
    Tipos_de_Documento_Home Tipos_de_Documento_Home;
    
    public Tipo_de_Documento_Cadastrar( Home Home2, Tipos_de_Documento_Home Tipos_de_Documento_Home2 ) {
        
        Home = Home2;     
        Tipos_de_Documento_Home = Tipos_de_Documento_Home2;
        
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
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Tipo_de_Documento_Cadastrar, "
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
    
    private void cadastrar( Bean_TipoDeDocumento Bean ){
        
        Control_TipoDeDocumento_Cadastrar Control = new Control_TipoDeDocumento_Cadastrar( Home.ip );
        Control.cadastrar( Bean );
    }
    
    private Bean_TipoDeDocumento getBean(){
        Bean_TipoDeDocumento Bean = new Bean_TipoDeDocumento();
        
        //ID
                    
        Bean.setNOME         ( Tipos_de_Documento_Home.Tipos_de_Documento.tfNome.getText().trim()                            );   
        Bean.setTIPODECUSTO  ( Tipos_de_Documento_Home.Tipos_de_Documento.cbTipoDeCusto.getSelectedItem().toString().trim()  );
        Bean.setVALORDECUSTO ( Float.parseFloat( Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto.getText().trim() )  );                           
          
        
        return Bean;
   
    }
   
}

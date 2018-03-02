/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_Setar_CB_tipo_de_documento;

import formas_de_pagamento.Formas_de_Pagamento_Home;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_CB_Tipo_de_Documento {
    
    Home Home;
    Formas_de_Pagamento_Home Formas_de_Pagamento_Home;
    
    public Setar_CB_Tipo_de_Documento( Home Home2, Formas_de_Pagamento_Home Formas_de_Pagamento_Home2 ) {
        
        Home = Home2;
        Formas_de_Pagamento_Home = Formas_de_Pagamento_Home2;
        
        inicio();
    }
    
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        setar();
                        
                    }catch(Exception e) {
                        
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_CB_Tipo_de_Documento, "
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
        
        TipoDoc_Forma_Pgto_Control_Listar Control = new TipoDoc_Forma_Pgto_Control_Listar( Home.ip );
        List<Bean_TipoDeDoc_FormaPgto> Bean_TipoDeDoc_FormaPgto = Control.listar( "%"+""+"%" );
                
        mostrarLista( Bean_TipoDeDoc_FormaPgto );
    }
    
    protected void mostrarLista( List<Bean_TipoDeDoc_FormaPgto> Bean_TipoDeDoc_FormaPgto ){
                                     
        if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao.getItemCount() > 0 ) { Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao.removeAllItems(); /*Formas_de_Pagamento_Home.listBookInfoContaDeDestino.clear();*/ }       
                
        for (int i = 0; i < Bean_TipoDeDoc_FormaPgto.size(); i++){ 
                                                             
            Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao.addItem( new BookInfoTipoDeDoc_FormaPgto( 
                    Bean_TipoDeDoc_FormaPgto.get(i).getID(), 
                    Bean_TipoDeDoc_FormaPgto.get(i).getNOME(), 
                    Bean_TipoDeDoc_FormaPgto.get(i).getTIPODECUSTO(),
                    Bean_TipoDeDoc_FormaPgto.get(i).getVALORDECUSTO()
            )
            );    
        }
           
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_parcelas;

import definicao_forma_pgto_parcelas.Preenchimento_Lista_Parcelas;
import OS.OS;
import formas_de_pagamento_Setar_CB_tipo_de_documento.Bean_TipoDeDoc_FormaPgto;
import formas_de_pagamento_Setar_CB_tipo_de_documento.BookInfoTipoDeDoc_FormaPgto;
import formas_de_pagamento_Setar_CB_tipo_de_documento.TipoDoc_Forma_Pgto_Control_Listar;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_CB_Tipo_de_Documento_Parcelas {
    
    OS OS;
    Home Home;
    Preenchimento_Lista_Parcelas Preenchimento_Lista_Parcelas;
    
    public Setar_CB_Tipo_de_Documento_Parcelas( OS OS2, Home Home2, Preenchimento_Lista_Parcelas Preenchimento_Lista_Parcelas2 ) {
        
        OS = OS2;
        Home = Home2;
        Preenchimento_Lista_Parcelas = Preenchimento_Lista_Parcelas2;

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
                        
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_CB_Tipo_de_Documento_Parcelas, "
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
                                     
        if( Preenchimento_Lista_Parcelas.cbTIPODEDOCUMENTO.getItemCount() > 0 ) { Preenchimento_Lista_Parcelas.cbTIPODEDOCUMENTO.removeAllItems(); /*Formas_de_Pagamento_Home.listBookInfoContaDeDestino.clear();*/ }       
                
        int select = 0;
        
        for (int i = 0; i < Bean_TipoDeDoc_FormaPgto.size(); i++){ 
            
            if( Bean_TipoDeDoc_FormaPgto.get(i).getID() == Preenchimento_Lista_Parcelas.TIPODEDOCUMENTO ) {
                
                select = i;
            }
                                                             
            Preenchimento_Lista_Parcelas.cbTIPODEDOCUMENTO.addItem( new BookInfoTipoDeDoc_FormaPgto( 
                    Bean_TipoDeDoc_FormaPgto.get(i).getID(), 
                    Bean_TipoDeDoc_FormaPgto.get(i).getNOME(), 
                    Bean_TipoDeDoc_FormaPgto.get(i).getTIPODECUSTO(),
                    Bean_TipoDeDoc_FormaPgto.get(i).getVALORDECUSTO()
            )
            );    
        }
        
        Preenchimento_Lista_Parcelas.cbTIPODEDOCUMENTO.setSelectedIndex( select );
           
    }
    
}

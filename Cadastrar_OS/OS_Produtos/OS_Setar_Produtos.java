/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Produtos;

import OS.OS;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class OS_Setar_Produtos {
    
    public OS_Setar_Produtos( OS OS2, Home Home2 ) {
        
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
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "OS_Setar_Produtos, "
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
        
        Control_OS_Produto_Listar Control = new Control_OS_Produto_Listar( Home.ip );
        List<Bean_Produto_OS> Bean_Produto_OS = Control.listar( "%"+""+"%" );
                
        mostrarLista( Bean_Produto_OS );
    }
    
    protected void mostrarLista( List<Bean_Produto_OS> Bean_Produto_OS ){
                                     
        if( OS.OS_Corpo.Controle_De_Inserir.cbInserirProduto.getItemCount() > 0 ) { OS.OS_Corpo.Controle_De_Inserir.cbInserirProduto.removeAllItems(); OS.BookInfoProdutos.clear(); }       
                
        for (int i = 0; i < Bean_Produto_OS.size(); i++){ 
                                                             
            OS.OS_Corpo.Controle_De_Inserir.cbInserirProduto.addItem( new BookInfoProdutos( 
                    Bean_Produto_OS.get(i).getID(), 
                    Bean_Produto_OS.get(i).getNOME(), 
                    Bean_Produto_OS.get(i).getUNIDADETRIBUTARIA(),
                    Bean_Produto_OS.get(i).getPRECODEVENDA() 
                    
            )
            );    
        }
           
    }
    
}

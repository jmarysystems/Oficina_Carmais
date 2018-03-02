/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto__metodos;

import home.Home;
import java.util.List;
import produto_.Produto;
import produto_unidade_control.Bean_Produto_Unidade;
import produto_unidade_control.Control_Listar_Produto_Unidade;

/**
 *
 * @author Cleilson
 */
public class Setar_Unidade {
    
    public Setar_Unidade( Home Home2, Produto Produto2 ) {
        
        Produto = Produto2;
        Home = Home2;
        
        setar();
    }
    
    Produto Produto;
    Home Home;
            
    private boolean um = true;
    private void setar(){ 
        new Thread() {   @Override
            public void run() {
                while ( um == true ) { um = false;
                    try { Thread.sleep(1); verificarParaSetar(); } catch(Exception e) { }
                }
            }
        }.start(); um = true;
    }
    
    private void verificarParaSetar(){  
        
        Control_Listar_Produto_Unidade Control = new Control_Listar_Produto_Unidade( Home.ip );
        List<Bean_Produto_Unidade> Bean_Unidade = Control.listar( "%"+""+"%" );
                
        mostrarLista( Bean_Unidade );
    }
    
    protected void mostrarLista( List<Bean_Produto_Unidade> Bean_Produto_Unidade ){
        if( Produto.cbUNIDADETRIBUTARIA.getItemCount() > 0 ) { Produto.cbUNIDADETRIBUTARIA.removeAllItems(); }           
        for (int i = 0; i < Bean_Produto_Unidade.size(); i++){ 
            
            //System.out.println( i + " - " + Bean_Grupo_Contato.get(i).getNOME() ); 
            
            Produto.cbUNIDADETRIBUTARIA.addItem( Bean_Produto_Unidade.get(i).getUNIDADE() );
        }
    }
            
    
}

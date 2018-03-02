/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto__metodos;

import home.Home;
import java.util.List;
import produto_.Produto;
import produto_categoria_control.Bean_Produto_Categoria;
import produto_categoria_control.Control_Listar_Produto_Categoria;

/**
 *
 * @author Cleilson
 */
public class Setar_Categoria {
    
    public Setar_Categoria( Home Home2, Produto Produto2 ) {
        
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
        
        Control_Listar_Produto_Categoria Control = new Control_Listar_Produto_Categoria( Home.ip );
        List<Bean_Produto_Categoria> Bean_Categoria = Control.listar( "%"+""+"%" );
                
        mostrarLista( Bean_Categoria );
    }
    
    protected void mostrarLista( List<Bean_Produto_Categoria> Bean_Produto_Categoria ){
        if( Produto.cbCATEGORIA.getItemCount() > 0 ) { Produto.cbCATEGORIA.removeAllItems(); }           
        for (int i = 0; i < Bean_Produto_Categoria.size(); i++){ 
            
            //System.out.println( i + " - " + Bean_Produto_Categoria.get(i).getNOME() ); 
            
            Produto.cbCATEGORIA.addItem( Bean_Produto_Categoria.get(i).getNOME() );
        }
    }
            
    
}

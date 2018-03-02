/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_categoria;

import produto_categoria_control.Control_Listar_Produto_Categoria;
import home.Home;
import java.util.List;
import produto_categoria_control.Bean_Produto_Categoria;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class verificarSeCategoriaJaExiste {
    
    public verificarSeCategoriaJaExiste( Home Home2, Produto_Categoria Produto_Categoria2 ){
        Home = Home2;
        Produto_Categoria = Produto_Categoria2;
    }
    
    Home Home;
    Produto_Categoria Produto_Categoria;
    
    public boolean verificarMargem(){  
        boolean retorno = false;
        
        final int observador = -1;
        try{
            if( !Produto_Categoria.ftmMagem.getText().trim().equals("") ) {
                String str = Produto_Categoria.ftmMagem.getText().trim();
                float nmr = Float.parseFloat( str ); 
            
                if( nmr > observador ) {
                    
                    retorno = verificar();
                }
                else {
                
                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Margem de lucro ( % ) tem que ser um número válido, "
                            + "\ne maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez Reais e Vinte Centavos: 10.2 ou 10.20"
                            + "\n    Use o ponto para frações decimais.", "Margem de lucro ( % )" );
                    Produto_Categoria.ftmMagem.requestFocus();
                }
            }
            else {
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Margem de lucro ( % ) não pode ser nulo", "Margem de lucro ( % ) ?" );
                Produto_Categoria.ftmMagem.requestFocus();
            } 
        }catch( Exception e ){
            retorno = false;
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Margem de lucro ( % ) tem que ser um número válido, "
                            + "\ne maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez Reais e Vinte Centavos: 10.2 ou 10.20"
                            + "\n    Use o ponto para frações decimais.", "Margem de lucro ( % )" );
            Produto_Categoria.ftmMagem.requestFocus();
        }
        
        return retorno;        
    }
    
    public boolean verificar(){  
        boolean retorno = true;
        
        Control_Listar_Produto_Categoria Control = new Control_Listar_Produto_Categoria( Home.ip );
        List<Bean_Produto_Categoria> Bean_Produto_Categoria = Control.listar( "%"+""+"%" );
        
        for (int i = 0; i < Bean_Produto_Categoria.size(); i++){       
            
            if( Bean_Produto_Categoria.get(i).getNOME().equals( Produto_Categoria.tfNome.getText().trim() ) ) {
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "A Categoria: " 
                        + Produto_Categoria.tfNome.getText() 
                        + " já existe \n", "Por favor escolha outro nome" );
                
                Produto_Categoria.tfNome.requestFocus();
                
                retorno = false;
                break;
            }
        }
        
        return retorno;        
    }
    
}

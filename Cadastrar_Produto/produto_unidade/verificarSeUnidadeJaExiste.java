/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_unidade;

import home.Home;
import java.util.List;
import produto_unidade_control.Bean_Produto_Unidade;
import produto_unidade_control.Control_Listar_Produto_Unidade;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class verificarSeUnidadeJaExiste {
    
    public static boolean verificar( Home Home, Produto_Unidade Produto_Unidade ){  
        boolean retorno = false;
        
        Control_Listar_Produto_Unidade Control = new Control_Listar_Produto_Unidade( Home.ip );
        List<Bean_Produto_Unidade> Bean_Produto_Unidade = Control.listar( "%"+""+"%" );
        
        for (int i = 0; i < Bean_Produto_Unidade.size(); i++){       
            
            if( Bean_Produto_Unidade.get(i).getUNIDADE().equals( Produto_Unidade.tfUnidade.getText().trim() ) ) {
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "A unidade: " 
                        + Produto_Unidade.tfUnidade.getText() 
                        + " já existe \n", "Por favor escolha outro nome" );
                
                Produto_Unidade.tfUnidade.requestFocus();
                
                retorno = true;
                break;
            }
        }
        
        return retorno;        
    }
    
}

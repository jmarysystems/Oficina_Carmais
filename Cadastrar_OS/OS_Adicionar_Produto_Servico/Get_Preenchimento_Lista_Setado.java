/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Adicionar_Produto_Servico;

import utilidades.Float_Para_Moeda;

/**
 *
 * @author ana
 */
public class Get_Preenchimento_Lista_Setado {

    public Preenchimento_Lista jpLista(
            int codigo2, String nomeProduto2, String unidade2, float valorUnitario2, float quantidade2, String observacao2
    ) {  
          
        Preenchimento_Lista Preenchimento_Lista = new Preenchimento_Lista(
                codigo2, nomeProduto2, unidade2, valorUnitario2, quantidade2, observacao2 
        );
        
        Preenchimento_Lista.setSize( 267, 79 );
        //jp2.setBackground(new java.awt.Color( 255, 255, 255 ) );
        Preenchimento_Lista.setPreferredSize(new java.awt.Dimension( 267, 79 ) );
        Preenchimento_Lista.setVisible(true);
        
                    
        Preenchimento_Lista.codigo = codigo2;
        Preenchimento_Lista.lbNomeProduto.setText  ( nomeProduto2                         ); 
        Preenchimento_Lista.lbUnidade.setText      ( unidade2                             );  
        
        Float_Para_Moeda.inicioJLabel( Preenchimento_Lista.lbValorUnitario, valorUnitario2, true );        
        //Preenchimento_Lista.lbValorUnitario.setText( String.valueOf( valorUnitario2 )     );  
        
        Preenchimento_Lista.lbQuantidade.setText   ( String.valueOf( quantidade2    )     );
        Preenchimento_Lista.lbObservacao.setText   ( observacao2                          );
        
        float vUnitXQuant = valorUnitario2 * quantidade2;
        
        Float_Para_Moeda.inicioJLabel( Preenchimento_Lista.lbValorUnitXQuantidade, vUnitXQuant, true ); 
        //Preenchimento_Lista.lbValorUnitXQuantidade.setText   ( String.valueOf( vUnitXQuant    )     );
              
        return Preenchimento_Lista;
    }
    
}

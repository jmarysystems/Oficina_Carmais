/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto__metodos;

import produto_.Produto;
import utilidades.RetornarNumeroFloat;

/**
 *
 * @author ana
 */
public class CustoLucroVenda {
    
    Produto Produto;
    
    public CustoLucroVenda( Produto Produto2, String str ) {
        Produto = Produto2;
        calcular( str );        
    }
    
    private void calcular( String str ){
        
        float preco_de_custo = RetornarNumeroFloat.floatTF( 
            Produto.tfPRECODECUSTO, Produto.tfPRECODECUSTO.getText().trim(), "Preço de custo", true );
        float margem = RetornarNumeroFloat.floatTF( 
            Produto.tfMARGEMDELUCRO, Produto.tfMARGEMDELUCRO.getText().trim(), "Margem de lucro", true );
        float preco_venda = RetornarNumeroFloat.floatTF( 
            Produto.tfPRECODEVENDA, Produto.tfPRECODEVENDA.getText().trim(), "Preço de venda", true );
                
        switch( str ){
            case "Preço de Custo": 
                
                if( preco_de_custo != 0 ){
                                
                    if( margem != 0 ){
                    
                        preco_venda = ( (margem / 100) * preco_de_custo ) + preco_de_custo;
                        Produto.tfPRECODEVENDA.setText( String.valueOf( preco_venda ) );
                    
                        if( preco_venda != 0 ){
                            float valor_lucro = preco_venda - preco_de_custo;
                            Produto.tfVALORDELUCRO.setText( String.valueOf( valor_lucro ) );
                        }
                    }
                    else{
                    
                        if( preco_venda != 0 ){
                            float valor_lucro = preco_venda - preco_de_custo;
                            Produto.tfVALORDELUCRO.setText( String.valueOf( valor_lucro ) );
                        }
                    }
                }
                else{
                    
                    Produto.tfPRECODEVENDA.setText( "" );
                    Produto.tfVALORDELUCRO.setText( "" );
                }
                
                break;
                
                
                
                
            case "Margem de lucro":  
                
                if( margem != 0 ){
                    
                    if( preco_de_custo != 0 ){
                    
                        preco_venda = ( (margem / 100) * preco_de_custo ) + preco_de_custo;
                        Produto.tfPRECODEVENDA.setText( String.valueOf( preco_venda ) );
                    
                        if( preco_venda != 0 ){
                            float valor_lucro = preco_venda - preco_de_custo;
                            Produto.tfVALORDELUCRO.setText( String.valueOf( valor_lucro ) );
                        }
                    }
                    else{
                    
                        if( preco_venda != 0 ){
                            float valor_lucro = preco_venda - preco_de_custo;
                            Produto.tfVALORDELUCRO.setText( String.valueOf( valor_lucro ) );
                        }
                    }
                }
                else{
                    
                    Produto.tfPRECODEVENDA.setText( String.valueOf( preco_de_custo ) );
                    Produto.tfVALORDELUCRO.setText( "0.0" );
                }
                
                break;   
                
                
                
                
            case "Preço de Venda":  
                
                if( preco_venda != 0 ){
                    
                    if( preco_de_custo != 0 ){
                    
                        
                        Produto.tfMARGEMDELUCRO.setText( "" );
                        /*margem = ( preco_venda - preco_de_custo ) / preco_de_custo;
                        Produto.tfMARGEMDELUCRO.setText( String.valueOf( margem * 100 ) );*/
                    
                        float valor_lucro = preco_venda - preco_de_custo;
                        Produto.tfVALORDELUCRO.setText( String.valueOf( valor_lucro ) );
                    }
                    else{
                    
                        float valor_lucro = preco_venda - preco_de_custo;
                        Produto.tfVALORDELUCRO.setText( String.valueOf( valor_lucro ) );
                    }
                }
                else{
                    
                    Produto.tfMARGEMDELUCRO.setText( "" );
                    Produto.tfVALORDELUCRO.setText( "" );
                }
                
                break;       
        }
    }
    
}

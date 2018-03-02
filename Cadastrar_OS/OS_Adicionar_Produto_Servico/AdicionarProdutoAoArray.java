/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Adicionar_Produto_Servico;

import OS.OS;
import home.Home;
import java.awt.Container;
import utilidades.Float_Para_Moeda;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class AdicionarProdutoAoArray {
    
    public AdicionarProdutoAoArray( Home Home2, OS OS2, int codigo2, String nomeProduto2, String unidade2, float valorUnitario2, float quantidade2, String observacao2 ) {
        
        Home = Home2;
        OS = OS2;   
        codigo         = codigo2;
        nomeProduto    = nomeProduto2;
        unidade        = unidade2;
        valorUnitario  = valorUnitario2;
        quantidade     = quantidade2;
        observacao     = observacao2;
        
        inicioAdicionarProdutoAoArray();
        
    }
    
    Home Home;
    OS OS;
    int codigo                ;
    String nomeProduto    = "";
    String unidade        = "";
    float valorUnitario       ;
    float quantidade          ;
    String observacao     = "";
    
    Preenchimento_Lista Preenchimento_Lista;
    
       
    boolean um = false;
    private void inicioAdicionarProdutoAoArray(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        Get_Preenchimento_Lista_Setado GetProduto = new Get_Preenchimento_Lista_Setado();
                     
                        Preenchimento_Lista = GetProduto.jpLista(
                                codigo, nomeProduto, unidade, valorUnitario, quantidade, observacao 
                        );
                        
                        verificarParaAdicionarProdutoALista();
                    
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "AdicionarProdutoAoArray, "
                            + "\ninicioAdicionarProdutoAoArray()"
                            + e.getMessage().toString()
                            + "\n", "inicioAdicionarProdutoAoArray()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void verificarParaAdicionarProdutoALista() {  
        
        int n = OS.listaPreenchimento_ListaProduto.size();
        
        if( n > 0 ){
            
            for( int i = 0; i < n; i++ ){
            
                if( Preenchimento_Lista.codigo == OS.listaPreenchimento_ListaProduto.get(i).codigo ){
                                    
                    float novaQuantidade = OS.listaPreenchimento_ListaProduto.get(i).quantidade +
                            Preenchimento_Lista.quantidade;
                    OS.listaPreenchimento_ListaProduto.get(i).quantidade = novaQuantidade;
                    OS.listaPreenchimento_ListaProduto.get(i).lbQuantidade.setText   ( 
                            String.valueOf( novaQuantidade    )     );
                
                    float novoValorUnitario = OS.listaPreenchimento_ListaProduto.get(i).valorUnitario;
                
                    float novoVUnitXQuant = novaQuantidade * novoValorUnitario;
                    OS.listaPreenchimento_ListaProduto.get(i).vUnitXQuant = novoVUnitXQuant;
                
                    OS.listaPreenchimento_ListaProduto.get(i).lbValorUnitXQuantidade.setText   ( 
                            String.valueOf( novoVUnitXQuant    )     );                              
                    
                    somaValoresDosProdutoDaLista();
                    somaTotal();
                    break;
                }
                else { 
                    int v = i;
                     
                    if( v+1 == n ){
                        
                        OS.listaPreenchimento_ListaProduto.add(Preenchimento_Lista);
                        adicionarProdutoALista( Preenchimento_Lista ); 
                    }
                }
                
            }        
        } 
        else{
            
            OS.listaPreenchimento_ListaProduto.add(Preenchimento_Lista);
            adicionarProdutoALista( Preenchimento_Lista ); 
        }
                            
    }
    
    private void adicionarProdutoALista( Preenchimento_Lista Preenchimento_ListaDoArray ) {                        
        
        OS.OS_Corpo.OS_Corpo_Adicionar_Produto.jpLista.add( 
                       Preenchimento_ListaDoArray
        ); 
        
        OS.validate();    
        
        somaValoresDosProdutoDaLista();
        somaTotal();
        
        adicionarEvento(Preenchimento_ListaDoArray);
    }
    
    
    
    
    
    
    
    
    
    
     private void somaValoresDosProdutoDaLista() {  
        
        int n = OS.listaPreenchimento_ListaProduto.size();

        float totalProdutos = 0;
        for( int i = 0; i < n; i++ ){
            
            totalProdutos += OS.listaPreenchimento_ListaProduto.get(i).vUnitXQuant;
        }
            
        Float_Para_Moeda.inicioJLabel( OS.OS_Corpo.OS_Corpo_Adicionar_Produto_Norte.lbTotalProdutos, totalProdutos, true );
        //OS.OS_Corpo.OS_Corpo_Adicionar_Produto_Norte.lbTotalProdutos.setText( String.valueOf(totalProdutos) );
     }
     
     private void somaTotal() {  

         Soma_total_produtos_servicos Soma_total_produtos_servicos = new Soma_total_produtos_servicos( Home, OS);
        /*float totalProdutos = Float.parseFloat( OS.OS_Corpo.OS_Corpo_Adicionar_Produto_Norte.lbTotalProdutos.getText().trim() );
        float totalServicos = Float.parseFloat( OS.OS_Corpo.OS_Corpo_Adicionar_Produto_Norte.lbTotalServicos.getText().trim() );
            
        float total = totalProdutos + totalServicos;
        OS.OS_Corpo.lbTotalEsquerdo.setText( String.valueOf(total) );*/
     }
     
     
     
     
     
     
     
     
     
     
     
     
     private void adicionarEvento(final Preenchimento_Lista Preenchimento_ListaDoArray) {  
         
         Preenchimento_ListaDoArray.lbRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                                
                OS.listaPreenchimento_ListaProduto.remove( Preenchimento_ListaDoArray );

                Container parent = Preenchimento_ListaDoArray.getParent();
                parent.remove( Preenchimento_ListaDoArray );
                parent.validate();
                parent.repaint();
                
                somaValoresDosProdutoDaLista();
                somaTotal();
                                
            }
        });
                  
     }

        
}

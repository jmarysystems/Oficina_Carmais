/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Adicionar_Produto_Servico;

import OS.OS;
import OS_Forma_de_Pagamento.Setar_Definicao_Forma_Pgto_Dentro_OS;
import home.Home;
import utilidades.Float_Para_Moeda;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Soma_total_produtos_servicos {
    
    public Soma_total_produtos_servicos( Home Home2, OS OS2 ) {
        
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
                    
                        soma();
                        
                        Setar_Definicao_Forma_Pgto_Dentro_OS Setar_Forma_Pgto_Dentro_OS = new Setar_Definicao_Forma_Pgto_Dentro_OS( Home, OS );
                    
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Soma_total_produtos_servicos, "
                            + "\ninicio()"
                            + e.getMessage()
                            + "\n", "inicio()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void soma() {  
        
        float totalProdutos = somaValoresDosProdutoDaLista();
        float totalServicos = somaValoresDosServicosDaLista();
            
        float total = totalProdutos + totalServicos;
        
        Float_Para_Moeda.inicioJLabel( OS.OS_Corpo.lbTotalEsquerdo, total, true );
        //OS.OS_Corpo.lbTotalEsquerdo.setText( String.valueOf(total) );
        
     }
    
    private float somaValoresDosProdutoDaLista() {  
        float retorno = 0;
        
        int n = OS.listaPreenchimento_ListaProduto.size();

        for( int i = 0; i < n; i++ ){
            
            retorno += OS.listaPreenchimento_ListaProduto.get(i).vUnitXQuant;
        }
            
        return retorno;
     }
    
    private float somaValoresDosServicosDaLista() {  
        float retorno = 0;
        
        int n = OS.listaPreenchimento_ListaServico.size();

        for( int i = 0; i < n; i++ ){
            
            retorno += OS.listaPreenchimento_ListaServico.get(i).vUnitXQuant;
        }
            
        return retorno;
     }
    
}

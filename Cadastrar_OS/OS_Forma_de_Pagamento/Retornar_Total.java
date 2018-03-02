/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Forma_de_Pagamento;

import OS.OS;
import home.Home;

/**
 *
 * @author ana
 */
public class Retornar_Total {
    
    public Retornar_Total( Home Home2, OS OS2 ) {
        
        OS = OS2;   
        Home = Home2;
    }
    
    OS OS;
    Home Home;
    
   public float getTotal() {  
        float retorno = 0;  
        
        float totalProdutos = somaValoresDosProdutoDaLista();
        float totalServicos = somaValoresDosServicosDaLista();
            
        retorno = totalProdutos + totalServicos;
        
        return retorno;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto;

import OS_Forma_de_Pagamento.*;
import OS.OS;
import home.Home; 

/**
 *
 * @author ana
 */
public class Recebendo_Definicao_Forma_Pgto_da_OS {
    
    public Recebendo_Definicao_Forma_Pgto_da_OS( 
            Home Home2, OS OS2, float Total, Bean_OS_Contas_Disponiveis Bean_Conta,
            Bean_OS_TipoDeDocumento Bean_Documento, Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto ) { 

        inicio( Home2, OS2, Total, Bean_Conta, Bean_Documento, Bean_Forma_Pgto );
    }
    
    
    private void inicio( Home Home2, OS OS2, float Total, Bean_OS_Contas_Disponiveis Bean_Conta,
            Bean_OS_TipoDeDocumento Bean_Documento, Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto ) { 
     
        
        OS_Definir_Forma_de_Pagamento_Home OS_Definir_Forma_de_Pagamento_Home = new OS_Definir_Forma_de_Pagamento_Home(
                Home2, OS2, Total, Bean_Conta, Bean_Documento, Bean_Forma_Pgto
        );
        //System.out.println( "Setando definição externa" );
     }
    
}

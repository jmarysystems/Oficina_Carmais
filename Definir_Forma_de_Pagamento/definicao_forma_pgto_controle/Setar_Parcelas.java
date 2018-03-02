/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_controle;

import OS.OS;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import definicao_forma_pgto.OS_Definir_Forma_de_Pagamento;
import home.Home;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_Parcelas {
    
    OS OS;
    Home Home;
    OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento;
    
    float Total;        
    Bean_OS_Contas_Disponiveis Bean_Conta;        
    Bean_OS_TipoDeDocumento    Bean_Documento;        
    Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto;
    
    public Setar_Parcelas( 
            Home Home2, OS OS2, OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento2,
            float Total2, 
            Bean_OS_Contas_Disponiveis Bean_Conta2,
            Bean_OS_TipoDeDocumento Bean_Documento2, 
            Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto2 ) {
        
        OS = OS2;
        Home = Home2;
        OS_Definir_Forma_de_Pagamento = OS_Definir_Forma_de_Pagamento2;
        
        Total           = Total2;        
        Bean_Conta      = Bean_Conta2;        
        Bean_Documento  = Bean_Documento2;        
        Bean_Forma_Pgto = Bean_Forma_Pgto2;
    }
            
    boolean um1 = false;
    public void inicio(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um1 == false ) {     um1 = true;
                    try { Thread.sleep(1); 
                    
                        iniciar();                                               
                                               
                    }catch(Exception e) {
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Definir_Forma_de_Pagamento_da_OS_Inicio, "
                                 + "\ninicio()"
                                 + e.getMessage()
                                 + "\n", "inicio()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um1 = false;
    }
    
    private void iniciar(){
        
        OS_Definir_Forma_de_Pagamento.Parcelas_OS_Definir_Forma_de_Pagamento.removeAll();
                        
        OS_Definir_Forma_de_Pagamento.Parcelas_OS_Definir_Forma_de_Pagamento.setLayout( new BorderLayout() );
        
        OS_Definir_Forma_de_Pagamento.Parcelas_OS_Definir_Forma_de_Pagamento.add( 
                OS_Definir_Forma_de_Pagamento.Topo_Preenchimento_da_Lista, BorderLayout.NORTH );
        
        Parcelas_OS_Definir_Forma_de_Pagamento Parcelas_OS_Definir_Forma_de_Pagamento = new Parcelas_OS_Definir_Forma_de_Pagamento(
                Home, OS, OS_Definir_Forma_de_Pagamento,
                Total, 
                Bean_Conta,
                Bean_Documento, 
                Bean_Forma_Pgto );
        
        JScrollPane jp = new JScrollPane( Parcelas_OS_Definir_Forma_de_Pagamento );
                    jp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));   

        OS_Definir_Forma_de_Pagamento.Parcelas_OS_Definir_Forma_de_Pagamento.add( 
                jp, BorderLayout.CENTER );
        
        jp.revalidate();
        OS_Definir_Forma_de_Pagamento.revalidate();
        Parcelas_OS_Definir_Forma_de_Pagamento.revalidate();
        OS_Definir_Forma_de_Pagamento.Parcelas_OS_Definir_Forma_de_Pagamento.revalidate();

    }

    
}

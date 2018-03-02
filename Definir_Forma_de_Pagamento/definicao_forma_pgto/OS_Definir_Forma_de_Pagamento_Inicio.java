/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto;

import OS.OS;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import definicao_forma_pgto_Setar_CB_Forma_Pgto.Setar_CB_OS_Forma_de_Pgto;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class OS_Definir_Forma_de_Pagamento_Inicio {
    
    OS OS;
    Home Home;
    OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento;
    
    float Total;        
    Bean_OS_Contas_Disponiveis Bean_Conta;        
    Bean_OS_TipoDeDocumento    Bean_Documento;        
    Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto;
    
    public OS_Definir_Forma_de_Pagamento_Inicio( 
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
                        
        Setar_CB_OS_Forma_de_Pgto Setar_CB_OS_Forma_de_Pgto = new Setar_CB_OS_Forma_de_Pgto( 
            Home, OS, OS_Definir_Forma_de_Pagamento,
            Total, 
            Bean_Conta,
            Bean_Documento, 
            Bean_Forma_Pgto );


        CBParcelas();
        CBTipoDeEntrada_CBTipoDeDesconto();
    }
    
    private void CBParcelas(){
        
        if( OS.pegar_e_GetQTDParcelas() == 0 ) {
            
            OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.setEnabled( false );
        }
        else{
            
            OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.setEnabled( true );
        }
    }
    
    private void CBTipoDeEntrada_CBTipoDeDesconto(){
        
        if( OS.pegar_e_GetCBTIPODEENTRADASELECIONADO() == 0 ) {
            
            OS_Definir_Forma_de_Pagamento.tfValorEntrada.setText( "" );
            OS_Definir_Forma_de_Pagamento.tfValorEntrada.setEnabled( false );
            OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.setSelectedIndex( OS.pegar_e_GetCBTIPODEENTRADASELECIONADO() );
        } 
        else{
            
            OS_Definir_Forma_de_Pagamento.tfValorEntrada.setEnabled( true );
            OS_Definir_Forma_de_Pagamento.tfValorEntrada.setText( String.valueOf( OS.pegar_e_GetValorDeEntrada() ) );
            OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.setSelectedIndex( OS.pegar_e_GetCBTIPODEENTRADASELECIONADO() );
        }
        
        if( OS.pegar_e_GetCBTIPODEDESCONTO() == 0 ) {
            
            OS_Definir_Forma_de_Pagamento.tfValorDesconto.setText( "" );
            OS_Definir_Forma_de_Pagamento.tfValorDesconto.setEnabled( false );
            OS_Definir_Forma_de_Pagamento.cbTipoDeDesconto.setSelectedIndex( OS.pegar_e_GetCBTIPODEDESCONTO() );
            
        }
        else{
            
            OS_Definir_Forma_de_Pagamento.tfValorDesconto.setEnabled( true );
            OS_Definir_Forma_de_Pagamento.tfValorDesconto.setText( String.valueOf( OS.pegar_e_GetVALORDEDESCONTO() ) );
            OS_Definir_Forma_de_Pagamento.cbTipoDeDesconto.setSelectedIndex( OS.pegar_e_GetCBTIPODEDESCONTO() );
        }
        
    }
    
}

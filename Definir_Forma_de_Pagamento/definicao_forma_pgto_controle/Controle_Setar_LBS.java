/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_controle;

import OS.OS;
import OS_Forma_de_Pagamento.Retornar_Total;
import definicao_forma_pgto.OS_Definir_Forma_de_Pagamento;
import home.Home;
import utilidades.Float_Para_Moeda;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Controle_Setar_LBS {
    
    OS OS;
    Home Home;
    OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento;
    float valorParc = 0;

    
    public Controle_Setar_LBS( 
            Home Home2, OS OS2, OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento2, float valorParc2 ) {
        
        OS = OS2;
        Home = Home2;
        OS_Definir_Forma_de_Pagamento = OS_Definir_Forma_de_Pagamento2;
        valorParc = valorParc2;
        
        inicio();
    }
            
    boolean um1 = false;
    private void inicio(){
        
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
        
        if( OS.pegar_e_GetQTDParcelas() == 0 ) {
            
            OS_Definir_Forma_de_Pagamento.lbFormaDePagamento.setText( "À Vista" );
            
            Retornar_Total Retornar_Total = new Retornar_Total( Home, OS );
            Float_Para_Moeda.inicioJLabel( OS_Definir_Forma_de_Pagamento.lbValorAvista, Retornar_Total.getTotal(), true );
        }
        else if( OS.pegar_e_GetQTDParcelas() == 1 ) {
            
            if( OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.getSelectedItem() != null ) {

                    String tipoDeEntrada = OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.getSelectedItem().toString(); 
                                                            
                    if( tipoDeEntrada.equals("Sem entrada") ){

                        OS_Definir_Forma_de_Pagamento.lbFormaDePagamento.setText( "0 + "+ "1 " + " Vez de " + valorParc );
                    }
                    else{

                        OS_Definir_Forma_de_Pagamento.lbFormaDePagamento.setText( "1 + "+ "1 " + " Vez de " + valorParc );
                    }   
                                                        
            }
            
            
        }
        else{
            
            if( OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.getSelectedItem() != null && OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.isEnabled() ) {

                    String tipoDeEntrada = OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.getSelectedItem().toString(); 
                                                            
                    if( tipoDeEntrada.equals("Sem entrada") ){

                        OS_Definir_Forma_de_Pagamento.lbFormaDePagamento.setText( "0 + "+ OS.pegar_e_GetQTDParcelas() + " Vezes de " + valorParc );
                    }
                    else{

                        OS_Definir_Forma_de_Pagamento.lbFormaDePagamento.setText( "1 + "+ OS.pegar_e_GetQTDParcelas() + " Vezes de " + valorParc );
                    }   
                                                        
            }
                        
        }
        
    }

    
}

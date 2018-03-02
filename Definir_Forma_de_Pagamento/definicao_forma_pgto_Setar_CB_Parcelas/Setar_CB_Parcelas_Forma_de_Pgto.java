/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_Setar_CB_Parcelas;

import OS.OS;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import definicao_forma_pgto.OS_Definir_Forma_de_Pagamento;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_CB_Parcelas_Forma_de_Pgto {
    
    int PARCELAMENTOMAXIMO;
    OS OS;
    Home Home;
    OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento;
    
    float Total;        
    Bean_OS_Contas_Disponiveis Bean_Conta;        
    Bean_OS_TipoDeDocumento    Bean_Documento;        
    Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto;
    
    public Setar_CB_Parcelas_Forma_de_Pgto(
            int PARCELAMENTOMAXIMO2,
            Home Home2, OS OS2, OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento2,
            float Total2, 
            Bean_OS_Contas_Disponiveis Bean_Conta2,
            Bean_OS_TipoDeDocumento Bean_Documento2, 
            Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto2 ) {
        
        PARCELAMENTOMAXIMO = PARCELAMENTOMAXIMO2;
        OS = OS2;
        Home = Home2;
        OS_Definir_Forma_de_Pagamento = OS_Definir_Forma_de_Pagamento2;
        
        Total           = Total2;        
        Bean_Conta      = Bean_Conta2;        
        Bean_Documento  = Bean_Documento2;        
        Bean_Forma_Pgto = Bean_Forma_Pgto2;
        
        inicio();
    }
    
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        setar();
                        
                    }catch(Exception e) {
                        
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_CB_Parcelas_Forma_de_Pagamento_Inicio, "
                                + "\ninicio()\n"
                                + e.getMessage()
                                + "\n", "inicio()" ); 
                        
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void setar(){  
        
        Parcelas_Forma_de_Pagamento_Control_Listar Control = new Parcelas_Forma_de_Pagamento_Control_Listar();
        List<Bean_Parcelas_Forma_de_Pagamento> Bean_Parcelas_Forma_de_Pagamento = Control.listar( PARCELAMENTOMAXIMO );
                
        mostrarLista( Bean_Parcelas_Forma_de_Pagamento );
    }
    
    protected void mostrarLista( List<Bean_Parcelas_Forma_de_Pagamento> Bean_Parcelas_Forma_de_Pagamento ){
                                     
        if( OS_Definir_Forma_de_Pagamento.cbParcelas.getItemCount() > 0 ) { OS_Definir_Forma_de_Pagamento.cbParcelas.removeAllItems(); /*Formas_de_Pagamento_Home.listBookInfoContaDeDestino.clear();*/ }       

        for (int i = 0; i < Bean_Parcelas_Forma_de_Pagamento.size(); i++){ 
                                                       
            OS_Definir_Forma_de_Pagamento.cbParcelas.addItem( new BookInfo_Parcelas_Forma_de_Pagamento( 
                    
                    Bean_Parcelas_Forma_de_Pagamento.get(i).getCODIGO(), 
                    
                    Bean_Parcelas_Forma_de_Pagamento.get(i).getNOME(), 
                    
                    Bean_Parcelas_Forma_de_Pagamento.get(i).getPARCELAMENTOMAXIMO()                             
                                      
            )
            );   
            
        }
        
        System.out.println( "Setar_CB_Parcelas_Forma_de_Pgto   " + Bean_Forma_Pgto.getPARCELAMENTOMAXIMO() );
        
        OS_Definir_Forma_de_Pagamento.cbFormaDePagamento.setSelectedIndex( OS.pegar_e_GetCBFORMAPGTOSELECIONADO() );
        OS_Definir_Forma_de_Pagamento.cbParcelas.setSelectedIndex( OS.pegar_e_GetCBPARCELASSELECIONADO() );

        
        //OS_Definir_Forma_de_Pagamento.setarParcelas( Home, OS, Total, Bean_Conta, Bean_Documento, Bean_Forma_Pgto ); 
    }
    
}

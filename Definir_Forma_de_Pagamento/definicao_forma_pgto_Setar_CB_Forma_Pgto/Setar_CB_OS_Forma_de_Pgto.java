/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_Setar_CB_Forma_Pgto;

import OS.OS;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import definicao_forma_pgto.OS_Definir_Forma_de_Pagamento;
import definicao_forma_pgto_Setar_CB_Parcelas.GetIntParcelamentoMaximo;
import definicao_forma_pgto_Setar_CB_Parcelas.Setar_CB_Parcelas_Forma_de_Pgto;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_CB_OS_Forma_de_Pgto {
    
    OS OS;
    Home Home;
    OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento;
    
    float Total;        
    Bean_OS_Contas_Disponiveis Bean_Conta;        
    Bean_OS_TipoDeDocumento    Bean_Documento;        
    Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto;
    
    public Setar_CB_OS_Forma_de_Pgto( 
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
                        
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_CB_OS_Forma_de_Pagamento, "
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
        
        Forma_de_Pagamento_Control_Listar Control = new Forma_de_Pagamento_Control_Listar( Home.ip );
        List<Bean_OS_Forma_de_Pgto> Bean_OS_Forma_de_Pgto = Control.listar( "%"+""+"%" );
                
        mostrarLista( Bean_OS_Forma_de_Pgto );
    }
    
    protected void mostrarLista( List<Bean_OS_Forma_de_Pgto> Bean_OS_Forma_de_Pgto ){
                                     
        if( OS_Definir_Forma_de_Pagamento.cbFormaDePagamento.getItemCount() > 0 ) { OS_Definir_Forma_de_Pagamento.cbFormaDePagamento.removeAllItems(); /*Formas_de_Pagamento_Home.listBookInfoContaDeDestino.clear();*/ }       

        int select = 0;
        for (int i = 0; i < Bean_OS_Forma_de_Pgto.size(); i++){ 
            
            if( Bean_OS_Forma_de_Pgto.get(i).getID() == Bean_Forma_Pgto.getID() ) {
                
                select = i;
            }
                                                                                     
            OS_Definir_Forma_de_Pagamento.cbFormaDePagamento.addItem( new BookInfo_OS_Forma_de_Pgto( 
                    Bean_OS_Forma_de_Pgto.get(i).getID(), 
                    
                    Bean_OS_Forma_de_Pgto.get(i).getNOME(),                                   
                    Bean_OS_Forma_de_Pgto.get(i).getPARCELAMENTOMAXIMO(),                      
                    Bean_OS_Forma_de_Pgto.get(i).getPARCELASSEMJUROS(),                        
        
                    Bean_OS_Forma_de_Pgto.get(i).getJUROSPORCENTAGEM(),                       
                    Bean_OS_Forma_de_Pgto.get(i).getTAXAFIXA(),                               
                    Bean_OS_Forma_de_Pgto.get(i).getDESCONTOAVISTAPORCENTAGEM(),              
                    
                    Bean_OS_Forma_de_Pgto.get(i).getCONTADEDESTINOPADRAOID(),                 
                    
                    Bean_OS_Forma_de_Pgto.get(i).getTIPODEDOCUMENTOPADRAOID(),                
                    
                    Bean_OS_Forma_de_Pgto.get(i).getINTERVALOPADRAOENTREASPARCELAS(),         
                    Bean_OS_Forma_de_Pgto.get(i).getINTERVALOPADRAOENTREASPARCELASDIAOUMES() 
            )
            ); 
                                    
        }
        
        //System.out.println( "Bean_Forma_Pgto.getPARCELAMENTOMAXIMO()" + Bean_OS_Forma_de_Pgto.get(select).getPARCELAMENTOMAXIMO() );
        String PARCELAMENTOMAXIMO = Bean_Forma_Pgto.getPARCELAMENTOMAXIMO();                 
                GetIntParcelamentoMaximo GetIntParcelamentoMaximo = new GetIntParcelamentoMaximo();
                
                int numeroParcelas = GetIntParcelamentoMaximo.getInt( PARCELAMENTOMAXIMO );
                
                Setar_CB_Parcelas_Forma_de_Pgto Setar_CB_Parcelas = new Setar_CB_Parcelas_Forma_de_Pgto( 
                        numeroParcelas, Home, OS, 
                        OS_Definir_Forma_de_Pagamento,
                        Total, 
                        Bean_Conta,
                        Bean_Documento, 
                        Bean_Forma_Pgto );
        
        //Definir_Forma_de_Pagamento_Valor_das_Parcelas Parcelas = new Definir_Forma_de_Pagamento_Valor_das_Parcelas( OS, Home, Definir_Forma_de_Pagamento_Home );
        
        //int QTDNoCB_OS_Forma_de_Pgto = OS_Definir_Forma_de_Pagamento.cbFormaDePagamento.getItemCount();
        //System.out.println( "QTDNoCB_OS_Forma_de_Pgto   " + QTDNoCB_OS_Forma_de_Pgto );
                                           
    }
            
}

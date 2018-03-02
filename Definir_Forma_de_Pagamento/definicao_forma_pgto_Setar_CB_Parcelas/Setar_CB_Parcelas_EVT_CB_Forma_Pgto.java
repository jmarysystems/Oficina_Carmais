/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_Setar_CB_Parcelas;

import OS.OS;
import definicao_forma_pgto.OS_Definir_Forma_de_Pagamento;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_CB_Parcelas_EVT_CB_Forma_Pgto {
    
    OS OS;
    int PARCELAMENTOMAXIMO;
    Home Home;
    OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento;
    
    public Setar_CB_Parcelas_EVT_CB_Forma_Pgto( OS OS2, int PARCELAMENTOMAXIMO2, Home Home2, OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento2 ) {
        
        OS = OS2;
        PARCELAMENTOMAXIMO = PARCELAMENTOMAXIMO2;
        Home = Home2;
        OS_Definir_Forma_de_Pagamento = OS_Definir_Forma_de_Pagamento2;
        
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
        
        OS_Definir_Forma_de_Pagamento.cbParcelas.setSelectedIndex( 0 );
        
        //Setar_OS_OS_Forma_de_Pagamento_Inicio_Parcelas Setar_OS_OS_Forma_de_Pagamento_Inicio_Parcelas = new Setar_OS_OS_Forma_de_Pagamento_Inicio_Parcelas( OS, Home, Definir_Forma_de_Pagamento_Home );
                           
        //Setar_OS_OS_Forma_de_Pagamento_Inicio_Tipo_de_Entrada Setar_OS_OS_Forma_de_Pagamento_Inicio_Tipo_de_Entrada = new Setar_OS_OS_Forma_de_Pagamento_Inicio_Tipo_de_Entrada( OS, Home, Definir_Forma_de_Pagamento_Home );
    
        //Definir_Forma_de_Pagamento_Valor_das_Parcelas Parcelas = new Definir_Forma_de_Pagamento_Valor_das_Parcelas( OS, Home, Definir_Forma_de_Pagamento_Home );
    }
    
}

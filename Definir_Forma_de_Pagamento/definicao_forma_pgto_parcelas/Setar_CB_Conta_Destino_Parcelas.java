/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_parcelas;

import definicao_forma_pgto_parcelas.Preenchimento_Lista_Parcelas;
import OS.OS;
import formas_de_pagamento_Setar_CB_conta_de_destino.Bean_Contas_Disponiveis_Forma_de_Pagamento;
import formas_de_pagamento_Setar_CB_conta_de_destino.BookInfoContaDeDestino;
import formas_de_pagamento_Setar_CB_conta_de_destino.Conta_Destino_Control_Listar;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_CB_Conta_Destino_Parcelas {
    
    OS OS;
    Home Home;
    Preenchimento_Lista_Parcelas Preenchimento_Lista_Parcelas;
    
    public Setar_CB_Conta_Destino_Parcelas( OS OS2, Home Home2, Preenchimento_Lista_Parcelas Preenchimento_Lista_Parcelas2 ) {
        
        OS = OS2;
        Home = Home2;
        Preenchimento_Lista_Parcelas = Preenchimento_Lista_Parcelas2;

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
                        
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_CB_Conta_Destino_Parcelas, "
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
        
        Conta_Destino_Control_Listar Control = new Conta_Destino_Control_Listar( Home.ip );
        List<Bean_Contas_Disponiveis_Forma_de_Pagamento> Bean_Contas_Disponiveis_Forma_de_Pagamento = Control.listar( "%"+""+"%" );
                
        mostrarLista( Bean_Contas_Disponiveis_Forma_de_Pagamento );
    }
    
    protected void mostrarLista( List<Bean_Contas_Disponiveis_Forma_de_Pagamento> Bean_Contas_Disponiveis ){
                                     
        if( Preenchimento_Lista_Parcelas.cbCONTADEDESTINO.getItemCount() > 0 ) { Preenchimento_Lista_Parcelas.cbCONTADEDESTINO.removeAllItems(); /*Formas_de_Pagamento_Home.listBookInfoContaDeDestino.clear();*/ }       
            
        int select = 0;
        for (int i = 0; i < Bean_Contas_Disponiveis.size(); i++){ 
            
            if( Bean_Contas_Disponiveis.get(i).getID() == Preenchimento_Lista_Parcelas.CONTADEDESTINO ) {
                
                select = i;
            }
                                                                                     
            Preenchimento_Lista_Parcelas.cbCONTADEDESTINO.addItem( new BookInfoContaDeDestino( 
                    Bean_Contas_Disponiveis.get(i).getID(), 
                    Bean_Contas_Disponiveis.get(i).getAPELIDOCURTO(), 
                    Bean_Contas_Disponiveis.get(i).getNOMEDESCRICAODACONTA()
            )
            );    
        }
        
        Preenchimento_Lista_Parcelas.cbCONTADEDESTINO.setSelectedIndex( select );
           
    }
    
}

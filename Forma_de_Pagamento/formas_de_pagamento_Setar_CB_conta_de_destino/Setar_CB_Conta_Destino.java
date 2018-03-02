/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_Setar_CB_conta_de_destino;

import formas_de_pagamento.Formas_de_Pagamento_Home;
import home.Home;
import java.util.List;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_CB_Conta_Destino {
    
    Home Home;
    Formas_de_Pagamento_Home Formas_de_Pagamento_Home;
    
    public Setar_CB_Conta_Destino( Home Home2, Formas_de_Pagamento_Home Formas_de_Pagamento_Home2 ) {
        
        Home = Home2;
        Formas_de_Pagamento_Home = Formas_de_Pagamento_Home2;
        
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
                        
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_CB_Conta_Destino, "
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
                                     
        if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao.getItemCount() > 0 ) { Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao.removeAllItems(); /*Formas_de_Pagamento_Home.listBookInfoContaDeDestino.clear();*/ }       
                
        for (int i = 0; i < Bean_Contas_Disponiveis.size(); i++){ 
                              //System.out.println( "*********** " + Bean_Contas_Disponiveis.get(i).getID() );
            Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao.addItem( new BookInfoContaDeDestino( 
                    Bean_Contas_Disponiveis.get(i).getID(), 
                    Bean_Contas_Disponiveis.get(i).getAPELIDOCURTO(), 
                    Bean_Contas_Disponiveis.get(i).getNOMEDESCRICAODACONTA()
            )
            );    
        }
           
    }
    
}

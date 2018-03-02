/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_metodos;

import OS.OS;

/**
 *
 * @author ana
 */
public class OS_Botoes_Inicio {
    
    public OS_Botoes_Inicio( OS OS2 ) {
        
        OS = OS2;
        
        inicio();  
    }
    
    OS OS;
    
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        botoes      ( true );
                        inicio_TSF_TAS_CBS( true );
                    }catch(Exception e) { }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void botoes( boolean b ){
        try { 
                    
            OS.OS_Botoes.btNovo     .setEnabled( b  );
            OS.OS_Botoes.btAlterar  .setEnabled( !b );
            OS.OS_Botoes.btCancelar .setEnabled( b  );
            OS.OS_Botoes.btExcluir  .setEnabled( !b );
            OS.OS_Botoes.btSalvar   .setEnabled( !b );
            OS.OS_Botoes.btAtualizar.setEnabled( !b  );
            OS.OS_Botoes.btPesquisar.setEnabled( b  );
        }catch(Exception e) { }
    }
    
    private void inicio_TSF_TAS_CBS( boolean b ){
        try { 
                    
            OS.OS_Corpo.tfCliente                      .setEnabled( !b );
            OS.OS_Corpo.lbCliente                      .setEnabled( !b );
            OS.OS_Corpo.tfVeiculo                      .setEnabled( !b );
            OS.OS_Corpo.lbVeiculo                      .setEnabled( !b );
            OS.OS_Corpo.tfReferencia                   .setEnabled( !b );
            OS.OS_Corpo.tfDataAprovacao                .setEnabled( !b );
            OS.OS_Corpo.tfDataAprovacao                .setEnabled( !b );
            OS.OS_Corpo.tfDataPrevistaEntrega          .setEnabled( !b );
            OS.OS_Corpo.taDescricaoProd_Serv           .setEnabled( !b );
            OS.OS_Corpo.taLaudoTecnico                 .setEnabled( !b );
            OS.OS_Corpo.taLaudoTecnico                 .setEnabled( !b );
            
            OS.OS_Corpo.cbTecnico                      .setEnabled( !b );
            OS.OS_Corpo.tfModelo                       .setEnabled( !b );
            OS.OS_Corpo.cbSituacao                     .setEnabled( !b );
            OS.OS_Corpo.tfDataEntrega                  .setEnabled( !b );
            OS.OS_Corpo.tfDiasDeGarantia               .setEnabled( !b );
            OS.OS_Corpo.taDefeitoDescritoPeloCliente   .setEnabled( !b );
            OS.OS_Corpo.taCheckList                    .setEnabled( !b );
            
            OS.OS_Corpo.Controle_De_Inserir.cbAdicionar                    .setEnabled( !b );
            OS.OS_Corpo.Controle_De_Inserir.tfObservacoesAdicionais        .setEnabled( !b );
            OS.OS_Corpo.Controle_De_Inserir.btInserir                      .setEnabled( !b );
            
            OS.OS_Corpo.lbAlterarFormaDePagamento      .setEnabled( !b );

        }catch(Exception e) { }
    }

    
}

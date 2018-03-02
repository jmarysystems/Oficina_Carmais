/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Forma_de_Pagamento;

import OS.OS;
import definicao_forma_pgto.Recebendo_Definicao_Forma_Pgto_da_OS;
import home.Home; 
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_Definicao_Forma_Pgto_Fora_OS {
    
    public Setar_Definicao_Forma_Pgto_Fora_OS( Home Home2, OS OS2 ) {
        
        OS = OS2;   
        Home = Home2;
        
        inicio();
    }
    
    OS OS;
    Home Home;
    
    boolean um = false;
    private void inicio(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        setar();
                    
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_Definicao_Forma_Pgto_Dentro_OS, "
                            + "\ninicio()"
                            + e.getMessage()
                            + "\n", "inicio()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    private void setar() {  
        Retornar_Total Retornar_Total = new Retornar_Total( Home, OS );
        
        Bean_OS_Contas_Disponiveis Bean_Conta = new Bean_OS_Contas_Disponiveis();
        
        Bean_OS_TipoDeDocumento Bean_Documento = new Bean_OS_TipoDeDocumento();
        
        Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto = new Bean_OS_Forma_de_Pagamento();
        
        
        
        float Total = Retornar_Total.getTotal();
        
        Bean_Conta.setID                  ( OS.IDDACONTA );
        Bean_Conta.setAPELIDOCURTO        ( OS.APELIDOCURTO );
        Bean_Conta.setNOMEDESCRICAODACONTA( OS.NOMEDESCRICAODACONTA );
        
        Bean_Documento.setID           ( OS.IDTIPODEDOCUMENTO );                    
        Bean_Documento.setNOME         ( OS.NOMETIPODEDOCUMENTO );
        Bean_Documento.setTIPODECUSTO  ( OS.TIPODECUSTO );
        Bean_Documento.setVALORDECUSTO ( OS.VALORDECUSTO );
        
        Bean_Forma_Pgto.setID(OS.IDFORMAPGTO);                    
        Bean_Forma_Pgto.setNOME(OS.NOMEFORMAPGTO);
        Bean_Forma_Pgto.setPARCELAMENTOMAXIMO(OS.PARCELAMENTOMAXIMO);
        Bean_Forma_Pgto.setPARCELASSEMJUROS(OS.PARCELASSEMJUROS);                    
        Bean_Forma_Pgto.setJUROSPORCENTAGEM(OS.JUROSPORCENTAGEM);
        Bean_Forma_Pgto.setTAXAFIXA(OS.TAXAFIXA);
        Bean_Forma_Pgto.setDESCONTOAVISTAPORCENTAGEM(OS.DESCONTOAVISTAPORCENTAGEM);                    
        Bean_Forma_Pgto.setCONTADEDESTINOPADRAOID(OS.CONTADEDESTINOPADRAOID);                    
        Bean_Forma_Pgto.setTIPODEDOCUMENTOPADRAOID(OS.TIPODEDOCUMENTOPADRAOID);                    
        Bean_Forma_Pgto.setINTERVALOPADRAOENTREASPARCELAS(OS.INTERVALOPADRAOENTREASPARCELAS);
        Bean_Forma_Pgto.setINTERVALOPADRAOENTREASPARCELASDIAOUMES(OS.INTERVALOPADRAOENTREASPARCELASDIAOUMES);
        
        
        
        setarDefinicao( Total, Bean_Conta, Bean_Documento, Bean_Forma_Pgto );
     }
    
    private void setarDefinicao( float Total, Bean_OS_Contas_Disponiveis Bean_Conta,
            Bean_OS_TipoDeDocumento Bean_Documento, Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto ) { 
        
        Recebendo_Definicao_Forma_Pgto_da_OS Recebendo_Forma_Pgto_da_OS = new Recebendo_Definicao_Forma_Pgto_da_OS( Home, OS, Total, Bean_Conta, Bean_Documento, Bean_Forma_Pgto );
    }
    
}

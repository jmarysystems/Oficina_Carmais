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
import home.Home;
import java.awt.BorderLayout;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class OS_Definir_Forma_de_Pagamento_Home_Inicio {
    
    OS OS;
    Home Home;
    OS_Definir_Forma_de_Pagamento_Home OS_Definir_Forma_de_Pagamento_Home;
    
    float Total;        
    Bean_OS_Contas_Disponiveis Bean_Conta;        
    Bean_OS_TipoDeDocumento    Bean_Documento;        
    Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto;
    
    public OS_Definir_Forma_de_Pagamento_Home_Inicio( 
            Home Home2, OS OS2,OS_Definir_Forma_de_Pagamento_Home OS_Definir_Forma_de_Pagamento_Home2,
            float Total2, 
            Bean_OS_Contas_Disponiveis Bean_Conta2,
            Bean_OS_TipoDeDocumento Bean_Documento2, 
            Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto2 ) {
        
        OS = OS2;
        Home = Home2;
        OS_Definir_Forma_de_Pagamento_Home = OS_Definir_Forma_de_Pagamento_Home2;
        
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
        
        /*
        System.out.println( Bean_Conta.getID() );
        System.out.println( Bean_Conta.getAPELIDOCURTO() );
        System.out.println( Bean_Conta.getNOMEDESCRICAODACONTA() );

        System.out.println( "\n" );
        
        System.out.println( Bean_Documento.getID() );
        System.out.println( Bean_Documento.getNOME() );
        System.out.println( Bean_Documento.getTIPODECUSTO() );
        System.out.println( Bean_Documento.getVALORDECUSTO() );
        
        System.out.println( "\n" );
        
        System.out.println( Bean_Forma_Pgto.getID() );
        System.out.println( Bean_Forma_Pgto.getNOME() );
        System.out.println( Bean_Forma_Pgto.getPARCELAMENTOMAXIMO() );
        System.out.println( Bean_Forma_Pgto.getPARCELASSEMJUROS() );
        System.out.println( Bean_Forma_Pgto.getJUROSPORCENTAGEM() );
        System.out.println( Bean_Forma_Pgto.getTAXAFIXA() );
        System.out.println( Bean_Forma_Pgto.getDESCONTOAVISTAPORCENTAGEM() );
        System.out.println( Bean_Forma_Pgto.getCONTADEDESTINOPADRAOID() );
        System.out.println( Bean_Forma_Pgto.getTIPODEDOCUMENTOPADRAOID() );
        System.out.println( Bean_Forma_Pgto.getINTERVALOPADRAOENTREASPARCELAS() );
        System.out.println( Bean_Forma_Pgto.getINTERVALOPADRAOENTREASPARCELASDIAOUMES() );
        System.out.println( "\n" );*/
        
        OS_Definir_Forma_de_Pagamento_Home.setLayout( new BorderLayout() );
                       
        OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento = new OS_Definir_Forma_de_Pagamento(
                Home, OS, OS_Definir_Forma_de_Pagamento_Home,
                Total, 
                Bean_Conta,
                Bean_Documento, 
                Bean_Forma_Pgto );
        
        OS_Definir_Forma_de_Pagamento_Home.add( OS_Definir_Forma_de_Pagamento, BorderLayout.CENTER );
                    
        //System.out.println( "***********************************************" );
        
        Home.ControleTabs.AddTabSemControleNovo( OS.tabOS, "Definir Forma de Pagamento", "/imagens/alterar.gif", OS_Definir_Forma_de_Pagamento_Home );
    }
    
}

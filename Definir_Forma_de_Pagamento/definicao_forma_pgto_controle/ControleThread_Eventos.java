/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_controle;

import OS.OS;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import definicao_forma_pgto.OS_Definir_Forma_de_Pagamento;
import definicao_forma_pgto_Setar_CB_Forma_Pgto.BookInfo_OS_Forma_de_Pgto;
import definicao_forma_pgto_Setar_CB_Parcelas.BookInfo_Parcelas_Forma_de_Pagamento;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author CARMAL
 */
public class ControleThread_Eventos extends Thread {  // System.setProperty("derby.system.home", System.getProperty("user.dir") + System.getProperty("file.separator") ); /***/

    OS OS;
    Home Home;
    OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento;
    
    public ControleThread_Eventos( OS OS2, Home Home2, OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento2 ) {
        
        OS = OS2;
        Home = Home2;
        OS_Definir_Forma_de_Pagamento = OS_Definir_Forma_de_Pagamento2;
    } 
    
    Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto_CB = new Bean_OS_Forma_de_Pagamento();
    Bean_OS_Contas_Disponiveis Bean_Conta         = new Bean_OS_Contas_Disponiveis();
    Bean_OS_TipoDeDocumento    Bean_Doc           = new Bean_OS_TipoDeDocumento();
    
    public void run(){  
        synchronized ( this ) {
            
            //Criar_Banco_De_Dados.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
            
            verificarsedbexiste();  
            
            //Criar_Banco_De_Dados.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        }  
    }  
    
    public void verificarsedbexiste(){  
        synchronized(this) {  
            
            a(); b(); c(); z();
        }  
    } 
  
    public void a(){  
        synchronized(this) {  
            
            try{
                if( OS_Definir_Forma_de_Pagamento.cbFormaDePagamento.getSelectedItem() != null ) {
                
                    BookInfo_OS_Forma_de_Pgto obj = (BookInfo_OS_Forma_de_Pgto) OS_Definir_Forma_de_Pagamento.cbFormaDePagamento.getSelectedItem();
                                            
                    Bean_Forma_Pgto_CB.setID                                    ( obj.ID );                    
                    Bean_Forma_Pgto_CB.setNOME                                  ( obj.NOME );
                    Bean_Forma_Pgto_CB.setPARCELAMENTOMAXIMO                    ( obj.PARCELAMENTOMAXIMO );
                    Bean_Forma_Pgto_CB.setPARCELASSEMJUROS                      ( obj.PARCELASSEMJUROS );                    
                    Bean_Forma_Pgto_CB.setJUROSPORCENTAGEM                      ( obj.JUROSPORCENTAGEM );
                    Bean_Forma_Pgto_CB.setTAXAFIXA                              ( obj.TAXAFIXA );
                    Bean_Forma_Pgto_CB.setDESCONTOAVISTAPORCENTAGEM             ( obj.DESCONTOAVISTAPORCENTAGEM );                    
                    Bean_Forma_Pgto_CB.setCONTADEDESTINOPADRAOID                ( obj.CONTADEDESTINOPADRAOID );                    
                    Bean_Forma_Pgto_CB.setTIPODEDOCUMENTOPADRAOID               ( obj.TIPODEDOCUMENTOPADRAOID );                    
                    Bean_Forma_Pgto_CB.setINTERVALOPADRAOENTREASPARCELAS        ( obj.INTERVALOPADRAOENTREASPARCELAS );
                    Bean_Forma_Pgto_CB.setINTERVALOPADRAOENTREASPARCELASDIAOUMES( obj.INTERVALOPADRAOENTREASPARCELASDIAOUMES );
                
                            
                    Bean_Conta.setID                  ( obj.CONTADEDESTINOPADRAOID );
                    Bean_Conta.setAPELIDOCURTO        ( OS.APELIDOCURTO );
                    Bean_Conta.setNOMEDESCRICAODACONTA( OS.NOMEDESCRICAODACONTA );
                                            
                    Bean_Doc.setID                       ( obj.TIPODEDOCUMENTOPADRAOID );                    
                    Bean_Doc.setNOME                     ( OS.NOMETIPODEDOCUMENTO );
                    Bean_Doc.setTIPODECUSTO              ( OS.TIPODECUSTO );
                    Bean_Doc.setVALORDECUSTO             ( OS.VALORDECUSTO );
                                        
                    OS.receber_e_SetarCBFORMAPGTOSELECIONADO    ( OS_Definir_Forma_de_Pagamento.cbFormaDePagamento.getSelectedIndex() );
                
                    
                }
            }catch(Exception e) {
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "ControleThread_Eventos, "
                    + "\na()"
                    + e.getMessage()
                    + "\n", "a())" );
        }
        
        }  
    }  
    
    public void b(){  
        synchronized(this){    
            
            try{
            //MeuObjeto obj = (MeuObjeto) combobox.getSelectedItem();
            if( OS_Definir_Forma_de_Pagamento.cbParcelas.getSelectedItem() != null ) {
                
                BookInfo_Parcelas_Forma_de_Pagamento obj = (BookInfo_Parcelas_Forma_de_Pagamento) OS_Definir_Forma_de_Pagamento.cbParcelas.getSelectedItem();
        
                OS.receber_e_SetarCBPARCELASSELECIONADO                     ( obj.CODIGO );   
                
                try{
                    
                    String numeroParcelas = OS_Definir_Forma_de_Pagamento.cbParcelas.getSelectedItem().toString(); 
                          
                    int qtdParc = Integer.parseInt( numeroParcelas );
                    OS.receber_e_SetarQTDParcelas( qtdParc );
                    //System.out.println("int qtdParc = Integer.parseInt( numeroParcelas );   " + qtdParc );
                }catch(Exception e) {
                    
                    OS.receber_e_SetarQTDParcelas( 0 );
                    //System.out.println("OS.receber_e_SetarQTDParcelas   " + OS_Definir_Forma_de_Pagamento.cbParcelas.getSelectedItem().toString() );
                }
                
                OS_Definir_Forma_de_Pagamento.cbTipoDeEntrada.setSelectedIndex( 0 );
                OS.receber_e_SetarCBTIPODEENTRADASELECIONADO( 0 );
                
                OS.receber_e_SetarValorDeEntrada( 0 );
                OS_Definir_Forma_de_Pagamento.tfValorEntrada.setText( "" );
                OS_Definir_Forma_de_Pagamento.tfValorEntrada.setEnabled( false );              
            }
                    
            
        }catch(Exception e) {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "ControleThread_Evento, "
                    + "\nb()"
                    + e.getMessage()
                    + "\n", "b()" );
        }

        }
    }
    
    public void c(){  
        synchronized(this){    


        }
    }
    
    public void z(){  
        synchronized(this) {  
            
            try{
                
                OS_Definir_Forma_de_Pagamento.setarParcelas( Home, OS, OS_Definir_Forma_de_Pagamento.Total, Bean_Conta, Bean_Doc, Bean_Forma_Pgto_CB );
            }catch(Exception e) {
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "ControleThread_Eventos, "
                    + "\nz()"
                    + e.getMessage()
                    + "\n", "z())" );
        }
        
        }  
    } 
  
               
    /******************Executar Teste*************************************
     * @param args************************
    public static void main(String[] args) {            
          
        ControleThread t1 = new ControleThread(); 
        
        t1.setName("Thread1");   
        
        t1.start();  
    }
    /******************Executar Teste*************************************/
    
}

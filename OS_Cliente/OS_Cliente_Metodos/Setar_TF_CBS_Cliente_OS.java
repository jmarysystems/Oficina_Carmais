/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente_Metodos;

import javax.swing.JTable;
import OS_Cliente.Contato_OS;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Setar_TF_CBS_Cliente_OS {
    
    public Setar_TF_CBS_Cliente_OS( Contato_OS Contato_OS2, JTable tb2 ) {
        
        Contato_OS = Contato_OS2;
        tb = tb2;
        
        inicio();  
    }
    
    JTable tb;
    Contato_OS Contato_OS;
        
    boolean um2 = false;
    private void inicio(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um2 == false ) {     um2 = true;
                    try { Thread.sleep(1); 
                    
                        if ( Contato_OS.Bean_Contato.size() > -1 ){
                            
                            if ( tb.getSelectedRow() != -1){
                                setar();
                            } else {
                                //limparCampos();
                            }
                        }

                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Setar_TF_CBS_Cliente_OS, "
                            + "\ninicio()"
                            + e.getMessage()
                            + "\n", "inicio()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um2 = false;
    }
    
    private void setar(){
        
        Contato_OS.rbPessoaFisica       .setSelected( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).isPESSOAFISICA() );       
        Contato_OS.rbPessoaJuridica     .setSelected( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).isPESSOAJURIDICA() );
        Contato_OS.tfNomeDoGrupo        .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getGRUPO() );
        
        Contato_OS.tfNome               .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getNOMEOURAZAOSOCIAL() );
        Contato_OS.tfNomeFantasia       .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getNOMEFANTASIA() );
        Contato_OS.tfCPFOuCNPJ          .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getCPFOUCNPJ() );
        Contato_OS.tfNomeResponsavel    .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getNOMEDORESPONSAVEL() );
        
        Contato_OS.tfInscricaoEstadual  .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getINSCRICAOESTADUAL() );
        Contato_OS.tfInscrEstaSubstTrib .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getINSCRICAOESTSUBSTTRIB() );
        Contato_OS.tfInscricaoMunicipal .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getINSCRICAOMUNICIPAL() );
        Contato_OS.tfInscricaoSuframa   .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getINSCRICAOSUFRAMA() );
        
        Contato_OS.tfCEP                .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getCEP() );
        Contato_OS.tfEndereco           .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getENDERECO() );
        Contato_OS.tfNumero             .setText( String.valueOf( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getNUMERO() ) );
        Contato_OS.tfComplemento        .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getCOMPLEMENTO() );
        
        Contato_OS.tfBairro             .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getBAIRRO() );
        Contato_OS.cbEstado             .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getESTADO() );
        Contato_OS.cbCidade             .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getCIDADE() );
        Contato_OS.cbPais               .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getPAIS() );
    
        Contato_OS.tfTelefone           .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getTELEFONE() );
        Contato_OS.tfFone2              .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getFONE2() );
        Contato_OS.tfFone3              .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getFONE3() );
        Contato_OS.tfDataNascimento     .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getDATADENASCIMENTO() );   
   
        Contato_OS.tfEmail              .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getEMAIL() );   
        Contato_OS.tfOutroEmail         .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getOUTROEMAIL() );   
        Contato_OS.tfPalavrasChave      .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getPALAVRASCHAVE() );   
        Contato_OS.tfFacebook           .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getFACEBOOK() );     
    
        Contato_OS.taAnotacoesGerais    .setText( Contato_OS.Bean_Contato.get( Contato_OS.tbClientes.getSelectedRow() ).getANOTACOESGERAIS() );     
    }
           
}

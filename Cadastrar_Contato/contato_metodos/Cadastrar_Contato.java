/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contato_metodos;

import contato.Contato;
import contato_control.Bean_Contato;
import contato_control.Control_Contato_Cadastrar;
import home.Home;
import utilidades.JOptionPaneMod;
import utilidades.RetornarNumeroInteiro;
import utilidades.RetornarStringDoComboBox;

/**
 *
 * @author CARMAL
 */
public class Cadastrar_Contato {
    
    Contato Contato;
    Home Home;
    
    public Cadastrar_Contato( Home Home2, Contato Contato2 ){
        Contato = Contato2;
        Home = Home2;
        
        cadastrar_Contato( getBean() );
        limparCampos();       
    }
    
    private void cadastrar_Contato( Bean_Contato Bean ){
        
        String TIPODECONTATO = tipoContato();
        
        if( !TIPODECONTATO.equals("") ){
            
            Control_Contato_Cadastrar Control = new Control_Contato_Cadastrar( Home.ip, TIPODECONTATO );
            Control.cadastrar( Bean );
        }
        else{
            
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O TIPO DE CONTATO não pode ser nulo"
                    + "\nEscolha um dos ítens"
                    + "\nExemplo:"
                    + "\n    CLIENTE"
                    + "\n    FORNECEDOR"
                    + "\n    TRANSPORTADOR"
                    , "TIPO DE CONTATO" );
        }
                
        
    }
    
    private String tipoContato(){
        String retorno = "";
        
        boolean tipoCliente       = Contato.cbTipoCliente.isSelected();
        boolean tipoFornecedor    = Contato.cbTipoFornecedor.isSelected();
        boolean tipoTransportador = Contato.cbTipoTransportador.isSelected();
        
        if( tipoCliente == true ) { 
            retorno = "CLIENTE"; 
        }
        else if( tipoFornecedor == true ) { 
            retorno = "FORNECEDOR"; 
        }
        else if( tipoTransportador == true ) { 
            retorno = "TRANSPORTADOR"; 
        }
        
        return retorno;
    }
    
    private Bean_Contato getBean(){
        Bean_Contato Bean = new Bean_Contato();
        
        //ID
                    
        Bean.setNOMEOURAZAOSOCIAL     ( Contato.tfNome.getText().trim()                         ); 
        Bean.setPESSOAFISICA          ( Contato.rbPessoaFisica.isSelected()                     );
        Bean.setPESSOAJURIDICA        ( Contato.rbPessoaJuridica.isSelected()                   );
        Bean.setGRUPO                 ( RetornarStringDoComboBox.getString( Contato.cbGrupo, "Grupo", true )      );      
        Bean.setANOTACOESGERAIS       ( Contato.taAnotacoesGerais.getText().trim()              );
                    
        Bean.setNOMEOURAZAOSOCIAL     ( Contato.tfNome.getText().trim()                         );
        Bean.setNOMEFANTASIA          ( Contato.tfNomeFantasia.getText().trim()                 );
        Bean.setCPFOUCNPJ             ( Contato.tfCPFOuCNPJ.getText().trim()                    );
        Bean.setNOMEDORESPONSAVEL     ( Contato.tfNomeResponsavel.getText().trim()              );
                    
        Bean.setINSCRICAOESTADUAL     ( Contato.tfInscricaoEstadual.getText().trim()            );
        Bean.setINSCRICAOESTSUBSTTRIB ( Contato.tfInscrEstaSubstTrib.getText().trim()           );
        Bean.setINSCRICAOMUNICIPAL    ( Contato.tfInscricaoMunicipal.getText().trim()           );
        Bean.setINSCRICAOSUFRAMA      ( Contato.tfInscricaoSuframa.getText().trim()             );
                    
        Bean.setCEP                   ( Contato.tfCEP.getText().trim()                          );
        Bean.setENDERECO              ( Contato.tfEndereco.getText().trim()                     );
        Bean.setNUMERO                ( RetornarNumeroInteiro.intTF( 
                    Contato.tfNumero, Contato.tfNumero.getText().trim(), "Número", true )       );                                                          
        Bean.setCOMPLEMENTO           ( Contato.tfComplemento.getText().trim()                  );
                    
        Bean.setBAIRRO                ( Contato.tfBairro.getText().trim()                       );
        Bean.setESTADO                ( Contato.cbEstado.getSelectedItem().toString()           );
        Bean.setCIDADE                ( Contato.cbCidade.getSelectedItem().toString()           );
        Bean.setPAIS                  ( Contato.cbPais.getSelectedItem().toString()             );
                  
        Bean.setTELEFONE              ( Contato.tfTelefone.getText().trim()                     );
        Bean.setFONE2                 ( Contato.tfFone2Fax.getText().trim()                     );
        Bean.setFONE3                 ( Contato.tfFone3Celular.getText().trim()                 );
        Bean.setDATADENASCIMENTO      ( Contato.tfDataNascimento.getText().trim()               );
                    
        Bean.setEMAIL                 ( Contato.tfEmail.getText().trim()                        );
        Bean.setOUTROEMAIL            ( Contato.tfOutroEmail.getText().trim()                   );
        Bean.setPALAVRASCHAVE         ( Contato.tfPalavrasChave.getText().trim()                );
        Bean.setFACEBOOK              ( Contato.tfFacebook.getText().trim()                     );
        
        return Bean;
    }
    
    private void limparCampos(){
        
        //Contato.rbPessoaFisica
        //Contato.rbPessoaJuridica
        //Contato.cbGrupo
        
        Contato.tfNome                .setText("");
        Contato.tfNomeFantasia        .setText("");
        Contato.tfCPFOuCNPJ           .setText("");
        Contato.tfNomeResponsavel     .setText("");
        
        Contato.tfInscricaoEstadual   .setText("");
        Contato.tfInscrEstaSubstTrib  .setText("");
        Contato.tfInscricaoMunicipal  .setText("");
        Contato.tfInscricaoSuframa    .setText("");
        
        Contato.tfCEP                 .setText("");
        Contato.tfEndereco            .setText("");
        Contato.tfNumero              .setText("");
        Contato.tfComplemento         .setText("");
        
        Contato.tfBairro              .setText("");
        //Contato.cbEstado
        //Contato.cbCidade
        //Contato.cbPais
        
        Contato.tfTelefone            .setValue("");       
        Contato.tfFone2Fax            .setValue("");
        Contato.tfFone3Celular        .setValue("");
        Contato.tfDataNascimento      .setValue("");
        
        Contato.tfEmail               .setText("");
        Contato.tfOutroEmail          .setText("");
        Contato.tfPalavrasChave       .setText("");
        Contato.tfFacebook            .setText("");
        
        //Contato.cbTipoCliente
        //Contato.cbTipoFornecedor
        //Contato.cbTipoTransportador
        Contato.taAnotacoesGerais     .setText("");
    }

    
}

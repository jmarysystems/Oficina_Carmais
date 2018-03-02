/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brasil;

import contato.Contato;
import contato.Pais_Estado_Cidade;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author AnaMariana
 */
public class A_Brasil_Estados {
    
    public String[] setar( String st ) {
        String [] retorno = null;
        switch( st ) {
            case "brasil_estados": retorno = new String [] {
                "AC","AL","AM","AP","BA","CE","DF","ES","GO","MA","MG","MS","MT",
                "PA","PB","PE","PI","PR","RJ","RN","RO","RR","RS","SC","SE","SP","TO"
            }; 
            break;    
        }
        
        return retorno;
    }
    
    public void setarCidadeComBaseNoEstadoDoBrasil( String estado, Contato Cliente ){

        switch( estado ) {
            case "AC": setarComboBoxCidade( "brasil_acre_cidades", Cliente ); break;
                case "AL": setarComboBoxCidade( "brasil_alagoas_cidades", Cliente ); break;
                    case "AM": setarComboBoxCidade( "brasil_amazonas_cidades", Cliente ); break;
                        case "AP": setarComboBoxCidade( "brasil_amapa_cidades", Cliente ); break;
                            case "BA": setarComboBoxCidade( "brasil_bahia_cidades", Cliente ); break;
                                case "CE": setarComboBoxCidade( "brasil_ceara_cidades", Cliente ); break;
                                    case "DF": setarComboBoxCidade( "brasil_brasilia_cidades", Cliente ); break;
                                        case "ES": setarComboBoxCidade( "brasil_espirito_santo_cidades", Cliente ); break;
                                            case "GO": setarComboBoxCidade( "brasil_goias_cidades", Cliente ); break;
                                                case "MA": setarComboBoxCidade( "brasil_maranhao_cidades", Cliente ); break;
                                                    case "MG": setarComboBoxCidade( "brasil_minas_gerais_cidades", Cliente ); break;
                                                        case "MS": setarComboBoxCidade( "brasil_mato_grasso_do_sul_cidades", Cliente ); break;
                                                            case "MT": setarComboBoxCidade( "brasil_mato_grasso_cidades", Cliente ); break;
                                                                case "PA": setarComboBoxCidade( "brasil_para_cidades", Cliente ); break;
                                                                    case "PB": setarComboBoxCidade( "brasil_paraiba_cidades", Cliente ); break;
                                                                        case "PE": setarComboBoxCidade( "brasil_pernambuco_cidades", Cliente ); break;
                                                                            case "PI": setarComboBoxCidade( "brasil_piaui_cidades", Cliente ); break;
                                                                                case "PR": setarComboBoxCidade( "brasil_parana_cidades", Cliente ); break;
                                                                                    case "RJ": setarComboBoxCidade( "brasil_rio_de_janeiro_cidades", Cliente ); break;
                                                                                        case "RN": setarComboBoxCidade( "brasil_rio_grande_do_norte_cidades", Cliente ); break;
                                                                                            case "RO": setarComboBoxCidade( "brasil_rondonia_cidades", Cliente ); break;
                                                                                                case "RR": setarComboBoxCidade( "brasil_roraima_cidades", Cliente ); break;
                                                                                                    case "RS": setarComboBoxCidade( "brasil_rio_grande_do_sul_cidades", Cliente ); break;
                                                                                                        case "SC": setarComboBoxCidade( "brasil_santa_catarina_cidades", Cliente ); break;
                                                                                                            case "SE": setarComboBoxCidade( "brasil_sergipe_cidades", Cliente ); break;
                                                                                                                case "SP": setarComboBoxCidade( "brasil_sao_paulo_cidades", Cliente ); break;
                                                                                                                    case "TO": setarComboBoxCidade( "brasil_tocantins_cidades", Cliente ); break;
                                      
        }
        
    }
    
    private void setarComboBoxCidade( String pais_estado_cidades, Contato Cliente ){
        
        Pais_Estado_Cidade P_E_C = new Pais_Estado_Cidade();

        Cliente.cbCidade.removeAllItems();                                       // "Pais_estado_cidades"
        DefaultComboBoxModel model = new DefaultComboBoxModel( P_E_C.setar( pais_estado_cidades ) );  
        Cliente.cbCidade.setModel( model );

    }
    
}

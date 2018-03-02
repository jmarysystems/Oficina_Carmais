/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contato;

import brasil.A_Brasil_Estados;
import brasil.Acre;
import brasil.Alagoas;
import brasil.Amapa;
import brasil.Amazonas;
import brasil.Bahia;
import brasil.Brasilia;
import brasil.Ceara;
import brasil.Espirito_Santo;
import brasil.Goias;
import brasil.Maranhao;
import brasil.Mato_Grasso;
import brasil.Mato_Grasso_do_Sul;
import brasil.Minas_Gerais;
import brasil.Para;
import brasil.Paraiba;
import brasil.Parana;
import brasil.Pernambuco;
import brasil.Piaui;
import brasil.Rio_Grande_do_Norte;
import brasil.Rio_Grande_do_Sul;
import brasil.Rio_de_Janeiro;
import brasil.Rondonia;
import brasil.Roraima;
import brasil.Santa_Catarina;
import brasil.Sao_Paulo;
import brasil.Sergipe;
import brasil.Tocantins;


/**
 *
 * @author AnaMariana
 */
public class Pais_Estado_Cidade {
    
    public String[] setar( String st ) {
        String [] retorno = null;
        switch( st ) {
            case "pais": retorno = new String [] { "BRASIL" }; break;
                case "brasil_estados": A_Brasil_Estados Br_St = new A_Brasil_Estados(); retorno = Br_St.setar(st); break; 
                    case "brasil_acre_cidades": Acre Ac = new Acre(); retorno = Ac.setar(st); break; 
                        case "brasil_alagoas_cidades": Alagoas Al = new Alagoas(); retorno = Al.setar(st); break; 
                            case "brasil_amazonas_cidades": Amazonas Am = new Amazonas(); retorno = Am.setar(st); break;
                                case "brasil_amapa_cidades": Amapa Ap = new Amapa(); retorno = Ap.setar(st); break;
                                    case "brasil_bahia_cidades": Bahia Ba = new Bahia(); retorno = Ba.setar(st); break;
                                        case "brasil_ceara_cidades": Ceara Ce = new Ceara(); retorno = Ce.setar(st); break; 
                                            case "brasil_brasilia_cidades": Brasilia Df = new Brasilia(); retorno = Df.setar(st); break;
                                                case "brasil_espirito_santo_cidades": Espirito_Santo Es = new Espirito_Santo(); retorno = Es.setar(st); break;
                                                    case "brasil_goias_cidades": Goias Go = new Goias(); retorno = Go.setar(st); break;
                                                        case "brasil_maranhao_cidades": Maranhao Ma = new Maranhao(); retorno = Ma.setar(st); break;
                                                            case "brasil_minas_gerais_cidades": Minas_Gerais Mg = new Minas_Gerais(); retorno = Mg.setar(st); break;
                                                                case "brasil_mato_grasso_do_sul_cidades": Mato_Grasso_do_Sul Ms = new Mato_Grasso_do_Sul(); retorno = Ms.setar(st); break;
                                                                    case "brasil_mato_grasso_cidades": Mato_Grasso Mt = new Mato_Grasso(); retorno = Mt.setar(st); break;
                                                                        case "brasil_para_cidades": Para Pa = new Para(); retorno = Pa.setar(st); break;
                                                                            case "brasil_paraiba_cidades": Paraiba Pb = new Paraiba(); retorno = Pb.setar(st); break;
                                                                                case "brasil_pernambuco_cidades": Pernambuco Pe = new Pernambuco(); retorno = Pe.setar(st); break;
                                                                                    case "brasil_piaui_cidades": Piaui Pi = new Piaui(); retorno = Pi.setar(st); break;
                                                                                        case "brasil_parana_cidades": Parana Pr = new Parana(); retorno = Pr.setar(st); break;
                                                                                            case "brasil_rio_de_janeiro_cidades": Rio_de_Janeiro Jr = new Rio_de_Janeiro(); retorno = Jr.setar(st); break;
                                                                                                case "brasil_rio_grande_do_norte_cidades": Rio_Grande_do_Norte Rn = new Rio_Grande_do_Norte(); retorno = Rn.setar(st); break;
                                                                                                    case "brasil_rondonia_cidades": Rondonia Ro = new Rondonia(); retorno = Ro.setar(st); break;
                                                                                                        case "brasil_roraima_cidades": Roraima Rr = new Roraima(); retorno = Rr.setar(st); break;
                                                                                                            case "brasil_rio_grande_do_sul_cidades": Rio_Grande_do_Sul Rs = new Rio_Grande_do_Sul(); retorno = Rs.setar(st); break;
                                                                                                                case "brasil_santa_catarina_cidades": Santa_Catarina Sc = new Santa_Catarina(); retorno = Sc.setar(st); break;
                                                                                                                    case "brasil_sergipe_cidades": Sergipe Se = new Sergipe(); retorno = Se.setar(st); break;
                                                                                                                        case "brasil_sao_paulo_cidades": Sao_Paulo Sp = new Sao_Paulo(); retorno = Sp.setar(st); break;
                                                                                                                            case "brasil_tocantins_cidades": Tocantins To = new Tocantins(); retorno = To.setar(st); break;
                                                                
        }
        
        return retorno;
    }
}

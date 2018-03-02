/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package definicao_forma_pgto_controle;

import OS.OS;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import definicao_forma_pgto.OS_Definir_Forma_de_Pagamento;
import definicao_forma_pgto_Setar_CB_Parcelas.GetIntParcelamentoMaximo;
import definicao_forma_pgto_parcelas_adicionar.Get_Valor_de_Custo_do_Tipo_de_Documento;
import definicao_forma_pgto_parcelas.Bean_Parcelas;
import home.Home;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import utilidades.Float_Para_Moeda;
import utilidades.Retornar_Data_de_Hoje_Mais_IntDias_Receb;

/**
 *
 * @author AnaMariana
 */
public class Control_Parcelas_Listar {
    
    public Control_Parcelas_Listar() { 

    }    

    public List<Bean_Parcelas> listar ( 
            int qtdParc,
            Home Home2, OS OS2, OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento2,
            float Total2, 
            Bean_OS_Contas_Disponiveis Bean_Conta2,
            Bean_OS_TipoDeDocumento Bean_Documento2, 
            Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto2 ) {
        
        Total2 -= OS2.pegar_e_GetVALORDEDESCONTO();
                
        if( OS2.pegar_e_GetCHJUROSPORCENTAGEM() == true && OS2.JUROSPORCENTAGEM != 0 ){
            float valorPorParcela;
            //System.out.println( "OS2.JUROSPORCENTAGEM "+ OS2.JUROSPORCENTAGEM );
                        
            float valor = Total2 * ( OS2.JUROSPORCENTAGEM/100 );
            if( OS2.pegar_e_GetQTDParcelas() > 1 ){
                GetIntParcelamentoMaximo intParc = new GetIntParcelamentoMaximo();
                
                valorPorParcela = valor / ( OS2.pegar_e_GetQTDParcelas()  );  
                //System.out.println( valor +"  "+OS2.pegar_e_GetQTDParcelas()+"  &&&&&&&&&&&&&&&&&&&&&& valorPorParcela " + valorPorParcela );
            
                float qtdParcSJ = intParc.getInt( OS2.PARCELASSEMJUROS );
                if( OS2.pegar_e_GetQTDParcelas() > qtdParcSJ ){
                    float qtdParcMesnosparcSJ = OS2.pegar_e_GetQTDParcelas() - qtdParcSJ;
                    
                    valor = valorPorParcela * qtdParcMesnosparcSJ;
                    //System.out.println( valor +"  "+"  &&&&&&&&&&&&&&&&&&&&&& valor  "+Total2 * ( OS2.JUROSPORCENTAGEM/100 )  );
                }
                else{
                    
                    valor = 0;
                }
            }
            else {
                
                valor = 0;
            }
            
            Total2 += valor;
        }
        if( OS2.pegar_e_GetCHTAXAFIXA() == true && OS2.TAXAFIXA != 0 ){
               
            Total2 += OS2.TAXAFIXA;
        }
        
        List<Bean_Parcelas> listarJavaBD = new ArrayList();        
        try {
            Bean_Parcelas Bean_Parcelas;            
            Get_Valor_de_Custo_do_Tipo_de_Documento Get_Valor_do_Documento = new Get_Valor_de_Custo_do_Tipo_de_Documento( OS2, Home2 );
            
            if( qtdParc == 0 || qtdParc == 1 ) {
                //System.out.println( "if( qtdParc == 0 || qtdParc == 1 ) {  " );
                
                Controle_A_Vista Controle_A_Vista = new Controle_A_Vista();
                
                Bean_Parcelas = Controle_A_Vista.GetBean_Parcelas( 
                        qtdParc,
                        Home2, OS2, OS_Definir_Forma_de_Pagamento2,
                        Total2, 
                        Bean_Conta2,
                        Bean_Documento2, 
                        Bean_Forma_Pgto2 );
                
                listarJavaBD.add( Bean_Parcelas );                
            }
            else{
                                                
    
                int    INTERVALO    = 0;                
                int    INTERVALOINT = Bean_Forma_Pgto2.getINTERVALOPADRAOENTREASPARCELAS();
                String INTERVALOSTR = Bean_Forma_Pgto2.getINTERVALOPADRAOENTREASPARCELASDIAOUMES();
                if( INTERVALOSTR.equalsIgnoreCase("MÊS") ){
                    
                    INTERVALO = INTERVALOINT * 30;
                }
                else{
                    
                    INTERVALO = INTERVALOINT * 1;
                }
                
                String NUMERODODOCUMENTO = "";
                String TIPODEVALOR       = "A Prazo";
                
                int    CONTADEDESTINO    = Bean_Conta2.getID();
                int    TIPODEDOCUMENTO   = Bean_Documento2.getID();
                
                float  CUSTOINTERNO      = Get_Valor_do_Documento.get( Bean_Documento2.getID() );
                                                
                
                float  VALORDEENTRADA    = OS2.pegar_e_GetValorDeEntrada();
                
                String tipoDeEntrada = OS_Definir_Forma_de_Pagamento2.cbTipoDeEntrada.getSelectedItem().toString(); 
                if( tipoDeEntrada.equals("Com entrada igual") ){
                    Date   hoje = Retornar_Data_de_Hoje_Mais_IntDias_Receb.get( 0 );
                    Bean_Parcelas = new Bean_Parcelas();
                
                    Bean_Parcelas.setTIPODEVALOR       ( TIPODEVALOR );
                    Bean_Parcelas.setVALOR             ( VALORDEENTRADA );
                    Bean_Parcelas.setDATADOPAGAMENTO   ( hoje );
                    Bean_Parcelas.setCONTADEDESTINO    ( CONTADEDESTINO );
                    Bean_Parcelas.setTIPODEDOCUMENTO   ( TIPODEDOCUMENTO );
                    Bean_Parcelas.setNUMERODODOCUMENTO ( NUMERODODOCUMENTO );
                    Bean_Parcelas.setCUSTOINTERNO      ( CUSTOINTERNO );
                    listarJavaBD.add( Bean_Parcelas ); 
                }
                else if( tipoDeEntrada.equals("Com entrada diferente") ){         
                    if( VALORDEENTRADA != 0 ) {
                        //System.out.println( "**********Com entrada diferente**************  " + VALORDEENTRADA);
                        Date   hoje = Retornar_Data_de_Hoje_Mais_IntDias_Receb.get( 0 );
                        Bean_Parcelas = new Bean_Parcelas();
                
                        Bean_Parcelas.setTIPODEVALOR       ( TIPODEVALOR );
                        Bean_Parcelas.setVALOR             ( VALORDEENTRADA );
                        Bean_Parcelas.setDATADOPAGAMENTO   ( hoje );
                        Bean_Parcelas.setCONTADEDESTINO    ( CONTADEDESTINO );
                        Bean_Parcelas.setTIPODEDOCUMENTO   ( TIPODEDOCUMENTO );
                        Bean_Parcelas.setNUMERODODOCUMENTO ( NUMERODODOCUMENTO );
                        Bean_Parcelas.setCUSTOINTERNO      ( CUSTOINTERNO );
                        listarJavaBD.add( Bean_Parcelas ); 
                    }
                }
                
                float totalParcelado;
                int qtdParcela = qtdParc;
                if( VALORDEENTRADA != 0 ){
                    
                    qtdParcela -= 1; 
                    totalParcelado = ( Total2 + CUSTOINTERNO ) / qtdParc;
                    
                    if( tipoDeEntrada.equals("Com entrada diferente") ){
                        
                        float totalMenosEntrada = ( Total2 - VALORDEENTRADA );
                        
                        totalParcelado = totalMenosEntrada  / qtdParcela;
                        //totalParcelado = ( totalMenosEntrada + CUSTOINTERNO ) / qtdParc-1;
                        //System.out.println( "**********totalMenosEntrada **************######  " + totalMenosEntrada + "     " + qtdParcela +"    " +  totalParcelado);
                    }
                }
                else{
                    
                   totalParcelado = ( Total2 + CUSTOINTERNO ) / qtdParc;                     
                }
                                
                                                              
                for( int i = 0; i < qtdParcela; i++ ) {
                          
                    int diasData = i;
                    diasData++;                                 
                    Date   hoje2 = Retornar_Data_de_Hoje_Mais_IntDias_Receb.get( INTERVALO * diasData );
                    
                    
                    Bean_Parcelas = new Bean_Parcelas();
                
                    Bean_Parcelas.setTIPODEVALOR       ( TIPODEVALOR );
                    Bean_Parcelas.setVALOR             ( totalParcelado );
                    Bean_Parcelas.setDATADOPAGAMENTO   ( hoje2 );
                    Bean_Parcelas.setCONTADEDESTINO    ( CONTADEDESTINO );
                    Bean_Parcelas.setTIPODEDOCUMENTO   ( TIPODEDOCUMENTO );
                    Bean_Parcelas.setNUMERODODOCUMENTO ( NUMERODODOCUMENTO );
                    Bean_Parcelas.setCUSTOINTERNO      ( CUSTOINTERNO );
                
                    //System.out.println( "************** A Prazo *******************" + hoje2);
                    listarJavaBD.add( Bean_Parcelas ); 
                    
                }
                
                
                Float_Para_Moeda.inicioJLabel( OS_Definir_Forma_de_Pagamento2.lbTotalEsquerdo, Total2, true );
            }
                                                
        } catch ( Exception e ) {
            JOptionPane.showMessageDialog( null, "Control\"listar\nControl_Parcelas_Listar\n"+e.getMessage().toString() );
            
        }
        
        return listarJavaBD;
    }
    
}

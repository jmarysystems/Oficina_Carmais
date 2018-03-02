/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package definicao_forma_pgto_controle;

import OS.OS;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import OS_Forma_de_Pagamento.Retornar_Total;
import definicao_forma_pgto.OS_Definir_Forma_de_Pagamento;
import definicao_forma_pgto_parcelas_adicionar.Get_Valor_de_Custo_do_Tipo_de_Documento;
import definicao_forma_pgto_parcelas.Bean_Parcelas;
import home.Home;
import java.util.Date;
import javax.swing.JOptionPane;
import utilidades.Float_Para_Moeda;
import utilidades.Retornar_Data_de_Hoje_Mais_IntDias_Receb;

/**
 *
 * @author AnaMariana
 */
public class Controle_A_Vista {
    
    public Controle_A_Vista() { 

    }    

    public Bean_Parcelas GetBean_Parcelas ( 
            int qtdParc,
            Home Home2, OS OS2, OS_Definir_Forma_de_Pagamento OS_Definir_Forma_de_Pagamento2,
            float Total2, 
            Bean_OS_Contas_Disponiveis Bean_Conta2,
            Bean_OS_TipoDeDocumento Bean_Documento2, 
            Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto2 ) {
        
        Bean_Parcelas Bean_Parcelas = new Bean_Parcelas();       
        try {
            
            Retornar_Total Retornar_Total = new Retornar_Total( Home2, OS2 );
            float descPorcAVista = Retornar_Total.getTotal() * ( Bean_Forma_Pgto2.getDESCONTOAVISTAPORCENTAGEM() / 100 );            
           
            Total2 -= descPorcAVista;
            
            Get_Valor_de_Custo_do_Tipo_de_Documento Get_Valor_do_Documento = new Get_Valor_de_Custo_do_Tipo_de_Documento( OS2, Home2 );
                                               
            String NUMERODODOCUMENTO = "";
            String TIPODEVALOR       = "À Vista";
                
            int    CONTADEDESTINO    = Bean_Conta2.getID();
            int    TIPODEDOCUMENTO   = Bean_Documento2.getID();
             
            float  CUSTOINTERNO      = Get_Valor_do_Documento.get( Bean_Documento2.getID() );
                
            float  VALORDAPARCELA    = Total2 + CUSTOINTERNO;
                
            Date   hoje              = Retornar_Data_de_Hoje_Mais_IntDias_Receb.get( 0 );
            if( qtdParc == 1 ) {
                int    INTERVALO    = 0;                
                int    INTERVALOINT = Bean_Forma_Pgto2.getINTERVALOPADRAOENTREASPARCELAS();
                String INTERVALOSTR = Bean_Forma_Pgto2.getINTERVALOPADRAOENTREASPARCELASDIAOUMES();
                if( INTERVALOSTR.equalsIgnoreCase("MÊS") ){
                    
                    INTERVALO = INTERVALOINT * 30;
                }
                else{
                    
                    INTERVALO = INTERVALOINT * 1;
                }
                hoje              = Retornar_Data_de_Hoje_Mais_IntDias_Receb.get( INTERVALO );
            }

            
            Bean_Parcelas.setTIPODEVALOR       ( TIPODEVALOR );
            Bean_Parcelas.setVALOR             ( VALORDAPARCELA );
            Bean_Parcelas.setDATADOPAGAMENTO   ( hoje );
            Bean_Parcelas.setCONTADEDESTINO    ( CONTADEDESTINO );
            Bean_Parcelas.setTIPODEDOCUMENTO   ( TIPODEDOCUMENTO );
            Bean_Parcelas.setNUMERODODOCUMENTO ( NUMERODODOCUMENTO );
            Bean_Parcelas.setCUSTOINTERNO      ( CUSTOINTERNO );
            
            Float_Para_Moeda.inicioJLabel( OS_Definir_Forma_de_Pagamento2.lbTotalEsquerdo, VALORDAPARCELA, true );
            
        } catch ( Exception e ) {
            JOptionPane.showMessageDialog( null, "Control\"listar\nControl_Parcelas_Listar\n"+e.getMessage().toString() );
            
        }
        
        //System.out.println( "************** À Vista *******************" );
        return Bean_Parcelas;
    }
    
}

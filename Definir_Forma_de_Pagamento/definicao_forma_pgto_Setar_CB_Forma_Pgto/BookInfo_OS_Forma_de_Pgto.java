package definicao_forma_pgto_Setar_CB_Forma_Pgto;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnaMariana
 */
public class BookInfo_OS_Forma_de_Pgto {
    
    public int    ID                                           ;
                    
    public String NOME                                     = "";
    public String PARCELAMENTOMAXIMO                       = "";
    public String PARCELASSEMJUROS                         = "";
                    
    public float  JUROSPORCENTAGEM                             ;
    public float  TAXAFIXA                                     ;
    public float  DESCONTOAVISTAPORCENTAGEM                    ;
                    
    public int    CONTADEDESTINOPADRAOID                       ;
                    
    public int    TIPODEDOCUMENTOPADRAOID                      ;
                    
    public int    INTERVALOPADRAOENTREASPARCELAS               ;
    public String INTERVALOPADRAOENTREASPARCELASDIAOUMES   = "";

    public BookInfo_OS_Forma_de_Pgto( int ID2, 
            String NOME2,  String PARCELAMENTOMAXIMO2,  String PARCELASSEMJUROS2, 
            float JUROSPORCENTAGEM2, float TAXAFIXA2, float DESCONTOAVISTAPORCENTAGEM2,
            int CONTADEDESTINOPADRAOID2, int TIPODEDOCUMENTOPADRAOID2,
            int INTERVALOPADRAOENTREASPARCELAS2, String INTERVALOPADRAOENTREASPARCELASDIAOUMES2 ) {
        ID                                     = ID2                                     ;    
        
        NOME                                   = NOME2                                   ; 
        PARCELAMENTOMAXIMO                     = PARCELAMENTOMAXIMO2                     ;  
        PARCELASSEMJUROS                       = PARCELASSEMJUROS2                       ; 
        
        JUROSPORCENTAGEM                       = JUROSPORCENTAGEM2                       ;
        TAXAFIXA                               = TAXAFIXA2                               ;
        DESCONTOAVISTAPORCENTAGEM              = DESCONTOAVISTAPORCENTAGEM2              ;
                    
        CONTADEDESTINOPADRAOID                 = CONTADEDESTINOPADRAOID2                 ;
                    
        TIPODEDOCUMENTOPADRAOID                = TIPODEDOCUMENTOPADRAOID2                ;
                    
        INTERVALOPADRAOENTREASPARCELAS         = INTERVALOPADRAOENTREASPARCELAS2         ;
        INTERVALOPADRAOENTREASPARCELASDIAOUMES = INTERVALOPADRAOENTREASPARCELASDIAOUMES2 ;       
        
    }
        
    @Override
    public String toString() {
        return NOME;
    }

}

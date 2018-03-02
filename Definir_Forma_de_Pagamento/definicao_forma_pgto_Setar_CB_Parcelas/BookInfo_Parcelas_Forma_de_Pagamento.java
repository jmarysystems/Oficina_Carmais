package definicao_forma_pgto_Setar_CB_Parcelas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnaMariana
 */
public class BookInfo_Parcelas_Forma_de_Pagamento {
    
    public int    CODIGO                                       ;  
    public String NOME                                     = "";
    public int    PARCELAMENTOMAXIMO                           ;

    public BookInfo_Parcelas_Forma_de_Pagamento( int CODIGO2, 
            String NOME2,  int PARCELAMENTOMAXIMO2 ) {
        CODIGO                                 = CODIGO2                            ;    
        
        NOME                                   = NOME2                              ; 
        PARCELAMENTOMAXIMO                     = PARCELAMENTOMAXIMO2                ;    
        
    }
        
    @Override
    public String toString() {
        return NOME;
    }

}

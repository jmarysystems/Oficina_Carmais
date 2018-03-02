/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_Setar_CB_Parcelas;


/**
 *
 * @author ana
 */
public class Bean_Parcelas_Forma_de_Pagamento {
    
    private int    CODIGO                                       ;    
    private String NOME                                     = "";
    private int    PARCELAMENTOMAXIMO                           ;

    /**
     * @return the CODIGO
     */
    public int getCODIGO() {
        return CODIGO;
    }

    /**
     * @param CODIGO the CODIGO to set
     */
    public void setCODIGO(int CODIGO) {
        this.CODIGO = CODIGO;
    }

    /**
     * @return the NOME
     */
    public String getNOME() {
        return NOME;
    }

    /**
     * @param NOME the NOME to set
     */
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    /**
     * @return the PARCELAMENTOMAXIMO
     */
    public int getPARCELAMENTOMAXIMO() {
        return PARCELAMENTOMAXIMO;
    }

    /**
     * @param PARCELAMENTOMAXIMO the PARCELAMENTOMAXIMO to set
     */
    public void setPARCELAMENTOMAXIMO(int PARCELAMENTOMAXIMO) {
        this.PARCELAMENTOMAXIMO = PARCELAMENTOMAXIMO;
    }

}

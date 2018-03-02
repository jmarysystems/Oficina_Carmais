
package OS_Tecnico;

/**
 *
 * @author John O'Conner
 */
public class Tecnico_Bean {
    
    private int    ID;    
    private String NOME; 
    private Float  COMISSAOPRODUTO;   
    private Float  COMISSAOSERVICO;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
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
     * @return the COMISSAOPRODUTO
     */
    public Float getCOMISSAOPRODUTO() {
        return COMISSAOPRODUTO;
    }

    /**
     * @param COMISSAOPRODUTO the COMISSAOPRODUTO to set
     */
    public void setCOMISSAOPRODUTO(Float COMISSAOPRODUTO) {
        this.COMISSAOPRODUTO = COMISSAOPRODUTO;
    }

    /**
     * @return the COMISSAOSERVICO
     */
    public Float getCOMISSAOSERVICO() {
        return COMISSAOSERVICO;
    }

    /**
     * @param COMISSAOSERVICO the COMISSAOSERVICO to set
     */
    public void setCOMISSAOSERVICO(Float COMISSAOSERVICO) {
        this.COMISSAOSERVICO = COMISSAOSERVICO;
    }
    
}

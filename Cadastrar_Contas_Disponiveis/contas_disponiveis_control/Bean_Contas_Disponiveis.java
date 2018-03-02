/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas_disponiveis_control;

/**
 *
 * @author ana
 */
public class Bean_Contas_Disponiveis {
    
    private int    ID                      ;
                    
    private String APELIDOCURTO                = "";
    private String NOMEDESCRICAODACONTA        = "";

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
     * @return the APELIDOCURTO
     */
    public String getAPELIDOCURTO() {
        return APELIDOCURTO;
    }

    /**
     * @param APELIDOCURTO the APELIDOCURTO to set
     */
    public void setAPELIDOCURTO(String APELIDOCURTO) {
        this.APELIDOCURTO = APELIDOCURTO;
    }

    /**
     * @return the NOMEDESCRICAODACONTA
     */
    public String getNOMEDESCRICAODACONTA() {
        return NOMEDESCRICAODACONTA;
    }

    /**
     * @param NOMEDESCRICAODACONTA the NOMEDESCRICAODACONTA to set
     */
    public void setNOMEDESCRICAODACONTA(String NOMEDESCRICAODACONTA) {
        this.NOMEDESCRICAODACONTA = NOMEDESCRICAODACONTA;
    }

}

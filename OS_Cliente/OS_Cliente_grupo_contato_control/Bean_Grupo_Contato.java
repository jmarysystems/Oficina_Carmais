/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente_grupo_contato_control;

/**
 *
 * @author ana
 */
public class Bean_Grupo_Contato {
    
    private int ID                    ;
                    
    private String NOME           = "";
    private String PALAVRASCHAVE  = "";

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
     * @return the PALAVRASCHAVE
     */
    public String getPALAVRASCHAVE() {
        return PALAVRASCHAVE;
    }

    /**
     * @param PALAVRASCHAVE the PALAVRASCHAVE to set
     */
    public void setPALAVRASCHAVE(String PALAVRASCHAVE) {
        this.PALAVRASCHAVE = PALAVRASCHAVE;
    }

}

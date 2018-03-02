/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto_categoria_control;

/**
 *
 * @author ana
 */
public class Bean_Produto_Categoria {  // CATEGORIA
    
    private int ID              ;
                    
    private String NOME  = "";
    private float MARGEM     ;

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
     * @return the MARGEM
     */
    public float getMARGEM() {
        return MARGEM;
    }

    /**
     * @param MARGEM the MARGEM to set
     */
    public void setMARGEM(float MARGEM) {
        this.MARGEM = MARGEM;
    }

   
}

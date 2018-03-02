/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Produtos;

/**
 *
 * @author ana
 */
public class Bean_Produto_OS {  
    
    private int     ID                               ;
            
    private String  NOME                         = "";          
    private String  UNIDADETRIBUTARIA            = "";              
              
    private float   PRECODEVENDA                     ; 

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
     * @return the UNIDADETRIBUTARIA
     */
    public String getUNIDADETRIBUTARIA() {
        return UNIDADETRIBUTARIA;
    }

    /**
     * @param UNIDADETRIBUTARIA the UNIDADETRIBUTARIA to set
     */
    public void setUNIDADETRIBUTARIA(String UNIDADETRIBUTARIA) {
        this.UNIDADETRIBUTARIA = UNIDADETRIBUTARIA;
    }

    /**
     * @return the PRECODEVENDA
     */
    public float getPRECODEVENDA() {
        return PRECODEVENDA;
    }

    /**
     * @param PRECODEVENDA the PRECODEVENDA to set
     */
    public void setPRECODEVENDA(float PRECODEVENDA) {
        this.PRECODEVENDA = PRECODEVENDA;
    }
 
}

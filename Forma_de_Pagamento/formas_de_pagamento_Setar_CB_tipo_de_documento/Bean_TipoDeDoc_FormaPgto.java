/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_Setar_CB_tipo_de_documento;

/**
 *
 * @author ana
 */
public class Bean_TipoDeDoc_FormaPgto {
    
    private int    ID                      ;
                    
    private String NOME                = "";
    private String TIPODECUSTO         = "";
    private float  VALORDECUSTO        = 0 ;

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
     * @return the TIPODECUSTO
     */
    public String getTIPODECUSTO() {
        return TIPODECUSTO;
    }

    /**
     * @param TIPODECUSTO the TIPODECUSTO to set
     */
    public void setTIPODECUSTO(String TIPODECUSTO) {
        this.TIPODECUSTO = TIPODECUSTO;
    }

    /**
     * @return the VALORDECUSTO
     */
    public float getVALORDECUSTO() {
        return VALORDECUSTO;
    }

    /**
     * @param VALORDECUSTO the VALORDECUSTO to set
     */
    public void setVALORDECUSTO(float VALORDECUSTO) {
        this.VALORDECUSTO = VALORDECUSTO;
    }
    
}

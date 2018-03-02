/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_control;


/**
 *
 * @author ana
 */
public class Bean_Forma_de_Pagamento {
    
    private int    ID                                           ;
                    
    private String NOME                                     = "";
    private String PARCELAMENTOMAXIMO                       = "";
    private String PARCELASSEMJUROS                         = "";
                    
    private float  JUROSPORCENTAGEM                             ;
    private float  TAXAFIXA                                     ;
    private float  DESCONTOAVISTAPORCENTAGEM                    ;
                    
    private int    CONTADEDESTINOPADRAOID                       ;
                    
    private int    TIPODEDOCUMENTOPADRAOID                      ;
                    
    private int    INTERVALOPADRAOENTREASPARCELAS               ;
    private String INTERVALOPADRAOENTREASPARCELASDIAOUMES   = "";

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
     * @return the PARCELAMENTOMAXIMO
     */
    public String getPARCELAMENTOMAXIMO() {
        return PARCELAMENTOMAXIMO;
    }

    /**
     * @param PARCELAMENTOMAXIMO the PARCELAMENTOMAXIMO to set
     */
    public void setPARCELAMENTOMAXIMO(String PARCELAMENTOMAXIMO) {
        this.PARCELAMENTOMAXIMO = PARCELAMENTOMAXIMO;
    }

    /**
     * @return the PARCELASSEMJUROS
     */
    public String getPARCELASSEMJUROS() {
        return PARCELASSEMJUROS;
    }

    /**
     * @param PARCELASSEMJUROS the PARCELASSEMJUROS to set
     */
    public void setPARCELASSEMJUROS(String PARCELASSEMJUROS) {
        this.PARCELASSEMJUROS = PARCELASSEMJUROS;
    }

    /**
     * @return the JUROSPORCENTAGEM
     */
    public float getJUROSPORCENTAGEM() {
        return JUROSPORCENTAGEM;
    }

    /**
     * @param JUROSPORCENTAGEM the JUROSPORCENTAGEM to set
     */
    public void setJUROSPORCENTAGEM(float JUROSPORCENTAGEM) {
        this.JUROSPORCENTAGEM = JUROSPORCENTAGEM;
    }

    /**
     * @return the TAXAFIXA
     */
    public float getTAXAFIXA() {
        return TAXAFIXA;
    }

    /**
     * @param TAXAFIXA the TAXAFIXA to set
     */
    public void setTAXAFIXA(float TAXAFIXA) {
        this.TAXAFIXA = TAXAFIXA;
    }

    /**
     * @return the DESCONTOAVISTAPORCENTAGEM
     */
    public float getDESCONTOAVISTAPORCENTAGEM() {
        return DESCONTOAVISTAPORCENTAGEM;
    }

    /**
     * @param DESCONTOAVISTAPORCENTAGEM the DESCONTOAVISTAPORCENTAGEM to set
     */
    public void setDESCONTOAVISTAPORCENTAGEM(float DESCONTOAVISTAPORCENTAGEM) {
        this.DESCONTOAVISTAPORCENTAGEM = DESCONTOAVISTAPORCENTAGEM;
    }

    /**
     * @return the CONTADEDESTINOPADRAOID
     */
    public int getCONTADEDESTINOPADRAOID() {
        return CONTADEDESTINOPADRAOID;
    }

    /**
     * @param CONTADEDESTINOPADRAOID the CONTADEDESTINOPADRAOID to set
     */
    public void setCONTADEDESTINOPADRAOID(int CONTADEDESTINOPADRAOID) {
        this.CONTADEDESTINOPADRAOID = CONTADEDESTINOPADRAOID;
    }

    /**
     * @return the TIPODEDOCUMENTOPADRAOID
     */
    public int getTIPODEDOCUMENTOPADRAOID() {
        return TIPODEDOCUMENTOPADRAOID;
    }

    /**
     * @param TIPODEDOCUMENTOPADRAOID the TIPODEDOCUMENTOPADRAOID to set
     */
    public void setTIPODEDOCUMENTOPADRAOID(int TIPODEDOCUMENTOPADRAOID) {
        this.TIPODEDOCUMENTOPADRAOID = TIPODEDOCUMENTOPADRAOID;
    }

    /**
     * @return the INTERVALOPADRAOENTREASPARCELAS
     */
    public int getINTERVALOPADRAOENTREASPARCELAS() {
        return INTERVALOPADRAOENTREASPARCELAS;
    }

    /**
     * @param INTERVALOPADRAOENTREASPARCELAS the INTERVALOPADRAOENTREASPARCELAS to set
     */
    public void setINTERVALOPADRAOENTREASPARCELAS(int INTERVALOPADRAOENTREASPARCELAS) {
        this.INTERVALOPADRAOENTREASPARCELAS = INTERVALOPADRAOENTREASPARCELAS;
    }

    /**
     * @return the INTERVALOPADRAOENTREASPARCELASDIAOUMES
     */
    public String getINTERVALOPADRAOENTREASPARCELASDIAOUMES() {
        return INTERVALOPADRAOENTREASPARCELASDIAOUMES;
    }

    /**
     * @param INTERVALOPADRAOENTREASPARCELASDIAOUMES the INTERVALOPADRAOENTREASPARCELASDIAOUMES to set
     */
    public void setINTERVALOPADRAOENTREASPARCELASDIAOUMES(String INTERVALOPADRAOENTREASPARCELASDIAOUMES) {
        this.INTERVALOPADRAOENTREASPARCELASDIAOUMES = INTERVALOPADRAOENTREASPARCELASDIAOUMES;
    }

}

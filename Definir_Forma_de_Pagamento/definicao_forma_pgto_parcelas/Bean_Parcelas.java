/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_parcelas;

import java.util.Date;

/**
 *
 * @author ana
 */
public class Bean_Parcelas {
    
    private String TIPODEVALOR;
    private float  VALOR;
    private Date   DATADOPAGAMENTO;
    private int    CONTADEDESTINO; 
    private int    TIPODEDOCUMENTO;
    private String NUMERODODOCUMENTO;
    private float  CUSTOINTERNO;

    /**
     * @return the TIPODEVALOR
     */
    public String getTIPODEVALOR() {
        return TIPODEVALOR;
    }

    /**
     * @param TIPODEVALOR the TIPODEVALOR to set
     */
    public void setTIPODEVALOR(String TIPODEVALOR) {
        this.TIPODEVALOR = TIPODEVALOR;
    }

    /**
     * @return the VALOR
     */
    public float getVALOR() {
        return VALOR;
    }

    /**
     * @param VALOR the VALOR to set
     */
    public void setVALOR(float VALOR) {
        this.VALOR = VALOR;
    }

    /**
     * @return the DATADOPAGAMENTO
     */
    public Date getDATADOPAGAMENTO() {
        return DATADOPAGAMENTO;
    }

    /**
     * @param DATADOPAGAMENTO the DATADOPAGAMENTO to set
     */
    public void setDATADOPAGAMENTO(Date DATADOPAGAMENTO) {
        this.DATADOPAGAMENTO = DATADOPAGAMENTO;
    }

    /**
     * @return the CONTADEDESTINO
     */
    public int getCONTADEDESTINO() {
        return CONTADEDESTINO;
    }

    /**
     * @param CONTADEDESTINO the CONTADEDESTINO to set
     */
    public void setCONTADEDESTINO(int CONTADEDESTINO) {
        this.CONTADEDESTINO = CONTADEDESTINO;
    }

    /**
     * @return the TIPODEDOCUMENTO
     */
    public int getTIPODEDOCUMENTO() {
        return TIPODEDOCUMENTO;
    }

    /**
     * @param TIPODEDOCUMENTO the TIPODEDOCUMENTO to set
     */
    public void setTIPODEDOCUMENTO(int TIPODEDOCUMENTO) {
        this.TIPODEDOCUMENTO = TIPODEDOCUMENTO;
    }

    /**
     * @return the NUMERODODOCUMENTO
     */
    public String getNUMERODODOCUMENTO() {
        return NUMERODODOCUMENTO;
    }

    /**
     * @param NUMERODODOCUMENTO the NUMERODODOCUMENTO to set
     */
    public void setNUMERODODOCUMENTO(String NUMERODODOCUMENTO) {
        this.NUMERODODOCUMENTO = NUMERODODOCUMENTO;
    }

    /**
     * @return the CUSTOINTERNO
     */
    public float getCUSTOINTERNO() {
        return CUSTOINTERNO;
    }

    /**
     * @param CUSTOINTERNO the CUSTOINTERNO to set
     */
    public void setCUSTOINTERNO(float CUSTOINTERNO) {
        this.CUSTOINTERNO = CUSTOINTERNO;
    }
    
}

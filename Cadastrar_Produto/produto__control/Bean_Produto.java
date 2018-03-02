/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto__control;

/**
 *
 * @author ana
 */
public class Bean_Produto {  
    
    private int     ID                               ;
            
    private String  NOME                         = "";     
    private String  CATEGORIA                    = "";      
    private String  CODIGOPERSONALIZADO          = "";      
    private String  UNIDADETRIBUTARIA            = "";              
                    
    private float   MARGEMDELUCRO                    ;              
    private float   PRECODECUSTO                     ;               
    private float   PRECODEVENDA                     ; 
    private String  VALORDELUCRO                 = ""; 
        
    private String  CODIGODEBARRAS               = ""; 
    private String  LOCALIZACAOINTERNA           = ""; 
    private String  INFORMACOESADICIONAISPARANFE = "";  
                    
    private String  REFERENCIAEANGTIN            = "";                
    private String  NCM                          = "";                
    private String  EXCECAOTABELAIPI             = "";            
    private String  ANOTACOESINTERNAS            = "";         
                    
    private boolean CONTROLARESTOQUE                 ;
    private boolean VENDERCOMESTOQUENEGATIVO         ;
    private int     ESTOQUEMINIMO                    ;
    private String  PALAVRASCHAVE                = "";     

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
     * @return the CATEGORIA
     */
    public String getCATEGORIA() {
        return CATEGORIA;
    }

    /**
     * @param CATEGORIA the CATEGORIA to set
     */
    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    /**
     * @return the CODIGOPERSONALIZADO
     */
    public String getCODIGOPERSONALIZADO() {
        return CODIGOPERSONALIZADO;
    }

    /**
     * @param CODIGOPERSONALIZADO the CODIGOPERSONALIZADO to set
     */
    public void setCODIGOPERSONALIZADO(String CODIGOPERSONALIZADO) {
        this.CODIGOPERSONALIZADO = CODIGOPERSONALIZADO;
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
     * @return the MARGEMDELUCRO
     */
    public float getMARGEMDELUCRO() {
        return MARGEMDELUCRO;
    }

    /**
     * @param MARGEMDELUCRO the MARGEMDELUCRO to set
     */
    public void setMARGEMDELUCRO(float MARGEMDELUCRO) {
        this.MARGEMDELUCRO = MARGEMDELUCRO;
    }

    /**
     * @return the PRECODECUSTO
     */
    public float getPRECODECUSTO() {
        return PRECODECUSTO;
    }

    /**
     * @param PRECODECUSTO the PRECODECUSTO to set
     */
    public void setPRECODECUSTO(float PRECODECUSTO) {
        this.PRECODECUSTO = PRECODECUSTO;
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

    /**
     * @return the VALORDELUCRO
     */
    public String getVALORDELUCRO() {
        return VALORDELUCRO;
    }

    /**
     * @param VALORDELUCRO the VALORDELUCRO to set
     */
    public void setVALORDELUCRO(String VALORDELUCRO) {
        this.VALORDELUCRO = VALORDELUCRO;
    }

    /**
     * @return the CODIGODEBARRAS
     */
    public String getCODIGODEBARRAS() {
        return CODIGODEBARRAS;
    }

    /**
     * @param CODIGODEBARRAS the CODIGODEBARRAS to set
     */
    public void setCODIGODEBARRAS(String CODIGODEBARRAS) {
        this.CODIGODEBARRAS = CODIGODEBARRAS;
    }

    /**
     * @return the LOCALIZACAOINTERNA
     */
    public String getLOCALIZACAOINTERNA() {
        return LOCALIZACAOINTERNA;
    }

    /**
     * @param LOCALIZACAOINTERNA the LOCALIZACAOINTERNA to set
     */
    public void setLOCALIZACAOINTERNA(String LOCALIZACAOINTERNA) {
        this.LOCALIZACAOINTERNA = LOCALIZACAOINTERNA;
    }

    /**
     * @return the INFORMACOESADICIONAISPARANFE
     */
    public String getINFORMACOESADICIONAISPARANFE() {
        return INFORMACOESADICIONAISPARANFE;
    }

    /**
     * @param INFORMACOESADICIONAISPARANFE the INFORMACOESADICIONAISPARANFE to set
     */
    public void setINFORMACOESADICIONAISPARANFE(String INFORMACOESADICIONAISPARANFE) {
        this.INFORMACOESADICIONAISPARANFE = INFORMACOESADICIONAISPARANFE;
    }

    /**
     * @return the REFERENCIAEANGTIN
     */
    public String getREFERENCIAEANGTIN() {
        return REFERENCIAEANGTIN;
    }

    /**
     * @param REFERENCIAEANGTIN the REFERENCIAEANGTIN to set
     */
    public void setREFERENCIAEANGTIN(String REFERENCIAEANGTIN) {
        this.REFERENCIAEANGTIN = REFERENCIAEANGTIN;
    }

    /**
     * @return the NCM
     */
    public String getNCM() {
        return NCM;
    }

    /**
     * @param NCM the NCM to set
     */
    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    /**
     * @return the EXCECAOTABELAIPI
     */
    public String getEXCECAOTABELAIPI() {
        return EXCECAOTABELAIPI;
    }

    /**
     * @param EXCECAOTABELAIPI the EXCECAOTABELAIPI to set
     */
    public void setEXCECAOTABELAIPI(String EXCECAOTABELAIPI) {
        this.EXCECAOTABELAIPI = EXCECAOTABELAIPI;
    }

    /**
     * @return the ANOTACOESINTERNAS
     */
    public String getANOTACOESINTERNAS() {
        return ANOTACOESINTERNAS;
    }

    /**
     * @param ANOTACOESINTERNAS the ANOTACOESINTERNAS to set
     */
    public void setANOTACOESINTERNAS(String ANOTACOESINTERNAS) {
        this.ANOTACOESINTERNAS = ANOTACOESINTERNAS;
    }

    /**
     * @return the CONTROLARESTOQUE
     */
    public boolean isCONTROLARESTOQUE() {
        return CONTROLARESTOQUE;
    }

    /**
     * @param CONTROLARESTOQUE the CONTROLARESTOQUE to set
     */
    public void setCONTROLARESTOQUE(boolean CONTROLARESTOQUE) {
        this.CONTROLARESTOQUE = CONTROLARESTOQUE;
    }

    /**
     * @return the VENDERCOMESTOQUENEGATIVO
     */
    public boolean isVENDERCOMESTOQUENEGATIVO() {
        return VENDERCOMESTOQUENEGATIVO;
    }

    /**
     * @param VENDERCOMESTOQUENEGATIVO the VENDERCOMESTOQUENEGATIVO to set
     */
    public void setVENDERCOMESTOQUENEGATIVO(boolean VENDERCOMESTOQUENEGATIVO) {
        this.VENDERCOMESTOQUENEGATIVO = VENDERCOMESTOQUENEGATIVO;
    }

    /**
     * @return the ESTOQUEMINIMO
     */
    public int getESTOQUEMINIMO() {
        return ESTOQUEMINIMO;
    }

    /**
     * @param ESTOQUEMINIMO the ESTOQUEMINIMO to set
     */
    public void setESTOQUEMINIMO(int ESTOQUEMINIMO) {
        this.ESTOQUEMINIMO = ESTOQUEMINIMO;
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

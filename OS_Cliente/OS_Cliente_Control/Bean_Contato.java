/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente_Control;

/**
 *
 * @author ana
 */
public class Bean_Contato {
    
    private int ID                               ;
                    
    private boolean PESSOAFISICA          = false;
    private boolean PESSOAJURIDICA        = false;
    private String  GRUPO                 = ""   ;       
    private String  ANOTACOESGERAIS       = ""   ;
                    
    private String  NOMEOURAZAOSOCIAL     = ""   ;
    private String  NOMEFANTASIA          = ""   ;
    private String  CPFOUCNPJ             = ""   ;
    private String  NOMEDORESPONSAVEL     = ""   ;
                    
    private String  INSCRICAOESTADUAL     = ""   ;
    private String  INSCRICAOESTSUBSTTRIB = ""   ;
    private String  INSCRICAOMUNICIPAL    = ""   ;
    private String  INSCRICAOSUFRAMA      = ""   ;
                    
    private String  CEP                   = ""   ;
    private String  ENDERECO              = ""   ;
    private int     NUMERO                       ;             
    private String  COMPLEMENTO           = ""   ;
                    
    private String  BAIRRO                = ""   ;
    private String  ESTADO                = ""   ;
    private String  CIDADE                = ""   ;
    private String  PAIS                  = ""   ;
                    
    private String  TELEFONE              = ""   ;
    private String  FONE2                 = ""   ;
    private String  FONE3                 = ""   ;
    private String  DATADENASCIMENTO      = ""   ;
                    
    private String  EMAIL                 = ""   ;
    private String  OUTROEMAIL            = ""   ;
    private String  PALAVRASCHAVE         = ""   ;
    private String  FACEBOOK              = ""   ;

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
     * @return the PESSOAFISICA
     */
    public boolean isPESSOAFISICA() {
        return PESSOAFISICA;
    }

    /**
     * @param PESSOAFISICA the PESSOAFISICA to set
     */
    public void setPESSOAFISICA(boolean PESSOAFISICA) {
        this.PESSOAFISICA = PESSOAFISICA;
    }

    /**
     * @return the PESSOAJURIDICA
     */
    public boolean isPESSOAJURIDICA() {
        return PESSOAJURIDICA;
    }

    /**
     * @param PESSOAJURIDICA the PESSOAJURIDICA to set
     */
    public void setPESSOAJURIDICA(boolean PESSOAJURIDICA) {
        this.PESSOAJURIDICA = PESSOAJURIDICA;
    }

    /**
     * @return the GRUPO
     */
    public String getGRUPO() {
        return GRUPO;
    }

    /**
     * @param GRUPO the GRUPO to set
     */
    public void setGRUPO(String GRUPO) {
        this.GRUPO = GRUPO;
    }

    /**
     * @return the ANOTACOESGERAIS
     */
    public String getANOTACOESGERAIS() {
        return ANOTACOESGERAIS;
    }

    /**
     * @param ANOTACOESGERAIS the ANOTACOESGERAIS to set
     */
    public void setANOTACOESGERAIS(String ANOTACOESGERAIS) {
        this.ANOTACOESGERAIS = ANOTACOESGERAIS;
    }

    /**
     * @return the NOMEOURAZAOSOCIAL
     */
    public String getNOMEOURAZAOSOCIAL() {
        return NOMEOURAZAOSOCIAL;
    }

    /**
     * @param NOMEOURAZAOSOCIAL the NOMEOURAZAOSOCIAL to set
     */
    public void setNOMEOURAZAOSOCIAL(String NOMEOURAZAOSOCIAL) {
        this.NOMEOURAZAOSOCIAL = NOMEOURAZAOSOCIAL;
    }

    /**
     * @return the NOMEFANTASIA
     */
    public String getNOMEFANTASIA() {
        return NOMEFANTASIA;
    }

    /**
     * @param NOMEFANTASIA the NOMEFANTASIA to set
     */
    public void setNOMEFANTASIA(String NOMEFANTASIA) {
        this.NOMEFANTASIA = NOMEFANTASIA;
    }

    /**
     * @return the CPFOUCNPJ
     */
    public String getCPFOUCNPJ() {
        return CPFOUCNPJ;
    }

    /**
     * @param CPFOUCNPJ the CPFOUCNPJ to set
     */
    public void setCPFOUCNPJ(String CPFOUCNPJ) {
        this.CPFOUCNPJ = CPFOUCNPJ;
    }

    /**
     * @return the NOMEDORESPONSAVEL
     */
    public String getNOMEDORESPONSAVEL() {
        return NOMEDORESPONSAVEL;
    }

    /**
     * @param NOMEDORESPONSAVEL the NOMEDORESPONSAVEL to set
     */
    public void setNOMEDORESPONSAVEL(String NOMEDORESPONSAVEL) {
        this.NOMEDORESPONSAVEL = NOMEDORESPONSAVEL;
    }

    /**
     * @return the INSCRICAOESTADUAL
     */
    public String getINSCRICAOESTADUAL() {
        return INSCRICAOESTADUAL;
    }

    /**
     * @param INSCRICAOESTADUAL the INSCRICAOESTADUAL to set
     */
    public void setINSCRICAOESTADUAL(String INSCRICAOESTADUAL) {
        this.INSCRICAOESTADUAL = INSCRICAOESTADUAL;
    }

    /**
     * @return the INSCRICAOESTSUBSTTRIB
     */
    public String getINSCRICAOESTSUBSTTRIB() {
        return INSCRICAOESTSUBSTTRIB;
    }

    /**
     * @param INSCRICAOESTSUBSTTRIB the INSCRICAOESTSUBSTTRIB to set
     */
    public void setINSCRICAOESTSUBSTTRIB(String INSCRICAOESTSUBSTTRIB) {
        this.INSCRICAOESTSUBSTTRIB = INSCRICAOESTSUBSTTRIB;
    }

    /**
     * @return the INSCRICAOMUNICIPAL
     */
    public String getINSCRICAOMUNICIPAL() {
        return INSCRICAOMUNICIPAL;
    }

    /**
     * @param INSCRICAOMUNICIPAL the INSCRICAOMUNICIPAL to set
     */
    public void setINSCRICAOMUNICIPAL(String INSCRICAOMUNICIPAL) {
        this.INSCRICAOMUNICIPAL = INSCRICAOMUNICIPAL;
    }

    /**
     * @return the INSCRICAOSUFRAMA
     */
    public String getINSCRICAOSUFRAMA() {
        return INSCRICAOSUFRAMA;
    }

    /**
     * @param INSCRICAOSUFRAMA the INSCRICAOSUFRAMA to set
     */
    public void setINSCRICAOSUFRAMA(String INSCRICAOSUFRAMA) {
        this.INSCRICAOSUFRAMA = INSCRICAOSUFRAMA;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the ENDERECO
     */
    public String getENDERECO() {
        return ENDERECO;
    }

    /**
     * @param ENDERECO the ENDERECO to set
     */
    public void setENDERECO(String ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    /**
     * @return the NUMERO
     */
    public int getNUMERO() {
        return NUMERO;
    }

    /**
     * @param NUMERO the NUMERO to set
     */
    public void setNUMERO(int NUMERO) {
        this.NUMERO = NUMERO;
    }

    /**
     * @return the COMPLEMENTO
     */
    public String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }

    /**
     * @param COMPLEMENTO the COMPLEMENTO to set
     */
    public void setCOMPLEMENTO(String COMPLEMENTO) {
        this.COMPLEMENTO = COMPLEMENTO;
    }

    /**
     * @return the BAIRRO
     */
    public String getBAIRRO() {
        return BAIRRO;
    }

    /**
     * @param BAIRRO the BAIRRO to set
     */
    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    /**
     * @return the ESTADO
     */
    public String getESTADO() {
        return ESTADO;
    }

    /**
     * @param ESTADO the ESTADO to set
     */
    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    /**
     * @return the CIDADE
     */
    public String getCIDADE() {
        return CIDADE;
    }

    /**
     * @param CIDADE the CIDADE to set
     */
    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    /**
     * @return the PAIS
     */
    public String getPAIS() {
        return PAIS;
    }

    /**
     * @param PAIS the PAIS to set
     */
    public void setPAIS(String PAIS) {
        this.PAIS = PAIS;
    }

    /**
     * @return the TELEFONE
     */
    public String getTELEFONE() {
        return TELEFONE;
    }

    /**
     * @param TELEFONE the TELEFONE to set
     */
    public void setTELEFONE(String TELEFONE) {
        this.TELEFONE = TELEFONE;
    }

    /**
     * @return the FONE2
     */
    public String getFONE2() {
        return FONE2;
    }

    /**
     * @param FONE2 the FONE2 to set
     */
    public void setFONE2(String FONE2) {
        this.FONE2 = FONE2;
    }

    /**
     * @return the FONE3
     */
    public String getFONE3() {
        return FONE3;
    }

    /**
     * @param FONE3 the FONE3 to set
     */
    public void setFONE3(String FONE3) {
        this.FONE3 = FONE3;
    }

    /**
     * @return the DATADENASCIMENTO
     */
    public String getDATADENASCIMENTO() {
        return DATADENASCIMENTO;
    }

    /**
     * @param DATADENASCIMENTO the DATADENASCIMENTO to set
     */
    public void setDATADENASCIMENTO(String DATADENASCIMENTO) {
        this.DATADENASCIMENTO = DATADENASCIMENTO;
    }

    /**
     * @return the EMAIL
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /**
     * @param EMAIL the EMAIL to set
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    /**
     * @return the OUTROEMAIL
     */
    public String getOUTROEMAIL() {
        return OUTROEMAIL;
    }

    /**
     * @param OUTROEMAIL the OUTROEMAIL to set
     */
    public void setOUTROEMAIL(String OUTROEMAIL) {
        this.OUTROEMAIL = OUTROEMAIL;
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

    /**
     * @return the FACEBOOK
     */
    public String getFACEBOOK() {
        return FACEBOOK;
    }

    /**
     * @param FACEBOOK the FACEBOOK to set
     */
    public void setFACEBOOK(String FACEBOOK) {
        this.FACEBOOK = FACEBOOK;
    }
    
}

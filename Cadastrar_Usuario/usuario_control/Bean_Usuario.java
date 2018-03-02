/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario_control;

/**
 *
 * @author ana
 */
public class Bean_Usuario {
    
    private int ID                                   ;
                    
    private String NOME                          = "";
    private String EMAIL                         = "";
    private String PALAVRASCHAVE                 = "";
                    
    private String TIPODEUSUARIO                 = "";
    
    private float   COMISSAOPRODUTO              = 0;
    private float   COMISSAOSERVICO              = 0;
                    
    private boolean PERMITIRACESSO               = false;
    private String  LOGIN                        = "";
    private String  SENHA                        = "";
                                                            
    private boolean CADASTRARUSUARIO             = false;
                    
    private boolean CADASTRARGRUPO               = false;
    private boolean CADASTRARCLIENTE             = false;                   
    private boolean CADASTRARFORNECEDOR          = false;
    private boolean CADASTRARTRANSPORTADOR       = false;
                    
    private boolean CADASTRARSERVICO             = false;                   
    private boolean CADASTRARCATEGORIA           = false;
    private boolean CADASTRARPRODUTO             = false;
                    
    private boolean CADASTRARTIPOSDEDOCUMENTOS   = false; 
    private boolean CADASTRARFORMADEPAGAMENTO    = false; 
    private boolean CADASTRARALTERARDEPAGAMENTO  = false;
                    
    private boolean CADASTRAROS                  = false;

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
     * @return the TIPODEUSUARIO
     */
    public String getTIPODEUSUARIO() {
        return TIPODEUSUARIO;
    }

    /**
     * @param TIPODEUSUARIO the TIPODEUSUARIO to set
     */
    public void setTIPODEUSUARIO(String TIPODEUSUARIO) {
        this.TIPODEUSUARIO = TIPODEUSUARIO;
    }

    /**
     * @return the COMISSAOPRODUTO
     */
    public float getCOMISSAOPRODUTO() {
        return COMISSAOPRODUTO;
    }

    /**
     * @param COMISSAOPRODUTO the COMISSAOPRODUTO to set
     */
    public void setCOMISSAOPRODUTO(float COMISSAOPRODUTO) {
        this.COMISSAOPRODUTO = COMISSAOPRODUTO;
    }

    /**
     * @return the COMISSAOSERVICO
     */
    public float getCOMISSAOSERVICO() {
        return COMISSAOSERVICO;
    }

    /**
     * @param COMISSAOSERVICO the COMISSAOSERVICO to set
     */
    public void setCOMISSAOSERVICO(float COMISSAOSERVICO) {
        this.COMISSAOSERVICO = COMISSAOSERVICO;
    }

    /**
     * @return the PERMITIRACESSO
     */
    public boolean isPERMITIRACESSO() {
        return PERMITIRACESSO;
    }

    /**
     * @param PERMITIRACESSO the PERMITIRACESSO to set
     */
    public void setPERMITIRACESSO(boolean PERMITIRACESSO) {
        this.PERMITIRACESSO = PERMITIRACESSO;
    }

    /**
     * @return the LOGIN
     */
    public String getLOGIN() {
        return LOGIN;
    }

    /**
     * @param LOGIN the LOGIN to set
     */
    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    /**
     * @return the SENHA
     */
    public String getSENHA() {
        return SENHA;
    }

    /**
     * @param SENHA the SENHA to set
     */
    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    /**
     * @return the CADASTRARUSUARIO
     */
    public boolean isCADASTRARUSUARIO() {
        return CADASTRARUSUARIO;
    }

    /**
     * @param CADASTRARUSUARIO the CADASTRARUSUARIO to set
     */
    public void setCADASTRARUSUARIO(boolean CADASTRARUSUARIO) {
        this.CADASTRARUSUARIO = CADASTRARUSUARIO;
    }

    /**
     * @return the CADASTRARGRUPO
     */
    public boolean isCADASTRARGRUPO() {
        return CADASTRARGRUPO;
    }

    /**
     * @param CADASTRARGRUPO the CADASTRARGRUPO to set
     */
    public void setCADASTRARGRUPO(boolean CADASTRARGRUPO) {
        this.CADASTRARGRUPO = CADASTRARGRUPO;
    }

    /**
     * @return the CADASTRARCLIENTE
     */
    public boolean isCADASTRARCLIENTE() {
        return CADASTRARCLIENTE;
    }

    /**
     * @param CADASTRARCLIENTE the CADASTRARCLIENTE to set
     */
    public void setCADASTRARCLIENTE(boolean CADASTRARCLIENTE) {
        this.CADASTRARCLIENTE = CADASTRARCLIENTE;
    }

    /**
     * @return the CADASTRARFORNECEDOR
     */
    public boolean isCADASTRARFORNECEDOR() {
        return CADASTRARFORNECEDOR;
    }

    /**
     * @param CADASTRARFORNECEDOR the CADASTRARFORNECEDOR to set
     */
    public void setCADASTRARFORNECEDOR(boolean CADASTRARFORNECEDOR) {
        this.CADASTRARFORNECEDOR = CADASTRARFORNECEDOR;
    }

    /**
     * @return the CADASTRARTRANSPORTADOR
     */
    public boolean isCADASTRARTRANSPORTADOR() {
        return CADASTRARTRANSPORTADOR;
    }

    /**
     * @param CADASTRARTRANSPORTADOR the CADASTRARTRANSPORTADOR to set
     */
    public void setCADASTRARTRANSPORTADOR(boolean CADASTRARTRANSPORTADOR) {
        this.CADASTRARTRANSPORTADOR = CADASTRARTRANSPORTADOR;
    }

    /**
     * @return the CADASTRARSERVICO
     */
    public boolean isCADASTRARSERVICO() {
        return CADASTRARSERVICO;
    }

    /**
     * @param CADASTRARSERVICO the CADASTRARSERVICO to set
     */
    public void setCADASTRARSERVICO(boolean CADASTRARSERVICO) {
        this.CADASTRARSERVICO = CADASTRARSERVICO;
    }

    /**
     * @return the CADASTRARCATEGORIA
     */
    public boolean isCADASTRARCATEGORIA() {
        return CADASTRARCATEGORIA;
    }

    /**
     * @param CADASTRARCATEGORIA the CADASTRARCATEGORIA to set
     */
    public void setCADASTRARCATEGORIA(boolean CADASTRARCATEGORIA) {
        this.CADASTRARCATEGORIA = CADASTRARCATEGORIA;
    }

    /**
     * @return the CADASTRARPRODUTO
     */
    public boolean isCADASTRARPRODUTO() {
        return CADASTRARPRODUTO;
    }

    /**
     * @param CADASTRARPRODUTO the CADASTRARPRODUTO to set
     */
    public void setCADASTRARPRODUTO(boolean CADASTRARPRODUTO) {
        this.CADASTRARPRODUTO = CADASTRARPRODUTO;
    }

    /**
     * @return the CADASTRARTIPOSDEDOCUMENTOS
     */
    public boolean isCADASTRARTIPOSDEDOCUMENTOS() {
        return CADASTRARTIPOSDEDOCUMENTOS;
    }

    /**
     * @param CADASTRARTIPOSDEDOCUMENTOS the CADASTRARTIPOSDEDOCUMENTOS to set
     */
    public void setCADASTRARTIPOSDEDOCUMENTOS(boolean CADASTRARTIPOSDEDOCUMENTOS) {
        this.CADASTRARTIPOSDEDOCUMENTOS = CADASTRARTIPOSDEDOCUMENTOS;
    }

    /**
     * @return the CADASTRARFORMADEPAGAMENTO
     */
    public boolean isCADASTRARFORMADEPAGAMENTO() {
        return CADASTRARFORMADEPAGAMENTO;
    }

    /**
     * @param CADASTRARFORMADEPAGAMENTO the CADASTRARFORMADEPAGAMENTO to set
     */
    public void setCADASTRARFORMADEPAGAMENTO(boolean CADASTRARFORMADEPAGAMENTO) {
        this.CADASTRARFORMADEPAGAMENTO = CADASTRARFORMADEPAGAMENTO;
    }

    /**
     * @return the CADASTRARALTERARDEPAGAMENTO
     */
    public boolean isCADASTRARALTERARDEPAGAMENTO() {
        return CADASTRARALTERARDEPAGAMENTO;
    }

    /**
     * @param CADASTRARALTERARDEPAGAMENTO the CADASTRARALTERARDEPAGAMENTO to set
     */
    public void setCADASTRARALTERARDEPAGAMENTO(boolean CADASTRARALTERARDEPAGAMENTO) {
        this.CADASTRARALTERARDEPAGAMENTO = CADASTRARALTERARDEPAGAMENTO;
    }

    /**
     * @return the CADASTRAROS
     */
    public boolean isCADASTRAROS() {
        return CADASTRAROS;
    }

    /**
     * @param CADASTRAROS the CADASTRAROS to set
     */
    public void setCADASTRAROS(boolean CADASTRAROS) {
        this.CADASTRAROS = CADASTRAROS;
    }

    
}

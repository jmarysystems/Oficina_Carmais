/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_usuario_logado;

/**
 *
 * @author ana
 */
public class Home_Bean_logado {
    
    private static int ID                                   ;
                    
    private static String NOME                          = "";
    private static String EMAIL                         = "";
    private static String PALAVRASCHAVE                 = "";
    
    private static String TIPODEUSUARIO                 = "";
    
    private static float   COMISSAOPRODUTO              = 0;
    private static float   COMISSAOSERVICO              = 0;
                    
    private static boolean PERMITIRACESSO               = false;
    private static String  LOGIN                        = "";
    private static String  SENHA                        = "";
                                                            
    private static boolean CADASTRARUSUARIO             = false;
                    
    private static boolean CADASTRARGRUPO               = false;
    private static boolean CADASTRARCLIENTE             = false;                   
    private static boolean CADASTRARFORNECEDOR          = false;
    private static boolean CADASTRARTRANSPORTADOR       = false;
                    
    private static boolean CADASTRARSERVICO             = false;                   
    private static boolean CADASTRARCATEGORIA           = false;
    private static boolean CADASTRARPRODUTO             = false;
                    
    private static boolean CADASTRARTIPOSDEDOCUMENTOS   = false; 
    private static boolean CADASTRARFORMADEPAGAMENTO    = false; 
    private static boolean CADASTRARALTERARDEPAGAMENTO  = false;
                    
    private static boolean CADASTRAROS                  = false;

    /**
     * @return the ID
     */
    public static int getID() {
        return ID;
    }

    /**
     * @param aID the ID to set
     */
    public static void setID(int aID) {
        ID = aID;
    }

    /**
     * @return the NOME
     */
    public static String getNOME() {
        return NOME;
    }

    /**
     * @param aNOME the NOME to set
     */
    public static void setNOME(String aNOME) {
        NOME = aNOME;
    }

    /**
     * @return the EMAIL
     */
    public static String getEMAIL() {
        return EMAIL;
    }

    /**
     * @param aEMAIL the EMAIL to set
     */
    public static void setEMAIL(String aEMAIL) {
        EMAIL = aEMAIL;
    }

    /**
     * @return the PALAVRASCHAVE
     */
    public static String getPALAVRASCHAVE() {
        return PALAVRASCHAVE;
    }

    /**
     * @param aPALAVRASCHAVE the PALAVRASCHAVE to set
     */
    public static void setPALAVRASCHAVE(String aPALAVRASCHAVE) {
        PALAVRASCHAVE = aPALAVRASCHAVE;
    }

    /**
     * @return the TIPODEUSUARIO
     */
    public static String getTIPODEUSUARIO() {
        return TIPODEUSUARIO;
    }

    /**
     * @param aTIPODEUSUARIO the TIPODEUSUARIO to set
     */
    public static void setTIPODEUSUARIO(String aTIPODEUSUARIO) {
        TIPODEUSUARIO = aTIPODEUSUARIO;
    }

    /**
     * @return the COMISSAOPRODUTO
     */
    public static float getCOMISSAOPRODUTO() {
        return COMISSAOPRODUTO;
    }

    /**
     * @param aCOMISSAOPRODUTO the COMISSAOPRODUTO to set
     */
    public static void setCOMISSAOPRODUTO(float aCOMISSAOPRODUTO) {
        COMISSAOPRODUTO = aCOMISSAOPRODUTO;
    }

    /**
     * @return the COMISSAOSERVICO
     */
    public static float getCOMISSAOSERVICO() {
        return COMISSAOSERVICO;
    }

    /**
     * @param aCOMISSAOSERVICO the COMISSAOSERVICO to set
     */
    public static void setCOMISSAOSERVICO(float aCOMISSAOSERVICO) {
        COMISSAOSERVICO = aCOMISSAOSERVICO;
    }

    /**
     * @return the PERMITIRACESSO
     */
    public static boolean isPERMITIRACESSO() {
        return PERMITIRACESSO;
    }

    /**
     * @param aPERMITIRACESSO the PERMITIRACESSO to set
     */
    public static void setPERMITIRACESSO(boolean aPERMITIRACESSO) {
        PERMITIRACESSO = aPERMITIRACESSO;
    }

    /**
     * @return the LOGIN
     */
    public static String getLOGIN() {
        return LOGIN;
    }

    /**
     * @param aLOGIN the LOGIN to set
     */
    public static void setLOGIN(String aLOGIN) {
        LOGIN = aLOGIN;
    }

    /**
     * @return the SENHA
     */
    public static String getSENHA() {
        return SENHA;
    }

    /**
     * @param aSENHA the SENHA to set
     */
    public static void setSENHA(String aSENHA) {
        SENHA = aSENHA;
    }

    /**
     * @return the CADASTRARUSUARIO
     */
    public static boolean isCADASTRARUSUARIO() {
        return CADASTRARUSUARIO;
    }

    /**
     * @param aCADASTRARUSUARIO the CADASTRARUSUARIO to set
     */
    public static void setCADASTRARUSUARIO(boolean aCADASTRARUSUARIO) {
        CADASTRARUSUARIO = aCADASTRARUSUARIO;
    }

    /**
     * @return the CADASTRARGRUPO
     */
    public static boolean isCADASTRARGRUPO() {
        return CADASTRARGRUPO;
    }

    /**
     * @param aCADASTRARGRUPO the CADASTRARGRUPO to set
     */
    public static void setCADASTRARGRUPO(boolean aCADASTRARGRUPO) {
        CADASTRARGRUPO = aCADASTRARGRUPO;
    }

    /**
     * @return the CADASTRARCLIENTE
     */
    public static boolean isCADASTRARCLIENTE() {
        return CADASTRARCLIENTE;
    }

    /**
     * @param aCADASTRARCLIENTE the CADASTRARCLIENTE to set
     */
    public static void setCADASTRARCLIENTE(boolean aCADASTRARCLIENTE) {
        CADASTRARCLIENTE = aCADASTRARCLIENTE;
    }

    /**
     * @return the CADASTRARFORNECEDOR
     */
    public static boolean isCADASTRARFORNECEDOR() {
        return CADASTRARFORNECEDOR;
    }

    /**
     * @param aCADASTRARFORNECEDOR the CADASTRARFORNECEDOR to set
     */
    public static void setCADASTRARFORNECEDOR(boolean aCADASTRARFORNECEDOR) {
        CADASTRARFORNECEDOR = aCADASTRARFORNECEDOR;
    }

    /**
     * @return the CADASTRARTRANSPORTADOR
     */
    public static boolean isCADASTRARTRANSPORTADOR() {
        return CADASTRARTRANSPORTADOR;
    }

    /**
     * @param aCADASTRARTRANSPORTADOR the CADASTRARTRANSPORTADOR to set
     */
    public static void setCADASTRARTRANSPORTADOR(boolean aCADASTRARTRANSPORTADOR) {
        CADASTRARTRANSPORTADOR = aCADASTRARTRANSPORTADOR;
    }

    /**
     * @return the CADASTRARSERVICO
     */
    public static boolean isCADASTRARSERVICO() {
        return CADASTRARSERVICO;
    }

    /**
     * @param aCADASTRARSERVICO the CADASTRARSERVICO to set
     */
    public static void setCADASTRARSERVICO(boolean aCADASTRARSERVICO) {
        CADASTRARSERVICO = aCADASTRARSERVICO;
    }

    /**
     * @return the CADASTRARCATEGORIA
     */
    public static boolean isCADASTRARCATEGORIA() {
        return CADASTRARCATEGORIA;
    }

    /**
     * @param aCADASTRARCATEGORIA the CADASTRARCATEGORIA to set
     */
    public static void setCADASTRARCATEGORIA(boolean aCADASTRARCATEGORIA) {
        CADASTRARCATEGORIA = aCADASTRARCATEGORIA;
    }

    /**
     * @return the CADASTRARPRODUTO
     */
    public static boolean isCADASTRARPRODUTO() {
        return CADASTRARPRODUTO;
    }

    /**
     * @param aCADASTRARPRODUTO the CADASTRARPRODUTO to set
     */
    public static void setCADASTRARPRODUTO(boolean aCADASTRARPRODUTO) {
        CADASTRARPRODUTO = aCADASTRARPRODUTO;
    }

    /**
     * @return the CADASTRARTIPOSDEDOCUMENTOS
     */
    public static boolean isCADASTRARTIPOSDEDOCUMENTOS() {
        return CADASTRARTIPOSDEDOCUMENTOS;
    }

    /**
     * @param aCADASTRARTIPOSDEDOCUMENTOS the CADASTRARTIPOSDEDOCUMENTOS to set
     */
    public static void setCADASTRARTIPOSDEDOCUMENTOS(boolean aCADASTRARTIPOSDEDOCUMENTOS) {
        CADASTRARTIPOSDEDOCUMENTOS = aCADASTRARTIPOSDEDOCUMENTOS;
    }

    /**
     * @return the CADASTRARFORMADEPAGAMENTO
     */
    public static boolean isCADASTRARFORMADEPAGAMENTO() {
        return CADASTRARFORMADEPAGAMENTO;
    }

    /**
     * @param aCADASTRARFORMADEPAGAMENTO the CADASTRARFORMADEPAGAMENTO to set
     */
    public static void setCADASTRARFORMADEPAGAMENTO(boolean aCADASTRARFORMADEPAGAMENTO) {
        CADASTRARFORMADEPAGAMENTO = aCADASTRARFORMADEPAGAMENTO;
    }

    /**
     * @return the CADASTRARALTERARDEPAGAMENTO
     */
    public static boolean isCADASTRARALTERARDEPAGAMENTO() {
        return CADASTRARALTERARDEPAGAMENTO;
    }

    /**
     * @param aCADASTRARALTERARDEPAGAMENTO the CADASTRARALTERARDEPAGAMENTO to set
     */
    public static void setCADASTRARALTERARDEPAGAMENTO(boolean aCADASTRARALTERARDEPAGAMENTO) {
        CADASTRARALTERARDEPAGAMENTO = aCADASTRARALTERARDEPAGAMENTO;
    }

    /**
     * @return the CADASTRAROS
     */
    public static boolean isCADASTRAROS() {
        return CADASTRAROS;
    }

    /**
     * @param aCADASTRAROS the CADASTRAROS to set
     */
    public static void setCADASTRAROS(boolean aCADASTRAROS) {
        CADASTRAROS = aCADASTRAROS;
    }
  
  
}

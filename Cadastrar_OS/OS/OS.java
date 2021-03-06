/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OS;

import OS_Adicionar_Produto_Servico.Preenchimento_Lista;
import OS_Designer.OS_Botoes;
import OS_Designer.OS_Corpo;
import OS_Forma_de_Pagamento.Bean_OS_Contas_Disponiveis;
import OS_Forma_de_Pagamento.Bean_OS_Forma_de_Pagamento;
import OS_Forma_de_Pagamento.Bean_OS_TipoDeDocumento;
import OS_Produtos.BookInfoProdutos;
import OS_Servicos.BookInfoServicos;
import OS_Tecnico.BookInfoTecnico;
import OS_metodos.OS_Botao_Novo_PressionadoInicio;
import OS_metodos.OS_Botoes_Inicio;
import home.Home;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTabbedPane;
import definicao_forma_pgto_parcelas.Preenchimento_Lista_Parcelas;
import utilidades.JOptionPaneMod;

/**
 *
 * @author AnaMariana
 */
public class OS extends javax.swing.JPanel {
    
    public Home Home;
    public OS_Botoes OS_Botoes;
    public OS_Corpo OS_Corpo;
    
    public List<BookInfoTecnico> ListBookInfoTecnico = new ArrayList();
    public List<BookInfoServicos> BookInfoServicos = new ArrayList();
    public List<BookInfoProdutos> BookInfoProdutos = new ArrayList();
    
    public Inicio_OS Inicio_OS;
    public JTabbedPane tabOS = new JTabbedPane();
    OS_Botoes_Inicio OS_Botoes_Inicio;
        
    /**
     * Creates new form Cliente
     * @param Home2
     */
    public OS( Home Home2 ) {
        initComponents();
        Home = Home2;
        
        OS_Botoes = new OS_Botoes( Home, this );
        OS_Corpo  = new OS_Corpo ( Home, this );
        Inicio_OS = new Inicio_OS( Home, this ); 
                
        setar_Inicio_OS();
               
    }
            
    private void setar_Inicio_OS(){
        try {  
                    
            Inicio_OS.inicioCBS();
            Inicio_OS.inicioTabDadosDaOS();
            Inicio_OS.inicioSetarNoTabOSBotoes_Corpo();
            
            OS_Botao_Novo_PressionadoInicio OS_Botao_Novo_Pressionado = new OS_Botao_Novo_PressionadoInicio(this, Home, false, false);
            
        }catch(Exception e) {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "OS, "
                    + "\nsetar_Inicio_OS()"
                    + e.getMessage()
                    + "\n", "setar_Inicio_OS()" );
        }
    }
           
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnOS = new javax.swing.JPanel();

        javax.swing.GroupLayout pnOSLayout = new javax.swing.GroupLayout(pnOS);
        pnOS.setLayout(pnOSLayout);
        pnOSLayout.setHorizontalGroup(
            pnOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        pnOSLayout.setVerticalGroup(
            pnOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel pnOS;
    // End of variables declaration//GEN-END:variables
    
    public List<Preenchimento_Lista> listaPreenchimento_ListaProduto = new ArrayList();
    public List<Preenchimento_Lista> listaPreenchimento_ListaServico = new ArrayList();
    
    public List<Preenchimento_Lista_Parcelas> listaPreenchimento_Lista_Parcelas = new ArrayList();

    
    
    public void receber_e_SetarCliente( String nomeCliente2, int codigoCliente2 ) {
        nomeCliente   = nomeCliente2;
        codigoCliente = codigoCliente2; 
        
        OS_Corpo.tfCliente.setText( nomeCliente );
    }
    
    public void receber_e_SetarCBFORMAPGTOSELECIONADO( int CBFORMAPGTOSELECIONADO2 ) {
        CBFORMAPGTOSELECIONADO = CBFORMAPGTOSELECIONADO2;
    }
    
    public void receber_e_SetarCBPARCELASSELECIONADO( int CBPARCELASSELECIONADO2 ) {
       CBPARCELASSELECIONADO = CBPARCELASSELECIONADO2;
    }
    
    public void receber_e_SetarQTDParcelas( int QTDPARCELAS2 ) {
        QTDPARCELAS = QTDPARCELAS2;
    }
    
    public void receber_e_SetarCBTIPODEENTRADASELECIONADO( int CBTIPODEENTRADASELECIONADO2 ) {
       CBTIPODEENTRADASELECIONADO = CBTIPODEENTRADASELECIONADO2;
    }
            
    public void receber_e_SetarValorDeEntrada( float VALORDEENTRADA2 ) {
        VALORDEENTRADA = VALORDEENTRADA2;
    }
    
    public void receber_e_SetarCBTIPODEDESCONTO( int CBTIPODEDESCONTO2 ) {
        CBTIPODEDESCONTOSELECIONADO = CBTIPODEDESCONTO2;
    }  
    
    public void receber_e_SetarVALORDEDESCONTO( float VALORDEDESCONTO2 ) {
        VALORDEDESCONTO = VALORDEDESCONTO2;
    }         
    
    public void receber_e_SetarConta( Bean_OS_Contas_Disponiveis Bean ) {
        IDDACONTA            = Bean.getID();
        APELIDOCURTO         = Bean.getAPELIDOCURTO();
        NOMEDESCRICAODACONTA = Bean.getNOMEDESCRICAODACONTA();
    }
    
    public void receber_e_SetarDocumento( Bean_OS_TipoDeDocumento Bean ) {
        IDTIPODEDOCUMENTO   = Bean.getID() ;                    
        NOMETIPODEDOCUMENTO = Bean.getNOME();
        TIPODECUSTO         = Bean.getTIPODECUSTO();
        VALORDECUSTO        = Bean.getVALORDECUSTO() ;
    }
    
    public void receber_e_SetarFormaPgto( Bean_OS_Forma_de_Pagamento Bean ) {
        IDFORMAPGTO                              = Bean.getID();                    
        NOMEFORMAPGTO                            = Bean.getNOME();
        PARCELAMENTOMAXIMO                       = Bean.getPARCELAMENTOMAXIMO();
        PARCELASSEMJUROS                         = Bean.getPARCELASSEMJUROS();                    
        JUROSPORCENTAGEM                         = Bean.getJUROSPORCENTAGEM();
        TAXAFIXA                                 = Bean.getTAXAFIXA();
        DESCONTOAVISTAPORCENTAGEM                = Bean.getDESCONTOAVISTAPORCENTAGEM();                    
        CONTADEDESTINOPADRAOID                   = Bean.getCONTADEDESTINOPADRAOID();                    
        TIPODEDOCUMENTOPADRAOID                  = Bean.getTIPODEDOCUMENTOPADRAOID();                    
        INTERVALOPADRAOENTREASPARCELAS           = Bean.getINTERVALOPADRAOENTREASPARCELAS();
        INTERVALOPADRAOENTREASPARCELASDIAOUMES   = Bean.getINTERVALOPADRAOENTREASPARCELASDIAOUMES();
    }
    
    public void receber_e_SetarCHJUROSPORCENTAGEM( boolean CHJUROSPORCENTAGEM2 ) {
        CHJUROSPORCENTAGEM = CHJUROSPORCENTAGEM2;
    }
    
    public void receber_e_SetarCHTAXAFIXA( boolean CHTAXAFIXA2 ) {
        CHTAXAFIXA = CHTAXAFIXA2;
    }
    
    public void receber_e_SetarFINANCEIRO( boolean FINANCEIRO2 ) {
        FINANCEIRO = FINANCEIRO2;
    }
              
    public int pegar_e_GetCBFORMAPGTOSELECIONADO() {
        int retorno;
        retorno = CBFORMAPGTOSELECIONADO;
        return retorno;
    }
    
    public int pegar_e_GetCBPARCELASSELECIONADO() {
        int retorno;
        retorno = CBPARCELASSELECIONADO;
        return retorno;
    }
    
    public int pegar_e_GetQTDParcelas() {
        int retorno;
        retorno = QTDPARCELAS;
        return retorno;
    }
    
    public int pegar_e_GetCBTIPODEENTRADASELECIONADO() {
        int retorno;
        retorno = CBTIPODEENTRADASELECIONADO;
        return retorno;
    }        
            
    public float pegar_e_GetValorDeEntrada() {
        float retorno;
        retorno = VALORDEENTRADA;
        return retorno;
    }
    
    public int pegar_e_GetCBTIPODEDESCONTO() {
        int retorno;
        retorno = CBTIPODEDESCONTOSELECIONADO;
        return retorno;
    }    
    
    public float pegar_e_GetVALORDEDESCONTO() {
        float retorno;
        retorno = VALORDEDESCONTO;
        return retorno;
    }
    
    public Bean_OS_Contas_Disponiveis pegar_e_GetConta() {
        Bean_OS_Contas_Disponiveis Bean_Conta = new Bean_OS_Contas_Disponiveis();
        
        Bean_Conta.setID                  ( IDDACONTA );
        Bean_Conta.setAPELIDOCURTO        ( APELIDOCURTO );
        Bean_Conta.setNOMEDESCRICAODACONTA( NOMEDESCRICAODACONTA );
        
        return Bean_Conta;
    }
    
    public Bean_OS_TipoDeDocumento pegar_e_GetDocumento() {
        Bean_OS_TipoDeDocumento Bean_Documento = new Bean_OS_TipoDeDocumento();
        
        Bean_Documento.setID           ( IDTIPODEDOCUMENTO );                    
        Bean_Documento.setNOME         ( NOMETIPODEDOCUMENTO );
        Bean_Documento.setTIPODECUSTO  ( TIPODECUSTO );
        Bean_Documento.setVALORDECUSTO ( VALORDECUSTO );
        
        return Bean_Documento;
    }
    
    public Bean_OS_Forma_de_Pagamento pegar_e_GetarFormaPgto() {
        Bean_OS_Forma_de_Pagamento Bean_Forma_Pgto = new Bean_OS_Forma_de_Pagamento();
        
        Bean_Forma_Pgto.setID                                    ( IDFORMAPGTO );                    
        Bean_Forma_Pgto.setNOME                                  ( NOMEFORMAPGTO );
        Bean_Forma_Pgto.setPARCELAMENTOMAXIMO                    ( PARCELAMENTOMAXIMO );
        Bean_Forma_Pgto.setPARCELASSEMJUROS                      ( PARCELASSEMJUROS );                    
        Bean_Forma_Pgto.setJUROSPORCENTAGEM                      ( JUROSPORCENTAGEM );
        Bean_Forma_Pgto.setTAXAFIXA                              ( TAXAFIXA );
        Bean_Forma_Pgto.setDESCONTOAVISTAPORCENTAGEM             ( DESCONTOAVISTAPORCENTAGEM );                    
        Bean_Forma_Pgto.setCONTADEDESTINOPADRAOID                ( CONTADEDESTINOPADRAOID );                    
        Bean_Forma_Pgto.setTIPODEDOCUMENTOPADRAOID               ( TIPODEDOCUMENTOPADRAOID );                    
        Bean_Forma_Pgto.setINTERVALOPADRAOENTREASPARCELAS        ( INTERVALOPADRAOENTREASPARCELAS );
        Bean_Forma_Pgto.setINTERVALOPADRAOENTREASPARCELASDIAOUMES( INTERVALOPADRAOENTREASPARCELASDIAOUMES );
        
        return Bean_Forma_Pgto;
    }
    
    public boolean pegar_e_GetCHJUROSPORCENTAGEM() {
        boolean retorno;
        retorno = CHJUROSPORCENTAGEM;
        return retorno;
    }
    
    public boolean pegar_e_GetCHTAXAFIXA() {
        boolean retorno;
        retorno = CHTAXAFIXA;
        return retorno;
    }
    
    public boolean pegar_e_GetFINANCEIRO() {
        boolean retorno;
        retorno = FINANCEIRO;
        return retorno;
    } 
    
    public String nomeCliente = "";
    public int    codigoCliente      ;
    
    public int    CBFORMAPGTOSELECIONADO                   = 0; 
    public int    CBPARCELASSELECIONADO                    = 0; 
    public int    QTDPARCELAS                 = 0;
    
    public int    CBTIPODEENTRADASELECIONADO               = 0;
    public float  VALORDEENTRADA              = 0;
    
    public int    CBTIPODEDESCONTOSELECIONADO = 0;
    public float  VALORDEDESCONTO             = 0;
            
    public int    IDDACONTA                   = 0;                    
    public String APELIDOCURTO                = "";
    public String NOMEDESCRICAODACONTA        = "";   
    
    public int    IDTIPODEDOCUMENTO   = 0 ;                    
    public String NOMETIPODEDOCUMENTO = "";
    public String TIPODECUSTO         = "- não selecionado -";
    public float  VALORDECUSTO        = 0 ;
            
    public int    IDFORMAPGTO                              = 1;                    
    public String NOMEFORMAPGTO                            = "";
    public String PARCELAMENTOMAXIMO                       = "Somente A Vista";
    public String PARCELASSEMJUROS                         = "Somente A Vista";                    
    public float  JUROSPORCENTAGEM                         = 0;
    public float  TAXAFIXA                                 = 0;
    public float  DESCONTOAVISTAPORCENTAGEM                = 0;                    
    public int    CONTADEDESTINOPADRAOID                   = 0;                    
    public int    TIPODEDOCUMENTOPADRAOID                  = 0;                    
    public int    INTERVALOPADRAOENTREASPARCELAS           = 1;
    public String INTERVALOPADRAOENTREASPARCELASDIAOUMES   = "MÊS";
    
    
    public boolean  CHJUROSPORCENTAGEM                     = false;
    public boolean  CHTAXAFIXA                             = false;
    
    public boolean FINANCEIRO                              = false;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formas_de_pagamento_Controle;

import formas_de_pagamento.Formas_de_Pagamento_Home;
import formas_de_pagamento_Estado_dos_Botoes.Formas_de_Pagamento_Botoes_Inicio;
import formas_de_pagamento_Estado_dos_TFs_CBs.Formas_de_Pagamento_TFs_CBs_Inicio;
import home.Home;
import utilidades.JOptionPaneMod;
import utilidades.RetornarNumeroFloat;
import utilidades.RetornarNumeroInteiro;

/**
 *
 * @author CARMAL
 */
public class Controle_Salvar_Formas_de_Pagamento_Thread extends Thread {  

    Home Home;
    Formas_de_Pagamento_Home Formas_de_Pagamento_Home;
    
    public Controle_Salvar_Formas_de_Pagamento_Thread( Home Home2, Formas_de_Pagamento_Home Formas_de_Pagamento_Home2 ) {
        
        Home = Home2;
        Formas_de_Pagamento_Home = Formas_de_Pagamento_Home2;
    }
    
    @Override
    public void run(){  
        synchronized ( this ) {
            
            //Criar_Banco_De_Dados.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
            
            verificar();  
            
            //Criar_Banco_De_Dados.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        }  
    }  
    
    public void verificar(){  
        synchronized(this) {  
            if( !Formas_de_Pagamento_Home.Formas_de_Pagamento.tfNome.getText().equals("") ) { 
            
                a();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Nome da Forma de Pagamento inválido, "
                                + "\nNenhum Nome da Forma de Pagamento informado\n"
                                + "\nPara Cadastrar é preciso informar o Nome da Forma de Pagamento"
                                + "\n", "Nome da Forma de Pagamento?" ); 
                
               Formas_de_Pagamento_Home.Formas_de_Pagamento.tfNome.requestFocus();
            }         
        }  
    } 
  
    public void a(){  
        synchronized(this) {  
            if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.getSelectedItem() != null ) { 
            
                b();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Parcelamento Máximo inválido, "
                                + "\nNenhum Parcelamento Máximo informado\n"
                                + "\nPara Cadastrar é preciso informar o Parcelamento Máximo"
                                + "\n", "Parcelamento Máximo?" ); 
                
               Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.requestFocus();
            }         
        }  
    }  
    
    public void b(){  
        synchronized(this) {  
            if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros.getSelectedItem() != null ) { 
            
                c();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Parcelas Sem Juros inválido, "
                                + "\nNada no campo Parcelas Sem Juros\n"
                                + "\nPara Cadastrar é preciso informar as Parcelas Sem Juros"
                                + "\n", "Parcelas Sem Juros?" ); 
                
               Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros.requestFocus();
            }         
        }  
    }
    
    public void c(){  
 
        synchronized ( this ) {
            
            if( !Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros.getText().equals("") ) { 
            
                float juros = RetornarNumeroFloat.floatTF( 
                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros, Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros.getText().trim(), "Juros( % )", true );
                            
                    if( juros > -1 ){
                
                        d();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Juros( % ) informado "+ Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros.getText().trim() 
                                    + "\n"
                                    + "\nA taxa de Juros( % ) para cadastrar não pode ser menor que  0"    
                                    + "\n"
                                    + "\nPara continuar edite este valor"
                                    + "\n"
                                    , "Juros( % ) " );
                                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Juros( % ) inválido, "
                                + "\nNenhuma taxa de Juros( % ) informada\n"
                                + "\nPara Cadastrar é preciso informar uma taxa de Juros( % )"
                                + "\n\nSe a taxa de Juros( % ) é 0, informe 0"
                                + "\n", "Juros( % )?" ); 
                
                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfJuros.requestFocus();
            }
            
        
        }
    }
    
    public void d(){  
 
        synchronized ( this ) {
            
            if( !Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa.getText().equals("") ) { 
            
                float taxaFixa = RetornarNumeroFloat.floatTF( 
                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa, Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa.getText().trim(), "Taxa Fixa", true );
                            
                    if( taxaFixa > -1 ){
                
                        e();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Taxa Fixa informada "+ Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa.getText().trim() 
                                    + "\n"
                                    + "\nA Taxa fixa para cadastrar não pode ser menor que  0"    
                                    + "\n"
                                    + "\nPara continuar edite este valor"
                                    + "\n"
                                    , "Taxa Fixa " );
                                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Taxa Fixa inválida, "
                                + "\nNenhuma Taxa Fixa informada\n"
                                + "\nPara Cadastrar é preciso informar uma Taxa Fixa"
                                + "\n\nSe a Taxa Fixa é 0, informe 0"
                                + "\n", "Taxa Fixa?" ); 
                
                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfTaxaFixa.requestFocus();
            }
        }
    }
    
    public void e(){  
 
        synchronized ( this ) {
            
            if( !Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista.getText().equals("") ) { 
            
                float taxaFixa = RetornarNumeroFloat.floatTF( 
                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista, Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista.getText().trim(), "Desconto a vista", true );
                            
                    if( taxaFixa > -1 ){
                
                        f();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Desconto a vista informado "+ Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista.getText().trim() 
                                    + "\n"
                                    + "\nO desconto a vista para cadastrar não pode ser menor que  0"    
                                    + "\n"
                                    + "\nPara continuar edite este valor"
                                    + "\n"
                                    , "Desconto a vista " );
                                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Desconto a vista inválido, "
                                + "\nNenhum Desconto a vista informado\n"
                                + "\nPara Cadastrar é preciso informar o Desconto a vista"
                                + "\n\nSe o Desconto a vista é 0, informe 0"
                                + "\n", "Desconto a vista?" ); 
                
                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfDescontoAVista.requestFocus();
            }
        }
    }
    
    public void f(){  
        synchronized(this) {  
            if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao.getSelectedItem() != null ) { 
            
                g();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Conta de destino padrão inválida, "
                                + "\nNenhuma conta de destino padrão informada\n"
                                + "\nPara Cadastrar é preciso informar a conta de destino padrão"
                                + "\n", "conta de destino padrão?" ); 
                
               Formas_de_Pagamento_Home.Formas_de_Pagamento.cbContaDeDestinoPadrao.requestFocus();
            }         
        }  
    }
    
    public void g(){  
        synchronized(this) {  
            if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao.getSelectedItem() != null ) { 
            
                h();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Tipo de documento padrão inválido, "
                                + "\nNenhum tipo de documento padrão informado\n"
                                + "\nPara Cadastrar é preciso informar um tipo de documento padrão"
                                + "\n", "tipo de documento padrão?" ); 
                
               Formas_de_Pagamento_Home.Formas_de_Pagamento.cbTipoDeDocumentoPadrao.requestFocus();
            }         
        }  
    }
    
    public void h(){  
 
        synchronized ( this ) {
            
            if( !Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas.getText().equals("") ) { 
            
                int taxaFixa = RetornarNumeroInteiro.intTF( 
                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas, Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas.getText().trim(), "Intervalo padrão entre as parcelas", true );
                            
                    if( taxaFixa > -1 ){
                
                        i();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Intervalo padrão entre as parcelas "+ Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas.getText().trim() 
                                    + "\n"
                                    + "\nO Intervalo padrão entre as parcelas para cadastrar não pode ser menor que  0"    
                                    + "\n"
                                    + "\nPara continuar edite este valor"
                                    + "\n"
                                    , "Intervalo padrão entre as parcelas " );
                                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Intervalo padrão entre as parcelas inválido, "
                                + "\nNenhum intervalo padrão entre as parcelas informado\n"
                                + "\nPara Cadastrar é preciso informar o intervalo padrão entre as parcelas"
                                + "\n\nSe o intervalo padrão entre as parcelas é 0, informe 0"
                                + "\n", "Intervalo padrão entre as parcelas?" ); 
                
                Formas_de_Pagamento_Home.Formas_de_Pagamento.tfIntervaloPadraoEntreAsParcelas.requestFocus();
            }
        }
    }
    
    public void i(){  
        synchronized(this) {  
            if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbIntervaloPadraoEntreAsParcelas.getSelectedItem() != null ) { 
            
                j();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Intervalo padrão entre as parcelas inválido, "
                                + "\nNenhum intervalo padrão entre as parcelas informado\n"
                                + "\nPara Cadastrar é preciso informar o intervalo padrão entre as parcelas"
                                + "\n\nSe o intervalo padrão entre as parcelas é 0, informe 0"
                                + "\n", "Intervalo padrão entre as parcelas?" ); 
                
               Formas_de_Pagamento_Home.Formas_de_Pagamento.cbIntervaloPadraoEntreAsParcelas.requestFocus();
            }         
        }  
    }
    
    public void j(){  
        synchronized(this) {  
            if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.getSelectedItem() != null && 
                    Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros.getSelectedItem() != null ) { 
            
                String parcMaximo   = Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.getSelectedItem().toString();
                String parcSemJuros = Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros  .getSelectedItem().toString();  
                                                
                if( parcMaximo.trim().equals( parcSemJuros.trim() ) ){
                    
                    cadastrar_Forma_de_Pagamento();
                }
                else{
                    
                    int parcelamentoMaximo = 0;
                    int parcelamentoSemJuros = 0;
                    
                    for( int i = 0; i < Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.getItemCount(); i++ ){
                        
                        if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.getItemAt(i).toString().trim().equals( parcMaximo.trim() ) ){
                            
                            parcelamentoMaximo = i;
                            System.out.println( "Parcelamento Máximo: "+ parcMaximo + " - " + parcelamentoMaximo );
                        }
                    }
                                        
                    for( int i = 0; i < Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros.getItemCount(); i++ ){
                        
                        if( Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelasSemJuros.getItemAt(i).toString().trim().equals( parcSemJuros.trim() ) ){
                            
                            parcelamentoSemJuros = i;
                            System.out.println( "Parcelas Sem Juros: "+ parcSemJuros + " - " + parcelamentoSemJuros );
                        }
                    }
                    
                    if( parcelamentoSemJuros <= parcelamentoMaximo ) {
                        
                        cadastrar_Forma_de_Pagamento();
                    }
                    else{
                
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Quantidade de Parcelas Sem Juros maior que Parcelamento Máximo, "
                                + "\nQuantidade de Parcelas Sem Juros informada está incorreto\n"
                                + "\nPara Cadastrar é preciso informar a quantidade de Parcelas Sem Juros menor ou igual ao Parcelamento Máximo"
                                + "\n", "Parcelas Sem Juros maior que Parcelamento Máximo?" ); 
                
                       Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.requestFocus();
                    }
                    
                }
                                
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Parcelamento Máximo e Parcelas Sem Juros inválido, "
                                + "\nParcelamento Máximo e Parcelas Sem Juros informado incorretamente\n"
                                + "\nPara Cadastrar é preciso informar o Parcelamento Máximo e as Parcelas Sem Juros"
                                + "\n", "Parcelamento Máximo e Parcelas Sem Juros?" ); 
                
               Formas_de_Pagamento_Home.Formas_de_Pagamento.cbParcelamentoMaximo.requestFocus();
            }         
        }  
    }
    
    
  
    
    private void cadastrar_Forma_de_Pagamento() {  
        
        try{
            
            Formas_de_Pagamento_Cadastrar                 Formas_de_Pagamento_Cadastrar                 = new Formas_de_Pagamento_Cadastrar                ( Home, Formas_de_Pagamento_Home );
            
            Formas_de_Pagamento_Botoes_Inicio             Forma_de_Pagamento_Botoes_Inicio              = new Formas_de_Pagamento_Botoes_Inicio            ( Home, Formas_de_Pagamento_Home );
           
            Formas_de_Pagamento_TFs_CBs_Inicio            Formas_de_Pagamento_TFs_CBs_Inicio            = new Formas_de_Pagamento_TFs_CBs_Inicio           ( Home, Formas_de_Pagamento_Home );
            
            Formas_de_Pagamento_Limpar_Campos_Apos_Salvar Formas_de_Pagamento_Limpar_Campos_Apos_Salvar = new Formas_de_Pagamento_Limpar_Campos_Apos_Salvar( Home, Formas_de_Pagamento_Home );
            
        }catch(Exception e) {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Controle_Salvar_Formas_de_Pagamento_Thread, "
                    + "\ncadastrar_Forma_de_Pagamento()"
                    + e.getMessage()
                    + "\n", "cadastrar_Forma_de_Pagamento()" );
        }
                
    }
    /******************Executar Teste*************************************
     * @param args************************
    public static void main(String[] args) {            
          
        ControleThread t1 = new ControleThread(); 
        
        t1.setName("Thread1");   
        
        t1.start();  
    }
    /******************Executar Teste*************************************/
    
}

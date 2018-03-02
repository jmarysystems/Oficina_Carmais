/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contato_metodos;

import contato.Contato;
import home.Home;
import utilidades.JOptionPaneMod;
import utilidades.ValidarCnpj;
import utilidades.ValidarCpf;

/**
 *
 * @author CARMAL
 */
public class Controle_Thread_Contato extends Thread {    
    
    public Controle_Thread_Contato( Home Home2, Contato Contato2 ) {  
        
        Home    = Home2;
        Contato = Contato2;
    }
    
    Home    Home;
    Contato Contato;
    
    public void run(){
        
        synchronized ( this ) {
            
            if( verificarGrupo() == true ){
                
                Cadastrar_Contato Cadastrar_Contato = new Cadastrar_Contato( Home, Contato );
            }
                                
        }
    }
    
    private boolean verificarGrupo(){
        boolean retorno = false; 
        
        synchronized ( this ) {
            
            if( Contato.cbGrupo.getSelectedItem() != null ) {
                
                retorno = pessoaFisicaOuJuridica();
            }
            else{            
                retorno = false; 
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Grupo não pode ser nulo"
                        + "\nPrimeiro cadastre um Grupo"
                        + "\nExemplo:"
                        + "\n    Bom Pagador"
                        + "\n    Suspenso"
                        , "Campo Grupo não pode ser nulo" );
                Contato.cbGrupo.requestFocus();
            }
                                
        }
        
        return retorno; 
    }
    
    private boolean pessoaFisicaOuJuridica(){
        boolean retorno = false; 
        
        synchronized ( this ) {
            
            if( Contato.rbPessoaJuridica.isSelected() || Contato.rbPessoaFisica.isSelected() ){ 
                
                retorno = cpf();
            }
            else{            
                retorno = false; 
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Pessoa Física ou Jurídica não pode ser nulo"
                        + "\nEscolha um dos ítens"
                        + "\nExemplo:"
                        + "\n    Pessoa Física"
                        + "\n    Pessoa Jurídica"
                        , "Pessoa Física ou Jurídica" );
                Contato.rbPessoaFisica.requestFocus();
            }
                                
        }
        
        return retorno; 
    }
    
    private boolean cpf(){
        boolean retorno = false; 
        
        synchronized ( this ) {
                            
                if( Contato.rbPessoaJuridica.isSelected() ){
                
                    if( !Contato.tfCPFOuCNPJ.getText().trim().equals("") && !Contato.tfCPFOuCNPJ.getText().trim().equals(".   .   /    -") ){ 
                        
                        if( ValidarCnpj.CNPJ( Contato.tfCPFOuCNPJ.getText().trim() ) ){
                            retorno = true;
                        }
                        else{
                            retorno = false;
                            
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O CNPJ informado "+ Contato.tfCPFOuCNPJ.getText() +" no CPF ou CNPJ"
                                + "\n"
                                + "\nNão é um CNPJ válido"    
                                + "\n"
                                + "\nPara continuar informe um CNPJ válido"
                                + "\n"
                                , "Validação do CNPJ " );
                            Contato.tfCPFOuCNPJ.requestFocus();
                        
                        }
                    }
                    else{ 
                        retorno = true; 
                    }
                }
                else if( Contato.rbPessoaFisica.isSelected() ){
                    
                    if( !Contato.tfCPFOuCNPJ.getText().trim().equals("") && !Contato.tfCPFOuCNPJ.getText().trim().equals(".   .   -") ){ 
                        System.out.println("***********"+Contato.tfCPFOuCNPJ.getText().trim());
                        if( ValidarCpf.CPF( Contato.tfCPFOuCNPJ.getText().trim() ) ){
                            retorno = true;
                        }
                        else{
                            retorno = false;
                        
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O CPF informado "+ Contato.tfCPFOuCNPJ.getText() +" no CPF ou CNPJ"
                                + "\n"
                                + "\nNão é um CPF válido"    
                                + "\n"
                                + "\nPara continuar informe um CPF válido"
                                + "\n"
                                , "Validação do CPF " );
                            Contato.tfCPFOuCNPJ.requestFocus();
                        
                        }
                    }
                    else{ 
                        retorno = true; 
                    }
                }               
        }
        
        return retorno; 
    }
    
     public boolean numero() {  
        boolean retorno = false;  
        
        synchronized ( this ) {
            
            final int observador = -1;
            try{
                if( !Contato.tfNumero.getText().trim().equals("") ) {
                    String str = Contato.tfNumero.getText();
                    int nmr = Integer.parseInt( str ); 
            
                    if( nmr > observador ) {
                
                        retorno = true;
                    }
                    else {
                        
                        retorno = false;
                
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Número tem que ser um número válido, "
                                + "\ne maior ou igual a 0 ( Zero )"
                                + "\nExemplo:"
                                + "\n    Dez 10, 200, 234, 800"
                                + "\n    Use números inteiros.", "Número" );
                        Contato.tfNumero.requestFocus();
                    }
                }
                else {
                    
                    retorno = true;   // Deixando true por que pode ser cadastrado sem 
                    
                    //JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Número não pode ser nulo", "Valor ?" );
                    //Contato.tfNumero.requestFocus();
                    
                } 
            }catch( Exception e ){
                retorno = true; // Deixando true por que pode ser cadastrado tendo letras no meio
                
                /*JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Número tem que ser um número válido, "
                                + "\ne maior ou igual a 0 ( Zero )"
                                + "\nExemplo:"
                                + "\n    Dez 10, 200, 234, 800"
                                + "\n    Use números inteiros.", "Número" );
                Contato.tfNumero.requestFocus();*/
            }
                                
            } 
        
            return retorno;  
        }         
}

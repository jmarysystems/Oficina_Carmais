/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produto__metodos;

import home.Home;
import produto_.Produto;
import utilidades.JOptionPaneMod;
import utilidades.RetornarNumeroFloat;
import utilidades.RetornarStringDoComboBox;

/**
 *
 * @author CARMAL
 */
public class Controle_Thread_Produto extends Thread {    
    
    public Controle_Thread_Produto( Home Home2, Produto Produto2 ) {  
        
        Home    = Home2;
        Produto = Produto2;
    }
    
    Home    Home;
    Produto Produto;
    
    public void run(){
        
        synchronized ( this ) {
            
            if( unidade() == true ){
                Cadastrar_Produto Cadastrar_Produto = new Cadastrar_Produto( Home, Produto );
            }
                                
        }
    }
    
    private boolean unidade(){
        boolean retorno = false; 
        
        synchronized ( this ) {
            
            if( !RetornarStringDoComboBox.getString( Produto.cbUNIDADETRIBUTARIA, "Unidade tributada", false ).equals("") ) { 
                
                retorno = preco_de_custo();
            }
            else{            
                retorno = false; 
                Produto.cbUNIDADETRIBUTARIA.requestFocus();
            }
                                
        }
        
        return retorno; 
    }
    
    private boolean preco_de_custo(){
        boolean retorno = false; 

        synchronized ( this ) {
            
            if( !Produto.tfPRECODECUSTO.getText().trim().equals("") ) { 
            
                float preco_de_custo = RetornarNumeroFloat.floatTF( 
                Produto.tfPRECODECUSTO, Produto.tfPRECODECUSTO.getText().trim(), "Preço de custo", true );
                            
                    if( preco_de_custo > 0 ){
                
                        retorno = margem_de_lucro();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Preço de custo informado "+ Produto.tfPRECODECUSTO.getText() 
                                    + "\n"
                                    + "\nO Preço de custo não pode ser menor que 1"    
                                    + "\n"
                                    + "\nPara continuar informe um Preço de custo válido"
                                    + "\n"
                                    , "Preço de custo " );
                                Produto.tfPRECODECUSTO.requestFocus(); 
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Preço de custo ?" 
                                    + "\n"
                                    + "\nO Preço de custo não pode ser nulo"    
                                    + "\n"
                                    + "\nPara continuar informe o preço de custo do produto"
                                    + "\n"
                                    , "Preço de custo " );
                                Produto.tfPRECODECUSTO.requestFocus();
            }
        }
        
        return retorno; 
    }
    
    private boolean margem_de_lucro(){
        boolean retorno = false; 
        
        synchronized ( this ) {
            
            if( !Produto.tfMARGEMDELUCRO.getText().trim().equals("") ) { 
            
                float margem = RetornarNumeroFloat.floatTF( 
                    Produto.tfMARGEMDELUCRO, Produto.tfMARGEMDELUCRO.getText().trim(), "Margem de lucro", true );
                            
                    if( margem > 0 ){
                
                        retorno = preco_de_venda();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Margem de lucro informada "+ Produto.tfMARGEMDELUCRO.getText() 
                                    + "\n"
                                    + "\nA Margem de lucro não pode ser menor que 1"    
                                    + "\npode ser omitida" 
                                    + "\n"
                                    + "\nPara continuar informe uma Margem de lucro válida"
                                    + "\n"
                                    , "Margem de lucro " );
                                Produto.tfMARGEMDELUCRO.requestFocus(); 
                    }
            }
            else{
                
                retorno = preco_de_venda();
            }
        }
        
        return retorno; 
    }
    
    private boolean preco_de_venda(){
        boolean retorno = false; 
        
        synchronized ( this ) {
            
            if( !Produto.tfPRECODEVENDA.getText().trim().equals("") ) { 
            
                float preco_venda = RetornarNumeroFloat.floatTF( 
                    Produto.tfPRECODEVENDA, Produto.tfPRECODEVENDA.getText().trim(), "Preço de venda", true );
                            
                    if( preco_venda > 0 ){
                
                        retorno = precos_venda_custo();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Preço de Venda informado "+ Produto.tfPRECODEVENDA.getText() 
                                    + "\n"
                                    + "\nO Preço de Venda não pode ser menor que 1"    
                                    + "\n"
                                    + "\nPara continuar informe um Preço de Venda válida"
                                    + "\n"
                                    , "Preço de Venda " );
                                Produto.tfPRECODECUSTO.requestFocus(); 
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Preço de Venda ?" 
                                    + "\n"
                                    + "\nO Preço de Venda não pode ser nulo"    
                                    + "\n"
                                    + "\nPara continuar informe o Preço de Venda do produto"
                                    + "\n"
                                    , "Preço de Venda " );
                                Produto.tfPRECODEVENDA.requestFocus();
            }
        }
        
        return retorno; 
    }
    
    private boolean precos_venda_custo(){
        boolean retorno = false; 
        
        synchronized ( this ) {
            
            if(  !Produto.tfPRECODEVENDA.getText().trim().equals("") & !Produto.tfPRECODECUSTO.getText().trim().equals("")  ) { 
            
                float preco_venda = RetornarNumeroFloat.floatTF( 
                    Produto.tfPRECODEVENDA, Produto.tfPRECODEVENDA.getText().trim(), "Preço de venda", true );
                
                float preco_de_custo = RetornarNumeroFloat.floatTF( 
                Produto.tfPRECODECUSTO, Produto.tfPRECODECUSTO.getText().trim(), "Preço de custo", true );
                            
                if( preco_venda >= preco_de_custo ){
                    retorno = true;
                }
                else {
                    
                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Preço de Venda informado "+ Produto.tfPRECODEVENDA.getText() 
                                + "\n"
                                + "\nÉ menor que o preço de custo: "+ Produto.tfPRECODECUSTO.getText()  
                                + "\n"
                                + "\nO preço de venda não pode ser menor que o preço de custo"  
                                + "\n"
                                + "\nPara continuar informe um Preço de Venda válido"
                                + "\n"
                                , "Preço de Venda " );
                            Produto.tfPRECODEVENDA.requestFocus(); 
                }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Preço de Venda ?" 
                                    + "\n"
                                    + "\nO Preço de Venda não pode ser nulo"    
                                    + "\n"
                                    + "\nPara continuar informe o Preço de Venda do produto"
                                    + "\n"
                                    , "Preço de Venda " );
                                Produto.tfPRECODEVENDA.requestFocus();
            }
        }
        
        return retorno; 
    }
    
     
}

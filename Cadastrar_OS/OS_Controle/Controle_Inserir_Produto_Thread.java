/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Controle;

import OS.OS;
import OS_Adicionar_Produto_Servico.AdicionarProdutoAoArray;
import OS_Designer.OS_Corpo;
import OS_Produtos.BookInfoProdutos;
import home.Home;
import utilidades.JOptionPaneMod;
import utilidades.RetornarNumeroFloat;

/**
 *
 * @author CARMAL
 */
public class Controle_Inserir_Produto_Thread extends Thread {  

    public Controle_Inserir_Produto_Thread( Home Home2, OS OS2, OS_Corpo OS_Corpo2 ){  
  
        Home = Home2;
        OS = OS2;
        OS_Corpo = OS_Corpo2;
    } 
    
    OS OS;
    Home Home;
    OS_Corpo OS_Corpo;
    
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
            if ( OS_Corpo.Controle_De_Inserir.cbInserirProduto.getSelectedItem() == null ) {
                                             
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Selecione um Produto ou Serviço, "
                                + "\nNenhum produto ou serviço selecionado\n"
                                + "\nPara inserir é preciso selecionar um ítem primeiro"
                                + "\n", "Selecione um Produto ou Serviço?" ); 
                
                OS_Corpo.Controle_De_Inserir.cbInserirProduto.requestFocus();
                
            } else{ 
            
                a();  
                
            }          
        }  
    } 
  
    public void a(){  
 
        synchronized ( this ) {
            
            if( !OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto.getText().equals("") ) { 
            
                float quantidade = RetornarNumeroFloat.floatTF( 
                OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto, OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto.getText().trim(), "Quantidade", true );
                            
                    if( quantidade > 0 ){
                        
                        b();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Quantidade informada "+ OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto.getText().trim() 
                                    + "\n"
                                    + "\nA Quantidade não pode ser menor ou igual a 0"    
                                    + "\n"
                                    + "\nPara continuar informe uma quantidade válida"
                                    + "\n"
                                    , "Quantidade " );
                                OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Quantidade inválida, "
                                + "\nNenhuma quantidade informada\n"
                                + "\nPara inserir é preciso informar uma quantidade"
                                + "\n", "informe uma quantidade?" ); 
                
                OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto.requestFocus();
            }
        }
    }  
    
    public void b(){  
 
        synchronized ( this ) {
            
            if( !OS_Corpo.Controle_De_Inserir.ftfPrecoUnitarioProduto.getText().equals("") ) { 
            
                float precoUnitario = RetornarNumeroFloat.floatTF( 
                OS_Corpo.Controle_De_Inserir.ftfPrecoUnitarioProduto, OS_Corpo.Controle_De_Inserir.ftfPrecoUnitarioProduto.getText().trim(), "Preco Unitario", true );
                            
                    if( precoUnitario > 0 ){
                
                        /********Verificar outros controle depois como nome do cliente e veículo*******/
                        InserirItem();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Preco Unitario informado "+ OS_Corpo.Controle_De_Inserir.ftfPrecoUnitarioProduto.getText().trim() 
                                    + "\n"
                                    + "\nO Preco Unitario para cadastrar não pode ser menor ou igual a  0"    
                                    + "\n"
                                    + "\nPara continuar edite este valor"
                                    + "\n"
                                    , "Preco Unitario para cadastrar " );
                                OS_Corpo.Controle_De_Inserir.ftfPrecoUnitarioProduto.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Preco Unitario inválido, "
                                + "\nNenhum preco unitario informado\n"
                                + "\nPara inserir é preciso informar um preco unitario"
                                + "\n", "Editar valor?" ); 
                
                OS_Corpo.Controle_De_Inserir.ftfPrecoUnitarioProduto.requestFocus();
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    private void InserirItem() {  
        
        try{
            BookInfoProdutos objP = (BookInfoProdutos) OS_Corpo.Controle_De_Inserir.cbInserirProduto.getSelectedItem();
                
            float quantidadeP = RetornarNumeroFloat.floatTF( 
            OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto, OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto.getText().trim(), "Quantidade", true );
                
            AdicionarProdutoAoArray AdicionarProdutoAoArray = new AdicionarProdutoAoArray(
                    Home, OS, objP.ID, objP.NOME, objP.UNIDADETRIBUTARIA, objP.PRECODEVENDA, quantidadeP, OS_Corpo.Controle_De_Inserir.tfObservacoesAdicionaisProduto.getText()
            );
                
            OS_Corpo.Controle_De_Inserir.tfObservacoesAdicionaisProduto.setText("");
            OS_Corpo.Controle_De_Inserir.ftfQuantidadeProduto          .setText("");
                
            OS_Corpo.tabOSCorpo.setSelectedIndex( 1 );
            
            
        }catch(Exception e) {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Controle_De_Inserir, "
                    + "\ncbAdicionarActionPerformed(java.awt.event.ActionEvent evt)"
                    + e.getMessage()
                    + "\n", "cbAdicionarActionPerformed(java.awt.event.ActionEvent evt)" );
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Controle;

import OS.OS;
import OS_Adicionar_Produto_Servico.AdicionarServicoAoArray;
import OS_Designer.OS_Corpo;
import OS_Servicos.BookInfoServicos;
import home.Home;
import utilidades.JOptionPaneMod;
import utilidades.RetornarNumeroFloat;

/**
 *
 * @author CARMAL
 */
public class Controle_Inserir_Servico_Thread extends Thread {  

    public Controle_Inserir_Servico_Thread( Home Home2, OS OS2, OS_Corpo OS_Corpo2 ){  
  
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
            if ( OS_Corpo.Controle_De_Inserir.cbAdicionar.getSelectedItem() == null ) {
                                             
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Selecione um Produto ou Serviço, "
                                + "\nNenhum produto ou serviço selecionado\n"
                                + "\nPara inserir é preciso selecionar um ítem primeiro"
                                + "\n", "Selecione um Produto ou Serviço?" ); 
                
                OS_Corpo.Controle_De_Inserir.cbAdicionar.requestFocus();
                
            } else{ 
            
                a();  
                
            }          
        }  
    } 
  
    public void a(){  
 
        synchronized ( this ) {
            
            if( !OS_Corpo.Controle_De_Inserir.ftfQuantidade.getText().equals("") ) { 
            
                float quantidade = RetornarNumeroFloat.floatTF( 
                OS_Corpo.Controle_De_Inserir.ftfQuantidade, OS_Corpo.Controle_De_Inserir.ftfQuantidade.getText().trim(), "Quantidade", true );
                            
                    if( quantidade > 0 ){
                        
                        b();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Quantidade informada "+ OS_Corpo.Controle_De_Inserir.ftfQuantidade.getText().trim() 
                                    + "\n"
                                    + "\nA Quantidade não pode ser menor ou igual a 0"    
                                    + "\n"
                                    + "\nPara continuar informe uma quantidade válida"
                                    + "\n"
                                    , "Quantidade " );
                                OS_Corpo.Controle_De_Inserir.ftfQuantidade.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Quantidade inválida, "
                                + "\nNenhuma quantidade informada\n"
                                + "\nPara inserir é preciso informar uma quantidade"
                                + "\n", "informe uma quantidade?" ); 
                
                OS_Corpo.Controle_De_Inserir.ftfQuantidade.requestFocus();
            }
        }
    }  
    
    public void b(){  
 
        synchronized ( this ) {
            
            if( !OS_Corpo.Controle_De_Inserir.ftfPrecoUnitario.getText().equals("") ) { 
            
                float precoUnitario = RetornarNumeroFloat.floatTF( 
                OS_Corpo.Controle_De_Inserir.ftfPrecoUnitario, OS_Corpo.Controle_De_Inserir.ftfPrecoUnitario.getText().trim(), "Preco Unitario", true );
                            
                    if( precoUnitario > 0 ){
                
                        /********Verificar outros controle depois como nome do cliente e veículo*******/
                        InserirItem();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Preco Unitario informado "+ OS_Corpo.Controle_De_Inserir.ftfPrecoUnitario.getText().trim() 
                                    + "\n"
                                    + "\nO Preco Unitario para cadastrar não pode ser menor ou igual a  0"    
                                    + "\n"
                                    + "\nPara continuar edite este valor"
                                    + "\n"
                                    , "Preco Unitario para cadastrar " );
                                OS_Corpo.Controle_De_Inserir.ftfPrecoUnitario.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Preco Unitario inválido, "
                                + "\nNenhum preco unitario informado\n"
                                + "\nPara inserir é preciso informar um preco unitario"
                                + "\n", "Editar valor?" ); 
                
                OS_Corpo.Controle_De_Inserir.ftfPrecoUnitario.requestFocus();
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    private void InserirItem() {  
        
        try{
            BookInfoServicos obj = (BookInfoServicos) OS_Corpo.Controle_De_Inserir.cbAdicionar.getSelectedItem();
                
            float quantidade = RetornarNumeroFloat.floatTF( 
            OS_Corpo.Controle_De_Inserir.ftfQuantidade, OS_Corpo.Controle_De_Inserir.ftfQuantidade.getText().trim(), "Quantidade", true );
                
            AdicionarServicoAoArray AdicionarServicoAoArray = new AdicionarServicoAoArray(
                    Home, OS, obj.ID, obj.NOME, "Unid", obj.PRECO, quantidade, OS_Corpo.Controle_De_Inserir.tfObservacoesAdicionais.getText()
            );
             
            OS_Corpo.Controle_De_Inserir.tfObservacoesAdicionais.setText("");
            OS_Corpo.Controle_De_Inserir.ftfQuantidade          .setText("");
            
            OS_Corpo.tabOSCorpo.setSelectedIndex( 0 );
            
            
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

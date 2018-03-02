/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas_disponiveis_Controle;

import contas_disponiveis_Estado_dos_TFs_CBs.Contas_Disponiveis_TFs_CBs_Inicio;
import contas_disponiveis.Contas_Disponiveis_Home;
import contas_disponiveis_Estado_dos_Botoes.Contas_Disponiveis_Botoes_Inicio;
import home.Home;
import utilidades.JOptionPaneMod;

/**
 *
 * @author CARMAL
 */
public class Controle_Salvar_Contas_Disponiveis_Thread extends Thread {  

    Home Home;
    Contas_Disponiveis_Home Contas_Disponiveis_Home;
    
    public Controle_Salvar_Contas_Disponiveis_Thread( Home Home2, Contas_Disponiveis_Home Contas_Disponiveis_Home2 ) {
        
        Home = Home2;
        Contas_Disponiveis_Home = Contas_Disponiveis_Home2;
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
            if( !Contas_Disponiveis_Home.Contas_Disponiveis.tfApelidoCurto.getText().equals("") ) { 
            
                a();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Apelido Curto inválido, "
                                + "\nNenhum Apelido Curto para a conta informado\n"
                                + "\nPara Cadastrar é preciso informar o Nome do Apelido Curto da conta"
                                + "\n", "Apelido Curto da conta?" ); 
                
               Contas_Disponiveis_Home.Contas_Disponiveis.tfApelidoCurto.requestFocus();
            }         
        }  
    } 
  
    public void a(){  
 
        synchronized ( this ) {
           
           if( !Contas_Disponiveis_Home.Contas_Disponiveis.tfNomeDescricao.getText().equals("") ) { 
            
                cadastrar_Conta();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Nome / Descrição da conta inválido, "
                                + "\nNenhum Nome / Descrição da conta informado\n"
                                + "\nPara Cadastrar é preciso informar o Nome / Descrição da conta"
                                + "\n", "Nome / Descrição da conta?" ); 
                
               Contas_Disponiveis_Home.Contas_Disponiveis.tfNomeDescricao.requestFocus();
            }         
        }
    }  
  
    
    private void cadastrar_Conta() {  
        
        try{
            
            Contas_Disponiveis_Cadastrar Contas_Disponiveis_Cadastrar           = new Contas_Disponiveis_Cadastrar                  ( Home,Contas_Disponiveis_Home );
            
            Contas_Disponiveis_Botoes_Inicio Contas_Disponiveis_Botoes_Inicio   = new Contas_Disponiveis_Botoes_Inicio              ( Home,Contas_Disponiveis_Home );
           
            Contas_Disponiveis_TFs_CBs_Inicio Contas_Disponiveis_TFs_CBs_Inicio = new Contas_Disponiveis_TFs_CBs_Inicio             ( Home,Contas_Disponiveis_Home );           
            
            Contas_Disponiveis_Limpar_Campos_Apos_Salvar Limpar_Apos_Salvar     = new Contas_Disponiveis_Limpar_Campos_Apos_Salvar  ( Home,Contas_Disponiveis_Home );
                    
        }catch(Exception e) {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Controle_Salvar_Contas_Disponiveis_Threadd, "
                    + "\ncadastrar_Conta()"
                    + e.getMessage()
                    + "\n", "cadastrar_Conta()" );
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

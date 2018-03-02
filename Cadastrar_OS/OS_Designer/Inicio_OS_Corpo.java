/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Designer;

import OS.OS;
import home.Home;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Inicio_OS_Corpo {
    
    OS OS;
    Home Home;
    
    public Inicio_OS_Corpo( Home Home2, OS OS2 ) {
        
        OS = OS2;
        Home = Home2;     
    }
            
    boolean um1 = false;
    public void setar_servico_OS_Corpo_Add_TabItens(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um1 == false ) {     um1 = true;
                    try { Thread.sleep(1); 
                    
                                                
          /*******************************************************************************************/
                    
                        adicionar_No_OS_Corpo_tabOSCorpo();
                        
                        adicionar_No_tabOSCorpo_Aba_Servicos();
                        
                        adicionar_No_tabOSCorpo_Aba_Produtos();
            
                        setar_Definicoes_tabOSCorpo();
                        
                        setar_FormaPgto_Avista_Total();
           
                    }catch(Exception e) {
                            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Inicio_OS_Corpo2, "
                                 + "\nsetar_servico_OS_Corpo_Add_TabItens()"
                                 + e.getMessage()
                                 + "\n", "setar_servico_OS_Corpo_Add_TabItens()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um1 = false;
    }
    
    private void adicionar_No_OS_Corpo_tabOSCorpo(){
        
        OS.OS_Corpo.jp_Produtos_Servicos.setLayout( new BorderLayout() );
            
        OS.OS_Corpo.jp_Produtos_Servicos.add( OS.OS_Corpo.OS_Corpo_Adicionar_Produto_Norte, BorderLayout.NORTH );
        
        OS.OS_Corpo.jp_Produtos_Servicos.add( OS.OS_Corpo.tabOSCorpo, BorderLayout.CENTER );
        OS.OS_Corpo.jp_Produtos_Servicos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                        
    }
    
    private void adicionar_No_tabOSCorpo_Aba_Servicos(){
        
        JScrollPane jp = new JScrollPane( OS.OS_Corpo.OS_Corpo_Adicionar_Servico );
                    jp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Home.ControleTabs.AddTabSemControleNovo( OS.OS_Corpo.tabOSCorpo, "Lista de Serviços", "/imagens/carrinho.png", jp );
                        
    }
    
    private void adicionar_No_tabOSCorpo_Aba_Produtos(){
        
        JScrollPane jp = new JScrollPane( OS.OS_Corpo.OS_Corpo_Adicionar_Produto );
                    jp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));                                
        Home.ControleTabs.AddTabSemControleNovo( OS.OS_Corpo.tabOSCorpo, "Lista de Produtos", "/imagens/carrinho.png", jp );
                        
    }
    
    private void setar_Definicoes_tabOSCorpo(){
        
        OS.OS_Corpo.tabOSCorpo.setSelectedIndex( 0 );
        OS.OS_Corpo.tabOSCorpo.setEnabledAt( 0, false );  
        OS.OS_Corpo.tabOSCorpo.setEnabledAt( 1, false );                        
                        
        OS.OS_Corpo.tabOSCorpo.setBackground(new java.awt.Color(253, 253, 253));
        OS.OS_Corpo.tabOSCorpo.setForeground(new java.awt.Color(255, 153, 0));
        OS.OS_Corpo.tabOSCorpo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)); 
                        
    }
    
    private void setar_FormaPgto_Avista_Total(){

        OS.OS_Corpo.lbTotalEsquerdo.setText( "0.00" );
        OS.OS_Corpo.lbValorAvista.setText( "0.00" );                       
                        
    }
    
   
}

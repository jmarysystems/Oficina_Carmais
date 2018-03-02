/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS;

import home.Home;
import java.awt.BorderLayout;
import java.awt.Color;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Inicio_OS {
    
    public Inicio_OS( Home Home2, OS OS2 ) {
        
        OS = OS2;
        Home = Home2;     
    }
    
    OS OS;
    Home Home;
    
    private void adicionar_Controle_OS_Corpo_Inserir_Produto_Servico(){
        
        OS.OS_Corpo.jp_Produtos_Servicos_Inserir.setLayout( new BorderLayout() );
            
        OS.OS_Corpo.jp_Produtos_Servicos_Inserir.add( OS.OS_Corpo.Controle_De_Inserir, BorderLayout.CENTER );
         
    }
    
    boolean um = false;
    public void inicioCBS(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um == false ) {     um = true;
                    try { Thread.sleep(1); 
                    
                        OS.OS_Corpo.cbTecnico.setBackground( new Color( 255, 255, 255 ) );
                        OS.OS_Corpo.cbSituacao.setBackground( new Color( 255, 255, 255 ) );
                        
                        OS.OS_Corpo.Controle_De_Inserir.cbAdicionar.setBackground( new Color( 255, 255, 255 ) );                     
                        OS.OS_Corpo.Controle_De_Inserir.cbInserirProduto.setBackground( new Color( 255, 255, 255 ) );
                    
                        adicionar_Controle_OS_Corpo_Inserir_Produto_Servico();
                        
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Inicio_OS, "
                            + "\ninicioCBS()"
                            + e.getMessage().toString()
                            + "\n", "inicioCBS()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um = false;
    }
    
    boolean um2 = false;
    public void inicioTabDadosDaOS(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um2 == false ) {     um2 = true;
                    try { Thread.sleep(1); 
                    
                        Home.ControleTabs.AddTabSemControleNovo( OS.tabOS, "Dados da OS", "/imagens/novo.gif", OS.OS_Corpo);
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Inicio_OS, "
                            + "\ninicioTabDadosDaOS()"
                            + e.getMessage().toString()
                            + "\n", "inicioTabDadosDaOS()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um2 = false;
    }
    
    boolean um3 = false;
    public void inicioSetarNoTabOSBotoes_Corpo(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um3 == false ) {     um3 = true;
                    try { Thread.sleep(1); 
                    
                        OS.pnOS.setLayout( new BorderLayout() );        
                        OS.pnOS.add( OS.OS_Botoes, BorderLayout.NORTH );
                        OS.pnOS.add( OS.tabOS, BorderLayout.CENTER );
                                                
                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Inicio_OS, "
                            + "\ninicioSetarNoTabOSBotoes_Corpo()"
                            + e.getMessage().toString()
                            + "\n", "inicioSetarNoTabOSBotoes_Corpo()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um3 = false;
    }
    

        
}

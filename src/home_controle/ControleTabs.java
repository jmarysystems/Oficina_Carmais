/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home_controle;

import OS_Controle.ButtonTabComponentSemControle;
import home.Home;
import home_tabImagens.TabImagens;
import java.awt.Component;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author Ana
 */
public class ControleTabs {
    
    public ControleTabs( Home HomeR ) {
        Home = HomeR;
    }
    
    Home Home;

    public int qtdComponentes = 0;
    
    public void AddTabHome( String nomeTab, String imgURLIcon, Component comp ) {
        try{             
            
            URL imgURL = TabImagens.class.getResource( imgURLIcon );
            ImageIcon icon = new ImageIcon(imgURL);
            
            JScrollPane sc = new JScrollPane();
            sc.setBorder( null );
            sc.setViewportView( comp );

            Home.tabHome.addTab( "  "+nomeTab, icon, sc, "Home" );              
            Home.tabHome.setTabComponentAt( qtdComponentes, new ButtonTabComponentHome( Home.tabHome, nomeTab, icon ) ); 
            Home.tabHome.setSelectedIndex( qtdComponentes );
            
        }catch( Exception e ){ JOptionPane.showMessageDialog(null,"ControleTabs - Método: AddTabHome \n"+e); }
    }
    
    public void AddTabsAoHome( String nomeTab, String imgURLIcon, Component comp ) {
        try{ 
            URL imgURL = TabImagens.class.getResource( imgURLIcon );
            ImageIcon icon = new ImageIcon(imgURL);
            
            JScrollPane sc = new JScrollPane();
            sc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            sc.setViewportView( comp );
                    
            Home.tabHome.addTab( "  "+nomeTab, icon, sc, nomeTab ); 
                    
            qtdComponentes+=1;
            Home.tabHome.setTabComponentAt( qtdComponentes, new ButtonTabComponent( Home.tabHome, nomeTab, icon, Home ) );                                        
            Home.tabHome.setSelectedIndex( qtdComponentes );
                    
            //removerTabHome();
        }catch( Exception e ){ JOptionPane.showMessageDialog(null,"ControleTabs - AddTabsAoHome\ns"+e); }
    }
    
    public void removerTabSelecionado() {
        
        Home.tabHome.remove( Home.tabHome.getSelectedComponent() );
        qtdComponentes-=1;
    }
    
    
    
    
    // Setando ImageIcon Diferente pelo endereço não pela classe
    public void AddTabSemControleNovo( JTabbedPane pane, String nomeTab, String imgURLIcon, Component comp ) {
        try{             
            
            ImageIcon icon = new ImageIcon(getClass().getResource( imgURLIcon ) );  
            
            JScrollPane sc = new JScrollPane();
            sc.setBorder( null );
            sc.setViewportView( comp );
            
            int qtdComponentesControl = pane.getTabCount();

            pane.addTab( "  "+nomeTab, icon, sc, nomeTab );              
            pane.setTabComponentAt( qtdComponentesControl, new ButtonTabComponentSemControle( pane, nomeTab, icon ) ); 
            pane.setSelectedIndex ( qtdComponentesControl );
            
        }catch( Exception e ){ JOptionPane.showMessageDialog(null,"ControleTabs - Método: AddTabSemControle \n"+e); }
    }
    
    public void removerTabSemControleSelecionado(JTabbedPane pane) {
        
        pane.remove( pane.getSelectedComponent() );
    }
    
}

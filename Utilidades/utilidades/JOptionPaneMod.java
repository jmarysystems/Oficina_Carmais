/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author ana
 */
public class JOptionPaneMod {
    
    public JOptionPaneMod( int j, String mensagem ) {
        padrao( mensagem );  
    }
    
    public JOptionPaneMod( int j, String mensagem2, String mensagemsemicone21, Icon icon ) {
        iconcustomizado( mensagem2, mensagemsemicone21, icon );
    }
    
    public JOptionPaneMod( int j, String mensagem2, String mensagem21 ) {
        switch( j ){
            case 1: aviso   ( mensagem2, mensagem21 ); break;  
            case 2: erroicon( mensagem2, mensagem21 ); break; 
            case 3: semicon ( mensagem2, mensagem21 ); break;     
        }
    }
        
    private void padrao( String mensagem ){
        //default title and icon
        JOptionPane.showMessageDialog( null, mensagem );	
    }
    
    private void aviso( String mensagem, String aviso ){
        //custom title, warning icon
        JOptionPane.showMessageDialog( null, mensagem,
                aviso,
                JOptionPane.WARNING_MESSAGE);	
    }
       
    private void erroicon( String mensagem, String erro ){
        //custom title, error icon
        JOptionPane.showMessageDialog( null,
                mensagem,
                erro,
                JOptionPane.ERROR_MESSAGE);	
    }
    
    private void semicon( String mensagem, String mensagemsemicone ){
        //custom title, no icon
        JOptionPane.showMessageDialog( null,
                mensagem,
                mensagemsemicone,
                JOptionPane.PLAIN_MESSAGE);
    }
    
    private void iconcustomizado( String mensagem, String mensagemsemicone, Icon icon ){
        //custom title, custom icon
        JOptionPane.showMessageDialog( null,
                mensagem,
                mensagemsemicone,
                JOptionPane.INFORMATION_MESSAGE,
                icon);
    }
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import brasil.A_Brasil_Estados;
import contato.Contato;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

/**
 *
 * @author AnaMariana
 */
public class Eventos_Clientes_CB_Estados {
    
    public Eventos_Clientes_CB_Estados( Contato ClienteR ) {
        
        Cliente = ClienteR;
    }
    
    private Contato Cliente;
    
    public void cbEstados( final JComboBox cb ){
        
        cb.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ie){
                String str = (String)cb.getSelectedItem();
                
                verificarPais(str);
            }
        });
        
    }
    
    private void verificarPais( String estado ){
        String str = (String)Cliente.cbPais.getSelectedItem();
        
        A_Brasil_Estados Brasil_Estados = new A_Brasil_Estados();
        
        switch( str ){
            case "BRASIL":  Brasil_Estados.setarCidadeComBaseNoEstadoDoBrasil( estado, Cliente ); break;
        }
    }
    
}

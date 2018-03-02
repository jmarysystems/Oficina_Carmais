/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente;

import java.awt.Color;

/**
 *
 * @author ana
 */
public class Inicio_Contato {
    
    public Inicio_Contato( Contato_OS Contato2, String tipoContato ) {
        
        Contato = Contato2;
        
        inicioCBSBancos();  
        setarTipoContato( tipoContato );
    }
    
    Contato_OS Contato;
    
    private void inicioCBSBancos(){
        
        Contato.cbGrupo.setBackground( new Color( 255, 255, 255 ) );
        Contato.cbEstado.setBackground( new Color( 255, 255, 255 ) );
        Contato.cbCidade.setBackground( new Color( 255, 255, 255 ) );
        Contato.cbPais.setBackground( new Color( 255, 255, 255 ) );
        
    }
    
    private void setarTipoContato( String tipoContato ){
        switch( tipoContato ){
            case "Transportador":  Contato.cbTipoTransportador.setSelected(true); break;
                case "Fornecedor":  Contato.cbTipoFornecedor.setSelected(true); break;
                    case "Cliente":  Contato.cbTipoCliente.setSelected(true); break;
        }        
    }
    
}

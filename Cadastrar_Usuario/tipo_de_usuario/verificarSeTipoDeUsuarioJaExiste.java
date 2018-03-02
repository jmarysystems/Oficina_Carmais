/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipo_de_usuario;

import tipo_de_usuario_control.Control_Listar_TipoDeUsuario;
import home.Home;
import java.util.List;
import tipo_de_usuario_control.Bean_Tipo_de_Usuario;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class verificarSeTipoDeUsuarioJaExiste {
    
    public static boolean verificar( Home Home, Tipo_de_Usuario Tipo_de_Usuario ){  
        boolean retorno = false;
        
        Control_Listar_TipoDeUsuario Control = new Control_Listar_TipoDeUsuario( Home.ip );
        List<Bean_Tipo_de_Usuario> Bean_Listar_TipoDeUsuario = Control.listar( "%"+""+"%" );
        
        for (int i = 0; i < Bean_Listar_TipoDeUsuario.size(); i++){       
            
            if( Bean_Listar_TipoDeUsuario.get(i).getTIPODEUSUARIO().equals( Tipo_de_Usuario.tfTipo_de_Usuario.getText().trim() ) ) {
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O nome do tipo de usuário: " 
                        + Tipo_de_Usuario.tfTipo_de_Usuario.getText() 
                        + " já existe \n", "Por favor escolha outro nome" );
                
                Tipo_de_Usuario.tfTipo_de_Usuario.requestFocus();
                
                retorno = true;
                break;
            }
        }
        
        return retorno;        
    }
    
}

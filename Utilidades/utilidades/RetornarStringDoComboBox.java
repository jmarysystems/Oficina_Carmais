/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import javax.swing.JComboBox;

/**
 *
 * @author ana
 */
public class RetornarStringDoComboBox {

    /** Realiza a validação do CPF. 
     * 
     * @param cb
     * @param nomecampo
     * @param aceitar_nulo 
     * @return  
     */

    public static String getString( JComboBox cb, String nomecampo, boolean aceitar_nulo ) {

        return str( cb, nomecampo, aceitar_nulo ); 
    }
    
    private static String  str( JComboBox cb, String campo, boolean aceitar_nulo ) {
        
        String retorno = "";  
            
        try{
            if( !cb.getSelectedItem().toString().trim().equals("") ) {
                
                retorno = cb.getSelectedItem().toString().trim();  
                           
            }
            else if( aceitar_nulo == true ) {
                    
                retorno = "";   // Deixando true por que pode ser cadastrado sem 

            }
            else if( aceitar_nulo == false ) {
                    
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo: "+campo +" não pode ser nulo", ""+campo +" ?" );
            }
        }catch( Exception e ){                
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "A informação presente no Campo: "+campo +" é inválida, "
                            + "\n para continuar escolha uma opção no campo "
                            + "\n    "+campo, campo );
        }
        
        return retorno;  
        
    }
// Use este trecho para testar a classe 
//    }
    public static void main(String[] args) {
        /*if( intn( "0", "Quantidade", false ) == 0 ){
            
            System.out.println( "0" );
        }
        else{
            System.out.println( "false" );
        }*/
    }
}

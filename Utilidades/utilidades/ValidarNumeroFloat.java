/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import javax.swing.JTextField;

/**
 *
 * @author ana
 */
public class ValidarNumeroFloat {

    /** Realiza a validação do CPF. 
     * 
     * @param tf
     * @param n
     * @param nomecampo
     * @param aceitar_nulo 
     * @return  
     */

    public static boolean floatTF( JTextField tf, String n, String nomecampo, boolean aceitar_nulo ) {

        boolean retorno = false; 
        
        if ( floatn( tf.getText().trim(), nomecampo, aceitar_nulo ) ) {
            retorno = true;
        }
        else{
            tf.requestFocus();
        }
        return retorno;  
    }
    
    private static boolean  floatn( String n, String campo, boolean aceitar_nulo ) {
        
        boolean retorno = false;  
            
        final int observador = -1;
        try{
            if( !n.trim().equals("") ) {
                float nmr = Float.parseFloat( n.trim() ); 
            
                if( nmr > observador ) {
                
                    retorno = true;
                }
                else {

                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Número informado no campo: "+campo +" não é um número válido, "
                            + "\ninforme um número maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez 10 - 200 - 234 - 800 - 0.02"
                            + "\n\n    Para frações decimais utilize o ponto\n"
                            + "\n    Use números válidos.", "Número Incorreto" );
                }
            }
            else if( aceitar_nulo == true ) {
                    
                retorno = true;   // Deixando true por que pode ser cadastrado sem 

            }
            else if( aceitar_nulo == false ) {
                    
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo: "+campo +" não pode ser nulo", ""+campo +" ?" );
            }
        }catch( Exception e ){                
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Número informado no campo: "+campo +" não é um número válido, "
                            + "\ninforme um número maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez 10 - 200 - 234 - 800 - 0.02"
                            + "\n\n    para frações decimais utilize o ponto\n"
                            + "\n    Use números válidos.", "Número Incorreto" );
        }
        
        return retorno;  
        
    }
// Use este trecho para testar a classe 
//    }
    public static void main(String[] args) {
        if( floatn( "c", "Quantidade", false ) == true ){
            
            System.out.println( "true" );
        }
        else{
            System.out.println( "false" );
        }
    }
}

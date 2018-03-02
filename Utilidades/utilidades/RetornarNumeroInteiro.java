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
public class RetornarNumeroInteiro {

    /** Realiza a validação do CPF. 
     * 
     * @param tf
     * @param n
     * @param nomecampo
     * @param aceitar_nulo 
     * @return  
     */

    public static int intTF( JTextField tf, String n, String nomecampo, boolean aceitar_nulo ) {

        return intn( tf.getText().trim(), nomecampo, aceitar_nulo ); 
    }
    
    private static int  intn( String n, String campo, boolean aceitar_nulo ) {
        
        int retorno = 0;  
            
        try{
            if( !n.trim().equals("") ) {
                int nmr = Integer.parseInt( n.trim() ); 
                
                if( nmr != 0 ) {
                    
                    retorno = nmr;
                }
                else if( nmr == 0 & aceitar_nulo == true ) {
                    
                    retorno = nmr;
                }
                else{
                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo: "+campo +" não pode ser zero", ""+campo +" ?" );
                }
                           
            }
            else if( aceitar_nulo == true ) {
                    
                retorno = 0;   // Deixando true por que pode ser cadastrado sem 

            }
            else if( aceitar_nulo == false ) {
                    
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo: "+campo +" não pode ser zero", ""+campo +" ?" );
            }
        }catch( Exception e ){  
            
            retorno = -1;
            
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
        if( intn( "0", "Quantidade", false ) == 0 ){
            
            System.out.println( "0" );
        }
        else{
            System.out.println( "false" );
        }
    }
}

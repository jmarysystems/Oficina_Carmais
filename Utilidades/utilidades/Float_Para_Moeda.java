/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ana
 */
public class Float_Para_Moeda {

    /** Realiza a validação do CPF. 
     * 
     * @param lb  
     * @param fl  
     * @param aceitar_nulo  
     */

    // não enviar float nulo
    public static void inicioJLabel( JLabel lb, float fl, boolean aceitar_nulo ) {
        
        if ( floatn( fl, aceitar_nulo ) ) {
            NumberFormat nf  = new DecimalFormat("###,##0.00");
            
            lb.setText( nf.format( fl ) );
        }
        else{
            //lb.requestFocus();
        }

    }
    
    // não enviar float nulo
    public static void inicioJTextField( JTextField tf, float fl, boolean aceitar_nulo ) {
        
        if ( floatn( fl, aceitar_nulo ) ) {
            NumberFormat nf  = new DecimalFormat("###,##0.00");
            
            tf.setText( nf.format( fl ) );
        }
        else{
            //lb.requestFocus();
        }

    }
    
    private static boolean  floatn( float fl, boolean aceitar_nulo ) {
        String n = String.valueOf(fl);
        
        boolean retorno = false;  
            
        final int observador = -1;
        try{
            if( !n.trim().equals("") ) {
                float nmr = Float.parseFloat( n.trim() ); 
            
                if( nmr > observador ) {
                
                    retorno = true;
                }
                else {

                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Número informado para transformar em moeda: "+n +" não é um número válido, "
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
                    
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Número informado para transformar em moeda: "+n +" não pode ser nulo", ""+n +" ?" );
            }
        }catch( Exception e ){                
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Número informado para transformar em moeda: "+n +" não é um número válido, "
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
        /*if( floatn( "c", "Quantidade", false ) == true ){
            
            System.out.println( "true" );
        }
        else{
            System.out.println( "false" );
        }*/
    }
}

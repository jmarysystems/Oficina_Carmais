/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servico;

import utilidades.JOptionPaneMod;

/**
 *
 * @author CARMAL
 */
public class VerificarCampos_Servico {  
    
    public VerificarCampos_Servico( Servico Servico2 ) {  
        
        Servico = Servico2;
    }
    
    Servico Servico;
    
     public boolean verificar(){  
        boolean retorno = false;
        
        if( !Servico.tfNome.getText().trim().equals("") ) {
            
            retorno = verificarPreco();
        } 
        else {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Nome do serviço não pode ser nulo", "Nome ?" );
            Servico.tfNome.requestFocus();
        } 
        
        return retorno;        
    } 
    
    private boolean verificarPreco(){  
        boolean retorno = false;
        
        final int observador = -1;
        try{
            if( !Servico.tfPreco.getText().trim().equals("") ) {
                String str = Servico.tfPreco.getText();
                float nmr = Float.parseFloat( str ); 
            
                if( nmr > observador ) {
                
                    retorno = true;
                }
                else {
                
                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo valor tem que ser um número válido, "
                            + "\ne maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez Reais e Vinte Centavos: 10.2 ou 10.20"
                            + "\n    Use o ponto para frações decimais.", "Valor R$" );
                    Servico.tfPreco.requestFocus();
                }
            }
            else {
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Valor não pode ser nulo", "Valor ?" );
                Servico.tfPreco.requestFocus();
            } 
        }catch( Exception e ){
            retorno = false;
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo valor tem que ser um número válido, "
                            + "\ne maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez Reais e Vinte Centavos: 10.2 ou 10.20"
                            + "\n    Use o ponto para frações decimais.", "Valor R$" );
            Servico.tfPreco.requestFocus();
        }
        
        return retorno;        
    } 
             
}

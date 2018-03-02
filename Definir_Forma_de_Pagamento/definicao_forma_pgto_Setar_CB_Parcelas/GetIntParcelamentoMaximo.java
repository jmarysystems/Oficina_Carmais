/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_Setar_CB_Parcelas;

/**
 *
 * @author ana
 */
public class GetIntParcelamentoMaximo {
    
    public int getInt ( String i ){  
        int retorno = 0;
        
        switch( i ) {
            
            case "Somente A Vista":                 
                retorno = 0;                                                                
            break;
                
            case "1 Vez":                 
                retorno = 1;                                                                
            break;  
                
            case "2 Vezes":                 
                retorno = 2;                                                                
            break;  
                
            case "3 Vezes":                 
                retorno = 3;                                                                
            break;  
                
            case "4 Vezes":                 
                retorno = 4;                                                                
            break; 
                
            case "5 Vezes":                 
                retorno = 5;                                                                
            break; 
                
            case "6 Vezes":                 
                retorno = 6;                                                                
            break;  
                
            case "7 Vezes":                 
                retorno = 7;                                                                
            break;
                
            case "8 Vezes":                 
                retorno = 8;                                                                
            break; 
                
            case "9 Vezes":                 
                retorno = 9;                                                                
            break; 
                
            case "10 Vezes":                 
                retorno = 10;                                                                
            break; 
                
            case "11 Vezes":                 
                retorno = 11;                                                                
            break; 
                
            case "12 Vezes":                 
                retorno = 12;                                                                
            break;     
        }
        
        return retorno;
    }
    
}

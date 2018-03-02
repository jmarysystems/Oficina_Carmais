/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package definicao_forma_pgto_Setar_CB_Parcelas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author AnaMariana
 */
public class Parcelas_Forma_de_Pagamento_Control_Listar {
    
    public Parcelas_Forma_de_Pagamento_Control_Listar() { 

    }    
                
    public List<Bean_Parcelas_Forma_de_Pagamento> listar ( int PARCELAMENTOMAXIMO ){
        List<Bean_Parcelas_Forma_de_Pagamento> listarJavaBD = new ArrayList();        
        try {
                  
            for( int i = 0; i <= PARCELAMENTOMAXIMO; i++ ) {               
                       
                Bean_Parcelas_Forma_de_Pagamento Bean_Parcelas_Forma_de_Pagamento = new Bean_Parcelas_Forma_de_Pagamento();        

                if( i == 0 ) {
                    Bean_Parcelas_Forma_de_Pagamento.setNOME                ( "A Vista" );                
                    Bean_Parcelas_Forma_de_Pagamento.setPARCELAMENTOMAXIMO  ( PARCELAMENTOMAXIMO );   
                    Bean_Parcelas_Forma_de_Pagamento.setCODIGO              ( i );
                }
                else{
                
                    Bean_Parcelas_Forma_de_Pagamento.setNOME                ( String.valueOf( i ) );                
                    Bean_Parcelas_Forma_de_Pagamento.setPARCELAMENTOMAXIMO  ( PARCELAMENTOMAXIMO ); 
                    Bean_Parcelas_Forma_de_Pagamento.setCODIGO              ( i ); 
                }
                
                listarJavaBD.add( Bean_Parcelas_Forma_de_Pagamento );                
            }
            
        } catch ( Exception e) {
            JOptionPane.showMessageDialog( null, "Control\"listar\nParcelas_Forma_de_Pagamento_Control_Listar\n"+e.getMessage() );
            
        }
        
        return listarJavaBD;
    }
    
}

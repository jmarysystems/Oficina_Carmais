package OS_Tecnico;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnaMariana
 */
public class BookInfoTecnico {
    
        public int    ID;    
        public String NOME; 
        public float  COMISSAOPRODUTO;   
        public float COMISSAOSERVICO;

        public BookInfoTecnico(int ID2, String NOME2, float COMISSAOPRODUTO2, float COMISSAOSERVICO2 ) {
            ID              = ID2             ;    
            NOME            = NOME2           ; 
            COMISSAOPRODUTO = COMISSAOPRODUTO2;   
            COMISSAOSERVICO = COMISSAOSERVICO2;
        }
        
        @Override
        public String toString() {
            return NOME;
        }

}

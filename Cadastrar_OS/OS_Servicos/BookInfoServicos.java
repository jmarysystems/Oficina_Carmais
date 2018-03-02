package OS_Servicos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnaMariana
 */
public class BookInfoServicos {
    
        public int ID                                   ;                    
        public String NOME                          = "";
        public float  PRECO                         = 0 ;
        public String PALAVRASCHAVE                 = "";

        public BookInfoServicos(int ID2, String NOME2, float PRECO2, String PALAVRASCHAVE2 ) {
            ID              = ID2             ;    
            NOME            = NOME2           ; 
            PRECO           = PRECO2;   
            PALAVRASCHAVE   = PALAVRASCHAVE2  ;
        }
        
        @Override
        public String toString() {
            return NOME;
        }

}

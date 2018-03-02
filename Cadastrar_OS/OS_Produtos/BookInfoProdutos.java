package OS_Produtos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnaMariana
 */
public class BookInfoProdutos {
    
        public int ID                                   ;                    
        public String NOME                          = "";
        public String UNIDADETRIBUTARIA             = "";
        public float  PRECODEVENDA                  = 0 ;
        
        public BookInfoProdutos(int ID2, String NOME2, String UNIDADETRIBUTARIA2, float PRECODEVENDA2 ) {
            ID                  = ID2                 ;    
            NOME                = NOME2               ;
            UNIDADETRIBUTARIA   = UNIDADETRIBUTARIA2  ;
            PRECODEVENDA        = PRECODEVENDA2       ;               
        }
        
        @Override
        public String toString() {
            return NOME;
        }

}

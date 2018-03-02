package formas_de_pagamento_Setar_CB_tipo_de_documento;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnaMariana
 */
public class BookInfoTipoDeDoc_FormaPgto {
    
        public int    ID;    
        public String NOME; 
        public String TIPODECUSTO;
        public float  VALORDECUSTO;

        public BookInfoTipoDeDoc_FormaPgto(int ID2, String NOME2,  String TIPODECUSTO2, float  VALORDECUSTO2 ) {
            ID           = ID2            ;    
            NOME         = NOME2          ; 
            TIPODECUSTO  = TIPODECUSTO2   ;  
            VALORDECUSTO = VALORDECUSTO2  ;
        }
        
        @Override
        public String toString() {
            return NOME;
        }

}

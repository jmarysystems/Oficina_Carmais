package formas_de_pagamento_Setar_CB_conta_de_destino;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnaMariana
 */
public class BookInfoContaDeDestino {
    
        public int    ID;    
        public String APELIDOCURTO; 
        public String NOMEDESCRICAODACONTA;

        public BookInfoContaDeDestino(int ID2, String APELIDOCURTO2,  String NOMEDESCRICAODACONTAO2 ) {
            ID                   = ID2             ;    
            APELIDOCURTO         = APELIDOCURTO2           ; 
            NOMEDESCRICAODACONTA = NOMEDESCRICAODACONTAO2;   
        }
        
        @Override
        public String toString() {
            return APELIDOCURTO;
        }

}

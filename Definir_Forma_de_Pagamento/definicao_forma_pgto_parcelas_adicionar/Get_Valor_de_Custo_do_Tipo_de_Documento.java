/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package definicao_forma_pgto_parcelas_adicionar;

import OS.OS;
import formas_de_pagamento_Setar_CB_tipo_de_documento.Bean_TipoDeDoc_FormaPgto;
import formas_de_pagamento_Setar_CB_tipo_de_documento.TipoDoc_Forma_Pgto_Control_Listar;
import home.Home;
import java.util.List;

/**
 *
 * @author ana
 */
public class Get_Valor_de_Custo_do_Tipo_de_Documento {
    
    OS OS;
    Home Home;
    
    public Get_Valor_de_Custo_do_Tipo_de_Documento( OS OS2, Home Home2 ) {
        
        OS = OS2;
        Home = Home2;
    }
    
    public float get( int id_do_tipo_de_documento ){  
        float retorno = 0;
        
        TipoDoc_Forma_Pgto_Control_Listar Control = new TipoDoc_Forma_Pgto_Control_Listar( Home.ip );
        List<Bean_TipoDeDoc_FormaPgto> Bean_TipoDeDoc_FormaPgto = Control.listar( "%"+""+"%" );
                
        retorno = mostrarLista( Bean_TipoDeDoc_FormaPgto, id_do_tipo_de_documento );
        
        return retorno;
    }
    
    protected float mostrarLista( List<Bean_TipoDeDoc_FormaPgto> Bean_TipoDeDoc_FormaPgto, int id_do_tipo_de_documento ){
        float retorno = 0;
                
        for (int i = 0; i < Bean_TipoDeDoc_FormaPgto.size(); i++){ 
                         
            if( id_do_tipo_de_documento ==  Bean_TipoDeDoc_FormaPgto.get(i).getID() ) {
                
                retorno = Bean_TipoDeDoc_FormaPgto.get(i).getVALORDECUSTO();
            }   
        }
        
        return retorno;           
    }
    
}

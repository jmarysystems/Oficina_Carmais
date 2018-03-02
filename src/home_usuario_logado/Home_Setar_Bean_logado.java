/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home_usuario_logado;

import java.util.List;

/**
 *
 * @author ana
 */
public class Home_Setar_Bean_logado {
    
    public Home_Setar_Bean_logado( List<Home_Bean_logado> List_Bean_Logado ){
        
        mostrarLista( List_Bean_Logado );
    }
    
    private void mostrarLista( List<Home_Bean_logado> List_Bean_Logado ){
        
        for (int i = 0; i < List_Bean_Logado.size(); i++){
                
            //System.out.println( "List - " + List_Bean_Logado.size() + " - 1 - " + List_Bean_Logado.get(i).getNOME() );
            
            Home_Bean_logado.setNOME                        ( List_Bean_Logado.get(i).getNOME()                        ); 
                Home_Bean_logado.setEMAIL                       ( List_Bean_Logado.get(i).getEMAIL()                       ); 
                Home_Bean_logado.setPALAVRASCHAVE               ( List_Bean_Logado.get(i).getPALAVRASCHAVE()               ); 

                Home_Bean_logado.setTIPODEUSUARIO               ( List_Bean_Logado.get(i).getTIPODEUSUARIO()                    ); 

                Home_Bean_logado.setCOMISSAOPRODUTO             ( List_Bean_Logado.get(i).getCOMISSAOPRODUTO()                 );
                Home_Bean_logado.setCOMISSAOSERVICO             ( List_Bean_Logado.get(i).getCOMISSAOSERVICO()                 );

                Home_Bean_logado.setPERMITIRACESSO              ( List_Bean_Logado.get(i).isPERMITIRACESSO()              ); 
                Home_Bean_logado.setLOGIN                       ( List_Bean_Logado.get(i).getLOGIN()                        ); 
                Home_Bean_logado.setSENHA                       ( List_Bean_Logado.get(i).getSENHA()                        );
                
                Home_Bean_logado.setCADASTRARUSUARIO            ( List_Bean_Logado.get(i).isCADASTRARUSUARIO()            ); 
            
                Home_Bean_logado.setCADASTRARGRUPO              ( List_Bean_Logado.get(i).isCADASTRARGRUPO()              );
                Home_Bean_logado.setCADASTRARCLIENTE            ( List_Bean_Logado.get(i).isCADASTRARCLIENTE()           );
                Home_Bean_logado.setCADASTRARFORNECEDOR         ( List_Bean_Logado.get(i).isCADASTRARFORNECEDOR()         );
                Home_Bean_logado.setCADASTRARTRANSPORTADOR      ( List_Bean_Logado.get(i).isCADASTRARTRANSPORTADOR()      );
            
                Home_Bean_logado.setCADASTRARSERVICO            ( List_Bean_Logado.get(i).isCADASTRARSERVICO()           );
                Home_Bean_logado.setCADASTRARCATEGORIA          ( List_Bean_Logado.get(i).isCADASTRARCATEGORIA()          );
                Home_Bean_logado.setCADASTRARPRODUTO            ( List_Bean_Logado.get(i).isCADASTRARPRODUTO()           );
            
                Home_Bean_logado.setCADASTRARTIPOSDEDOCUMENTOS  ( List_Bean_Logado.get(i).isCADASTRARTIPOSDEDOCUMENTOS() );
                Home_Bean_logado.setCADASTRARFORMADEPAGAMENTO   ( List_Bean_Logado.get(i).isCADASTRARFORMADEPAGAMENTO()   );
                Home_Bean_logado.setCADASTRARALTERARDEPAGAMENTO ( List_Bean_Logado.get(i).isCADASTRARALTERARDEPAGAMENTO() );
                
                Home_Bean_logado.setCADASTRAROS                 ( List_Bean_Logado.get(i).isCADASTRAROS()                 );
 

                                
                Home_Bean_logado.setID( List_Bean_Logado.get(i).getID()   );
                        
        }
    }
   
}

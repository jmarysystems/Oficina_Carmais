/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente_Metodos;

import home.Home;
import java.util.List;
import OS_Cliente.Contato_OS;
import OS_Cliente_Control.Bean_Contato;
import OS_Cliente_Control.Control_Contato_Pelo_Nome_Listar;
import utilidades.JOptionPaneMod;

/**
 *
 * @author ana
 */
public class Listar_Clientes {
    
    Home Home;
    Contato_OS Contato_OS;
    
    public Listar_Clientes( Home Home2, Contato_OS Contato_OS2 ) {
        Home = Home2;
        Contato_OS = Contato_OS2;
        
        Iniciar_listar();
    }
    
    boolean um2 = false;
    private void Iniciar_listar(){
        
        new Thread() {   /* Fim Thread de Captura Teclas*/
            @Override
            public void run() {
                while ( um2 == false ) {     um2 = true;
                    try { Thread.sleep(1); 
                    
                        if (Contato_OS.tbClientes.getSelectedRow() != -1){
                            while (Contato_OS.tmClientes.getRowCount() > 0){
                                Contato_OS.tmClientes.removeRow(0);
                            }
                        }
                        listar();

                    }catch(Exception e) {
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Listar_Clientes, "
                            + "\nlistar()"
                            + e.getMessage()
                            + "\n", "listar()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um2 = false;
    }
    
    private void listar(){
        //List<Bean_Contato> Bean_Contato;
        
        Control_Contato_Pelo_Nome_Listar Control = new Control_Contato_Pelo_Nome_Listar(Home.ip, "CLIENTE");
        Contato_OS.Bean_Contato = Control.listar( "%" + Contato_OS.tfPesquisaCliente.getText().trim() + "%" );
        mostrar( Contato_OS.Bean_Contato );
        
    }
    
    protected void mostrar( List<Bean_Contato> Bean_Contato ){
        while (Contato_OS.tmClientes.getRowCount() > 0){
            Contato_OS.tmClientes.removeRow(0);
        }
        
        if (Bean_Contato.isEmpty()){
            //JOptionPane.showMessageDialog( null , "Nenhum dado encontrado!");
        }else{
            String [] campos = new String[] {null, null, null, null};
            for (int i = 0; i < Bean_Contato.size(); i++){
                Contato_OS.tmClientes.addRow(campos);
                Contato_OS.tmClientes.setValueAt( Bean_Contato.get(i).getID()               , i, 0);
                Contato_OS.tmClientes.setValueAt( Bean_Contato.get(i).getNOMEOURAZAOSOCIAL(), i, 1);
                Contato_OS.tmClientes.setValueAt( Bean_Contato.get(i).getTELEFONE(), i, 2);
                Contato_OS.tmClientes.setValueAt( Bean_Contato.get(i).getFONE2()         , i, 3);
                Contato_OS.tmClientes.setValueAt( Bean_Contato.get(i).getFONE3()            , i, 4);
            }
        }
    }
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import home_usuario_logado.Home_Bean_logado;
import home_usuario_logado.Home_Control_logado;
import home_usuario_logado.Home_Setar_Bean_logado;

/**
 *
 * @author CARMAL
 */
public class Home_ControleThread extends Thread {  
    
    public Home_ControleThread( int ID2, String ip_do_servidor2 ){   
        ID = ID2;
        ip_do_servidor = ip_do_servidor2;
    } 
    
    int ID = 0;
    String ip_do_servidor = "";
    
    public void run(){  
        synchronized ( this ) {
            
            a( ID ); b(); 

        }  
    }  
    
    private void a( int ID ){  
        synchronized(this) {
            Home_Control_logado Control = new Home_Control_logado( ip_do_servidor );
            List<Home_Bean_logado> List_Bean_Login = Control.listar( ID );                
            Home_Setar_Bean_logado mostrarLista = new Home_Setar_Bean_logado( List_Bean_Login );
        } 
    }
        
    public void b(){  
        synchronized ( this ) {
            Home Home = new Home( ip_do_servidor );
            Home.setVisible(true);
            //if(  ){}  //Home.setUndecorated(true);
            Home.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
            Home.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        }
 
    } 

    
    /******************Executar Teste*************************************
     * @param args************************
    public static void main(String[] args) {            
          
        ControleThread t1 = new ControleThread(); 
        
        t1.setName("Thread1");   
        
        t1.start();  
    }
    /******************Executar Teste*************************************/
    
}

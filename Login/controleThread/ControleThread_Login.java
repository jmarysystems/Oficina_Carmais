/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleThread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;
import login.LoginDerby;

/**
 *
 * @author CARMAL
 */
public class ControleThread_Login extends Thread {  
    
    public ControleThread_Login( LoginDerby LoginDerby2 ){   
        LoginDerby = LoginDerby2;
    } 
    
    LoginDerby LoginDerby;
    
    public void run(){  
        synchronized ( this ) {
            
            LoginDerby.btConectar.setEnabled( false );
                    
            a();  

            LoginDerby.btConectar.setEnabled( true );
        }  
    }  
    
    private void a(){  
        synchronized(this) {

            // System.getProperty("user.dir") + System.getProperty("file.separator") );
            String pastaDoIp = System.getProperty("user.home") + System.getProperty("file.separator") + ".JMarySystems";
            
            File f = new File( pastaDoIp );
            
            if( f.exists() ){
                
                b();
            }
            else{
                
                try{
                    f.mkdir();
                
                    b();
                }catch( Exception e ){
                    
                    JOptionPane.showMessageDialog( null, "Não foi possível criar a pasta do endereço IP");
                }
            }
        } 
    }
        
    public void b(){  
        synchronized(this) {

            // System.getProperty("user.dir") + System.getProperty("file.separator") );
            String ip = System.getProperty("user.home") + System.getProperty("file.separator") + ".JMarySystems"
                    + System.getProperty("file.separator") + "ip" + ".txt";
            
            File f = new File( ip );
            
            if( f.exists() ){
                
                try{
                    
                    InputStream inputStream =  new FileInputStream( ip );
                    BufferedReader br = new BufferedReader( new InputStreamReader( inputStream, "ISO-8859-1" ) ); // "UTF-8", "UTF-16", "ISO-8859-1" ou "US-ASCII"
                    StringBuilder sb = new StringBuilder();
                    String line; 
                    while ( (line = br.readLine() ) != null ) {
                        sb.append(line);      
                        
                        //System.out.println( sb.toString() );
                        break;
	            }
                    
                    if( !sb.toString().equals("") ){
                        
                        LoginDerby.ip_do_servidor = sb.toString();
                        
                        LoginDerby.verificarLogin( LoginDerby.ip_do_servidor );
                    }
                    else{
                        
                        c( ip );
                    }
                    
                    
                }catch( Exception e ){
                    
                    JOptionPane.showMessageDialog( null, "Não foi possível ler o arquivo do endereço ip");
                }
            }
            else{
                try {
                    
                    f.createNewFile();
                    
                    c( ip );
                    
                } catch ( Exception e ) {
                    
                    JOptionPane.showMessageDialog( null, "Não foi possível criar o arquivo ip.txt");
                }
            }
        }    
    } 
    
    public void c( String ip ){  
        synchronized(this) {
            
            String str = JOptionPane.showInputDialog( null, 
                    "Informe o IP do servidor de Banco De Dados"
                    + "\n\nClique em OK para configurar o endereço ip do servidor" 
                    
                    + "\n","Configurar ip? ", JOptionPane.OK_CANCEL_OPTION );
            if ( !str.equals("") ){
                
                try {
                        
                    RandomAccessFile arquivo = new RandomAccessFile( ip, "rw");
                    arquivo.setLength(0);
                    arquivo.close();
                    
	            BufferedWriter out = new BufferedWriter(new FileWriter( ip,true));
	            out.write( str );                
	            out.close();
                    
                    d( str );
	        } catch ( Exception e ) {
                        
                    JOptionPane.showMessageDialog( null, "Não foi possível gravar no arquivo ip.txt");
                }
                                
            }
        }    
    }
    
    private void d( String ip ){  
        synchronized(this) {
            
            if( TestarConexaoComOBanco.criar( ip ) ){
                
                a();
            }
            else{
                
                JOptionPane.showMessageDialog( null, "O endereço IP: " + ip 
                        + "\nNão conseguiu estabelecer conexão com o servidor\n"
                        + "\nVerifique se o servidor foi iniciado!"
                        );
            }
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

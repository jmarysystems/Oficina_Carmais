/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brasil;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author AnaMariana
 */
public class Txt {

    public void construirHtml(){
        try{
            InputStream inputStream =  getClass().getResourceAsStream( "txt"+".txt" );
            BufferedReader br = new BufferedReader( new InputStreamReader( inputStream, "ISO-8859-1" ) ); // "UTF-8", "UTF-16", "ISO-8859-1" ou "US-ASCII"
            StringBuilder sb = new StringBuilder();
            
            String line; 
            while ( (line = br.readLine() ) != null ) {
                sb.append("                \"");
                sb.append(line);
                sb.append("\",");
                sb.append( "\n" );
	    }
            
            System.out.println( sb.toString() );
            
        }catch( Exception e ){ e.printStackTrace(); }
    }
    
    @SuppressWarnings("empty-statement")
    public static void main ( String args [] ){
        Txt T = new Txt();
        T.construirHtml();;
    }
    
}

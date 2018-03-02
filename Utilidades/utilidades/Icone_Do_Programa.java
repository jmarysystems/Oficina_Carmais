/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import home.Home;
import javax.swing.ImageIcon;

/**
 *
 * @author ana
 */
public class Icone_Do_Programa {
    
    public Icone_Do_Programa( Home Home2 ) {
        
        Home = Home2;
        iconeDoPrograma();
    }
    
    Home Home;
        
    /* Início Setando O Ícone do Programa */
    boolean um1 = false;
    private void iconeDoPrograma(){
        
        new Thread() {   
            @Override
            public void run() {
                while ( um1 == false ) {     um1 = true;
                    try { Thread.sleep(1); 
                    
                        /*URL imgUrl;
                        ImageIcon imgIcon;*/
                    
                        Home.setIconImage(new ImageIcon( "/imagens/lixo.jpg" ).getImage() );
                        /*imgUrl = Home.class.getResource("Imagens/iconeCiênciasHumanasHistóriaDoBrasil.png");
                        imgIcon = new ImageIcon(imgUrl);
                        Image img = imgIcon.getImage();
                        this.setIconImage(img);*/

           
                    }catch( Exception e ){                
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Icone_Do_Programa, "
                                + "\niconeDoPrograma()"
                                + e.getMessage()
                                + "\n", "iconeDoPrograma()" );
                    }
                }
            }
        }.start(); /* Fim Thread */ 
        um1 = false;
    }
    /* Fim Setando O Ícone do Programa */
    
}

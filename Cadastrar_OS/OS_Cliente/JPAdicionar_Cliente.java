/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OS_Cliente;

import OS.OS;
import OS_metodos.OS_Botao_Pesquisar_Cliente_Pressionado;
import home.Home;

/**
 *
 * @author ana
 */
public class JPAdicionar_Cliente extends javax.swing.JPanel {

    OS OS;
    Home Home;
    
    /**
     * Creates new form JPAdicionar_Cliente
     * @param Home2
     * @param OS2
     */
    public JPAdicionar_Cliente( Home Home2, OS OS2 ) {
        OS = OS2;
        Home = Home2;  
        
        initComponents();
        
        inicioJPAdicionar_Cliente();                       
    }
    
    private void inicioJPAdicionar_Cliente() {
        
        OS.tabOS.setEnabledAt( 0, false );
        
        OS_Botao_Pesquisar_Cliente_Pressionado bt_Pesquisar_Cliente = new OS_Botao_Pesquisar_Cliente_Pressionado(OS, Home, true);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

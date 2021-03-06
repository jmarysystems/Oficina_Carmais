/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formas_de_pagamento;

import home.Home;
import java.awt.Color;

/**
 *
 * @author AnaMariana
 */
public class Formas_de_Pagamento extends javax.swing.JPanel {

    /**
     * Creates new form Cliente
     * @param Home2
     */
    Home Home;
    
    public Formas_de_Pagamento( Home Home2 ) {
        Home = Home2;
        
        initComponents();
        
        cbParcelamentoMaximo.setBackground( new Color( 255, 255, 255 ) );
        cbParcelasSemJuros.setBackground( new Color( 255, 255, 255 ) );
        cbContaDeDestinoPadrao.setBackground( new Color( 255, 255, 255 ) );
        cbTipoDeDocumentoPadrao.setBackground( new Color( 255, 255, 255 ) );
        cbIntervaloPadraoEntreAsParcelas.setBackground( new Color( 255, 255, 255 ) );
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfIntervaloPadraoEntreAsParcelas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbParcelamentoMaximo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbParcelasSemJuros = new javax.swing.JComboBox();
        tfJuros = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTaxaFixa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfDescontoAVista = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbContaDeDestinoPadrao = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cbTipoDeDocumentoPadrao = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cbIntervaloPadraoEntreAsParcelas = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Configuração Básica");

        tfIntervaloPadraoEntreAsParcelas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfIntervaloPadraoEntreAsParcelas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfIntervaloPadraoEntreAsParcelas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfIntervaloPadraoEntreAsParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIntervaloPadraoEntreAsParcelasActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setText("Valores que serão preenchidos automaticamente ao selecionar esta forma de pagamento");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Intervalo padrão entre as parcelas");

        tfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome ");

        cbParcelamentoMaximo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbParcelamentoMaximo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Somente A Vista", "1 Vez", "2 Vezes", "3 Vezes", "4 Vezes", "5 Vezes", "6 Vezes", "7 Vezes", "8 Vezes", "9 Vezes", "10 Vezes", "11 Vezes", "12 Vezes", "13 Vezes", "14 Vezes", "15 Vezes", "16 Vezes", "17 Vezes", "18 Vezes", "19 Vezes", "20 Vezes", "21 Vezes", "22 Vezes", "23 Vezes", "24 Vezes", "25 Vezes", "26 Vezes", "27 Vezes", "28 Vezes", "29 Vezes", "30 Vezes", "31 Vezes", "32 Vezes", "33 Vezes", "34 Vezes", "35 Vezes", "36 Vezes", "37 Vezes", "38 Vezes", "39 Vezes", "40 Vezes", "41 Vezes", "42 Vezes", "43 Vezes", "44 Vezes", "45 Vezes", "46 Vezes", "47 Vezes", "48 Vezes", "49 Vezes", "50 Vezes", "51 Vezes", "52 Vezes", "53 Vezes", "54 Vezes", "55 Vezes", "56 Vezes", "57 Vezes", "58 Vezes", "59 Vezes", "60 Vezes" }));
        cbParcelamentoMaximo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Parcelamento máximo");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Preenchimento automático");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel12.setText("Nome, parcelamento e valores utilizados no cálculo");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Parcelas sem juros");

        cbParcelasSemJuros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbParcelasSemJuros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Somente A Vista", "1 Vez", "2 Vezes", "3 Vezes", "4 Vezes", "5 Vezes", "6 Vezes", "7 Vezes", "8 Vezes", "9 Vezes", "10 Vezes", "11 Vezes", "12 Vezes", "13 Vezes", "14 Vezes", "15 Vezes", "16 Vezes", "17 Vezes", "18 Vezes", "19 Vezes", "20 Vezes", "21 Vezes", "22 Vezes", "23 Vezes", "24 Vezes", "25 Vezes", "26 Vezes", "27 Vezes", "28 Vezes", "29 Vezes", "30 Vezes", "31 Vezes", "32 Vezes", "33 Vezes", "34 Vezes", "35 Vezes", "36 Vezes", "37 Vezes", "38 Vezes", "39 Vezes", "40 Vezes", "41 Vezes", "42 Vezes", "43 Vezes", "44 Vezes", "45 Vezes", "46 Vezes", "47 Vezes", "48 Vezes", "49 Vezes", "50 Vezes", "51 Vezes", "52 Vezes", "53 Vezes", "54 Vezes", "55 Vezes", "56 Vezes", "57 Vezes", "58 Vezes", "59 Vezes", "60 Vezes" }));
        cbParcelasSemJuros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbParcelasSemJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParcelasSemJurosActionPerformed(evt);
            }
        });

        tfJuros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfJuros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfJuros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJurosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Juros ( % )");

        tfTaxaFixa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfTaxaFixa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTaxaFixa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfTaxaFixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTaxaFixaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Taxa fixa ( $ )");

        tfDescontoAVista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDescontoAVista.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfDescontoAVista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        tfDescontoAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescontoAVistaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Desconto a vista ( % )");

        cbContaDeDestinoPadrao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbContaDeDestinoPadrao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbContaDeDestinoPadrao.setPreferredSize(new java.awt.Dimension(88, 25));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Conta de destino padrão");

        cbTipoDeDocumentoPadrao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTipoDeDocumentoPadrao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbTipoDeDocumentoPadrao.setPreferredSize(new java.awt.Dimension(28, 25));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Tipo de documento padrão");

        cbIntervaloPadraoEntreAsParcelas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbIntervaloPadraoEntreAsParcelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dia", "mês" }));
        cbIntervaloPadraoEntreAsParcelas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 239, 237), 1, true));
        cbIntervaloPadraoEntreAsParcelas.setPreferredSize(new java.awt.Dimension(45, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(cbContaDeDestinoPadrao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbTipoDeDocumentoPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfIntervaloPadraoEntreAsParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cbIntervaloPadraoEntreAsParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfJuros, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfTaxaFixa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbParcelamentoMaximo, 0, 211, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbParcelasSemJuros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDescontoAVista))))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbParcelamentoMaximo, cbParcelasSemJuros, tfDescontoAVista, tfJuros, tfNome, tfTaxaFixa});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbParcelasSemJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(cbParcelamentoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfDescontoAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTaxaFixa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIntervaloPadraoEntreAsParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIntervaloPadraoEntreAsParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbContaDeDestinoPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTipoDeDocumentoPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbContaDeDestinoPadrao, cbIntervaloPadraoEntreAsParcelas, cbParcelamentoMaximo, cbParcelasSemJuros, cbTipoDeDocumentoPadrao, tfDescontoAVista, tfIntervaloPadraoEntreAsParcelas, tfJuros, tfNome, tfTaxaFixa});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfIntervaloPadraoEntreAsParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIntervaloPadraoEntreAsParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIntervaloPadraoEntreAsParcelasActionPerformed

    private void tfJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJurosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJurosActionPerformed

    private void tfTaxaFixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTaxaFixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTaxaFixaActionPerformed

    private void tfDescontoAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescontoAVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescontoAVistaActionPerformed

    private void cbParcelasSemJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParcelasSemJurosActionPerformed
    }//GEN-LAST:event_cbParcelasSemJurosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox cbContaDeDestinoPadrao;
    public javax.swing.JComboBox cbIntervaloPadraoEntreAsParcelas;
    public javax.swing.JComboBox cbParcelamentoMaximo;
    public javax.swing.JComboBox cbParcelasSemJuros;
    public javax.swing.JComboBox cbTipoDeDocumentoPadrao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField tfDescontoAVista;
    public javax.swing.JTextField tfIntervaloPadraoEntreAsParcelas;
    public javax.swing.JTextField tfJuros;
    public javax.swing.JTextField tfNome;
    public javax.swing.JTextField tfTaxaFixa;
    // End of variables declaration//GEN-END:variables
             
}

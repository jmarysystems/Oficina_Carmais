/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipo_de_documento_Controle;

import home.Home;
import tipo_de_documento.Tipos_de_Documento_Home;
import tipo_de_documento_Estado_dos_Botoes.Tipo_de_Documentos_Botoes_Inicio;
import tipo_de_documento_Estado_dos_TFs_CBs.Tipo_de_Documentos_TFs_CBs_Inicio;
import utilidades.JOptionPaneMod;
import utilidades.RetornarNumeroFloat;

/**
 *
 * @author CARMAL
 */
public class Controle_Salvar_Tipo_de_Doc_Thread extends Thread {  

    Home Home;
    Tipos_de_Documento_Home Tipos_de_Documento_Home;
    
    public Controle_Salvar_Tipo_de_Doc_Thread( Home Home2, Tipos_de_Documento_Home Tipos_de_Documento_Home2 ) {
        
        Home = Home2;     
        Tipos_de_Documento_Home = Tipos_de_Documento_Home2;
    }
    
    @Override
    public void run(){  
        synchronized ( this ) {
            
            //Criar_Banco_De_Dados.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
            
            verificar();  
            
            //Criar_Banco_De_Dados.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        }  
    }  
    
    public void verificar(){  
        synchronized(this) {  
            if( !Tipos_de_Documento_Home.Tipos_de_Documento.tfNome.getText().equals("") ) { 
            
                a();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Nome do Tipo de Documento inválido, "
                                + "\nNenhum Nome do Tipo de Documento informado\n"
                                + "\nPara Cadastrar é preciso informar o Nome do Tipo de Documento"
                                + "\n", "Nome do Tipo de Documento?" ); 
                
                Tipos_de_Documento_Home.Tipos_de_Documento.tfNome.requestFocus();
            }         
        }  
    } 
  
    public void a(){  
 
        synchronized ( this ) {
           
            if( Tipos_de_Documento_Home.Tipos_de_Documento.cbTipoDeCusto.getSelectedItem() != null ) { 
            
                b();
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Nome do Tipo de Custo inválido, "
                                + "\nNenhum Nome do Tipo de Custo informado\n"
                                + "\nPara Cadastrar é preciso informar o Nome do Tipo de Custo"
                                + "\n", "Nome do Tipo de Custo?" ); 
                
                Tipos_de_Documento_Home.Tipos_de_Documento.cbTipoDeCusto.requestFocus();
            }
        }
    }  
    
    public void b(){  
 
        synchronized ( this ) {
            
            if( !Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto.getText().equals("") ) { 
            
                float valorCusto = RetornarNumeroFloat.floatTF( 
                Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto, Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto.getText().trim(), "Valor de Custo", true );
                            
                    if( valorCusto > -1 ){
                
                        c();
                    }
                    else {
                    
                        JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Valor de Custo informado "+ Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto.getText().trim() 
                                    + "\n"
                                    + "\nO Valor de Custo para cadastrar não pode ser menor que  0"    
                                    + "\n"
                                    + "\nPara continuar edite este valor"
                                    + "\n"
                                    , "Valor de Custo para cadastrar " );
                                Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto.requestFocus();  
                    }
            }
            else{
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Valor Custo inválido, "
                                + "\nNenhum valor de Custo informado\n"
                                + "\nPara Cadastrar é preciso informar o valor de Custo para empresa"
                                + "\n\nSe o valor de Custo para empresa é 0, informe 0"
                                + "\n", "Valor Custo?" ); 
                
                Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto.requestFocus();
            }
        }
    }
    
    public void c(){  
 
        synchronized ( this ) {
            
            String str = Tipos_de_Documento_Home.Tipos_de_Documento.cbTipoDeCusto.getSelectedItem().toString().trim();
           
            if( str.equals("Sem custo") && !Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto.getText().equals("0") ) {
                
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Tipo de custo inválido, "
                                + "\nTipo de custo informado: Sem custo\n"
                                + "\nPara Cadastrar é preciso informar o valor de Custo = 0"
                                + "\n\nTipo de custo Sem custo só pode ser cadastrado com o valor de custo = 0"
                                + "\n", "Tipo de custo inválido?" ); 
                
            }
            else{
                
                if( !str.equals("Sem custo") && Tipos_de_Documento_Home.Tipos_de_Documento.tfValorCusto.getText().equals("0") ) {
                    
                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Tipo de custo inválido, "
                                + "\nTipo de custo informado diferente de Sem custo\n"
                                + "\nPara Cadastrar é preciso informar o valor de Custo diferente de 0"
                                + "\n\nSe não for utilizado o tipo de custo Sem custo só pode ser cadastrado com o valor de custo diferente de 0"
                                + "\n", "Tipo de custo inválido?" ); 
                }
                else{
                    
                    cadastrar_Tipo_de_Documento();
                }
            }
            
            
        }
    } 
    
    
    
    
    
    
    
    
    
    
    private void cadastrar_Tipo_de_Documento() {  
        
        try{
            
            Tipo_de_Documento_Cadastrar Tipo_de_Documento_Cadastrar             = new Tipo_de_Documento_Cadastrar       ( Home,Tipos_de_Documento_Home );
            
            Tipo_de_Documentos_Botoes_Inicio Tipo_de_Documentos_Botoes_Inicio   = new Tipo_de_Documentos_Botoes_Inicio  ( Home,Tipos_de_Documento_Home );           
            Tipo_de_Documentos_TFs_CBs_Inicio Tipo_de_Documentos_TFs_CBs_Inicio = new Tipo_de_Documentos_TFs_CBs_Inicio ( Home,Tipos_de_Documento_Home );            
            
            Limpar_Campos_Apos_Salvar Limpar_Campos_Apos_Salvar                 = new Limpar_Campos_Apos_Salvar         ( Home,Tipos_de_Documento_Home );
                    
        }catch(Exception e) {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Controle_Salvar_Tipo_de_Doc_Thread, "
                    + "\ncadastrar_Tipo_de_Documento()"
                    + e.getMessage()
                    + "\n", "cadastrar_Tipo_de_Documento()" );
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

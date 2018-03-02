/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.JOptionPaneMod;
import login_control.Login_Bean;
import login_control.Login_Control_Listar;
import home_usuario_logado.Home_Bean_logado;

/**
 *
 * @author CARMAL
 */
public class VerificarCampos_Usuario {  
    
    public VerificarCampos_Usuario( Usuario Usuario2 ) {  
        
        Usuario = Usuario2;
    }
    
    Usuario Usuario;
    
     public boolean verificar() {  
        boolean retorno = false;  
        
        String email = Usuario.tfEmail.getText().trim();
        if (email != null && email.length() > 0) {  
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);  
            Matcher matcher = pattern.matcher(email);  
            if (matcher.matches()) {  
                retorno = verificarNomeCompleto();  // true  
            } 
            else {
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Email Digitado Nao é Válido", "Email Inválido" );
                Usuario.tfEmail.requestFocus();
            }
        } 
        else {
            retorno = verificarNomeCompleto();  // false
        } 
        
        return retorno;  
    }

    private boolean verificarNomeCompleto(){  
        boolean retorno = false;
        
        if( !Usuario.tfNome.getText().trim().equals("") ) {
            
            retorno = comissaoProdutos();
        } 
        else {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Nome Completo não pode ser nulo", "Nome Completo" );
            Usuario.tfNome.requestFocus();
        } 
        
        return retorno;        
    } 
    
    private boolean comissaoProdutos(){  
        boolean retorno = false;
        
        final int observador = -1;
        try{
            if( !Usuario.ftfComissaoProduto.getText().trim().equals("") ) {
                String str = Usuario.ftfComissaoProduto.getText();
                float nmr = Float.parseFloat( str ); 
            
                if( nmr > observador ) {
                
                    retorno = comissaoServicos();
                }
                else {
                
                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Comissão produtos (%) tem que ser um número válido, "
                            + "\ne maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez Reais e Vinte Centavos: 10.2 ou 10.20"
                            + "\n    Use o ponto para frações decimais.", "Comissão produtos (%)" );
                    Usuario.ftfComissaoProduto.requestFocus();
                }
            }
            else {
                
                retorno = comissaoServicos();
            }
        }catch( Exception e ){
            retorno = false;
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Comissão produtos (%) tem que ser um número válido, "
                            + "\ne maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez Reais e Vinte Centavos: 10.2 ou 10.20"
                            + "\n    Use o ponto para frações decimais.", "Comissão produtos (%)" );
            Usuario.ftfComissaoProduto.requestFocus();
        }
        
        return retorno;        
    } 
    
    private boolean comissaoServicos(){  
        boolean retorno = false;
        
        final int observador = -1;
        try{
            if( !Usuario.tfComissaoServico.getText().trim().equals("") ) {
                String str = Usuario.tfComissaoServico.getText();
                float nmr = Float.parseFloat( str ); 
            
                if( nmr > observador ) {
                
                    retorno = verificarTipoDeUsuario();
                }
                else {
                
                    JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Comissão servicos (%) tem que ser um número válido, "
                            + "\ne maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez Reais e Vinte Centavos: 10.2 ou 10.20"
                            + "\n    Use o ponto para frações decimais.", "Comissão produtos (%)" );
                    Usuario.tfComissaoServico.requestFocus();
                }
            }
            else {
                
                retorno = verificarTipoDeUsuario();
            }
        }catch( Exception e ){
            retorno = false;
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Comissão servicos (%) tem que ser um número válido, "
                            + "\ne maior ou igual a 0 ( Zero )"
                            + "\nExemplo:"
                            + "\n    Dez Reais e Vinte Centavos: 10.2 ou 10.20"
                            + "\n    Use o ponto para frações decimais.", "Comissão produtos (%)" );
            Usuario.tfComissaoServico.requestFocus();
        }
        
        return retorno;        
    }
    
    private boolean verificarTipoDeUsuario(){  
        boolean retorno = false;
        
        if( !Usuario.cbTipoDeUsuario.getSelectedItem().toString().equals("") ) {
            
            if( Usuario.chbPermitirAcessar.isSelected() ) {
                
                retorno = verificarLogin();
            }
            else {
                retorno = true;
            }

        } 
        else {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Tipo de usuário não pode ser nulo", "Tipo de usuário?" );
            Usuario.cbTipoDeUsuario.requestFocus();
        }
        
        return retorno;        
    }
    
    private boolean verificarLogin(){  
        boolean retorno = false;
        
        if( !Usuario.tfLogin.getText().trim().equals("") ) {
            
            retorno = verificarSenha();
        } 
        else {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Login (nome de usuário) não pode ser nulo", "Login (nome de usuário)?" );
            Usuario.tfLogin.requestFocus();
        } 
        
        return retorno;        
    } 
    
    private boolean verificarSenha(){  
        boolean retorno = false;
        
        if( !Usuario.tfSenha.getText().trim().equals("") ) {
            
            retorno = verificarRepetirSenha();
        } 
        else {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Definir Senha não pode ser nulo", "Definir Senha?" );
            Usuario.tfSenha.requestFocus();
        } 
        
        return retorno;        
    } 
    
    private boolean verificarRepetirSenha(){  
        boolean retorno = false;
        
        if( !Usuario.tfRepetirSenha.getText().trim().equals("") ) {
            
            retorno = verificarSenhaERepetirSenha();
        } 
        else {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O Campo Repetir Senha não pode ser nulo", "Repetir Senha?" );
            Usuario.tfRepetirSenha.requestFocus();
        } 
        
        return retorno;        
    }
    
    private boolean verificarSenhaERepetirSenha(){  
        boolean retorno = false;
        
        if( Usuario.tfSenha.getText().trim().equals( Usuario.tfRepetirSenha.getText().trim() ) ) {
            
            retorno = verificarPermissaoUsuarioLogado();
        } 
        else {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "A Senha e a confirmação da Senha não são iguais", "Senha e a confirmação da Senha diferenrtes" );
            Usuario.tfNome.requestFocus();
        } 
        
        return retorno;        
    }
    
    private boolean verificarPermissaoUsuarioLogado(){  
        boolean retorno = false;
        
        if( Home_Bean_logado.isCADASTRARUSUARIO() == true ) {
            
            retorno = verificarSeUsuarioJaExiste();
        } 
        else {
            JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "Usuário "+ Home_Bean_logado.getLOGIN() +" está sem permissão de efetuar cadastro: ", "Sem permissão" );
            Usuario.tfNome.requestFocus();
        } 
        
        return retorno;        
    }
    
    private boolean verificarSeUsuarioJaExiste(){  
        boolean retorno = true;
        
        Login_Control_Listar Control = new Login_Control_Listar("localhost");
        List<Login_Bean> List_Bean_Login = Control.listar( "%"+""+"%" );
        
        for (int i = 0; i < List_Bean_Login.size(); i++){       System.out.println( i+" - "+List_Bean_Login.get(i).getLOGIN() );
            if( List_Bean_Login.get(i).getLOGIN().equals( Usuario.tfLogin.getText().trim() ) ) {
                JOptionPaneMod JOptionPaneMod = new JOptionPaneMod( 2, "O nome de usuário: " + Usuario.tfLogin.getText() + " já existe \n", "Por favor escolha outro nome" );
                Usuario.tfLogin.requestFocus();
                
                retorno = false;
                break;
            }
        }
        
        return retorno;        
    }
         
}

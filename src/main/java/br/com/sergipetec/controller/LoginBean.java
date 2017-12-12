package br.com.sergipetec.controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.sergipetec.dao.UsuarioRN;
import br.com.sergipetec.model.Usuario;



@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean {

	private Usuario usuario;
	private String mensagem;
	
	public LoginBean(){
		this.setUsuario(new Usuario());
		this.mensagem = "";
	}
	
	public String login(){
		this.mensagem = "";
		
		UsuarioRN usuarioRN = new UsuarioRN();
		
		Usuario usuLogin = usuarioRN.buscarLogin(this.usuario.getEmail(), this.usuario.getSenha());

		if(usuLogin != null){
			this.usuario = usuLogin;
		}else{
			this.mensagem = "Usuário e/ou senha inválidos.";
			return "?faces-redirect=true";
		}
		
//		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.usuario);
		
		return "index.jsf?faces-redirect=true";
	}
	
	public String crypt(String senha){
		try {
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
			
			StringBuilder hexString = new StringBuilder();
			for (byte b : messageDigest) {
			  hexString.append(String.format("%02X", 0xFF & b));
			}
			
			return hexString.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return senha;
	}
	
	public String logout(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		
        return "login.jsf?faces-redirect=true";
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}
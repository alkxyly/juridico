package br.com.sergipetec.dao;

import br.com.sergipetec.model.Usuario;
import br.com.sergipetec.web.filter.DAOFactory;

public class UsuarioRN {

	
private UsuarioDAO usuarioDAO;
	
	public UsuarioRN(){
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	
	public Usuario buscarLogin(String email, String senha) {
		
		return null;
	}

}

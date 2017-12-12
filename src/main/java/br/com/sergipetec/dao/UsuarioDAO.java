package br.com.sergipetec.dao;

import br.com.sergipetec.model.Usuario;

public interface UsuarioDAO {
	public Usuario buscarLogin(String email, String senha) ;
}

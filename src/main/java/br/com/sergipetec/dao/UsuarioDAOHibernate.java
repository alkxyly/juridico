package br.com.sergipetec.dao;

import org.hibernate.Session;

import br.com.sergipetec.model.Usuario;

public class UsuarioDAOHibernate implements UsuarioDAO {
	private Session session;

	public void setSession(Session session){
		this.session = session;
	}
	@Override
	public Usuario buscarLogin(String email, String senha) {
		return null;
	}

}

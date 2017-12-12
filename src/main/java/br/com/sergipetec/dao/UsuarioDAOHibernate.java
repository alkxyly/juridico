package br.com.sergipetec.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.sergipetec.model.Usuario;

public class UsuarioDAOHibernate implements UsuarioDAO {
	private Session session;

	public void setSession(Session session){
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Usuario buscarLogin(String login, String senha) {
		String sql = "select u from Usuario u where u.email  = :email and u.senha = :senha";
		Query retorno = this.session.createQuery(sql);
		retorno.setString("email", login);
		retorno.setString("senha", senha);
		List<Usuario> lista = (List<Usuario>) retorno.list();

		if (lista.size() > 0)
			return lista.get(0);
		else
			return null;
	}
}

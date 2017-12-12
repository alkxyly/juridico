package br.com.sergipetec.web.filter;

import br.com.sergipetec.dao.ContratoDAO;
import br.com.sergipetec.dao.ContratoDAOHibernate;
import br.com.sergipetec.dao.UsuarioDAO;
import br.com.sergipetec.dao.UsuarioDAOHibernate;

public class DAOFactory {
	public static ContratoDAO criarContratoDAO(){
		ContratoDAOHibernate contratoDAO = new ContratoDAOHibernate();
		contratoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return contratoDAO;
	}
	public static UsuarioDAO criarUsuarioDAO(){
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
}

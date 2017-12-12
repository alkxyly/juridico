package br.com.sergipetec.web.filter;

import br.com.sergipetec.dao.ContratoDAO;
import br.com.sergipetec.dao.ContratoDAOHibernate;

public class DAOFactory {
	public static ContratoDAO criarContratoDAO(){
		ContratoDAOHibernate contratoDAO = new ContratoDAOHibernate();
		contratoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return contratoDAO;
	}
}

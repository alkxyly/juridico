package br.com.sergipetec.dao;


import java.util.List;

import org.hibernate.Session;

import br.com.sergipetec.model.Contrato;

public class ContratoDAOHibernate  implements ContratoDAO{
	private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}

	@Override
	public void salvar(Contrato contrato) {
		this.session.save(contrato);
		
	}

	@Override
	public void excluir(Contrato contrato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Contrato contrato) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contrato> listarContratos() {
		return this.session.createCriteria(Contrato.class).list();
	}
}

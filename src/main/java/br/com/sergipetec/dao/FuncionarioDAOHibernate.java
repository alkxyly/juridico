package br.com.sergipetec.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.sergipetec.model.Funcionario;

public class FuncionarioDAOHibernate implements FuncionarioDAO {
	
	private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}

	@Override
	public void salvar(Funcionario funcionario) {
		this.session.save(funcionario);
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void excluir(Funcionario funcionario){
		
	}

	@Override
	public List<Funcionario> listarFuncionarios() {
		Criteria crit = this.session.createCriteria(Funcionario.class);
		crit.add(Restrictions.eq("categoria", "Funcionario"));
		return crit.list();
	}

	@Override
	public List<Funcionario> listarGestores() {
		Criteria crit = this.session.createCriteria(Funcionario.class);
		crit.add(Restrictions.eq("categoria", "Gestor"));
		return crit.list();
	}

}

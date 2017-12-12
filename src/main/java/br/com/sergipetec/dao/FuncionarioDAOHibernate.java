package br.com.sergipetec.dao;

import org.hibernate.Session;

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

}

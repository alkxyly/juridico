package br.com.sergipetec.dao;

import br.com.sergipetec.model.Funcionario;
import br.com.sergipetec.web.filter.DAOFactory;
;

public class FuncionarioRN {
private FuncionarioDAO funcionarioDAO;
	
	public FuncionarioRN(){
		this.funcionarioDAO = DAOFactory.criarFuncionarioDAO();
	}
	
	public void salvar(Funcionario funcionario){
		if(funcionario == null || funcionario.getId() == 0)
			this.funcionarioDAO.salvar(funcionario);
	}
}

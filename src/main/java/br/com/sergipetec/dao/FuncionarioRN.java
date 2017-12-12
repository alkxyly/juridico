package br.com.sergipetec.dao;

import java.util.List;

import br.com.sergipetec.model.Funcionario;
import br.com.sergipetec.web.filter.DAOFactory;
;

public class FuncionarioRN {
private FuncionarioDAO funcionarioDAO;
	
	public FuncionarioRN(){
		this.funcionarioDAO = DAOFactory.criarFuncionarioDAO();
	}
	
	public void salvar(Funcionario funcionario){
		if(funcionario == null || funcionario.getId() == null)
			this.funcionarioDAO.salvar(funcionario);
	}
	
	public List<Funcionario> listarFuncionarios(){
		return this.funcionarioDAO.listarFuncionarios();
	}
	
	public List<Funcionario> listarGestores(){
		return this.funcionarioDAO.listarGestores();
	}
}

package br.com.sergipetec.dao;

import br.com.sergipetec.model.Funcionario;

public interface FuncionarioDAO {
	public void salvar(Funcionario funcionario);
	public void atualizar(Funcionario funcionario);
	public void excluir(Funcionario funcionario);
}

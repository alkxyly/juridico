package br.com.sergipetec.dao;

import java.util.List;

import br.com.sergipetec.model.Funcionario;

public interface FuncionarioDAO {
	public void salvar(Funcionario funcionario);
	public void atualizar(Funcionario funcionario);
	public void excluir(Funcionario funcionario);
	public List<Funcionario> listarFuncionarios();
	public List<Funcionario> listarGestores();
	public List<Funcionario> listar();
}

package br.com.sergipetec.dao;

import br.com.sergipetec.model.Contrato;

public interface ContratoDAO {
	public void salvar(Contrato contrato);
	public void excluir(Contrato contrato);
	public void atualizar(Contrato contrato);
}

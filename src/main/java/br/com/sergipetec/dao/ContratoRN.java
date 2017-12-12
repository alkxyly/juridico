package br.com.sergipetec.dao;

import java.util.List;

import br.com.sergipetec.model.Contrato;
import br.com.sergipetec.web.filter.DAOFactory;

public class ContratoRN {
	
	private ContratoDAO contratoDAO;
	
	public ContratoRN(){
		this.contratoDAO = DAOFactory.criarContratoDAO();
	}
	
	public void salvar(Contrato contrato){
		if(contrato == null || contrato.getId() == null)
			this.contratoDAO.salvar(contrato);
	}
	
	public List<Contrato> listarContratos(){
		return this.contratoDAO.listarContratos();
	}
}

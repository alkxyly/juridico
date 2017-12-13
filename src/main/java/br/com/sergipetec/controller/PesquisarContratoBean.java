package br.com.sergipetec.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sergipetec.dao.ContratoRN;
import br.com.sergipetec.model.Contrato;

@ManagedBean(name = "pesquisarBean")
@ViewScoped
public class PesquisarContratoBean {
	private List<Contrato> contratos;
	private Contrato contratoSelecionado = new Contrato();
	
	public PesquisarContratoBean(){
		ContratoRN contratoRN = new ContratoRN();	
		this.contratos = contratoRN.listarContratos();
	}

	public Contrato getContratoSelecionado() {
		return contratoSelecionado;
	}

	public void setContratoSelecionado(Contrato contratoSelecionado) {
		this.contratoSelecionado = contratoSelecionado;
	}


	public List<Contrato> getContratos() {
		if(this.contratos == null){
			ContratoRN contratoRN =  new ContratoRN();
			this.contratos = contratoRN.listarContratos();
		}
		return contratos;
	}
	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	
	
}

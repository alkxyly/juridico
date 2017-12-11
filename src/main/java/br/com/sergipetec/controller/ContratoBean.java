package br.com.sergipetec.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sergipetec.dao.ContratoRN;
import br.com.sergipetec.model.Contrato;

@ManagedBean(name = "contratoBean")
@RequestScoped
public class ContratoBean {
	private Contrato contrato;
	
	public ContratoBean(){
		this.contrato =  new Contrato();
	}
	
	public void salvar(){
		ContratoRN contratoRN = new ContratoRN();
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	
}

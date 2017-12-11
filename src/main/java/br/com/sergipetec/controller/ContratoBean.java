package br.com.sergipetec.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sergipetec.dao.ContratoRN;
import br.com.sergipetec.model.Contrato;
import br.com.sergipetec.model.Usuario;

@ManagedBean(name = "contratoBean")
@RequestScoped
public class ContratoBean {
	private Contrato contrato;
	
	public ContratoBean(){
		this.contrato =  new Contrato();
	}
	
	public void salvar(){
		ContratoRN contratoRN = new ContratoRN();
//		Usuario usuario =  new Usuario();
//		usuario.setEmail("luiz@hotmail.com");
//		usuario.setSenha("123123");
//		usuario.setId(1);
//		contrato.setUsuario(usuario);
//		contratoRN.salvar(contrato);
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	
}

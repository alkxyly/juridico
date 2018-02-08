package br.com.sergipetec.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.sergipetec.dao.ContratoRN;
import br.com.sergipetec.dao.FuncionarioRN;
import br.com.sergipetec.model.Contrato;
import br.com.sergipetec.model.Funcionario;
import br.com.sergipetec.model.Usuario;

@ManagedBean(name = "contratoBean")
@ViewScoped
public class ContratoBean {
	private Contrato contrato;
	private List<Funcionario> funcionarios;
	private List<Funcionario> gestores;
	private List<Contrato> contratos;
	private Contrato contratoSelecionado = new Contrato();

	public ContratoBean(){
		ContratoRN contratoRN = new ContratoRN();	
		this.contrato =  new Contrato();
		this.funcionarios = new ArrayList<Funcionario>();
		this.gestores = new ArrayList<Funcionario>();
		this.contrato.setUsuario((Usuario) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("usuario"));
		this.contratos = contratoRN.listarContratos();
//		this.contratoSelecionado =  new Contrato();
	}

	public void salvar(){
		ContratoRN contratoRN = new ContratoRN();
		try {
			contratoRN.salvar(contrato);
			contrato =  new Contrato();
			FacesContext.getCurrentInstance().addMessage("xxx", new FacesMessage("Novo contrato cadastrado com sucesso!"));
			return "consultarContrato?faces-redirect=true";
		} catch (Exception e) {
		}

	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public List<Funcionario> getFuncionarios() {
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		this.funcionarios = funcionarioRN.listarFuncionarios();
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Funcionario> getGestores() {
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		this.gestores = funcionarioRN.listarGestores();
		return gestores;
	}

	public void setGestores(List<Funcionario> gestores) {
		this.gestores = gestores;
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

	public Contrato getContratoSelecionado() {
		return contratoSelecionado;
	}

	public void setContratoSelecionado(Contrato contratoSelecionado) {
		this.contratoSelecionado = contratoSelecionado;
	}


}

package br.com.sergipetec.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sergipetec.dao.FuncionarioRN;
import br.com.sergipetec.model.Funcionario;

@ManagedBean(name = "funcionarioBean")
@RequestScoped
public class FuncionarioBean {
	private Funcionario funcionario;

	public FuncionarioBean(){
		this.funcionario = new Funcionario();
	}
	
	public String novo(){
		return "funcionario.jsf?faces-redirect=true";
	}
	
	public String salvar(){
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		funcionarioRN.salvar(funcionario);
		return "consultarFuncionario.jsf?faces-redirect=true";
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}

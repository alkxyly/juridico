package br.com.sergipetec.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sergipetec.dao.FuncionarioRN;
import br.com.sergipetec.model.Funcionario;

@ManagedBean(name = "funcionarioBean")
@RequestScoped
public class FuncionarioBean {
	private Funcionario funcionario;
	private List<Funcionario> listaFuncionarios;

	public FuncionarioBean(){
		this.funcionario = new Funcionario();
		this.listaFuncionarios = new ArrayList<Funcionario>();
	}
	
	public String salvar(){
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		funcionarioRN.salvar(funcionario);
		return "consultarFuncionario?faces-redirect=true";
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Funcionario> getListaFuncionarios() {
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		listaFuncionarios = funcionarioRN.listar();
		return listaFuncionarios;
	}

	public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
}

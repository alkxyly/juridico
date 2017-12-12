package br.com.sergipetec.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sergipetec.dao.ContratoRN;
import br.com.sergipetec.dao.FuncionarioRN;
import br.com.sergipetec.model.Contrato;
import br.com.sergipetec.model.Funcionario;

@ManagedBean(name = "contratoBean")
@RequestScoped
public class ContratoBean {
	private Contrato contrato;
	private List<Funcionario> funcionarios;
	private List<Funcionario> gestores;
	
	public ContratoBean(){
		this.contrato =  new Contrato();
		this.funcionarios = new ArrayList<Funcionario>();
		this.gestores = new ArrayList<Funcionario>();
	}
	
	public void salvar(){
		ContratoRN contratoRN = new ContratoRN();
		System.out.println("Clicou");
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
}

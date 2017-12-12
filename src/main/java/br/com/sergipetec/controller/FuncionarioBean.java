package br.com.sergipetec.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sergipetec.dao.ContratoRN;
import br.com.sergipetec.model.Contrato;
import br.com.sergipetec.model.Usuario;

@ManagedBean(name = "funcionarioBean")
@RequestScoped
public class FuncionarioBean {
	//private Contrato contrato;
	
	public FuncionarioBean(){
		//this.contrato =  new FuncionarioBean();
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

	
	
}

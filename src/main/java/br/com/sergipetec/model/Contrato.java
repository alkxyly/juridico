package br.com.sergipetec.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_contrato")
public class Contrato implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5928138367585974122L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private String numeroContrato;
	private double valorContrato;
	@Temporal(TemporalType.DATE )
	private Date dataInicio;
	@Temporal(TemporalType.DATE )
	private Date dataFim;
	private String objeto;
	private String empresa;
	private String fonteRecurso;
	
	@ManyToOne
	@JoinColumn(name = "cod_usuario")
	private Usuario usuario;
	
	@OneToOne
	@PrimaryKeyJoinColumn(name = "id")
	private Funcionario gestor;
	@OneToOne
	@PrimaryKeyJoinColumn(name = "id")
	private Funcionario funcionario;
	
	public void Contrato(){
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public double getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public String getObjeto() {
		return objeto;
	}


	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}


	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getFonteRecurso() {
		return fonteRecurso;
	}


	public void setFonteRecurso(String fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
	}


	public Funcionario getGestor() {
		return gestor;
	}


	public void setGestor(Funcionario gestor) {
		this.gestor = gestor;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
}

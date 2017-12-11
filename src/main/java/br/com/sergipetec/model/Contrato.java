package br.com.sergipetec.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	private Date dataincio;
	private Date dataFim;
	private String observacao;
	private String empresa;
	
	@ManyToOne
	@JoinColumn(name = "cod_usuario")
	private Usuario usuario;
	
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
	public Date getDataincio() {
		return dataincio;
	}
	public void setDataincio(Date dataincio) {
		this.dataincio = dataincio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
	
	
	
	
}

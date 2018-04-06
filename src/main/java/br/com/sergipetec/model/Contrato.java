package br.com.sergipetec.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
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

	private static final long serialVersionUID = -5928138367585974122L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private String numeroContrato;
	private Double valorContrato;
	@Temporal(TemporalType.DATE )
	private Date dataInicio;
	@Temporal(TemporalType.DATE )
	private Date dataFim;
	@Column(length = 2048)
	private String objeto;
	private String empresa;
	private String fonteRecurso;
	
	@ManyToOne
	@JoinColumn(name = "cod_usuario")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "id_gestor")
	private Funcionario gestor;
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario")
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
	public Double getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(Double valorContrato) {
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFim == null) ? 0 : dataFim.hashCode());
		result = prime * result
				+ ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((fonteRecurso == null) ? 0 : fonteRecurso.hashCode());
		result = prime * result
				+ ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((gestor == null) ? 0 : gestor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((numeroContrato == null) ? 0 : numeroContrato.hashCode());
		result = prime * result + ((objeto == null) ? 0 : objeto.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorContrato);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (dataFim == null) {
			if (other.dataFim != null)
				return false;
		} else if (!dataFim.equals(other.dataFim))
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (fonteRecurso == null) {
			if (other.fonteRecurso != null)
				return false;
		} else if (!fonteRecurso.equals(other.fonteRecurso))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (gestor == null) {
			if (other.gestor != null)
				return false;
		} else if (!gestor.equals(other.gestor))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroContrato == null) {
			if (other.numeroContrato != null)
				return false;
		} else if (!numeroContrato.equals(other.numeroContrato))
			return false;
		if (objeto == null) {
			if (other.objeto != null)
				return false;
		} else if (!objeto.equals(other.objeto))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (Double.doubleToLongBits(valorContrato) != Double
				.doubleToLongBits(other.valorContrato))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Contrato [id=" + id + ", numeroContrato=" + numeroContrato + ", valorContrato=" + valorContrato
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", objeto=" + objeto + ", empresa=" + empresa
				+ ", fonteRecurso=" + fonteRecurso + ", usuario=" + usuario.getEmail() + ", gestor=" + gestor.getNome() + ", funcionario="
				+ funcionario.getEmail() + "]";
	}
	
}

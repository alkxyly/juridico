package br.com.sergipetec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 3606975550828545319L;
	@Id
	@GeneratedValue
	@Column(name = "cod_usuario")
	private Integer id;
	private String email;
	private String senha;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}

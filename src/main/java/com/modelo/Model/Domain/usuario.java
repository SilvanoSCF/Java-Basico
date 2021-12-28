package com.modelo.Model.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class usuario extends GenericDomain {
	@Column(length = 32, nullable = false)
	private String senha;
	
	@Column(nullable = false)
	private Character tipo;
	
	@Column(nullable = false)
	private Boolean ativo;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private pessoa pessoa;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public pessoa getpessoa() {
		return pessoa;
	}

	public void setpessoa(pessoa pessoa) {
		this.pessoa = pessoa;
	}
}

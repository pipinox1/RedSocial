package com.eduardo.redSocial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Departamento")
public class Departamento {
	
	@Column(name = "iddepartamento")
	@Id
	private int iddepartamento;
	
	@Column(name = "nombredepartamento")
	private String nombredepartamento;
	
	public Departamento() {}

	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombredepartamento() {
		return nombredepartamento;
	}

	public void setNombredepartamento(String nombredepartamento) {
		this.nombredepartamento = nombredepartamento;
	}

	

	
	
}

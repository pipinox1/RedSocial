package com.eduardo.redSocial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Departamento")
public class Departamento {
	
	@Column(name = "iddepartamento")
	private String idDepartamento;
	
	@Column(name = "nombredepartamento")
	private String nombreDepartamento;
	
	public Departamento() {}
	
	

	public Departamento(String idDepartamento, String nombreDepartamento) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombreDepartamento = nombreDepartamento;
	}



	public String getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	
	

	
	
}

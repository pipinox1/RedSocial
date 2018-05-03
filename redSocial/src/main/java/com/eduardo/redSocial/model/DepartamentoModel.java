package com.eduardo.redSocial.model;

import javax.persistence.Column;

public class DepartamentoModel {


	
	private String idDepartamento;
	
	
	private String nombreDepartamento;
	
	public DepartamentoModel() {}
	
	

	public DepartamentoModel(String idDepartamento, String nombreDepartamento) {
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

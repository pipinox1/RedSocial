package com.eduardo.redSocial.model;

import javax.persistence.Column;

public class DepartamentoModel {


	
	private int iddepartamento;
	
	
	private String nombredepartamento;
	
	public DepartamentoModel() {}

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

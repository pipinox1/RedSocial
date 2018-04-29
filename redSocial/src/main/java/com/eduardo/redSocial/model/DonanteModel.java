package com.eduardo.redSocial.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.eduardo.redSocial.entity.GrupoSanguineo;
import com.eduardo.redSocial.entity.UserRole;

public class DonanteModel {
	
	
	private String nombredonante;
		
	private int iddonante;	
	
	private GrupoSanguineo grupodonante;	
	
	private String userdonante;
	
	private String passdonante;
	
	private Set<UserRole> userRole = new HashSet<UserRole>();
	
	public Set<UserRole> getUserRole() {
		return userRole;
	}



	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}



	public DonanteModel() {}
	
	

	public DonanteModel(String nombredonante, int iddonante, GrupoSanguineo grupodonante, String userdonante,
			String passdonante) {
		super();
		this.nombredonante = nombredonante;
		this.iddonante = iddonante;
		this.grupodonante = grupodonante;
		this.userdonante = userdonante;
		this.passdonante = passdonante;
	}



	public String getNombredonante() {
		return nombredonante;
	}

	public void setNombredonante(String nombredonante) {
		this.nombredonante = nombredonante;
	}

	public int getIddonante() {
		return iddonante;
	}

	public void setIddonante(int iddonante) {
		this.iddonante = iddonante;
	}

	public GrupoSanguineo getGrupodonante() {
		return grupodonante;
	}

	public void setGrupodonante(GrupoSanguineo grupodonante) {
		this.grupodonante = grupodonante;
	}

	public String getUserdonante() {
		return userdonante;
	}

	public void setUserdonante(String userdonante) {
		this.userdonante = userdonante;
	}

	public String getPassdonante() {
		return passdonante;
	}

	public void setPassdonante(String passdonante) {
		this.passdonante = passdonante;
	}
	
	
	

}

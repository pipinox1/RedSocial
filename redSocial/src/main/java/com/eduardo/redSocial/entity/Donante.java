package com.eduardo.redSocial.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="donante")
public class Donante {

	@Column(name="nombre")
	private String nombredonante;
	
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="iddonante", unique = true, nullable = false)
	//private int iddonante;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iddepartamento")
	private Departamento departamentodonante;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idgrupo")
	private GrupoSanguineo grupodonante;
	
	@Id
	@Column(name="user", unique = true, nullable = false, length = 45)
	private String userdonante;
	
	@Column(name="password", unique = true, nullable = false, length = 60)
	private String passdonante;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="user")
	private Set<UserRole> userRole = new HashSet<UserRole>();

	public Donante() {}

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

	public Donante( String nombredonante,   GrupoSanguineo grupodonante,
			String userdonante, String passdonante, Set<UserRole> userRole) {
		super();
		this.nombredonante = nombredonante;
		
		this.grupodonante = grupodonante;
		this.userdonante = userdonante;
		this.passdonante = passdonante;
		this.userRole = userRole;
	}

	public String getNombredonante() {
		return nombredonante;
	}

	public void setNombredonante(String nombredonante) {
		this.nombredonante = nombredonante;
	}

	

	public GrupoSanguineo getGrupodonante() {
		return grupodonante;
	}

	public void setGrupodonante(GrupoSanguineo grupodonante) {
		this.grupodonante = grupodonante;
	}

	public Departamento getDepartamentodonante() {
		return departamentodonante;
	}

	public void setDepartamentodonante(Departamento departamentodonante) {
		this.departamentodonante = departamentodonante;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		
		this.userRole = userRole;
	}
	
	
	
	
	
	
}

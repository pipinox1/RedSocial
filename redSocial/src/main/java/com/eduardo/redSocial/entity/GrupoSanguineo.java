package com.eduardo.redSocial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gruposanguineo")
public class GrupoSanguineo {
	
	
	
	@Column(name="nombre")
	private String nombregruposanguineo;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="idgrupo")
	private int idgruposanguineo;


	public GrupoSanguineo() {}
	
	public GrupoSanguineo(String nombregruposanguineo, int idgruposanguineo) {
		super();
		this.nombregruposanguineo = nombregruposanguineo;
		this.idgruposanguineo = idgruposanguineo;
	}


	public String getNombregruposanguineo() {
		return nombregruposanguineo;
	}


	public void setNombregruposanguineo(String nombregruposanguineo) {
		this.nombregruposanguineo = nombregruposanguineo;
	}


	public int getIdgruposanguineo() {
		return idgruposanguineo;
	}


	public void setIdgruposanguineo(int idgruposanguineo) {
		this.idgruposanguineo = idgruposanguineo;
	}
	
	

	
	
	
	
	

}

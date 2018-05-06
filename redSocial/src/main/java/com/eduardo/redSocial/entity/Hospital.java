package com.eduardo.redSocial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="nombrehospital")
	private String nombrehospital;
	
	
	@JoinColumn(name = "iddepartamento", unique = true)
	@OneToOne(fetch=FetchType.LAZY)
	private Departamento departamento;
	
	@Id
	@Column(name="idhospital")
	private int idHospital;
	
	public Hospital() {}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombrehospital() {
		return nombrehospital;
	}

	public void setNombrehospital(String nombrehospital) {
		this.nombrehospital = nombrehospital;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public int getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(int idHospital) {
		this.idHospital = idHospital;
	}
	
	
	
	

}

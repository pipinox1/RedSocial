package com.eduardo.redSocial.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="solicitudDonacion")
public class SolicitudDonacion {
	
	@Id
	@GeneratedValue( generator = "generador_propietario_hibernate_increment" )
	 @org.hibernate.annotations.GenericGenerator(
	     name = "generador_propietario_hibernate_increment",
	     strategy = "increment"
	 )
	@Column(name="numerosolicitud" , unique = true)
	private int numerosolicitud;
	
	@JoinColumn(name = "user", unique = true)
	@OneToOne(fetch=FetchType.LAZY)
	private Donante donantesolicitud;
	
	@JoinColumn(name = "idhospital", unique = true)
	@OneToOne(fetch=FetchType.LAZY)
	private Hospital hospitalsolicitud;
	

	@JoinColumn(name = "idgrupo", unique = true)
	@OneToOne(fetch=FetchType.LAZY)
	private GrupoSanguineo gruposanguineosolicitud;
	
	
	@Column(name="fechasolicitud")
	@DateTimeFormat (iso = ISO.DATE)
	private Date fechasolicitud;
	
	
	@DateTimeFormat(iso = ISO.TIME)
	@Column(name="horasolicitd")
	private Time horasolicitud;
	
	@Column(name="anexos")
	private String anexos;
	
	public SolicitudDonacion() {}

	public int getNumerosolicitud() {
		return numerosolicitud;
	}

	public void setNumerosolicitud(int numerosolicitud) {
		this.numerosolicitud = numerosolicitud;
	}

	public Donante getDonantesolicitud() {
		return donantesolicitud;
	}

	public void setDonantesolicitud(Donante donantesolicitud) {
		this.donantesolicitud = donantesolicitud;
	}

	public Hospital getHospitalsolicitud() {
		return hospitalsolicitud;
	}

	public void setHospitalsolicitud(Hospital hospitalsolicitud) {
		this.hospitalsolicitud = hospitalsolicitud;
	}

	public GrupoSanguineo getGruposanguineosolicitud() {
		return gruposanguineosolicitud;
	}

	public void setGruposanguineosolicitud(GrupoSanguineo gruposanguineosolicitud) {
		this.gruposanguineosolicitud = gruposanguineosolicitud;
	}

	public Date getFechasolicitud() {
		return fechasolicitud;
	}

	public void setFechasolicitud(Date fechasolicitud) {
		this.fechasolicitud = fechasolicitud;
	}

	public Time getHorasolicitud() {
		return horasolicitud;
	}

	public void setHorasolicitud(Time horasolicitud) {
		this.horasolicitud = horasolicitud;
	}

	public String getAnexos() {
		return anexos;
	}

	public void setAnexos(String anexos) {
		this.anexos = anexos;
	}
	
	
	
	

}

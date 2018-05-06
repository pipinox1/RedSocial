package com.eduardo.redSocial.model;

import java.sql.Time;
import java.util.Date;



public class SolicitudDonacionModel {
	
	
	private int numerosolicitud;
	
	private DonanteModel donantesolicitud;
	
	
	private HospitalModel hospitalsolicitud;
	

	
	private GrupoSanguineoModel gruposanguineosolicitud;
	
	
	private Date fechasolicitud;
	
	
	private Time horasolicitud;
	
	
	private String anexos;

	
	public SolicitudDonacionModel() {}

	

	public SolicitudDonacionModel(int numerosolicitud, DonanteModel donantesolicitud, HospitalModel hospitalsolicitud,
			GrupoSanguineoModel gruposanguineosolicitud, Date fechasolicitud, Time horasolicitud, String anexos) {
		super();
		this.numerosolicitud = numerosolicitud;
		this.donantesolicitud = donantesolicitud;
		this.hospitalsolicitud = hospitalsolicitud;
		this.gruposanguineosolicitud = gruposanguineosolicitud;
		this.fechasolicitud = fechasolicitud;
		this.horasolicitud = horasolicitud;
		this.anexos = anexos;
	}



	public int getNumerosolicitud() {
		return numerosolicitud;
	}


	public void setNumerosolicitud(int numerosolicitud) {
		this.numerosolicitud = numerosolicitud;
	}


	public DonanteModel getDonantesolicitud() {
		return donantesolicitud;
	}


	public void setDonantesolicitud(DonanteModel donantesolicitud) {
		this.donantesolicitud = donantesolicitud;
	}


	public HospitalModel getHospitalsolicitud() {
		return hospitalsolicitud;
	}


	public void setHospitalsolicitud(HospitalModel hospitalsolicitud) {
		this.hospitalsolicitud = hospitalsolicitud;
	}


	public GrupoSanguineoModel getGruposanguineosolicitud() {
		return gruposanguineosolicitud;
	}


	public void setGruposanguineosolicitud(GrupoSanguineoModel gruposanguineosolicitud) {
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

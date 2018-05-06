package com.eduardo.redSocial.model;



public class HospitalModel {

	
	private String direccion;
	private String nombrehospital;
	private DepartamentoModel departamento;
	private int idHospital;
	
	public HospitalModel() {}
	
	
	public HospitalModel(String direccion, String nombrehospital, DepartamentoModel departamento, int idHospital) {
		super();
		this.direccion = direccion;
		this.nombrehospital = nombrehospital;
		this.departamento = departamento;
		this.idHospital = idHospital;
	}


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
	public DepartamentoModel getDepartamento() {
		return departamento;
	}
	public void setDepartamento(DepartamentoModel departamento) {
		this.departamento = departamento;
	}
	public int getIdHospital() {
		return idHospital;
	}
	public void setIdHospital(int idHospital) {
		this.idHospital = idHospital;
	}
	
	
	
}

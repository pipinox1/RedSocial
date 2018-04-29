package com.eduardo.redSocial.model;

public class GrupoSanguineoModel {

	private String nombregruposanguineo;

	private int idgruposanguineo;

	public GrupoSanguineoModel() {
	}

	public GrupoSanguineoModel(String nombregruposanguineo, int idgruposanguineo) {
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

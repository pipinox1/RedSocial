package com.eduardo.redSocial.component;

import org.springframework.stereotype.Component;


import com.eduardo.redSocial.entity.GrupoSanguineo;

import com.eduardo.redSocial.model.GrupoSanguineoModel;

@Component("converterGrupoSanguineo")
public class GrupoSanguineoConverter {
	
	
	public GrupoSanguineo converteToGrupoSanguineo(GrupoSanguineoModel  grupoSanguineoModel) {
	
		GrupoSanguineo gruposanguineo = new GrupoSanguineo();
		gruposanguineo.setIdgruposanguineo(grupoSanguineoModel.getIdgruposanguineo());
		gruposanguineo.setNombregruposanguineo(grupoSanguineoModel.getNombregruposanguineo());
	return gruposanguineo;
	}

	public GrupoSanguineoModel converteToGrupoSanguineoModel(GrupoSanguineo  gruposanguineo) {
		
		GrupoSanguineoModel grupoSanguineoModel = new GrupoSanguineoModel();
		grupoSanguineoModel.setIdgruposanguineo(gruposanguineo.getIdgruposanguineo());
		grupoSanguineoModel.setNombregruposanguineo(gruposanguineo.getNombregruposanguineo());
	return grupoSanguineoModel;
	}



}

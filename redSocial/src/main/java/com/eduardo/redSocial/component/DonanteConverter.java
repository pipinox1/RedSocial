package com.eduardo.redSocial.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.eduardo.redSocial.entity.Donante;
import com.eduardo.redSocial.model.DonanteModel;

@Component("donanteConverter")
public class DonanteConverter {
	
	@Autowired
	@Qualifier("converterDepartamento")
	private DepartamentoConverte converterDpto;
	
	@Autowired
	@Qualifier("converterGrupoSanguineo")
	private GrupoSanguineoConverter converterGrupo;
	
	public Donante converteToDonante(DonanteModel  donantemodel) {
		Donante donante = new Donante();
		donante.setGrupodonante(converterGrupo.converteToGrupoSanguineo(donantemodel.getGrupodonante()));
		donante.setNombredonante(donantemodel.getNombredonante());
		donante.setDepartamentodonante(converterDpto.convertToDepartamento(donantemodel.getDepartamentodonante()));
		donante.setPassdonante(donantemodel.getPassdonante());
		donante.setUserdonante(donantemodel.getUserdonante());
		donante.setUserRole(donantemodel.getUserRole());
	return donante;
	}

	public DonanteModel convertToDonanteModel(Donante donante) {
	
		DonanteModel donanteModel = new DonanteModel();
		donanteModel.setGrupodonante(converterGrupo.converteToGrupoSanguineoModel(donante.getGrupodonante()));
		donanteModel.setDepartamentodonante(converterDpto.convertToDepartamentoMode(donante.getDepartamentodonante()));
		donanteModel.setNombredonante(donante.getNombredonante());
		donanteModel.setPassdonante(donante.getPassdonante());
		donanteModel.setUserdonante(donante.getUserdonante());
		donanteModel.setUserRole(donante.getUserRole());
		
	return donanteModel;
	}

}

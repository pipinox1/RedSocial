package com.eduardo.redSocial.component;

import org.springframework.stereotype.Component;

import com.eduardo.redSocial.entity.Donante;
import com.eduardo.redSocial.model.DonanteModel;

@Component("donanteConverter")
public class DonanteConverter {
	
	public Donante converteToDonante(DonanteModel  donantemodel) {
		Donante donante = new Donante();
		donante.setGrupodonante(donantemodel.getGrupodonante());
		donante.setNombredonante(donantemodel.getNombredonante());
		donante.setPassdonante(donantemodel.getPassdonante());
		donante.setUserdonante(donantemodel.getUserdonante());
		donante.setUserRole(donantemodel.getUserRole());
	return donante;
	}

	public DonanteModel convertToDonanteModel(Donante donante) {
	
		DonanteModel donanteModel = new DonanteModel();
		donanteModel.setGrupodonante(donante.getGrupodonante());
		donanteModel.setNombredonante(donante.getNombredonante());
		donanteModel.setPassdonante(donante.getPassdonante());
		donanteModel.setUserdonante(donante.getUserdonante());
		donanteModel.setUserRole(donante.getUserRole());
		
	return donanteModel;
	}

}

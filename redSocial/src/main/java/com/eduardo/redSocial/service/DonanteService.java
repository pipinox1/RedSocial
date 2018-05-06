package com.eduardo.redSocial.service;


import org.springframework.stereotype.Service;

import com.eduardo.redSocial.entity.Donante;
import com.eduardo.redSocial.model.DonanteModel;
@Service
public interface DonanteService {

	
	public Donante addDonante(DonanteModel donantemodel);
	public Donante addDonante(DonanteModel donantemodel, int idGrupoSanguineo,int idDepartamento);
	
	//public boolean loginDonante(String user,String pass);
	
	public DonanteModel buscarDonanteporUser(String username);
}

package com.eduardo.redSocial.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eduardo.redSocial.component.GrupoSanguineoConverter;
import com.eduardo.redSocial.entity.GrupoSanguineo;
import com.eduardo.redSocial.model.GrupoSanguineoModel;
import com.eduardo.redSocial.repository.GrupoSanguineoRepository;
import com.eduardo.redSocial.service.GrupoSanguineoService;

@Service("gruposanguineoServicesImplements")
public class GrupoSanguineoServiceImpl implements GrupoSanguineoService{

	@Autowired
	@Qualifier("grupoSanguineoRepository")
	private GrupoSanguineoRepository gruposanguineoRepository;
	
	@Autowired
	@Qualifier("converterGrupoSanguineo")
	private GrupoSanguineoConverter gruposanguineoConverter;
	
	
	@Override
	public List<GrupoSanguineoModel> getAllGrup() {
		
		List<GrupoSanguineoModel> listaGrupo = new ArrayList<>();
		for(GrupoSanguineo grupo : gruposanguineoRepository.findAll()) {
			listaGrupo.add(gruposanguineoConverter.converteToGrupoSanguineoModel(grupo));
			
		}
		
	return listaGrupo;
		
	}
	
	public GrupoSanguineoModel searchByID(int id) {
		
		
		return gruposanguineoConverter.converteToGrupoSanguineoModel(gruposanguineoRepository.findByIdgruposanguineo(id));
		
	}
	
	
	
	

}

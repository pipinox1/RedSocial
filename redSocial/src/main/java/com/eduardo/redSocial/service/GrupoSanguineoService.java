package com.eduardo.redSocial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eduardo.redSocial.entity.GrupoSanguineo;
import com.eduardo.redSocial.model.GrupoSanguineoModel;

@Service
public interface GrupoSanguineoService {
	
	public List<GrupoSanguineoModel> getAllGrup();
	
	public GrupoSanguineoModel searchByID(int id);

}

package com.eduardo.redSocial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.redSocial.model.DepartamentoModel;
import com.eduardo.redSocial.model.GrupoSanguineoModel;

@Service
public interface DepartamentoService {

	
	public List<DepartamentoModel> getAllDepartamentos();
	
	public DepartamentoModel searchByID(int id);
}

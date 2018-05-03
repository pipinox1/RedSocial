package com.eduardo.redSocial.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.eduardo.redSocial.component.DepartamentoConverte;
import com.eduardo.redSocial.entity.Departamento;
import com.eduardo.redSocial.model.DepartamentoModel;
import com.eduardo.redSocial.repository.DepartamentoRepository;
import com.eduardo.redSocial.service.DepartamentoService;;

public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	@Qualifier("departamentoRepository")
	private DepartamentoRepository departamentoRepository;
	
	@Autowired
	@Qualifier("converterDepartamento")
	private DepartamentoConverte departamentoconverter;
	public List<DepartamentoModel> getAllDepartamentos(){
		
		List<DepartamentoModel> departamentolist = new ArrayList<>();
		
		for (Departamento depto : departamentoRepository.findAll()) {
			
			departamentolist.add(departamentoconverter.convertToDepartamentoMode(depto));
			
			
		}
		
		
		
		return departamentolist;
	}
	
	
	
	
	
	

}

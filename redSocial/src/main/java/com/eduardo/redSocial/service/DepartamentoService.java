package com.eduardo.redSocial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.redSocial.model.DepartamentoModel;

@Service
public interface DepartamentoService {

	
	public List<DepartamentoModel> getAllDepartamentos();
}

package com.eduardo.redSocial.component;

import org.springframework.stereotype.Component;

import com.eduardo.redSocial.entity.Departamento;
import com.eduardo.redSocial.model.DepartamentoModel;


@Component("converterDepartamento")
public class DepartamentoConverte {
	
	public Departamento convertToDepartamento(DepartamentoModel departamentomodel) {
		
		Departamento departamento = new Departamento();
		
		departamento.setIdDepartamento(departamentomodel.getIdDepartamento());
		departamento.setNombreDepartamento(departamentomodel.getNombreDepartamento());
		
		return departamento;
		
		
	}
	
	public DepartamentoModel convertToDepartamentoMode(Departamento departamento) {
		
		DepartamentoModel departamentomodel = new DepartamentoModel();
		
		departamentomodel.setIdDepartamento(departamento.getIdDepartamento());
		departamentomodel.setNombreDepartamento(departamento.getNombreDepartamento());
		
		return departamentomodel;
		
		
	}

}

package com.eduardo.redSocial.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.eduardo.redSocial.entity.Hospital;
import com.eduardo.redSocial.model.HospitalModel;

@Component("hospitalConverter")
public class HospitalConverter {

	@Autowired
	@Qualifier("converterDepartamento")
	private DepartamentoConverte converterDepartamento;
	public HospitalModel convertToHospitalModel(Hospital hospital) {
		
		HospitalModel hospitalModel = new HospitalModel();
		hospitalModel.setDepartamento(converterDepartamento.convertToDepartamentoMode(hospital.getDepartamento()));
		hospitalModel.setDireccion(hospital.getDireccion());
		hospitalModel.setIdHospital(hospital.getIdHospital());
		hospitalModel.setNombrehospital(hospital.getNombrehospital());
		
		return hospitalModel;
	}
	
	public Hospital converToHospital(HospitalModel hospitalmodel) {
		Hospital hospital = new Hospital();
		hospital.setDepartamento(converterDepartamento.convertToDepartamento(hospitalmodel.getDepartamento()));
		hospital.setDireccion(hospitalmodel.getDireccion());
		hospital.setIdHospital(hospitalmodel.getIdHospital());
		hospital.setNombrehospital(hospitalmodel.getNombrehospital());
		
		return hospital;
	}
}

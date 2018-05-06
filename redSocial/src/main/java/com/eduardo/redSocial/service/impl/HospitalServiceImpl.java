package com.eduardo.redSocial.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eduardo.redSocial.component.HospitalConverter;
import com.eduardo.redSocial.entity.Hospital;
import com.eduardo.redSocial.model.HospitalModel;
import com.eduardo.redSocial.repository.HospitalRepository;
import com.eduardo.redSocial.service.HospitalService;

@Service("hospitalServiceImpl")
public class HospitalServiceImpl implements  HospitalService {

	@Autowired
	@Qualifier("hospitalRepository")
	private HospitalRepository hospitalrepository;
	
	@Autowired
	@Qualifier("hospitalConverter")
	private HospitalConverter hospitalConverter;
	
	@Override
	public List<HospitalModel> getAllHospita() {
		List<HospitalModel> listahospital = new ArrayList<>();
		
		for(Hospital hospital: hospitalrepository.findAll()) {
			
			listahospital.add(hospitalConverter.convertToHospitalModel(hospital));
		}
		
		return listahospital;
	}

}

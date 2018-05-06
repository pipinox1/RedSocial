package com.eduardo.redSocial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.redSocial.model.HospitalModel;
@Service
public interface HospitalService {

	public List<HospitalModel> getAllHospita();
	
	
}

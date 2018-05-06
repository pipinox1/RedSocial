package com.eduardo.redSocial.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.redSocial.entity.Hospital;

@Repository("hospitalRepository")
public interface HospitalRepository extends JpaRepository<Hospital, Serializable> {

	
	
}

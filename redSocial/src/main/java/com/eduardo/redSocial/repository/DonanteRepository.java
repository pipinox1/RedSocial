package com.eduardo.redSocial.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.redSocial.entity.Donante;
import com.eduardo.redSocial.model.DonanteModel;

@Repository("donanteRepository")
public interface DonanteRepository extends JpaRepository<Donante, Serializable> {
	
	public Donante findByUserdonanteAndPassdonante(String user, String pass);

//	public boolean existByUserdonanteAndPassdonante(String Userdonante, String Passdonante);
	
	public Donante findByUserdonante(String userdonante);
	
	
	
}

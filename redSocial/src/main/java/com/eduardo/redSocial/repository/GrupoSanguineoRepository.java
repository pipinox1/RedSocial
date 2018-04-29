package com.eduardo.redSocial.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.redSocial.entity.GrupoSanguineo;
import com.eduardo.redSocial.model.GrupoSanguineoModel;

@Repository("grupoSanguineoRepository")
public interface GrupoSanguineoRepository extends JpaRepository<GrupoSanguineo,Serializable> {

	
	public GrupoSanguineo findByIdgruposanguineo(int id);
}

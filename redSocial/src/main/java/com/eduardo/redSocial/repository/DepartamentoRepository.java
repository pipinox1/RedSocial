package com.eduardo.redSocial.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.redSocial.entity.Departamento;

@Repository("departamentoRepository")
public interface DepartamentoRepository extends JpaRepository<Departamento,Serializable> {

	
	
}

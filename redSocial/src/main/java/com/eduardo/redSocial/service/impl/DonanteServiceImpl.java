package com.eduardo.redSocial.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.eduardo.redSocial.component.DepartamentoConverte;
import com.eduardo.redSocial.component.DonanteConverter;
import com.eduardo.redSocial.component.GrupoSanguineoConverter;
import com.eduardo.redSocial.entity.Donante;
import com.eduardo.redSocial.model.DonanteModel;
import com.eduardo.redSocial.repository.DonanteRepository;
import com.eduardo.redSocial.repository.GrupoSanguineoRepository;
import com.eduardo.redSocial.service.DepartamentoService;
import com.eduardo.redSocial.service.DonanteService;
import com.eduardo.redSocial.service.GrupoSanguineoService;

@Service("donanteServicesImplements")
public class DonanteServiceImpl implements DonanteService{
	
	private static final Log LOGGER = LogFactory.getLog(DonanteServiceImpl.class);
	
	@Autowired
	@Qualifier("donanteRepository")
	private DonanteRepository donanteRepository;
	
	@Autowired
	@Qualifier("donanteConverter")
	private DonanteConverter donanteConverter;
	
	
	@Autowired
	@Qualifier("gruposanguineoServicesImplements")
	private GrupoSanguineoService gruposanguineoService;
	
	@Autowired
	@Qualifier("converterGrupoSanguineo")
	private GrupoSanguineoConverter gruposanguineoConverter;;

	@Autowired
	@Qualifier("departamentoServiceImpl")
	private DepartamentoService departamentoService;
	
	@Autowired
	@Qualifier("converterDepartamento")
	private DepartamentoConverte departamentoConverter;
	
	
	public Donante addDonante(DonanteModel donantemodel) {
		
		
		
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		
		
		String passwordcrip = pe.encode(donantemodel.getPassdonante());
		
		donantemodel.setPassdonante(passwordcrip);
		
		
		LOGGER.info("METHOD: addCourse()");		
		
		
		return donanteRepository.save(donanteConverter.converteToDonante(donantemodel));		
	}

	@Override
	public Donante addDonante(DonanteModel donantemodel,int idGrupoSanguineo,int idDepartamento) {
		
		
		
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		
		
		String passwordcrip = pe.encode(donantemodel.getPassdonante());
		
		donantemodel.setPassdonante(passwordcrip);
		
		
		donantemodel.setGrupodonante(gruposanguineoService.searchByID(idGrupoSanguineo));
		
		donantemodel.setDepartamentodonante(departamentoService.searchByID(idDepartamento));
		
		LOGGER.info("METHOD: addCourse()");		
		
		
		return donanteRepository.save(donanteConverter.converteToDonante(donantemodel));		
	}

	//@Override
	//public boolean loginDonante(String user, String pass) {
		

	//	if(donanteRepository.existByUserdonanteAndPassdonante(user, pass)) {
			
	//		return true;
	//	}
		
	//	return false;
	//}
	
	

}

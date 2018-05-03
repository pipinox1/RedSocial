package com.eduardo.redSocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eduardo.redSocial.constant.Constantes;
import com.eduardo.redSocial.entity.Donante;
import com.eduardo.redSocial.model.DonanteModel;
import com.eduardo.redSocial.service.DonanteService;
import com.eduardo.redSocial.service.GrupoSanguineoService;

@Controller
@RequestMapping("/registrar")
public class RegisterController {
	
	@Autowired
	@Qualifier("donanteServicesImplements")
	private DonanteService donanteService;

	@Autowired
	@Qualifier("gruposanguineoServicesImplements")
	private GrupoSanguineoService gruposanguineoService;
	
	
	@GetMapping("/showFormDonante")
	
	public String showform(Model modelo) {
		
		modelo.addAttribute("donante", new DonanteModel());				
		modelo.addAttribute("gruposSanguineo", gruposanguineoService.getAllGrup());
		modelo.addAttribute("listaDepartamentos",new)
		return Constantes.VIEW_REGISTER;
	}
	
	
	@PostMapping("/addDonante")
	public String addDonante(@ModelAttribute(name="donante") DonanteModel donantenuevo,@RequestParam(name="idGrupoSanguineo") int IDgruposanguineo ) {
		

		donanteService.addDonante(donantenuevo,IDgruposanguineo);
		
		
		return Constantes.VIEW_OKREGISTER;
	}
	
}

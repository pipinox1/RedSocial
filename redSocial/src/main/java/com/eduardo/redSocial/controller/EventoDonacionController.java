package com.eduardo.redSocial.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduardo.redSocial.model.SolicitudDonacionModel;
import com.eduardo.redSocial.service.DepartamentoService;
import com.eduardo.redSocial.service.HospitalService;
import com.eduardo.redSocial.service.impl.DonanteServiceImpl;
import com.eduardo.redSocial.service.impl.GrupoSanguineoServiceImpl;



@Controller
@RequestMapping("/control")
@PreAuthorize("hasRole('ROLE_USERLOG')")
public class EventoDonacionController {
	
	@Autowired
	@Qualifier("hospitalServiceImpl")
	private HospitalService servicehospital;

	@Autowired
	@Qualifier("donanteServicesImplements")
	private DonanteServiceImpl donanteService;
	
	@GetMapping("/solicitarDonacion")
	public String crearSolicitudDonacion(Model model) {
		model.addAttribute("solicitud", new SolicitudDonacionModel());
		model.addAttribute("listahospital", servicehospital.getAllHospita());
		User activeUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("donante",donanteService.buscarDonanteporUser(activeUser.getUsername()));
		
		
		
		return "formularioSolicitud";
	}

}

package com.eduardo.redSocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eduardo.redSocial.constant.Constantes;

@Controller
public class LoginController {

	// @Autowired
	// @Qualifier("donanteServicesImplements")
	// private DonanteService donanteService;

	@GetMapping({"/login","/"})
	public String Login(Model model, @RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout) {
		model.addAttribute("logout", logout);
		model.addAttribute("error", error);

		return Constantes.VIEW_LOGIN;
	}

	@GetMapping("/loginsucces")
	public String checkLogin() {

			return "primerVista";
			
	}
}
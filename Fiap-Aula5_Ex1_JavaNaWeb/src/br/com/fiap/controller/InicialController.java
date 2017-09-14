package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicialController {
	
	@RequestMapping("/")
	public String paginaInicial(Model m) {
		m.addAttribute("mensagem", "seja bem vindo");
		return "index";
	}

}

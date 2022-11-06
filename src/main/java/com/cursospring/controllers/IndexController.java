package com.cursospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index", "/", "/home", ""})
	public String index(Model model) {
		model.addAttribute("titulo", "Curso Spring");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Joao");
		usuario.setApellido("Jacome");
		usuario.setEmail("jjacome@");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Lista de usuarios");
		return "perfil";
	}
	
	
}

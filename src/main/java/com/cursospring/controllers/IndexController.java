package com.cursospring.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		model.addAttribute("titulo", "Perfil");
		return "perfil";
	}
	
	
	@RequestMapping("/listausuarios")
	public String listarUsuarios(Model model) {
		
		return "listausuarios";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("julian", "alvarez", "ja@gmail.com"),
				new Usuario("luisa", "cueva", "lc@gmail.com"));
		
		return usuarios;
	}
	
}

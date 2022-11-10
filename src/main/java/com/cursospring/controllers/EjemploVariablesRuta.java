package com.cursospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRuta {

	@GetMapping("/string/{texto}")
	public String variable(@PathVariable String texto, Model model) {
		model.addAttribute("resultado", "Este es el texto " + texto);
		return "varibles/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}")
	public String variable(@PathVariable String texto, @PathVariable int numero, Model model) {
		model.addAttribute("resultado", "Este es el texto " + texto + " y el numero es " + numero );
		return "varibles/ver";
	}
	
}

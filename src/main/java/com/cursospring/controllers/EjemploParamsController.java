package com.cursospring.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}
	
	@GetMapping("/string")
	public String param(@RequestParam(defaultValue = "por defecto") String texto, Model model) {
		
		model.addAttribute("resultado", "El parametro enviado es: " + texto);
		return "params/ver";
	}
	
	//Forma 1
	@GetMapping("/multi-params")
	public String multiparams(@RequestParam(defaultValue = "por defecto") String nombre,@RequestParam Integer edad, Model model) {
		model.addAttribute("resultado", "Hola me llamo " + nombre + " y tengo " + edad + " anios" );
		return "params/ver";
		
	}
	
	//Forma 2
	@GetMapping("/multi-params-http")
	public String multiparams(HttpServletRequest request, Model model) {
		String nombre = request.getParameter("nombre");
		int edad = -1;
		try {
			edad = Integer.parseInt(request.getParameter("edad"));
		}catch(Exception e) {
			edad = 0;
		}
		
		model.addAttribute("resultado", "Hola me llamo " + nombre + " y tengo " + edad + " anios" );
		return "params/ver";
		
	}
	
}

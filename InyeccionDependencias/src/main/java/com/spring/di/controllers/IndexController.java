package com.spring.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.di.models.services.IServicio;

@Controller
public class IndexController {

	@Autowired
	private IServicio servicio;
	
	/*public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}*/

	@GetMapping({"/","/index", ""})
	public String index(Model model) {
		model.addAttribute("operacion", servicio.operacion());
		return "index";
	}

	
}

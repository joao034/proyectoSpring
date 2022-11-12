package com.spring.di.models.services;

import org.springframework.stereotype.Component;

//@Component("ServicioSimple")
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		return "operacion simple";
	}
	
}

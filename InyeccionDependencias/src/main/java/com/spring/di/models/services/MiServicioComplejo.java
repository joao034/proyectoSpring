package com.spring.di.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("ServicioComplejo")
//@Primary
public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		return "operacion complicado";
	}
	
}

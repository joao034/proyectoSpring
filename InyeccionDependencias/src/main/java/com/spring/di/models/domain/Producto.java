package com.spring.di.models.domain;

import org.springframework.stereotype.Component;

public class Producto {

	public String nombre;
	public long precio;
	
	public Producto(String nombre, long precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	
	
	
}

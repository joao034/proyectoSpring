package com.spring.di.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

	@Value("{factura.descripcion}")
	private String descripcion;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	private List<ItemFactura> itemsFactura;
	
	//Ciclo de vida de un componente
	@PostConstruct
	public void init() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("Jose"));
		descripcion = descripcion.concat(" del cliente : ").concat(cliente.getNombre());
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Factura destruida ".concat(descripcion));
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemFactura> getItemsFactura() {
		return itemsFactura;
	}
	public void setItemsFactura(List<ItemFactura> itemsFactura) {
		this.itemsFactura = itemsFactura;
	}
	
	
}

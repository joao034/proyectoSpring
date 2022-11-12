package com.spring.di;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.di.models.domain.ItemFactura;
import com.spring.di.models.domain.Producto;
import com.spring.di.models.services.IServicio;
import com.spring.di.models.services.MiServicio;
import com.spring.di.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio registrarMiServicioSimple() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItemsOficina(){
		Producto p1 = new Producto("PS5", 2000);
		Producto p2  = new Producto("Camara", 800);
		
		ItemFactura i1 = new ItemFactura(p1, 2);
		ItemFactura i2 = new ItemFactura(p2, 3);
		
		return Arrays.asList(i1, i2);
		
	}
	
}

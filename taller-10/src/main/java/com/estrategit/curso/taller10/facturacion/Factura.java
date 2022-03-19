package com.estrategit.curso.taller10.facturacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Factura 
{
	protected ArrayList<String> listaString ;
	public Factura(String nombre, String cedula, String productos,String total) {
		listaString = new ArrayList<String>();
		listaString.add(nombre);
		listaString.add(cedula);
		listaString.add(productos);
		listaString.add(total);
		
		
		/*
		 * 	listaString.add("Nombre: JUAN 1");
		listaString.add("Cedula: 0909880808");
		listaString.add("Productos: leche , arroz , yodo");
		listaString.add("Total : $16.58");*/
		
	}
	
	public void getFactura() {
		//String elemn= "";
		listaString.forEach(elemento -> {
		System.out.println(elemento);
		//elemn = elemento;
		});
	
	}
	
}

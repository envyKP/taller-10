package com.estrategit.curso.taller10.facturacion;

import java.util.ArrayList;
import java.util.HashMap;
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
	public Factura(String nombre, String cedula, ArrayList<String> productos,String total) {
		listaString = new ArrayList<String>();
		listaString.add("Nombre: " + nombre);
		listaString.add("Cedula: "+ cedula);
		//listaString.add(productos);
		String cadenaP = "";
		Iterator<String> recorre = productos.iterator();
		while (recorre.hasNext()) {
			cadenaP = cadenaP +","+ recorre.next();
		}
		listaString.add("Productos: " + cadenaP);
		listaString.add("Total :" + total);
		
		
	}
	
	public Factura(HashMap<String, String>  cliente, ArrayList<String> productos,String total) {
		listaString = new ArrayList<String>();
		Iterator<String> recorreClaves = cliente.keySet().iterator(); 
		int cc=0;
		while (recorreClaves.hasNext()) {
		String claveprimaria = recorreClaves.next();
		cc++;
		System.out.println("******"+cc+"*********");
		System.out.println("cedula :"+claveprimaria);
		System.out.println("nombre :"+cliente.get(claveprimaria));
		
		}
		//listaString.add("Nombre: " + nombre);
		//listaString.add("Cedula: "+ cedula);
		//listaString.add(productos);
		String cadenaP = "";
		Iterator<String> recorre = productos.iterator();
		while (recorre.hasNext()) {
			cadenaP = cadenaP +","+ recorre.next();
		}
		listaString.add("Productos: " + cadenaP);
		listaString.add("Total :" + total);
		
		
	}
	
	public void getFactura() {
		//String elemn= "";
		listaString.forEach(elemento -> {
		System.out.println(elemento);
		//elemn = elemento;
		});
	
	}
	
}

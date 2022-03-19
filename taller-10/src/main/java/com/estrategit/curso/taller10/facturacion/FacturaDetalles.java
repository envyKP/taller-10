package com.estrategit.curso.taller10.facturacion;

import java.util.ArrayList;
import java.util.HashMap;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class FacturaDetalles {

	public FacturaDetalles() {

		/*
		 * listaString.add("Nombre: JUAN 1"); listaString.add("Cedula: 0909880808");
		 * listaString.add("Productos: leche , arroz , yodo");
		 * listaString.add("Total : $16.58");
		 */

	}
	private String nombre,cedula,productos,total;
	public Factura f;
	
	public void rellenarFactura(int i) {

		switch (i) {
		case 1:
			nombre = "Nombre: JUAN 1";
			cedula = "Cedula: 0909880808";
			productos = "Productos: leche , arroz , yodo";
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, productos, total);
			f.getFactura();
			break;
		case 2:
			nombre = "Nombre: JUAN 2";
			cedula = "Cedula: 0909880808";
			productos = "Productos: leche , arroz , yodo";
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, productos, total);
			f.getFactura();
			break;
		case 3:
			nombre = "Nombre: JUAN 3";
			cedula = "Cedula: 0909880808";
			productos = "Productos: leche , arroz , yodo";
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, productos, total);
			f.getFactura();
			break;
		case 4:
			nombre = "Nombre: JUAN 4";
			cedula = "Cedula: 0909880808";
			productos = "Productos: leche , arroz , yodo";
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, productos, total);
			f.getFactura();
			break;
		case 5:
			nombre = "Nombre: JUAN 5";
			cedula = "Cedula: 0909880808";
			productos = "Productos: leche , arroz , yodo";
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, productos, total);
			f.getFactura();
			break;

		default:
			//return " algo salio mal";
			break;
		}
		///return " algo salio mal";
	}
	//entidad producto adicionada
	public void rellenarFactura2(int i) {
		ArrayList<String> prodcc = new ArrayList<>();
		Productos prd = new Productos();
		switch (i) {
		case 1:
			nombre = "JUAN 1";
			cedula = "0909880808";
			
			prodcc = prd.productosDetalle("igos", "chocolate", "Galletas");
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, prodcc, total);
			f.getFactura();
			break;
		case 2:
			nombre = "Nombre: JUAN 2";
			cedula = "Cedula: 0909880808";
			
			
			prodcc = prd.productosDetalle("Whiskey", "Vodka", "Galletas");
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, prodcc, total);
			f.getFactura();
			break;
		case 3:
			nombre = "Nombre: JUAN 3";
			cedula = "Cedula: 0909880808";
			prodcc = prd.productosDetalle("limon", "revista", "dddd");
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, prodcc, total);
			f.getFactura();
			break;
		case 4:
			nombre = "Nombre: JUAN 4";
			cedula = "Cedula: 0909880808";
			prodcc = prd.productosDetalle("producto 1", "producto 2", "producto 3");
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, prodcc, total);
			f.getFactura();
			break;
		case 5:
			nombre = "Nombre: JUAN 5";
			cedula = "Cedula: 0909880808";
			prodcc = prd.productosDetalle("mosnter", "redbull", "galletitas");
			total = "Total : $16.58";
			f = new Factura(nombre, cedula, prodcc, total);
			f.getFactura();
			break;

		default:
			//return " algo salio mal";
			break;
		}
		///return " algo salio mal";
	}

	
	//entidad producto adicionada y entidad cliente adicional
	public void rellenarFactura3(int i) {
		ArrayList<String> prodcc = new ArrayList<>();
		HashMap<String, String>  clienDD = new HashMap<String, String>();
		Productos prd = new Productos();
		
		switch (i) {
		case 1:
			Cliente cli1 = new Cliente("Paulo", "9999999999");
			clienDD=cli1.getdato();
			prodcc = prd.productosDetalle("igos", "chocolate", "Galletas");
			total = "Total : $16.58";
			f = new Factura(clienDD, prodcc, total);
			f.getFactura();
			break;
		case 2:
			Cliente cli2 = new Cliente("Paulo2", "888888888");
			clienDD=cli2.getdato();
			
			
			prodcc = prd.productosDetalle("Whiskey", "Vodka", "Galletas");
			total = "Total : $16.58";
			f = new Factura(clienDD, prodcc, total);
			f.getFactura();
			break;
		case 3:
			Cliente cli3 = new Cliente("Paulo3", "7777777777");
			clienDD=cli3.getdato();
			
			prodcc = prd.productosDetalle("limon", "revista", "dddd");
			total = "Total : $16.58";
			f = new Factura(clienDD, prodcc, total);
			f.getFactura();
			break;
		case 4:
			Cliente cli4 = new Cliente("Paulo4", "44444444");
			clienDD=cli4.getdato();
						prodcc = prd.productosDetalle("producto 1", "producto 2", "producto 3");
			total = "Total : $16.58";
			f = new Factura(clienDD, prodcc, total);
			f.getFactura();
			break;
		case 5:
			Cliente cli5 = new Cliente("Paulo5", "5555555555555");
			clienDD=cli5.getdato();
			prodcc = prd.productosDetalle("mosnter", "redbull", "galletitas");
			total = "Total : $16.58";
			f = new Factura(clienDD, prodcc, total);
			f.getFactura();
			break;

		default:
			//return " algo salio mal";
			break;
		}
		///return " algo salio mal";
	}

}

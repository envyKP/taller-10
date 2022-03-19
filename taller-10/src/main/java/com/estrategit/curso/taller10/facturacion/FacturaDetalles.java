package com.estrategit.curso.taller10.facturacion;

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

	/*
	 * protected String nombre; protected String cedula; protected String cantidad;
	 * protected String total;
	 * 
	 * public FacturaDetalles(String nombre, String cedula) { this.nombre= nombre;
	 * this.cedula = cedula; this.cantidad = cantidad; } public
	 * FacturaDetalles(String nombre, String cedula, String cantidad, String total)
	 * { this.nombre= nombre; this.cedula = cedula; this.cantidad = cantidad;
	 * this.total = total; }
	 * 
	 * public String getDetalles() { return nombre + " " + cedula + "  " +
	 * cantidad+"  "+ total; }
	 */
}

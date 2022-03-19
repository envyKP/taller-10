package com.estrategit.curso.taller10.atencion;

import com.estrategit.curso.taller10.facturacion.Factura;
import com.estrategit.curso.taller10.facturacion.FacturaDetalles;

public class Cajero extends Thread{
	private String nombre;

	public Cajero(String nombre) {
		this.nombre = nombre;

	}
	
	@Override
	public void run() {
		for(int i=1 ; i<=5; i++) {
			System.out.println("*************");
			System.out.println("Cajero :"+nombre+" esta atendiendo");
			FacturaDetalles fd= new FacturaDetalles();
			fd.rellenarFactura(i);
			System.out.println("Cajero :"+nombre+" termino de atender");
			System.out.println("*************");
			
		}
		
	}
}

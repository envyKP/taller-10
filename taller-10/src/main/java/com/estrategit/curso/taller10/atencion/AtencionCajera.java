package com.estrategit.curso.taller10.atencion;

public class AtencionCajera {

	public static void main(String[] args) {
		Cajero caja1 = new Cajero("cajero 1");
		Cajero caja2 = new Cajero("cajero 2");
		Cajero caja3 = new Cajero("cajero 3");
		Cajero caja4 = new Cajero("cajero 4");
		Cajero caja5 = new Cajero("cajero 5");
		
		
		caja1.start();
		caja2.start();
		caja3.start();
		caja4.start();
		caja5.start();
		
	}
	
}

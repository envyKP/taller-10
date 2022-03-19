package com.estrategit.curso.taller10.facturacion;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {

	protected String nombre;
	protected String cedula;
	public Cliente(String nombre, String cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	/*public void DatosCliente(String nombre, String cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
		HashMap<String, String> edadpersona = new HashMap<String, Integer>();
	}*/
	
	public HashMap<String, String>  getdato() {
		HashMap<String, String>   returnalD= new HashMap<String, String>();
		returnalD.put(cedula, nombre);
		return returnalD;
	}
}

package com.estrategit.curso.taller10.facturacion;

import java.util.ArrayList;

public class Productos {

	
	public ArrayList<String> productosDetalle(String prod1, String prod2 , String prod3){
		ArrayList<String> producList = new ArrayList<>();
		producList.add(prod1);
		producList.add(prod2);
		producList.add(prod3);
		return producList;
	}
}

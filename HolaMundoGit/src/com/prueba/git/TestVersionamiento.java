package com.prueba.git;

public class TestVersionamiento {

	public static void main(String[] args) {
		
		System.out.println("Mi Segundo archivo en Git");
		System.out.println("Agregue Otro Mensaje en git");
		
		Casa casita = new Casa();
		casita.setMensaje("Una casa blanca ubicada en la plata Argentina");
		casita.setNumeroPersonas(5);
		System.out.println(casita);

	}

}

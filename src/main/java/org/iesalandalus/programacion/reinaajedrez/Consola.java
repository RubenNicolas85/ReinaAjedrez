package org.iesalandalus.programacion.reinaajedrez;

public class Consola {
	
	/* Creamos constructor de la clase sin parámetros y sin almacenamiento en variables, ya que la clase es sólo para 
	 * métodos y no tiene atributos */
	
	private Consola() {
		
		
	}
	
	/* Se crea el método estático mostrarMenu que mostrará el menú con las opciones de nuestra aplicación: crear reina 
	 * por defecto, crear reina eligiendo el color, mover y salir */
	
	public static String mostrarMenu() {
		 
		return "MENÚ PRINCIPAL DE LA APLICACIÓN REINA DE AJEDREZ: \n1. Crear reina por defecto"
				+ "\n2. Crear reina eligiendo el color \n3. Mover \n4. Salir";
	}
}

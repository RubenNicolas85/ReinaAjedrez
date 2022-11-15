package org.iesalandalus.programacion.reinaajedrez.modelo;


// Se crea el tipo enum "Direccion" con los valores constantes de las direcciones de la reina dentro del tablero de ajedrez

public enum Direccion {NORTE("Norte"), NORESTE("Noreste"), ESTE("Este"), SURESTE("Sureste"), SUR("Sur"), SUROESTE("Suroeste"), OESTE("Oeste"), NOROESTE("Noroeste");
	
	// Método constructor, en los tipos enum siempre tiene que ser private. Aceptará un argumento de tipo String
	
	private Direccion(String cadenaAMostrar) {
		
		this.cadenaAMostrar=cadenaAMostrar; 
	}
	
	// Atributo o variable del tipo enumerado para asociarlo a los valores definidos en el método constructor
	
	private String cadenaAMostrar; 

	/* Método toString, no se admite método to String en tipos enum, lo creamos a modo de método Getter para poder acceder 
	 desde fuera*/
	
	public String toString() {
		
		return cadenaAMostrar; 
	}
}

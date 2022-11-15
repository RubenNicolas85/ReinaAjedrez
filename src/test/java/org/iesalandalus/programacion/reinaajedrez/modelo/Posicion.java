package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	// Creamos las variables de clase o atributos y los encapsulamos con el modificador de acceso private
	
	private int fila; 
	private char columna; 
	
	/* Creamos el método Setter correspondiente al atributo fila, lo declaramos private. En caso de que se introduzca 
	 * un valor fuera del rango 1 a 8 el programa lanzará una excepción del tipo IllegalArgumentException */
	
	private void setFila(int fila) {
		
		if(fila>=1 && fila<=8) {
			
			this.fila=fila; 
		} else{
			
		throw new IllegalArgumentException("La fila introducida es incorrecta, por favor, introduzca un número"
				+ "entre 1 y 8");
		}
	}
	
	// Creamos el método Getter correspondiente al atributo fila, nos devolverá un dato de tipo entero
			
	public int getFila() {
		
		return fila;
	}
			
	/* Creamos el método Setter correspondiente al atributo columna, lo declaramos private. En caso de que se introduzca 
	 * un caracter fuera del rango de vocales 'a' a la 'h'el programa lanzará una excepción del tipo 
	 * IllegalArgumentException */	 
			
	private void setColumna(char columna) {
		
		switch(columna) {
		
		case 'a': this.columna=columna;
		break; 
		case 'A': this.columna=columna;
		break; 
		case 'b': this.columna=columna;
		break; 
		case 'B': this.columna=columna;
		break; 
		case 'c': this.columna=columna;
		break; 
		case 'C': this.columna=columna;
		break; 
		case 'd': this.columna=columna;
		break; 
		case 'D': this.columna=columna;
		break; 
		case 'e': this.columna=columna;
		break; 
		case 'E': this.columna=columna;
		break; 
		case 'f': this.columna=columna;
		break; 
		case 'F': this.columna=columna;
		break; 
		case 'g': this.columna=columna;
		break; 
		case 'G': this.columna=columna;
		break; 
		case 'h': this.columna=columna;
		break; 
		case 'H': this.columna=columna;
		break; 
		
		default: throw new IllegalArgumentException("La columna introducida es incorrecta, por favor, introduzca una letra entre la "
				+ " 'a' y la 'h'");
		}
		
	}	
		
	// Creamos el método Getter correspondiente al atributo columna, nos devolverá un dato de tipo char
	
	public char getColumna() {
			
		return columna;
	}

}

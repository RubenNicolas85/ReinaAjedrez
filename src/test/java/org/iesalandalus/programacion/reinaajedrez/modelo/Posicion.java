package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	// Creamos las variables de clase o atributos y los encapsulamos con el modificador de acceso private
	
	private int fila; 
	private char columna; 
	
	/* Creamos el método Setter correspondiente al atributo fila, lo declaramos private. En caso de que se introduzca 
	 * un valor fuera del rango 1 a 8 el programa lanzará una excepción del tipo IllegalArgumentException */
	
	private void setFila(int fila) {
		
		this.fila=fila; 
		
		if(fila>=1 && fila<=8) {
			
			System.out.println("La fila introducida es correcta");
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
		
		this.columna=columna; 
		
		switch(columna) {
		
		case 'a': System.out.println("La columna introducida es 'a'");
		break; 
		case 'A': System.out.println("La columna introducida es 'a'");
		break; 
		case 'b': System.out.println("La columna introducida es 'a'");
		break; 
		case 'B': System.out.println("La columna introducida es 'a'");
		break; 
		case 'c': System.out.println("La columna introducida es 'a'");
		break; 
		case 'C': System.out.println("La columna introducida es 'a'");
		break; 
		case 'd': System.out.println("La columna introducida es 'a'");
		break; 
		case 'D': System.out.println("La columna introducida es 'a'");
		break; 
		case 'e': System.out.println("La columna introducida es 'a'");
		break; 
		case 'E': System.out.println("La columna introducida es 'a'");
		break; 
		case 'f': System.out.println("La columna introducida es 'a'");
		break; 
		case 'F': System.out.println("La columna introducida es 'a'");
		break; 
		case 'g': System.out.println("La columna introducida es 'a'");
		break; 
		case 'G': System.out.println("La columna introducida es 'a'");
		break; 
		case 'h': System.out.println("La columna introducida es 'a'");
		break; 
		case 'H': System.out.println("La columna introducida es 'a'");
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

package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

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

	/* Creamos el método constructor principal, aceptará dos parámetros, uno de tipo entero para la fila y otro de tipo 
	 * char para la columna. Usaremos los métodos Set de ambos atributos ya creados para que, en caso de que el valor sea
	 * correcto, se almacenen en los atributos de clase. En caso contrario, se lanzará una excepción del tipo
	 * IllegalArgumentException */
	
	public Posicion(int fila, char columna) {
		
		setFila(fila);
	    setColumna(columna);
	    
	    this.fila=fila; 
	    this.columna=columna; 		
	     
	}
	
	// Creamos el método constructor copia, aceptará como parámetro un objeto de tipo Posición llamado "posicion" 
	
	public Posicion(Posicion posicion) {
		
		this.fila=posicion.fila; 
		this.columna=posicion.columna;
	}

	// Creamos los métodos hashCode y Equals para nuestra clase Posición
	
	@Override
	public int hashCode() {
		
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	// Creamos el método toString para nuestra clase Posición
	
	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}
		
}

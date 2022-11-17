package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	
	/* Establecemos las variables o atributos de la clase Reina, serán color (del enum Color) y posición
	 *  (de la clase Posición) */
	
	private Color color; 
	private Posicion posicion;
	
	
	/* Creamos el método Setter setColor para establecer el color, aceptará como parámetro un objeto del enum Color. Lo 
	 * declaramos private con el modificador de acceso correspondiente. En caso de que se introduzca un valor diferente
	 * a los colores blanco o negro, el programa lanzará una excepción del tipo IllegalArgumentException*/
	
	private void setColor(Color color) {
		
		if(color.equals(Color.valueOf("blanco")) || color.equals(Color.valueOf("negro"))){
			this.color=color; 
		}else {
		
			throw new IllegalArgumentException("El color introducido no es correcto, por favor, introduzca como argumento"
					+ "blanco o negro");
		}
	}
	
	// Creamos el método Getter getColor para que nos devuelva el valor del atributo color
	
	public Color getColor() {
		
		return color; 
	}
	
    /* Creamos el método Setter setPosicion para establecer la posición, aceptará como parámetro un objeto 
     * de tipo Posicion. Lo declaramos private con el modificador de acceso correspondiente. En nuestro ejercicio, 
     * como los métodos setter de las clases son privados, invocamos al constructor de la clase posición que nos permitía 
     * pasarle un parámetro de tipo posición y que a su vez, estaba compuesto por los métodos Setter de fila y columna de 
     * la clase posición, los cuales validaban si una fila o columna era la correcta. En caso de que se introduzca
     * un valor diferenteba los colores blanco o negro, el programa lanzará una excepción del tipo 
     * IllegalArgumentException*/
	
	private void setPosicion(Posicion posicion) {
		
		posicion=new Posicion(posicion); 
		
		this.posicion=posicion; 
		
	}
	
	// Creamos el método Getter getPosicion para que nos devuelva el valor del atributo posicion
	
	public Posicion getPosicion() {
		
		return posicion; 
	} 

package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

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
					+ " blanco o negro");
		}
	}
	
	// Creamos el método Getter getColor para que nos devuelva el valor del atributo color
	
	public Color getColor() {
		
		return color; 
	}
	
    /* Creamos el método Setter setPosicion para establecer la posición, aceptará como parámetro un objeto 
     * de tipo Posicion. Lo declaramos private con el modificador de acceso correspondiente. En nuestro ejercicio, 
     * como los métodos setter de las clases son privados, invocamos al constructor copia de la clase posición que nos 
     * permitía pasarle un parámetro de tipo posición y que a su vez, estaba compuesto por los métodos Setter de fila y 
     * columna de la clase posición, los cuales validaban si una fila o columna era la correcta. En caso de que se 
     * introduzca un valor no permitido de fila o columna, el programa lanzará una excepción del tipo 
     * IllegalArgumentException*/
	
	private void setPosicion(Posicion posicion) {
		
		posicion=new Posicion(posicion); 
		
		this.posicion=posicion; 
		
		
	}
	
	// Creamos el método Getter getPosicion para que nos devuelva el valor del atributo posicion
	
	public Posicion getPosicion() {
		
		return posicion; 
	}  
	
	// Creamos el método constructor por defecto para que nos cree una reina blanca en la posición 1d: 
	
		public Reina() {
		
		this.color=Color.BLANCO;
		posicion=new Posicion(1,'d');
	}
		
	/* Creamos el método constructor que acepte como parámetro el color y que creará una reina blanca en la posición (1,d)
	 * y una reina negra en la posición 8d */
	
		public Reina(Color color) {
			
			if(color==Color.BLANCO) {
				
				this.color=Color.BLANCO;
				posicion=new Posicion(1,'d');
			}
			
			if(color==Color.NEGRO) {
				
				this.color=Color.NEGRO;
				posicion=new Posicion(8,'d');
			}
		}

		/* Creamos el método mover que aceptará como parámetros una dirección del Enum Direccion y un número entero 
		 * que determinará el número de pasos. Los pasos deben estar comprendidos entre 1 y 7 (ambos inclusive) y la 
		 * dirección no puede ser nula o de lo contrario debe lanzar una excepción adecuada 
		 NullPointerException o IllegalArgumentException) con el mensaje adecuado. Si no puede realizar dicho movimiento,
		 debido a que la reina se sale del tablero, se debe lanzar una excepción del tipo OperationNotSupportedException 
		 con un mensaje adecuado y no modificará la posición de la reina */
		
		public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

			char norte='d';
			char sur='d';
			char estenorestesuresteblanco='d';
			estenorestesuresteblanco+=pasos; 
			char oestenoroestesuroesteblanco='d';
			oestenoroestesuroesteblanco-=pasos; 
			char estenorestesurestenegro='d';
			char oestenoroestesuroestenegro='d';
			oestenoroestesuroestenegro+=pasos; 
			switch (direccion) {
			
			case NORTE: 
				
				if(color.equals(color.BLANCO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(1+pasos,norte);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			
				if(color.equals(color.NEGRO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(8-pasos,norte);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
				
			break;  
			
			case NORESTE: 
				
				if(color.equals(color.BLANCO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(pasos+1,estenorestesuresteblanco);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			
				if(color.equals(color.NEGRO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(pasos+1,estenorestesurestenegro);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			break;  
			
			case ESTE: 
				
				if(color.equals(color.BLANCO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(1,estenorestesuresteblanco);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			
				if(color.equals(color.NEGRO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(8,estenorestesurestenegro);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			break;  
			
			case SURESTE: 
				
				if(color.equals(color.BLANCO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(1-pasos,oestenoroestesuroesteblanco);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			
				if(color.equals(color.NEGRO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(8-pasos,oestenoroestesuroestenegro);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			break; 
			
			case SUR: 
				
				if(color.equals(color.BLANCO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(1-pasos,sur);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			
				if(color.equals(color.NEGRO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(8-pasos,sur);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			break;
			
			case SUROESTE: 
				
				if(color.equals(color.BLANCO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(1-pasos,oestenoroestesuroesteblanco);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			
				if(color.equals(color.NEGRO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(8-pasos,oestenoroestesuroestenegro);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			break;
			
			case OESTE: 
				
				if(color.equals(color.BLANCO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(1,oestenoroestesuroesteblanco);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			
				if(color.equals(color.NEGRO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(8,oestenoroestesuroestenegro);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			break; 
			
			case NOROESTE: 
				
				if(color.equals(color.BLANCO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(pasos+1,oestenoroestesuroesteblanco);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			
				if(color.equals(color.NEGRO)) {
					if(pasos>=1 && pasos<=7){
						this.posicion=new Posicion(8-pasos,oestenoroestesuroestenegro);
					} else{
						throw new OperationNotSupportedException("El movimiento no es válido porque la reina se sale del tablero");
					}
				}
			break;   
			}
}	

		// Creamos el método toString que nos devolverá el valor del color y la posición de la reina
		
		@Override
		public String toString() {
			return "Reina [color=" + color + ", posicion=" + posicion + "]";
		}

}

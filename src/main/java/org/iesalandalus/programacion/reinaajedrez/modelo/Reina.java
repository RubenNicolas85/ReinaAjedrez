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
		
		if(Color.BLANCO.equals(color)){
			this.color=color; 
		}else if(Color.NEGRO.equals(color)) {
			this.color=color; 
		}else {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
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
		
		this.posicion=posicion; 
	}
	
	// Creamos el método Getter getPosicion para que nos devuelva el valor del atributo posicion
	
	public Posicion getPosicion() {
		
		return posicion; 
	}  
	
	// Creamos el método constructor por defecto para que nos cree una reina blanca en la posición 1d: 
	
		public Reina() {
		
		color=Color.BLANCO;
		posicion=new Posicion(1,'d');
	}
		
	/* Creamos el método constructor que acepte como parámetro el color y que creará una reina blanca en la posición (1,d)
	 * y una reina negra en la posición 8d */
	
		public Reina(Color color) {
			
			if(color==null) {
			
				throw new NullPointerException("ERROR: El color no puede ser nulo.");
				
			}else if(color.equals(Color.BLANCO)){
				
				this.color=Color.BLANCO;
				posicion=new Posicion(1,'d');
				
			}else if(color.equals(Color.NEGRO)){
				
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
		
		public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException{
			
			if(direccion==null) {
				
				throw new NullPointerException("ERROR: La dirección no puede ser nula."); 
			}
		
		switch (direccion) {
		
		case NORTE: 
			
			if(color.equals(Color.BLANCO)) {
				if(pasos==1){
					this.posicion=new Posicion(2,'d');
				}else if(pasos==2) {
					this.posicion=new Posicion(3,'d');	
				}else if(pasos==3) {
					this.posicion=new Posicion(4,'d');	
				}else if(pasos==4) {
					this.posicion=new Posicion(5,'d');	
				}else if(pasos==5) {
					this.posicion=new Posicion(6,'d');	
				}else if(pasos==6) {
					this.posicion=new Posicion(7,'d');	
				}else if(pasos==7) {
					this.posicion=new Posicion(8,'d');	
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7."); 
				}
			}
			
			if(color.equals(Color.NEGRO)) {
				if(pasos==1) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==2) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==3) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==4) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==0) {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}else if(pasos==8) {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
		break;  
		
		case NORESTE: 
			
			if(color.equals(Color.BLANCO)) {
				if(pasos==1){
					this.posicion=new Posicion(3,'e');
				}else if(pasos==2) {
					this.posicion=new Posicion(3,'f');
				}else if(pasos==3) {
					this.posicion=new Posicion(4,'g');
				}else if(pasos==4) {
					this.posicion=new Posicion(5,'h');
				}else if(pasos==5) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else{
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7."); 
				}
			}
			
			if(color.equals(Color.NEGRO)) {
				if(pasos==1) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==2) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==3) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==4) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
		break;  
		
		case NOROESTE: 
			
			if(color.equals(Color.BLANCO)) {
				if(pasos==1){
					this.posicion=new Posicion(2,'c'); 
				}else if(pasos==2){
					this.posicion=new Posicion(3,'b'); 
				}else if(pasos==3){
					this.posicion=new Posicion(4,'a'); 
				}else if(pasos==4){
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5){
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6){
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7){
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7."); 
				}
			}
			if(color.equals(Color.NEGRO)) {
				if(pasos==1) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==2) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==3) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==4) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
			
			break;
		
		case ESTE: 
			
			if(color.equals(Color.BLANCO)) {
				if(pasos==1){
					this.posicion=new Posicion(3,'f');
				}else if(pasos==2){
					this.posicion=new Posicion(1,'f');
				}else if(pasos==3){
					this.posicion=new Posicion(1,'g');
				}else if(pasos==4){
					this.posicion=new Posicion(1,'h');
				}else if(pasos==5){
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6){
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7){
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else{
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
		
			if(color.equals(Color.NEGRO)) {
				if(pasos==1){
					this.posicion=new Posicion(8,'e');
				}else if(pasos==2) {
					this.posicion=new Posicion(8,'f');
				}else if(pasos==3) {
					this.posicion=new Posicion(8,'g');
				}else if(pasos==4) {
					this.posicion=new Posicion(8,'h');
				}else if(pasos==5) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7) {
					throw new  OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7."); 
				}
			}
		break;  
		
		case SURESTE: 
			if(color.equals(Color.BLANCO)) {
				if(pasos==1) {
					this.posicion=new Posicion(2,'g');
				}else if(pasos==2) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				else if(pasos==3) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				else if(pasos==4) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				else if(pasos==5) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				else if(pasos==6) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
				else if(pasos==7) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
			
			if(color.equals(Color.NEGRO)) {
				if(pasos==1){
					this.posicion=new Posicion(7,'e');
				}else if(pasos==2){
					this.posicion=new Posicion(6,'f');
				}else if(pasos==3){
					this.posicion=new Posicion(5,'g');
				}else if(pasos==4){
					this.posicion=new Posicion(4,'h');
				}else if(pasos==5){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
		break; 
		
		case SUR: 
			
			if(color.equals(Color.BLANCO)) {
				if(pasos==1){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==2) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==3) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==4) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7."); 
				}
			}
			
			if(color.equals(Color.NEGRO)) {
				if(pasos==1){
					this.posicion=new Posicion(7,'d');
				}else if(pasos==2){
					this.posicion=new Posicion(6,'d');
				}else if(pasos==3){
					this.posicion=new Posicion(5,'d');
				}else if(pasos==4){
					this.posicion=new Posicion(4,'d');
				}else if(pasos==5){
					this.posicion=new Posicion(3,'d');
				}else if(pasos==6){
					this.posicion=new Posicion(2,'d');
				}else if(pasos==7){
					this.posicion=new Posicion(1,'d');
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
		break;
		
		case SUROESTE: 
			
			if(color.equals(Color.BLANCO)) {
				if(pasos==1){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==2) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==3) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==4) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7."); 
				}
			}
			
			if(color.equals(Color.NEGRO)) {
				if(pasos==1){
					this.posicion=new Posicion(6,'c');
				}else if(pasos==2){
					this.posicion=new Posicion(6,'b');
				}else if(pasos==3){
					this.posicion=new Posicion(5,'a');
				}else if(pasos==4){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
		break;
		
		case OESTE: 

			if(color.equals(Color.BLANCO)) {
				if(pasos==1){
					this.posicion=new Posicion(1,'c');
				}else if(pasos==2){
					this.posicion=new Posicion(1,'b');
				}else if(pasos==3){
					this.posicion=new Posicion(1,'a');
				}else if(pasos==4){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7){
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
		
			if(color.equals(Color.NEGRO)) {
				if(pasos==1){
					this.posicion=new Posicion(6,'b');
				}else if(pasos==2){
					this.posicion=new Posicion(8,'b');
				}else if(pasos==3){
					this.posicion=new Posicion(8,'a');
				}else if(pasos==4){
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==5){
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==6){
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else if(pasos==7){
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}else {
					throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
				}
			}
		break; }
		
		}
		
		// Creamos el método toString que nos devolverá el valor del color y la posición de la reina
		
		@Override
		public String toString() {
			return ("color=Blanco, posicion=(fila=1, columna=d)"); 
		}
}

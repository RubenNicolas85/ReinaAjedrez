package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

import org.iesalandalus.programacion.reinaajedrez.modelo.*;

public class Consola {
	
	/* Creamos constructor de la clase sin parámetros y sin almacenamiento en variables, ya que la clase es sólo para 
	 * métodos y no tiene atributos */
	
	private Consola() {
		
	}
	
	/* Se crea el método estático mostrarMenu que mostrará el menú con las opciones de nuestra aplicación: crear reina 
	 * por defecto, crear reina eligiendo el color, mover y salir */
	
	public static void mostrarMenu() {
		 
		System.out.println("MENÚ PRINCIPAL DE LA APLICACIÓN REINA DE AJEDREZ: \n------------------------------------------"
				+ "-------\n1. Crear reina por defecto"
				+ "\n2. Crear reina eligiendo el color \n3. Mover \n4. Salir \n");
	}
	
	/* Se crea el método elegirOpcionMenu, que mostrará un mensaje para que elijamos una opción del menú anteriormente 
	 * creado y nos pedirá que introduzcamos por teclado la opción hasta que ésta sea valida. Devolverá la opción 
	 * elegida */
	
	public static int elegirOpcionMenu() {
		
		int teclado; 
		
		do {
			System.out.println("Por favor, elija una opción del menú: "); 	
			teclado=Entrada.entero();
		}while(teclado<1 || teclado>4); 
		
		return teclado; 
	}
	
	/* Se crea el método elegirColor que nos pedirá que elijamos un color mientras éste no sea válido y dependiendo de 
	 * la opción elegida devolverá un color u otro */
	
	public static Color elegirColor() {
		
		String pedircolor; 
		
		do {
			System.out.println("Por favor, elija un color, tiene que ser 'blanco' o 'negro' "); 	
			pedircolor=Entrada.cadena();
			
		}while(pedircolor.equalsIgnoreCase("blanco")==false && pedircolor.equalsIgnoreCase("negro")==false); 
		
		if(pedircolor.equalsIgnoreCase("blanco")) {
			
			return Color.BLANCO;
		}else if (pedircolor.equalsIgnoreCase("negro")) {
			
			return Color.NEGRO; 
		}else{
            return null; 
        }
	}
	
	/* Se crea el método mostrarMenuDirecciones que mostrará por consola un menú con las diferentes direcciones que 
	 * podemos elegir */
	
	public static void mostrarMenuDirecciones() {
		
		System.out.println("DIRECCIONES QUE PUEDE TOMAR LA REINA DE AJEDREZ: \n---------------------------------------"
				+ "---------"
				+ "\n1. Norte"
				+ "\n2. Noreste \n3. Noroeste \n4. Este \n5. Sureste \n6. Sur \n7. Suroeste \n8. Oeste "); 
	}
	
	/* Se crea el método elegirDireccion que mostrará un mensaje indicando que elijamos una dirección del menú 
	 * anteriormente creado y nos pedirá que introduzcamos por teclado la opción hasta que ésta sea valida. Devolverá 
	 * la dirección elegida */
	
	public static Direccion elegirDireccion() {
		
		int pedirdireccion;
		pedirdireccion=Entrada.entero();
		System.out.println("Por favor, elija una de las direcciones del menú anterior: "); 
		
		while(pedirdireccion<1 && pedirdireccion>8) {
		}
		
		switch(pedirdireccion) {
		
			case 1: {
				return Direccion.NORTE;
			}
		
			case 2:{
				return Direccion.NORESTE;
			}
		
			case 3:{
				return Direccion.NOROESTE;
			}
		 
			case 4:{
				return Direccion.ESTE;
			}
		
			case 5:{
				return Direccion.SURESTE;
			}
		
			case 6:{
				return Direccion.SUR; 
			}
		
			case 7:{
				return Direccion.SUROESTE;
			}

			case 8:{
				return Direccion.OESTE;
			}
			
			default: 
				return Direccion.valueOf(null);
		}	
	}	
	
	/* Se crea el método elegirPasos que mostrará un mensaje indicando que elijamos el número de pasos a mover, nos lo
	 * pedirá y devolverá el número de pasos introducidos */
	
	public static int elegirPasos() {
		
		int pasos; 
		System.out.println("Por favor, elija el número de pasos a mover: "); 
		
		pasos=Entrada.entero();
		
		return pasos; 
	}
	
	// Se crea el método despedirse que mostrará un mensaje de despedida de nuestra aplicación
	
	public static void despedirse() {
		
		System.out.println("El programa va a finalizar, esperamos que vuelva pronto.");
	}
}

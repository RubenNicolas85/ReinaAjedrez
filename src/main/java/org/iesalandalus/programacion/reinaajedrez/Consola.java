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
		}else {
			
			return Color.NEGRO; 
		}
	}
	
	/* Se crea el método mostrarMenuDirecciones que mostrará por consola un menú con las diferentes direcciones que 
	 * podemos elegir */
	
	public static void mostrarMenuDirecciones() {
		
		System.out.println("DIRECCIONES QUE PUEDE TOMAR LA REINA DE AJEDREZ: \n---------------------------------------"
				+ "---------"
				+ "\n1. Norte"
				+ "\n2. Noreste \n3. Este \n4. Sureste \n5. Sur \n6. Suroeste \n7. Oeste \n8. Noroeste "); 
	}
	
	/* Se crea el método elegirDireccion que mostrará un mensaje indicando que elijamos una dirección del menú 
	 * anteriormente creado y nos pedirá que introduzcamos por teclado la opción hasta que ésta sea valida. Devolverá 
	 * la dirección elegida */
	
	public static Direccion elegirDireccion() {
		
		int pedirdireccion;
		
		do {
			System.out.println("Por favor, elija una de las direcciones del menú anterior: "); 	
			pedirdireccion=Entrada.entero();
			
		}while(pedirdireccion<1 && pedirdireccion>8); 
			
		if(pedirdireccion==1) {
			
			return Direccion.NORTE;
		}	
			
		if(pedirdireccion==2) {
			
			return Direccion.NORESTE;
		}	

		if(pedirdireccion==3) {
	
			return Direccion.ESTE;
		}	

		if(pedirdireccion==4) {
	
			return Direccion.SURESTE;
		}		

		if(pedirdireccion==5) {
	
			return Direccion.SUR;
		}	

		if(pedirdireccion==6) {
	
			return Direccion.SUROESTE;
		}	

		if(pedirdireccion==7) {
	
			return Direccion.OESTE;
		}else{
	
			return Direccion.NOROESTE;
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

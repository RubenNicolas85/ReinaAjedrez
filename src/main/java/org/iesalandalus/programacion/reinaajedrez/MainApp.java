package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.*;

public class MainApp {
	
	// Se crea el atributo de clase reina
	
	private static Reina reina;
	
	public static void main(String[] args) {
		
		
		Consola.mostrarMenu();
		MainApp.ejecutarOpcion(Consola.elegirOpcionMenu());
	 }
	
	/* Se crea el método ejecutarOpcion que dependiendo de la opción pasada como parámetro, actuará en 
	 * consecuencia */
	
	private static void ejecutarOpcion(int opcion) {
			
		switch (opcion) {
			case 1: 
				
					try{
						
						crearReinaDefecto();
						MainApp.mostrarReina();
						System.out.println(); 
						MainApp.mover();
						MainApp.mostrarReina();
						System.out.println();
						
					} catch(Exception e) {
						
						MainApp.mover();
						System.out.println(e);
						
					}finally {
						Consola.mostrarMenu();
						MainApp.mostrarReina();
						MainApp.ejecutarOpcion(Consola.elegirOpcionMenu());
					}
					
			break;
			
			case 2: 
					try {
						crearReinaColor(Consola.elegirColor()); 
						MainApp.mostrarReina();
						System.out.println(); 
						MainApp.mover();
						MainApp.mostrarReina();
						System.out.println();	
						
						
					}catch(Exception e2) {
						
						MainApp.mover();
						System.out.println(e2);
						
					}finally {
						
						Consola.mostrarMenu();
						MainApp.mostrarReina();
						MainApp.ejecutarOpcion(Consola.elegirOpcionMenu());
					}
					 
			break; 
			case 3: MainApp.mostrarReina();
					System.out.println();
					Consola.mostrarMenu();
					MainApp.ejecutarOpcion(Consola.elegirOpcionMenu());
			break;
			case 4: Consola.despedirse();
			break;
			default: System.out.println("Opción no válida, por favor, escoja una opción válida");
			break; 
		}
	}
	
	/* Se crea el método crearReinaDefecto que asignará al atributo de clase reina una nueva instancia de una 
	 * reina creada con el constructor por defecto */
	
	private static void crearReinaDefecto() {
		
		reina=new Reina();
	}
	
	/* Se crea el método crearReinaColor que asignará al atributo de clase reina una nueva instancia de una 
	 * reina creada con el constructor al que le pasamos el color */
	
	private static void crearReinaColor(Color color) {
		
		reina=new Reina(color);
	}
	
	/* Se crea el método mover que mostrará un menú con las posibles direcciones, nos preguntará por la 
	 * dirección y la cantidad de pasos a mover y moverá la reina según esos parámetros */
	
	private static void mover() {
		
		Consola.mostrarMenuDirecciones();
		try {
			reina.mover(Consola.elegirDireccion(),Consola.elegirPasos());
			MainApp.mostrarReina();
			
		} catch (OperationNotSupportedException e) {
		
		}finally {
			Consola.mostrarMenuDirecciones();
			try {
				reina.mover(Consola.elegirDireccion(),Consola.elegirPasos());
			} catch (OperationNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MainApp.mostrarReina();
		}
		
	}
	
	/* Se crea el método mostrarReina que nos mostrará la información de la reina si ésta está creada o de 
	 * lo contrario nos informará de ello */
	
	private static void mostrarReina() {
		
		if(reina!=null) {
			
			System.out.println("reina=" + reina + "]");
		}else {
			
			System.out.println("La reina no existe o aún no ha sido creada"); 
		}
	}
}

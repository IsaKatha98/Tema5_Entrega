package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declaramos los arrays y las variables necesarias.

		char[] tablero = new char[Funciones.TAM]; // Tablero sobre el que se van haciendo modificaciones.
		char[] tableroUsuario = new char[Funciones.TAM]; // Tablero que verá el usuario.
		int casilla=0; // Casilla que indica la posición que va a destapar el usuario.
		boolean fin= false;


		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el tablero.
		System.out.println("Bienvenido/a, se va a iniciar el juego del buscaminas.\n"); ;
		System.out.println(Arrays.toString(Funciones.dibujaTablero( tableroUsuario)));
		
		System.out.println("\n Tablero auxiliar: ");
		System.out.println(Arrays.toString(Funciones.colocaMinas(tablero)));
		
		
		do {
		
			System.out.println("Introduzca la casilla que quiere destapar (entre 0 y 19): ");
			casilla=sc.nextInt();
			
			System.out.println(Arrays.toString(Funciones.dibujaJuego(tablero, tableroUsuario, casilla)));
			
			//Invocamos la función pierde.
			fin= Funciones.pierde(tablero, casilla);
		
		} while (!fin);
		
		System.out.println("El juego ha terminado.");

	}

}

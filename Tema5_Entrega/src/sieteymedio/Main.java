package sieteymedio;

import java.util.Arrays;
import java.util.Scanner;

import buscaminas.Funciones;

public class Main {

	public static void main(String[] args) {

		// Declaramos los arrays y las variables necesarias.
		int[] mazo= new int[10]; //Mazo de cartas.
		
		
		String carta; // Array que nos sacará un valor aleatorio.
		String respuesta; // Variable que va a introducir el usuario.
		double puntosJ1 = 0;
		double puntosJ2 = 0;
		String palo;
		boolean fin = false;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Presentamos el juego.
		System.out.println("Bienvenido/a, se va a iniciar el juego del siete y medio.\n");

		// Esto tiene que ir en un bucle while más grande.
		while (!fin) {

			System.out.println("Es el turno del jugador1. ¿Quiere sacar una carta? (s/n): ");
			respuesta = sc.next();

			if (respuesta.equals("s")) {

				do {
					
					
					// Hay que presentar la carta.
					puntosJ1 = Functions.randomCartas();
					carta= Functions.conversionCarta(puntosJ1);
					palo = Functions.valorPalo();
					
					System.out.println("Tu carta es: " + carta + palo);
					
					// Sumamos los puntos.
					System.out.println("El jugador 1 tiene " + puntosJ1 + " puntos.");

					System.out.println("¿Quiere sacar otra carta? (s/n): ");
					respuesta = sc.next();

					// Aquí hay que pedir una fumnción para comprobar si se ha pasado.

				} while (respuesta.equals("s"));

			}

			System.out.println("Es el turno del jugador2. ¿Quiere sacar una carta? (s/n): ");
			respuesta = sc.next();

			if (respuesta.equals("s")) {

				do {
					// Sumamos los puntos.
					puntosJ2 += Functions.randomCartas();
					
					// Hay que presentar la carta.
					carta = Functions.conversionCarta(puntosJ2);
					palo = Functions.valorPalo();

					System.out.println("Tu carta es: " + carta + palo);

					System.out.println("El jugador 1 tiene " + puntosJ2 + " puntos.");

					System.out.println("¿Quiere sacar otra carta? (s/n): ");
					respuesta = sc.next();

					// Aquí hay que pedir una fumnción para comprobar si se ha pasado.

				} while (respuesta.equals("s"));

			}

		}

	}

}

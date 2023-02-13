package sieteymedio;

import java.util.Arrays;
import java.util.Scanner;

import buscaminas.Funciones;

public class Main {

	public static void main(String[] args) {

		// Declaramos los arrays y las variables necesarias.
		double[] mazo= new double[10]; //Mazo de cartas.
		
		
		String carta; // Array que nos sacará un valor aleatorio.
		String respuesta; // Variable que va a introducir el usuario.
		double puntosJ1 = 0;
		double sumaPuntosJ1=0;
		double sumaPuntosJ2=0;
		double puntosJ2 = 0;
		String palo;
		boolean fin = false;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Presentamos el juego.
		System.out.println("Bienvenido/a, se va a iniciar el juego del siete y medio.\n");
		
		System.out.println(Arrays.toString(Functions.rellenaMazo(mazo)));

		// Esto tiene que ir en un bucle while más grande.
		while (!fin) {

			System.out.println("Es el turno del jugador1. ¿Quiere sacar una carta? (s/n): ");
			respuesta = sc.next();

			if (respuesta.equals("s")) {

				do {
					
					
					// Hay que presentar la carta.
					
					puntosJ1 = Functions.randomCartas(mazo);
					carta= Functions.conversionCarta( puntosJ1 );
					palo = Functions.valorPalo();
					
					System.out.println("Tu carta es: " + carta + palo);
							
					// Sumamos los puntos.
					
					sumaPuntosJ1+=puntosJ1;
					
					System.out.println("El jugador 1 tiene " + sumaPuntosJ1 + " puntos.");
					
					// Comprobamos si nos pasamos de la puntuación.
					if (sumaPuntosJ1>=Functions.MAX_PUNTOS) {
						
						//Indicar al usuario que ha perdido.
						System.out.println("Vaya, te has pasado, sorry");
						
						//Forzamos la salida del bucle
						break;
						
					}
					
					System.out.println("¿Quiere sacar otra carta? (s/n): ");
					respuesta = sc.next();

					

				} while (respuesta.equals("s"));

			}

			System.out.println("Es el turno del jugador 2. ¿Quiere sacar una carta? (s/n): ");
			respuesta = sc.next();

			if (respuesta.equals("s")) {

				do {
	
					
					// Hay que presentar la carta.
					puntosJ2 = Functions.randomCartas(mazo);
					carta = Functions.conversionCarta(puntosJ2);
					palo = Functions.valorPalo();

					System.out.println("Tu carta es: " + carta + palo);
					
					sumaPuntosJ2+=puntosJ2;

					System.out.println("El jugador 2 tiene " + sumaPuntosJ2 + " puntos.");
					
					// Aquí hay que pedir una fumnción para comprobar si se ha pasado.
					if (sumaPuntosJ1>Functions.MAX_PUNTOS) {
						
						//Indicar al usuario que ha perdido.
						System.out.println("Vaya, te has pasado, sorry");
						
						//Forzamos la salida del bucle
						break;
						
					}

					System.out.println("¿Quiere sacar otra carta? (s/n): ");
					respuesta = sc.next();

				} while (respuesta.equals("s"));
				
				
				//Aquí ponemos la función fin.

			}

		}

	}

}

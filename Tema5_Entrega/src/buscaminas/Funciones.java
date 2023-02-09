package buscaminas;

import java.util.Arrays;

public class Funciones {

	// Declaramos las variables y los arrays necesarios.
	final static int TAM = 20; // Tamaño que tendrán los tableros.
	final static int MINAS = 6; // Número de minas que contiene el juego.

	/**
	 * En esta función se supone que vamos a pintar el tablero inicial.
	 *
	 * @param tableroUsuario recibe un char[] vacío.
	 * @return tableroUsuario devuelve un char[] relleno de guiones.
	 */
	public static char[] dibujaTablero(char tableroUsuario[]) {

		// Pintamos el tableroUsuario con guiones.
		Arrays.fill(tableroUsuario, '-');

		return tableroUsuario;
	}

	/**
	 * Función que va destapando las casillas.
	 * 
	 * @param tableroAux
	 * @param tableroUsuario
	 * @param casilla
	 * @return
	 */
	public static char[] dibujaJuego(char tableroAux[], char tableroUsuario[], int casilla) {

		// Igualamos el tableroUsuario a tableroAux en una casilla concreta.
		if (tableroUsuario[casilla] == '-') {

			tableroUsuario[casilla] = tableroAux[casilla];
		}

		// Devolvemos la tabla.
		return tableroUsuario;
	}

	/**
	 * Función que coloca las minas de forma aleatoria.
	 * 
	 */

	public static char[] colocaMinas (char[] tableroAux) {

		int index; // posición del array donde se colocarán las minas.
		int contadorMinas = 0; // contador de minas.
		

		// Rellenamos el tablero de 0, de forma inicial.
		for (int i = 0; i < tableroAux.length; i++) {

			tableroAux[i] = '0';

		}

		// Hacemos un random para colocar las minas, dentro de un while para que este
		// proceso se repita 6 veces.
		while (contadorMinas < MINAS) {

			index = (int) (Math.random() * (20 + 1) - 1);

			// Si en esa posición no hay una mina, la ponemos.
			if (tableroAux[index] != '*') {

				// Ponemos la mina.
				tableroAux[index] = '*';
				
				//Ahora, añadimos un 1 a la izquierda y otro a la derecha.
				if (tableroAux[index]=='*') {
					
					tableroAux[index +1]+=1;
					
					tableroAux [index -1]+=1;
					
				
					
				}
					
			// Si ya había una, le quitamos 1 al contadorMinas.
			} else {

				contadorMinas--;

			}

			// Contamos uno en el contadorMinas.
			contadorMinas++;

		}

		return tableroAux;

	}
	
	

	
	public static boolean bordeIzq (int index) {
		
		boolean borde = false;

		if (index == 0) {
			borde = true;
		}

		return borde;
	}

	/**
	 * Método para comprobar si estamos en el borde de la derecha
	 * 
	 * @param indice recibe una posición por parámetros
	 * @return Devuelve un booleano que nos dice si estamos en el borde o no
	 */
	public static boolean bordeDer(int index) {
		
		boolean borde = false;

		if (index == (TAM - 1)) {
			borde = true;
		}
		return borde;
	}
	
	
	public static boolean pierde (char[] tableroAux, int casilla) {
		
		boolean pierde= false;
		
		if (tableroAux[casilla]=='*') {
			
			pierde= true;
		}
		
		return pierde;
	}

}

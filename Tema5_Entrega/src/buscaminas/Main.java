package buscaminas;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Hacemos un array de tamaño 20.
		int tam=20;
		int[] tabla= new int [tam];
		
		//Pedimos la tabla.
		tabla= Funciones.dibujaTablero(tam);
		
		//Imprimimos el tablero.
		System.out.println(Arrays.toString(tabla));

	}

}

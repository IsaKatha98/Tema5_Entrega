package sieteymedio;

public class Functions {

	// Declaramos las variables y los arrays necesarios.

	static final double MAX_PUNTOS = 7.5;

	public static double[] rellenaMazo(double[] mazo) {

		for (int i = 0; i < mazo.length; i++) {

			mazo[i] = i + 1;

			if (i >= 7) {

				mazo[i] = 0.5;
			}

		}

		return mazo;

	}

	public static double randomCartas(double[] mazo) {

		double valor;
		int index;

		index = (int) (Math.random() * 9) + 1;

		valor = mazo[index];

		return valor;

	}

	public static String conversionCarta(double valor) {

		String conversion = "";

		switch ((int) valor) {

		case 1:

			conversion = "el as";
			break;

		case 2:

			conversion = "dos";
			break;

		case 3:

			conversion = "tres";
			break;

		case 4:

			conversion = "cuatro";
			break;

		case 5:

			conversion = "cinco";
			break;

		case 6:

			conversion = "seis";
			break;

		case 7:

			conversion = "siete";
			break;

		}

		if (valor == 0.5) {

			int random;
			random = (int) (Math.random() * 3) + 1;

			switch (random) {

			case 1:

				conversion = "el sota ";
				break;

			case 2:

				conversion = "el caballo ";
				break;

			case 3:

				conversion = "el rey ";
				break;

			}

		}

		return conversion;
	}

	public static String valorPalo() {

		int index;

		index = (int) (Math.random() * 4) + 1;

		String valorPalo = "";

		switch (index) {

		case 1:

			valorPalo = " de oros.";
			break;

		case 2:

			valorPalo = " de bastos.";
			break;

		case 3:

			valorPalo = " de espadas.";
			break;

		case 4:

			valorPalo = " de copas.";
			break;

		}

		return valorPalo;

	}

	public static boolean fin(double valorJ1, double valorJ2) {

		boolean fin = false;

		if (valorJ2 >= MAX_PUNTOS) {

			fin = true;
		}

		if (valorJ1 > MAX_PUNTOS && valorJ2 > MAX_PUNTOS) {

			// Ambos jugadores pierden porque ambos se han pasado de 7.5
			fin=true;
		}

		return fin;
	}

	public static void ganador(double valorJ1, double valorJ2) {

		if (valorJ1 > valorJ2 && valorJ1 < MAX_PUNTOS && valorJ2 < MAX_PUNTOS) {

			// Gana el jugador 1.
			System.out.println("Ha ganado el jugador 1.");

		}
		
		if (valorJ1<=MAX_PUNTOS &&valorJ2>MAX_PUNTOS) {
			
			System.out.println("Ha ganado Jugador 1.");
		}

		if (valorJ2 > valorJ1 && valorJ1 < MAX_PUNTOS && valorJ2 < MAX_PUNTOS) {

			// Gana el jugador 2.
			System.out.println("Ha ganador el jugador 2.");
		}

		if (valorJ2 == valorJ1 && valorJ1 < MAX_PUNTOS && valorJ2 < MAX_PUNTOS) {

			// Ha habido empate y ninguno se ha pasado.
			System.out.println("Ha habido empate.");
		}

		if (valorJ1 > MAX_PUNTOS && valorJ2 > MAX_PUNTOS) {

			// Ambos jugadores pierden porque ambos se han pasado de 7.5
			System.out.println("Han perdido ambos jugadores.");
		}

	}

}

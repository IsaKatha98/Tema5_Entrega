package sieteymedio;

public class Functions {

	// Declaramos las variables y los arrays necesarios.
	
	static final double MAX_PUNTOS=7.5;
	
	
	public static double[] rellenaMazo (double[] mazo) {
		
		for (int i=0; i<mazo.length;i++) {
			
			if (i>7) {
				
				mazo[i]=0.5;
			} 
			
		}
	}

	public static double randomCartas() {

		double valorCarta;

		valorCarta = (int) (Math.random()* 10 )+1;
		
		if (valorCarta>7) {
			
			valorCarta=0.5;
		}

		return valorCarta;
	}
	
	public static String conversionCarta (double valorCarta) {
		
		int valor;
		String conversion="";
		
		switch ((int) valorCarta) {
			
		case 1:
			
			conversion="el as";
			break;
			
		case 2: 
			
			conversion="dos";
			break;
			
		case 3: 
			
			conversion="tres";
		break;
		
		case 4:
			
			conversion="cuatro";
			break;
			
		case 5:
			
			conversion="cinco";
			break;
			
		case 6:
			
			conversion="seis";
			break;
			
		case 7:
			
			conversion="siete";
			break;
		
		}
		
		if (valorCarta==0.5) {
			
			valor= (int)(Math.random()*3);
			
			switch (valor) {
			
			case 1: 
				
				conversion= "el sota ";
				break;
				
			case 2:
				
				conversion="el caballo ";
				break;
				
			case 3: 
				
				conversion= "el rey ";
				break;
			
			}
			
			
		}
		
		
		
		return conversion;
	}

	public static String valorPalo() {

		int index;

		index = (int) (Math.random()* 4)+1;

		String valorPalo = "";

		switch (index) {

		case 1:

			valorPalo = " de oros.";
			break;

		case 2:

			valorPalo = " de bastos.";
			break;

		case 3:

			valorPalo = "de espadas.";
			break;

		case 4:

			valorPalo = " de copas.";
			break;

		}

		return valorPalo;

	}

}

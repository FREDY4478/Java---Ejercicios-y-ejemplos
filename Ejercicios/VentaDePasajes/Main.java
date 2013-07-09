
/*
 *	Por: Matías Muñoz Espinoza
 *	Problema:
 *		Diseñe un programa que posea dos calses, una principal y una secundaria llamada
 *		"Autobus". La clase principal venderá pasajes a diferentes destinos, según su
 *		valor. Los buses tendrán un destino, una cantidad de asientos, asiento ventana,
 *		asiento pasillo, asiento en mal estado (no se vende).
 */

import java.util.Scanner;

public class Main
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);

		Autobus [] autobuses = new  Autobus [5];
		
		// Inicializar autobuses
		autobuses[0] = new Autobus ("Maquina 1", "Temuco", 1600, 8);
		autobuses[1] = new Autobus ("Maquina 2", "Victoria", 1300, 4);
		autobuses[2] = new Autobus ("Maquina 3", "Traiguen", 1400, 8);
		autobuses[3] = new Autobus ("Maquina 4", "Lautaro", 1300, 4);
		autobuses[4] = new Autobus ("Maquina 5", "Angol", 3300, 8);

		// Asignar asientos malos
		autobuses[0].asignarAsientoMalo (5);
		autobuses[2].asignarAsientoMalo (1);
		autobuses[2].asignarAsientoMalo (8);
		autobuses[4].asignarAsientoMalo (3);

		int deseaComprar = 1;

		while (deseaComprar == 1) {
			System.out.println ("Desea comprar un pasaje? ");
			System.out.println ("\t 1) Si");
			System.out.println ("\t 2) No");
			deseaComprar = sc.nextInt();

			if (deseaComprar == 1)
				menu (autobuses);
		}
	}

	private static void menu (Autobus [] autobuses) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println ("Buses:");
		System.out.println ("\t1) Temuco");
		System.out.println ("\t2) Victoria");
		System.out.println ("\t3) Traiguen");
		System.out.println ("\t4) Lautaro");
		System.out.println ("\t5) Angol");
		System.out.print ("Ingrese el Nº de Destino: ");

		int optBus = -1;
		optBus = sc.nextInt ();

		switch (optBus) {
			case 1:
				autobuses[optBus - 1].showAsientos ();
				break;
			case 2:
				autobuses[optBus - 1].showAsientos ();
				break;
			case 3:
				autobuses[optBus - 1].showAsientos ();
				break;
			case 4:
				autobuses[optBus - 1].showAsientos ();
				break;
			case 5:
				autobuses[optBus - 1].showAsientos ();
				break;
			default:
				System.out.println ("Ingrese una opción válida");
		}

		System.out.println ("Ingrese un número de asieto: ");

		int numAsiento = -1;
		numAsiento = sc.nextInt ();
		int numAutobus = optBus - 1;

		autobuses[numAutobus].asignarAsiento (numAsiento);
		autobuses[numAutobus].showAsientos ();
	}
}

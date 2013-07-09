
/*
 *	Por: Matías Muñoz Espinoza
 *	Problema: Escriba un agoritmo que imprima los números múltiplos de 4 y múltiplo 
 *		de 7 comprendidos en el rango de 300 a 400 usando for, while y do while.
 */

import java.util.Scanner;

public class Multiplos
{
	public static void main (String [] args) {
		System.out.println ("------ Con For ------");
		
		for (int i = 300; i <= 400; i++) {
			if (i % 4 == 0)
				System.out.println (i + " es múltiplo de 4");
			if (i % 7 == 0)
				System.out.println (i + " es múltiplo de 7");
		}
		
		System.out.println ("------ Con While ------");
		
		int i = 300;
		
		while (i <= 400) {
			if (i % 4 == 0)
				System.out.println (i + " es múltiplo de 4");
			if (i % 7 == 0)
				System.out.println (i + " es múltiplo de 7");

			i++;
		}

		System.out.println ("------ Con Do While ------");
		
		i = 300;
		
		do {
			if (i % 4 == 0)
				System.out.println (i + " es múltiplo de 4");
			if (i % 7 == 0)
				System.out.println (i + " es múltiplo de 7");

			i++;
		} while (i <= 400);
	}
}

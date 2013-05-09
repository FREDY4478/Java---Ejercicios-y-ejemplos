
/**
 *  Por: Matías Muñoz Espinoza
 *	Problema: Crear un método que retorne verdadero o falso si el parámetro
 *		ingresado es o no un número primo.
 */

import java.util.Scanner;

public class IsPrime
{
	public static void main (String [] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num;

		System.out.println ("Enter a number: ");
		num = sc.nextInt ();
		System.out.println (isPrime(num));
	}

	public static boolean isPrime (int num)
	{
		boolean isPrime = true;

		for (int i = 2; i <= (num - 1); i++) {
			if (num % i == 0) {
				System.out.println ("No es primo");
				isPrime = false;
				break;
			}
		}

		return isPrime; 
	}
}

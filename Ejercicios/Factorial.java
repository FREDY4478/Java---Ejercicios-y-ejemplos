
/**
 *  Por: Matías Muñoz Espinoza
 *	Problema:
 *	Crear un método que permita calcular el factorial de un número.
 */

import java.util.Scanner;

public class Factorial
{
	public static void main (String [] args) 
	{
		Scanner sc = new Scanner (System.in);
		int fact;

		fact = sc.nextInt ();
		System.out.println (factorial (fact));
	}
	
	public static int factorial (int num)
	{
		int result = num;

		for (int i = 1; i <= num; i++)
			result *= i;

		return result;
	}
}
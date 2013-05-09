
/**
 *  Por: Matías Muñoz Espinoza
 *	Problema: Escriba un programa que indique cuál es el mayor de dos números
 *		utilizando un método.
 */

import java.util.Scanner;

public class Mayor
{
	public static void main(String [] args)
	{ 
		Scanner tk = new Scanner(System.in);
		int a, b, mayor;
		System.out.println ("Ingrese el valor a: ");
		a = tk.nextInt ();
		System.out.println ("Ingrese el valor b: ");
		b = tk.nextInt ();
		System.out.println (mayor (a, b));
	}

	public static int mayor (int a, int b)
	{
		int m;

		if (a > b) {
			System.out.println ("a es mayor: ");
			m = a;
		}

		else {
			System.out.println ("b es mayor: ");
			m = b;
		}

		return m;
	}
}
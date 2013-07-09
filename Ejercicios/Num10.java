
/*
 *	Por: Matías Muñoz Espinoza
 *	Problema: Escriba un programa que al ingresar 10 números. Luego imprima sólo los
 *		numeros positivos ingresados.
 */

import java.util.Scanner;

public class Num10
{
	public static void main (String [] args) 
	{
		Scanner tk = new Scanner (System.in);

		int [] num = new int [10];

		for (int i = 0; i <= 9; i++) {
			num[i] = tk.nextInt ();
		}

		System.out.println ("Numeros positivos:");

		for (int i = 0; i <= 9; i++) {
			if (num[i] > 0)
				System.out.println (num[i]);
		}
	}
}

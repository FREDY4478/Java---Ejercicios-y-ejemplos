
/*
 *	Por: Matías Muñoz Espinoza
 *	Problema:
 *	Invertir un array unidimecinoal de 8 elementos y mostrarlo.
 */

public class InvertirVector
{
	public static void main (String args [])
	{
		int a [] = {2, 3, 4, 1, 6, 7, 3, 7};
		int b [] = new int [8];

		for (int i = 0; i <= 7; i++) {
			b[7 - i] = a [i];
		}

		// Imprimir vector a

		for (int i = 0; i <= 7; i++){
			System.out.print (a[i] + " ");
		}

		System.out.println();

		// Imprimir vector b

		for (int i = 0; i <= 7; i++){
			System.out.print (b[i] + " ");
		}

		System.out.println();
	}
}

/**
 *  Por: Matías Muñoz Espinoza
 *	Problema: Crear una programa qu calcule el promedio de 3 notas ingresadas por
 *		el usuario, utilizando el bucle do while.
 */

import java.util.Scanner;

public class p3Notas
{
	public static void main (String [] args)
	{
		float n, p, t=0;
		int i;
		
		Scanner tk = new Scanner (System.in);
		
		for (i = 1; i <= 3; i++) {
			do {
				System.out.print ("Ingrese nota " + i + " :");
				n = tk.nextFloat ();
			} while (n < 1.0 || n > 7.0);
			
			t += n;
		}
		
		p = t / 3;
		System.out.println ("El promedio es: " + p);
	}
}
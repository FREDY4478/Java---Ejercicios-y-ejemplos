
/*
 *  Por: Matías Muñoz Espinoza
 *	Problema: Crear una función que permita calcular el valor en pesos chilenos de un 
 *		producto si como parámetro de entrada recibe un valor en dólares.
 */

import java.util.Scanner;

public class DollarToClpConverter
{
	public static int dollarToClp = 470;

	public static void main (String [] args)
	{
		int dollarAmount, clpTotal;
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Enter the dollar amount: ");
		dollarAmount = sc.nextInt ();
		
		clpTotal = dollarToClp (dollarAmount);
		System.out.println ("The exchange of dollar to clp is:\n" + clpTotal);
	}
	
	public static int dollarToClp (int dollarAmount)
	{
		int total = dollarAmount * dollarToClp;
		return total;
	}
}
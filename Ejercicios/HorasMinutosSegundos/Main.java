 
/*
 *	Resuelto por: Matías Muñoz Espinoza
 *	Problema:
 *	Implementar la clase Hora. Cada objeto de esta clase representa una hora
 *	específica del día, almacenando las horas, minutos y segundos como enteros.
 *	Se debe de incluir un constructor, métodos de acceso, un método 
 *	adelantar(int h, int m, int s) para adelantar la hora actual de un objeto 
 *	existente, un método reiniciar(int h, int m, int s) que reinicializa la
 *	hora actual de un objeto existente y un método imprimir
 */

import java.util.Scanner;

public class Main
{
	public static void main (String args [])
	{
		Hora h1 = new Hora (10, 54, 33);
		h1.mostrar();
		h1.restablecer (22, 14, 22);
		h1.mostrar();
		h1.adelantar (4, 0, 0);
		h1.mostrar();
	}
}
package Capitulo_6.ProgrammingExercises.E3;

import java.util.Scanner;

public class Factorials {

	private static long factorial = 1;
	private static int num;
	private static int i = 0;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num = entrada.nextInt();

		System.out.print("\n");

		for (i = num; i > 0; i--) {

			factorial = factorial * i;
			System.out.println("Los numero factoriales son de acuerdo al numero ingresado son: " + i);

		}

		System.out.println("\nEl resultado de la multiplicacion es : " + factorial);

	}

}

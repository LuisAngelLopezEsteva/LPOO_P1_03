package Capitulo_6.ProgrammingExercises.E13;

import java.util.Scanner;

public class BarGraph {

	private static int dato, dato1, dato2, dato3;

	public static void main(String[] args) {

		String x = "X";

		System.out.print("valor para Pam: ");
		Scanner entrada = new Scanner(System.in);
		dato = entrada.nextInt();
		System.out.print("valor para Leo: ");
		dato1 = entrada.nextInt();
		System.out.print("valor para Kim: ");
		dato2 = entrada.nextInt();
		System.out.print("valor para Bob: ");
		dato3 = entrada.nextInt();
		System.out.print("Pam ");
		for (int i = 0; i < dato; i++) {

			System.out.print("x");

		}
		System.out.print("\nLeo ");
		for (int i = 0; i < dato1; i++) {

			System.out.print("x");

		}

		System.out.print("\nKim ");
		for (int i = 0; i < dato2; i++) {

			System.out.print("x");

		}
		System.out.print("\nBob ");
		for (int i = 0; i < dato3; i++) {

			System.out.print("x");

		}

	}

}

package Capitulo_6.ProgrammingExercises.E1;

import java.util.Scanner;

public class CountByAnything {

	private static int multiplo;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		multiplo = entrada.nextInt();

		System.out.println("\nCuenta a partir de:");
		for (int i = multiplo; i <= 10; i++) {

			if (i % multiplo == 0) {

				System.out.println(i);

			}

		}

	}

}

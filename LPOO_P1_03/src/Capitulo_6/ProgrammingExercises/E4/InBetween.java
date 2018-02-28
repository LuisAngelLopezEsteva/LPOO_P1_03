package Capitulo_6.ProgrammingExercises.E4;

import java.util.Scanner;

public class InBetween {

	private static int numero1 = 0;
	private static int numero2 = 0;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese numero 1: ");
		numero1 = entrada.nextInt();

		System.out.println("ingrese numero 2: ");
		numero2 = entrada.nextInt();

		for (int i = numero1; i <= numero2; i++) {

			System.out.println(i);

		}
		if (numero1 > numero2) {

			for (int i = numero2; i <= numero1; i++) {

				System.out.println(i);

			}

		}

	}

}

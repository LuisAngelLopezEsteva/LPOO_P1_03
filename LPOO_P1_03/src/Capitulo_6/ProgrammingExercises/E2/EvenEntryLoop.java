package Capitulo_6.ProgrammingExercises.E2;

import java.util.Scanner;

public class EvenEntryLoop {

	private static int numero;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero par para continuar y si ingresa el 999 va salir");

		do {
			numero = entrada.nextInt();

			if (numero % 2 == 0) {
				System.out.println("Buen Trabajo");
			}

		} while (numero != 999);
		System.out.println("Termino el Programa");
	}
}

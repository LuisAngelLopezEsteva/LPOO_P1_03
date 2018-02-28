package Capitulo_5.ProgrammingExercises.E1;

import java.util.Scanner;

public class EvenOdd {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		Integer x = input.nextInt();
		if (x % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("Impar");
	}

}

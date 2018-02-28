package Capitulo_7.ProgrammingExercises.E2;

import java.util.Scanner;

public class CountSpaces2 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese un texto :");
		String text= input.nextLine();
		Integer cont = 0;

		for (int x = 0; x < text.length(); x++) {
			if (text.substring(x, x + 1).equals(" "))
				cont++;

		}
		System.out.println("Numero de veces que se repite el \" \" : " + cont);

	}

}

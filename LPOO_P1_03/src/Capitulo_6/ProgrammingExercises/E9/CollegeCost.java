package Capitulo_6.ProgrammingExercises.E9;

import java.util.Scanner;

public class CollegeCost {

	public static void main(String[] args) {

		int edad1;
		int dinero;

		Scanner input = new Scanner(System.in);

		System.out.println("ingrese la edad actual del niño");
		edad1 = input.nextInt();
		System.out.println("ingrese la cantidad estimada de gastos universitarios: ");
		dinero = input.nextInt();
		float edad2 = 19 - edad1;
		System.out.println(edad2);
		for (int i = edad1; i <= 18; i++) {

			System.out.println("tendra que guardar en el año " + i + " = " + (dinero / edad2));
		}

	}

}

package Capitulo_7.ProgrammingExercises.E1;

import java.util.Scanner;

public class BabyNameComparison {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, nombre2, nombre3;
		
		System.out.println("Ingrese nombre_1: ");
		nombre = input.nextLine();
		System.out.println("Ingrese nombre_2: ");
		nombre2 = input.nextLine();
		System.out.println("Ingrese nombre_3: ");
		nombre3 = input.nextLine();

		System.out.println("Opcion1: " + (nombre + " " + nombre2));
		System.out.println("Opcion2: " + (nombre + " " + nombre3));
		System.out.println("Opcion1: " + (nombre2 + " " + nombre));
		System.out.println("Opcion1: " + (nombre2 + " " + nombre3));
		System.out.println("Opcion1: " + (nombre3 + " " + nombre));
		System.out.println("Opcion1: " + (nombre3 + " " + nombre2));
	}

}

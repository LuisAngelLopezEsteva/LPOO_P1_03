package Capitulo_6.ProgrammingExercises.E10;

import java.util.Scanner;

public class RetirementGoal {

	private static int a, b, t;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese cuantos años falta para su jubilación ");
		do {
			a = sc.nextInt();
		} while (a <= 0);
		System.out.print("Ingrese el dinero que puede ahorrar al año ");
		b = sc.nextInt();
		t = a * b;
		System.out.printf("Usted tendrá un total de %d pesos ahorrados ", t);

	}

}

package Capitulo_7.ProgrammingExercises.E4;

import java.util.Scanner;

public class CountMatches {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag;
		System.out.println("Ingrese un texto :");
		String text = input.nextLine();
		String aux;
		System.out.println("Ingrese un texto :");
		String text2 = input.nextLine();
		String contenedor = "";

		for (int x = 0; x < text.length(); x++) {
			flag = false;
			for (int i = 0; i < text2.length(); i++) {
				aux = "" + text.charAt(x);
				if (text2.contains(aux)) {
					 flag = true;
					//contenedor = contenedor + text2.charAt(x);
				}

			}
			 if (flag) {
			 contenedor = contenedor + text.charAt(x) ;
			 }
		}
		System.out.println(contenedor);

	}
}

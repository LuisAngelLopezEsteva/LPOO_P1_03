package Capitulo_7.ProgrammingExercises.E5;

import java.util.Scanner;

public class CountWords {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	boolean flag;
		System.out.println("No ingrese simbolos si no agrega texto, porfavor");
		System.out.println("Ingrese un texto :");
		String text = input.nextLine();
		Integer contador = 1;

		for (int x = 0; x < text.length()-1; x++) {
			if (((text.codePointAt(x) >= 65 && text.codePointAt(x) <= 90)
					|| (text.codePointAt(x) >= 97 && text.codePointAt(x) <= 122))  
					&& !((text.codePointAt(x+1) >= 65 && text.codePointAt(x+1) <= 90)
							|| (text.codePointAt(x+1) >= 97 && text.codePointAt(x+1) <= 122)) ) {
				contador++;
			}
		}
		System.out.println("Cantidad de palabras= "+contador);
	}

}
